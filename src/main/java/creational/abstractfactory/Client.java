package creational.abstractfactory;

public class Client {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.createComputer(new PCFactory("10","500"));
        Computer server = ComputerFactory.createComputer(new ServerFactory("10","1000"));
    }
}
