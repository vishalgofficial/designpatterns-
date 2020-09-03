package creational.factory;

public abstract class OS {
    private OSType osType = null;

    public OS(OSType osType) {
        this.osType = osType;

    }

    protected abstract void spec();
}
