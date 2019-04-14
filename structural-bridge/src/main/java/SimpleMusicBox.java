import instrument.MusicalInstrument;

public class SimpleMusicBox implements MusicBox {

    protected MusicalInstrument instrument;

    public SimpleMusicBox(MusicalInstrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void volumeDown() {
        instrument.setVolume(instrument.getVolume() < 10 ? 0 : instrument.getVolume() - 10);
        printVolumeLevel();
    }


    @Override
    public void volumeUp() {
        instrument.setVolume(instrument.getVolume() > 90 ? 100 : instrument.getVolume() + 10);
        printVolumeLevel();
    }

    @Override
    public void makeSound() {
        System.out.println(instrument.getSound());
    }

    @Override
    public void printName() {
        System.out.println(instrument);
    }

    protected void printVolumeLevel() {
        System.out.println("New volume level: " + instrument.getVolume());
    }
}
