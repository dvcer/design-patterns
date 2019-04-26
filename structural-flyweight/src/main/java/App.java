import java.util.Random;
import java.util.stream.IntStream;

public class App {


    public static void main(String[] args) {
        createImage(100, 30);
    }

    private static void createImage(int x, int y) {
        IntStream.range(0, y).forEach(xx -> {
            IntStream.range(0, x).forEach(yy -> {
                Particle current = getRandomParticle();
                System.out.print(current.getImage());

            });
            System.out.println();
        });
    }

    private static Particle getRandomParticle() {
        return ParticleFabric.create(ParticleType.values()[new Random().nextInt(ParticleType.values().length)]);
    }
}
