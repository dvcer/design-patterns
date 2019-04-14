package instrument;

public class Violin extends MusicalInstrument {

    public static final String VIOLIN_SOUND = "VIOLIN_SOUND";
    private static final String VIOLIN_NAME = "VIOLIN";

    public Violin() {
        super(VIOLIN_SOUND, VIOLIN_NAME);
    }
}
