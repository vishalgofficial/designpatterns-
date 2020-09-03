package creational.prototype;

public class PrototypeFactory {

    public static class ModelType {
        public static final String MOVIE = "movie";
        public static final String SHOW = "show";
    }

    private static java.util.Map<String, PrototypeCapable> prototypes = new java.util.HashMap<String, PrototypeCapable>();

    static {
        prototypes.put(ModelType.MOVIE, new Movie());
        prototypes.put(ModelType.SHOW, new Show());
    }

    public static PrototypeCapable getInstance(final String s) throws CloneNotSupportedException {
        return (prototypes.get(s)).clone();
    }
}
