package RestAPI;

import java.util.List;

public class Transcript {

	private String audio_url;
	private List<String> speech_models;
	private String id;
	private String status;
	private String text;

	public String getAudio_url() {
		return audio_url;
	}

	public void setAudio_url(String audio_url) {
		this.audio_url = audio_url;
	}

	public List<String> getSpeech_models() {
		return speech_models;
	}

	public void setSpeech_models(List<String> speech_models) {
		this.speech_models = speech_models;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
