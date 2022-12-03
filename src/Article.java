import java.util.Objects;

public class Article {
    public int id;
    private String str;

    public Article(int id, String str) {
        this.id = id;
        this.str = str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return id == article.id && str.equals(article.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, str);
    }
}
