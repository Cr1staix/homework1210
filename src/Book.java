/**
 * Класс создает объект "книга". Содержит в себе информацию об авторе, названии, дате публикации
 * и методы для управления ими.
 */
public class Book {
    private String title;
    private Author author;
    private int yearPublication;

    public Book() {
    }

    public Book(String title, Author author, int yearPublication) {
        this.title = title;
        this.yearPublication = yearPublication;
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYearPublication(int yearPublication) {
        if (yearPublication <= 0) {
            throw new RuntimeException("Некорректная дата");
        } else {
            this.yearPublication = yearPublication;
        }
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    @Override
    public String toString() {
        return "Книга " + title + " / " + author.toString() + " / Год публикации " + yearPublication;
    }
}