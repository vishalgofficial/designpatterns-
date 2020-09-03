package creational.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        String moviePrototype = PrototypeFactory.getInstance(PrototypeFactory.ModelType.MOVIE).toString();
        System.out.println(moviePrototype);

    }
}
