/**
 * Class representation fo AnalogAdapter implementing AnalogAlbum
 * @author Xzavian Slaughter
 */
public class AnalogAdapter implements AnalogAlbum{

    private DigitalAlbum album; 

    /**
     * Constructor: Intializes values for AnalogAdapter
     * @param album DigitalAlbum album
     */
    public AnalogAdapter(DigitalAlbum album){

        this.album = album;  

    }

    /**
     * Returns playing equivalent
     */
    public String play() {

       return album.playSong(0);

    }

    /**
     * Returns rewinding equivalent
     */
    public String rewind() {

        return album.prevSong(); 
    }

    /**
     * Returns fast-fowarding equivalent
     */
    public String ffwd(){

        return album.nextSong(); 
    }

    /**
     * Returns pausing equivalent
     */
    public String pause() {

        return album.pause(); 

    }

    /**
     * Returns stopping and ejecting equivalent
     */
    public String stopEject() {

        return album.stop(); 
    }
}
