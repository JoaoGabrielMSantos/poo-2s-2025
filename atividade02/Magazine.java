
public class Magazine extends Material {
    private String edition;

    public Magazine(String title, Integer publicationYear, String edition) {
        super(title, publicationYear);
        this.edition = edition;
    }

    @Override
    public void description() {
        System.out.println("Title: " + getTitle());
        System.out.println("Publication Year: " + getPublicationYear());
        System.out.println("Edition: " + edition);
    }

    public String getEdition() {
        return this.edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }
}

