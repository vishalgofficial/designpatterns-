package creational.abstractfactory;

public class PC implements Computer {
    private String RAM;
    private String HDD;

    public PC(String RAM, String HDD) {
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public String getRam() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }
}
