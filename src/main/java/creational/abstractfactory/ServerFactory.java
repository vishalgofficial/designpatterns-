package creational.abstractfactory;

public class ServerFactory implements ComputerAbstractFactory {

    private String RAM;
    private String HDD;

    public ServerFactory(String RAM, String HDD) {
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public Computer createComputer() {
        return new Server(this.RAM, this.HDD);
    }
}
