
public class Employee extends Person {
    private String position;

    public Employee(String name, String email, String position) {
        super(name, email);
        this.position = position;
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Position: " + position);
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

