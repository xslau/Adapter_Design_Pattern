import java.util.ArrayList;

/**
 * Class representation of Cassett implementing AnalogAlbum
 * @author Xzavian Slaughter
 */
public class Cassett implements AnalogAlbum{

    private ArrayList<String> songs = new ArrayList<String>(5); 
    private int currentIndex; 

    /**
     * Constructor: Intializes values for Cassett
     * @param song1 Song 1
     * @param song2 Song 2
     * @param song3 Song 3
     * @param song4 Song 4
     * @param song5 Song 5
     */
    public Cassett(String song1, String song2, String song3, String song4, String song5){

            songs.add(song1); 
            songs.add(song2); 
            songs.add(song3);
            songs.add(song4);
            songs.add(song5);   
    } 

    /**
     * Returns current song playing
     */
    public String play() {

        return "Playing song" + currentIndex + " " + songs.get(currentIndex); 
    }

    /**
     * Returns rewinding and previous song
     */
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

    /**
     * Returns fast-forwarding and next song
     */
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

    /**
     * Returns pausing
     */
    public String pause() {

        return "Pausing..."; 
    }

    /**
     * Returns stopping and ejecting
     */
    public String stopEject() {

        return "Stopping cassette and ejecting"; 
    }

    
}
