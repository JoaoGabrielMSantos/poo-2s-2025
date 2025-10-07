
public class Book extends Material {
    private String author;

    public Book(String title, Integer publicationYear, String author) {
        super(title, publicationYear);
        this.author = author;
    }

    @Override
    public void description() {
        System.out.println("Title: " + getTitle());
        System.out.println("Publication Year: " + getPublicationYear());
        System.out.println("Author: " + author);
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

