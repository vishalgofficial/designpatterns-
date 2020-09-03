package creational.factory;

public class Android extends OS {

    public Android() {
        super(OSType.ANDROID);
        spec();
    }

    public void spec() {
        System.out.println("Hello from Android");
    }
}
