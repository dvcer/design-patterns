import instrument.Guitar;
import instrument.Violin;
import org.junit.Test;

public class BridgeTest {
    @Test
    public void bridgeTest() {
        MusicBox musicBox = new SimpleMusicBox(new Violin());
        check(musicBox);

        musicBox = new SimpleMusicBox(new Guitar());
        check(musicBox);
    }

    private void check(MusicBox musicBox) {
        musicBox.printName();
        musicBox.volumeUp();
        musicBox.volumeDown();
        musicBox.makeSound();
    }
}
