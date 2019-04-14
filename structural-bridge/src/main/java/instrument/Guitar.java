package instrument;

public class Guitar extends MusicalInstrument {

    public static final String GUITAR_SOUND = "GUITAR_SOUND";
    private static final String GUITAR_NAME = "GUITAR";

    public Guitar() {
        super(GUITAR_SOUND, GUITAR_NAME);
    }
}
