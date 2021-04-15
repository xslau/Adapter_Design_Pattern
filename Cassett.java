import java.util.ArrayList;

public class Cassett implements AnalogAlbum{

    private ArrayList<String> songs = new ArrayList<String>(5); 
    private int currentIndex; 

    public Cassett(String song1, String song2, String song3, String song4, String song5){

            songs.add(song1); 
            songs.add(song2); 
            songs.add(song3);
            songs.add(song4);
            songs.add(song5);   
    } 

    public String play() {

        return "Playing song" + currentIndex + " " + songs.get(currentIndex); 
    }

    public String rewind() {

        String result = ""; 

        if(currentIndex == 0){

            result = "Fully Re-Wound"; 
        } else {

            currentIndex--;
            result = "Rewinding to Song" + " " + songs.get(currentIndex); 
        }

        return result;  
    }

    public String ffwd() {

        String result = "";

        if(currentIndex == 4){

            result = "At the end of the cassette you need to rewind"; 
        } else {

            currentIndex++; 
            result = "Forwarding to song" + " " + songs.get(currentIndex);
            
            if(currentIndex == 4){
                
                result = "Forwarding to song" + " " + songs.get(currentIndex) + "\nForwarded to end of cassette";
            }
        }

        return result; 
    }

    public String pause() {

        return "Pausing..."; 
    }

    public String stopEject() {

        return "Stopping cassette and ejecting"; 
    }

    
}
