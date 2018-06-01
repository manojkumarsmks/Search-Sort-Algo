/* Reorder the data such that all the lines with word on top of the log file. */ 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
public class ArrangeLogs {

	public static void main(String[] args) {
    	String literature = "romeo romeo wherefore art thou romeo";
    	List<String> word  = new ArrayList<String>();
    	word.add("mi2 jog mid pet");
    	word.add("wz3 24 54 23");
    	word.add("a1 alps cow bar");
    	word.add("x4 45 21 3");  
    	
    	List<String> result = reorderLines(word.size(), word);
    	
    	for (String string : result) {
			System.out.println(string);
		}
    	
	}
	// Read orderLine
	public static List<String> reorderLines(int logFileSize, List<String> logLines) {
		
		List<String> logLineWithString = new ArrayList<>();
		List<String> logLineWithInteger = new ArrayList<>();
		
		for(int i=0; i<logLines.size(); i++) {
			String[] splitString = logLines.get(i).split(" ");
			if(isIntegerOrNot(splitString[1])) {
				logLineWithInteger.add(logLines.get(i));
			}
			else {
				logLineWithString.add(logLines.get(i));
			}
		}
		
		Collections.sort(logLineWithString, new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				if(arg0.substring(arg0.indexOf(" ")).compareTo(arg1.substring(arg1.indexOf(" "))) == 0) {
					return arg0.split(" ")[0].compareTo(arg1.split(" ")[0]);
				}
				return arg0.substring(arg0.indexOf(" ")).compareTo(arg1.substring(arg1.indexOf(" ")));
			}
			
		});
		
		logLineWithString.addAll(logLineWithInteger);
		
		return logLineWithString;
		
	}
	
	public static boolean isIntegerOrNot(String input) {
		try {
			Integer.parseInt(input);
		}
		catch(NumberFormatException e) {
			return false;
		}
		return true;
	}
}


