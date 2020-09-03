package creational.factory;

public class OSFactory {
    public static OS getOSSpec(OSType osType) {
        OS os = null;
        switch (osType) {
            case IOS:
                os = new IOS();
                break;
            case ANDROID:
                os = new Android();
                break;
            case WINDOWS:
                os = new Windows();
                break;
            default:
                break;
        }
        return os;
    }
}
