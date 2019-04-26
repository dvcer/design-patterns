import java.util.EnumMap;

public class ParticleFabric {
    private static EnumMap<ParticleType, Particle> map = new EnumMap<>(ParticleType.class);

    public static Particle create(ParticleType type) {
        Particle particle = map.get(type);
        if (particle == null) {
            particle = new Particle(type.name());
            map.put(type,particle);
        }
        return particle;
    }
}
