
public abstract class Material {
    private String title;
    private Integer publicationYear;

    public Material(String title, Integer publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public abstract void description();

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }
}
