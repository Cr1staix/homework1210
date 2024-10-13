/**
 * Класс создает объект "книга". Содержит в себе информацию об авторе, названии, дате публикации
 * и методы для управления ими.
 */
public class Book {
    private String bookName;
    private Author author;
    int yearPublication;

    public void setBookName(String bookName) {
        this.bookName = bookName;
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

    private String getBookName() {
        return bookName;
    }

    private int getYearPublication() {
        return yearPublication;
    }

    /**
     * Метод выводит информацию о книге.
     *
     * @return возвращает значения полей содержащих информацию о книге.
     */
    public String getBookInfo() {
        return "Книга - " + getBookName() + "/ Автор " + author.getAuthorNameInfo() + "/ " + getYearPublication() + " года издания.";
    }
}