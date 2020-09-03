package creational.factory;

public class Windows extends OS {
    public Windows() {
        super(OSType.WINDOWS);
        spec();
    }

    public void spec() {
        System.out.println("Hello from Windows");
    }
}
