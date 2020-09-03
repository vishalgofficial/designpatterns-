package creational.abstractfactory;

public class Server implements Computer {
    private String RAM;
    private String HDD;

    public Server(String RAM, String HDD) {
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
