package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
	
	public int countWords(String words){
		String[] seperateWords = StringUtils.split(words,' ');
		return (seperateWords==null)?0: seperateWords.length;
    }
	
	public void greet(){
		List<String> greetings = new ArrayList<>();
		greetings.add("hello");
		
		for(String greeting:greetings){
			System.out.println ("greetings"+greetings);
		}	
	}
	
	public Application() {
        System.out.println ("Inside Application");
    }
    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
		int count = app.countWords("I have four words");
		System.out.println ("Word count"+count);
    }
}