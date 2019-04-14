package instrument;

public abstract class MusicalInstrument {
    private final String sound;
    private int volume;
    private final String name;

    public MusicalInstrument(String sound, String name) {
        this.sound = sound;
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return name;
    }
}
