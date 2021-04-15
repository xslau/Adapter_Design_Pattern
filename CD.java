import java.util.ArrayList;

/**
 * Class representation of CD implementing DigitalAlbum
 * @author Xzavian Slaughter
 */
public class CD implements DigitalAlbum{

    private ArrayList<String> songs = new ArrayList<String>(5); 
    private int currentIndex; 

    /**
     Constructor: Intializes values for CD
     * @param song1 Song 1
     * @param song2 Song 2
     * @param song3 Song 3
     * @param song4 Song 4
     * @param song5 Song 5
     */
    public CD (String song1, String song2, String song3, String song4, String song5){

        songs.add(0,song1); 
        songs.add(1, song2); 
        songs.add(2, song3);
        songs.add(3, song4);
        songs.add(4, song5);   
    }

    /**
     * Returns playing from beginning and 1st song
     * @return 1st song 
     */
    public String playFromBeginning() {

        currentIndex = 1; 
        return "Playing Song 1: " + songs.get(1); 
    }

    /**
     * Returns playing a specific song
     * @param num specific song number
     * @return specified song
     */
    public String playSong(int num){

        if(currentIndex != 0 && currentIndex !=5){

            currentIndex = num + 1; 
        }

        return songs.get(num);
    }

    /**
     * Returns previous song from current index
     * @return song before current index song
     */
    public String prevSong() {

        if(currentIndex != 0){

            currentIndex--; 
        }

        return "Skipping back and playing " + songs.get(currentIndex); 
    }

    /**
     * Returns next song from current index
     * @return song after current index
     */
    public String nextSong() {

        if(currentIndex != 4){

            currentIndex++; 
        } else {

            currentIndex = 0; 
        }

        return "Playing" + songs.get(currentIndex); 
    }

   /**
    * Returns pausing
    * @return pausing
    */
    public String pause() {

        return "Pausing"; 
    }
    
    /**
     * Returns stopping
     * @return stopping
     */
    public String stop() {

        return "Stopping..."; 
    }

}
