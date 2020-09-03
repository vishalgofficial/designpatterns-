package creational.abstractfactory;

public class PCFactory implements ComputerAbstractFactory {

    private String RAM;
    private String HDD;

    public PCFactory(String RAM, String HDD) {
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public Computer createComputer() {
        return new PC(this.RAM, this.HDD);
    }
}
