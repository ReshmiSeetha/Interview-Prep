/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class ComparatorExample
{
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		Comparator com = new Comparator<String>(){
		    public int compare(String i , String j){
		        if(i.length() > j.length()){
		            return 1;
		        }else{
		            return -1;
		        }
		    }
		};
		
		list.add("Vinu");
		list.add("Maxxxxxxxxxxxx");
		list.add("Rohit");
		
		Collections.sort(list, com);
		System.out.println(list);
	}
}