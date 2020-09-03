package creational.factory;

public class IOS extends OS {
    public IOS() {
        super(OSType.IOS);
        spec();
    }

    public void spec() {
        System.out.println("Hello from IOS");
    }
}
