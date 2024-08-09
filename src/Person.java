import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age = 0;
    protected String address = "";


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public boolean hasAge() {
        if (this.age != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasAddress() {
        if (this.address != "") {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public OptionalInt getAge() {
        OptionalInt optInt = OptionalInt.of(this.age);
        return optInt;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        age++;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(this.surname).setAddress(this.address).setAge(1);
    }

    @Override
    public String toString() {
        return "name: " + this.name + ", surname: " + this.surname + ", age: " + this.age + ", address: " + this.address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.surname, this.age, this.address);
    }

}
