
public class User extends Person {
    private Integer registration;

    public User(String name, String email, Integer registration) {
        super(name, email);
        this.registration = registration;
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Registration: " + registration);
    }

    public Integer getRegistration() {
        return this.registration;
    }

    public void setRegistration(Integer registration) {
        this.registration = registration;
    }
}

