import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //a unica mudança feita no código foi a troca dos nomes das classes e atributos para inglês, a fim de praticar o idioma
        
        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Material> materials = new ArrayList<>();
        ArrayList<Loan> loans = new ArrayList<>();

        int option;

        do {
            System.out.println("===== LIBRARY SYSTEM =====");
            System.out.println("1 - Register User");
            System.out.println("2 - Register Employee");
            System.out.println("3 - List People");
            System.out.println("4 - Register Book");
            System.out.println("5 - Register Magazine");
            System.out.println("6 - List Materials");
            System.out.println("7 - Register Loan");
            System.out.println("8 - List Loans");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Name: ");
                    String nameU = sc.nextLine();
                    System.out.print("Email: ");
                    String emailU = sc.nextLine();
                    System.out.print("Registration: ");
                    int registration = sc.nextInt();
                    sc.nextLine();
                    people.add(new User(nameU, emailU, registration));
                    System.out.println("User registered successfully!\n");
                    break;

                case 2:
                    System.out.print("Name: ");
                    String nameE = sc.nextLine();
                    System.out.print("Email: ");
                    String emailE = sc.nextLine();
                    System.out.print("Position: ");
                    String position = sc.nextLine();
                    people.add(new Employee(nameE, emailE, position));
                    System.out.println("Employee registered successfully!\n");
                    break;

                case 3:
                    System.out.println("=== People List ===");
                    for (Person p : people) {
                        p.showInfo();
                        System.out.println("-------------------");
                    }
                    break;

                case 4:
                    System.out.print("Title: ");
                    String titleB = sc.nextLine();
                    System.out.print("Publication year: ");
                    int yearB = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    materials.add(new Book(titleB, yearB, author));
                    System.out.println("Book registered successfully!\n");
                    break;

                case 5:
                    System.out.print("Title: ");
                    String titleM = sc.nextLine();
                    System.out.print("Publication year: ");
                    int yearM = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Edition: ");
                    String edition = sc.nextLine();
                    materials.add(new Magazine(titleM, yearM, edition));
                    System.out.println("Magazine registered successfully!\n");
                    break;

                case 6:
                    System.out.println("=== Materials List ===");
                    for (Material m : materials) {
                        m.description();
                        System.out.println("-------------------");
                    }
                    break;

                case 7:
                    if (people.isEmpty() || materials.isEmpty()) {
                        System.out.println("There must be at least one person and one material registered.\n");
                        break;
                    }

                    System.out.println("Choose a person (index):");
                    for (int i = 0; i < people.size(); i++) {
                        System.out.println(i + " - " + people.get(i).getName());
                    }
                    int idxPerson = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Choose a material (index):");
                    for (int i = 0; i < materials.size(); i++) {
                        System.out.println(i + " - " + materials.get(i).getTitle());
                    }
                    int idxMaterial = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Loan date: ");
                    String loanDate = sc.nextLine();
                    System.out.print("Return date: ");
                    String returnDate = sc.nextLine();

                    loans.add(new Loan(people.get(idxPerson), materials.get(idxMaterial), loanDate, returnDate));
                    System.out.println("Loan registered!\n");
                    break;

                case 8:
                    System.out.println("=== Loans List ===");
                    for (Loan l : loans) {
                        l.showDetails();
                        System.out.println("-------------------");
                    }
                    break;

                case 0:
                    System.out.println("Exiting the system...");
                    break;

                default:
                    System.out.println("Invalid option!\n");
            }

        } while (option != 0);

        sc.close();
    }
}
