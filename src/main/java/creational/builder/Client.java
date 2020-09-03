package creational.builder;

import creational.builder.User.UserBuilder;

public class Client {
    public static void main(String[] args) {
        User user = new UserBuilder("Vishal")
                .setAge("28")
                .setSalary("100000")
                .build();
        System.out.println(user);
    }
}
