import instrument.MusicalInstrument;

public class AdvancedMusicBox extends SimpleMusicBox {
    public AdvancedMusicBox(MusicalInstrument instrument) {
        super(instrument);
    }

    public void mute() {
        instrument.setVolume(0);
        printVolumeLevel();
    }
}
