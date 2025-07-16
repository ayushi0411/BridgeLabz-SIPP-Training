package Day6_Programs;
import java.util.*;

class shows{
	String showName;
	String time;
	int timeMin;
	
	shows(String showName, String time){
		this.showName = showName;
		this.time = time;
		this.timeMin = convertToMin(time);
	}
	
	int convertToMin(String time) {
		String[] parts = time.split(":");
		int hr = Integer.parseInt(parts[0]);
		int min = Integer.parseInt(parts[1]);
		return hr*60 + min;
	}
	void display() {
		System.out.println("Show Name: "+ showName);
		System.out.println("Time: "+ time);
	}
}

public class MovieTime{
	public static void main(String[] args) {
		ArrayList<shows> showList = new ArrayList<>();
        showList.add(new shows("Independence", "12:00"));
        showList.add(new shows("Standup Comedian", "15:00"));
        
		shows newshow = new shows("Tare Jameen Par" , "14:00");
		insertTime(showList, newshow);
		printlist(showList);
		
	}
	
	public static void insertTime(ArrayList<shows> showList, shows newShow) {
		int i = 0;
	    while (i < showList.size() && showList.get(i).timeMin <= newShow.timeMin) {
	        i++;
	    }
	    showList.add(i, newShow);
	}
	
	public static void printlist(ArrayList<shows> showList) {
		for(shows s : showList) {
			s.display();
		}
	}
}
