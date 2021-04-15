import java.util.ArrayList;

public class CD implements DigitalAlbum{

    private ArrayList<String> songs = new ArrayList<String>(5); 
    private int currentIndex; 

    public CD (String song1, String song2, String song3, String song4, String song5){

        songs.add(0,song1); 
        songs.add(1, song2); 
        songs.add(2, song3);
        songs.add(3, song4);
        songs.add(4, song5);   
    }

    public String playFromBeginning() {

        currentIndex = 1; 
        return "Playing Song 1: " + songs.get(1); 
    }

    public String playSong(int num){

        if(currentIndex != 0 && currentIndex !=5){

            currentIndex = num + 1; 
        }

        return songs.get(num);
    }

    public String prevSong() {

        if(currentIndex != 0){

            currentIndex--; 
        }

        return "Skipping back and playing " + songs.get(currentIndex); 
    }

    public String nextSong() {

        if(currentIndex != 4){

            currentIndex++; 
        } else {

            currentIndex = 0; 
        }

        return "Playing" + songs.get(currentIndex); 
    }

    public String pause() {

        return "Pausing"; 
    }
    
    public String stop() {

        return "Stopping..."; 
    }

}
