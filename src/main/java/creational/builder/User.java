package creational.builder;

public class User {

    private String name;
    private String age;
    private String salary;

    public User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.age = userBuilder.age;
        this.salary = userBuilder.salary;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

        public static class UserBuilder {
            private String name;
            private String age;
            private String salary;

            public UserBuilder(String name) {
                this.name = name;
            }

            public UserBuilder setAge(String age) {
                this.age = age;
                return this;
            }

            public UserBuilder setSalary(String salary) {
                this.salary = salary;
                return this;
            }

            public User build() {
                return new User(this);
            }
        }
}
