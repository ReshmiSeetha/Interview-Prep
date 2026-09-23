/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Student implements Comparable<Student>{
    int age;
    String name;
    
    public Student (int age,String name){
        this.age = age;
        this.name = name;
    }
    
    public String toString(){
        return "Student [age:" + age + ",name:" + name + "]";
    }
    
    public int compareTo(Student that){
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }
}
public class ComparableExample
{
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		Comparator com = new Comparator<String>(){
		    public int compare(String i , String j){
		        if(i.length() > j.length()){
		            return 1;
		        }else{
		            return -1;
		        }
		    }
		};
		
		list.add(new Student(12,"Vinu"));
		list.add(new Student(1,"Maxxxxxxxxxxxx"));
		list.add(new Student(9,"Rohit"));
		
		Collections.sort(list);
		System.out.println(list);
	}
}
