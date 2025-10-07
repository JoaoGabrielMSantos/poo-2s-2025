public class Loan {
    private Person person;
    private Material material;
    private String loanDate;
    private String returnDate;

    public Loan(Person person, Material material, String loanDate, String returnDate) {
        this.person = person;
        this.material = material;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    public void showDetails() {
        System.out.println("Loan Date: " + loanDate);
        System.out.println("Return Date: " + returnDate);
        person.showInfo();
        material.description();
    }
}

