package RestAPI;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class RestApiExample {
	public static void main(String[] args) throws Exception {

		Transcript transcript = new Transcript();
		List<String> speechModels = new ArrayList<>();
		speechModels.add("universal-2");
		transcript.setAudio_url("https://assembly.ai/wildfires.mp3");
		transcript.setSpeech_models(speechModels);

		// Transcript to JSON
		Gson gson = new Gson();
		String jsonRequest = gson.toJson(transcript);
		System.out.println(jsonRequest);
		HttpRequest request = HttpRequest.newBuilder()
				.uri(new java.net.URI("https://api.assemblyai.com/v2/transcript"))
				.header("Authorization", API_KEY)
				.POST(BodyPublishers.ofString(jsonRequest))
				.build();

		HttpClient client = HttpClient.newHttpClient();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		System.out.println(response.body());

		transcript = gson.fromJson(response.body(), Transcript.class);
		System.out.println(transcript.getId());

		HttpRequest getRequest = HttpRequest.newBuilder()
				.uri(new java.net.URI("https://api.assemblyai.com/v2/transcript/" + transcript.getId()))
				.header("Authorization", API_KEY)
				.GET()
				.build();
		while (true) {
			HttpResponse<String> getResponse = client.send(getRequest, BodyHandlers.ofString());
			transcript = gson.fromJson(getResponse.body(), Transcript.class);
			System.out.println(transcript.getStatus());
			if ("completed".equals(transcript.getStatus()) || "error".equals(transcript.getStatus())) {
				break;
			}
			Thread.sleep(5000);
		}
		System.out.println("Done");
		System.out.println(transcript.getText());
	}
}
