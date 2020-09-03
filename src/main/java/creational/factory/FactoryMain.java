package creational.factory;

public class FactoryMain {
    public static void main(String[] args) {
        OSFactory.getOSSpec(OSType.WINDOWS);
        OSFactory.getOSSpec(OSType.ANDROID);
        OSFactory.getOSSpec(OSType.IOS);
    }
}

