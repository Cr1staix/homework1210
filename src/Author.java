/**
 * Класс создает объект "Автор". Содержит в себе информацию об авторе и методы для управления ими.
 */
public class Author {
    private String authorFirstName;
    private String authorLastName;

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    private String getAuthorFirstName() {
        return authorFirstName;
    }

    private String getAuthorLastName() {
        return authorLastName;
    }

    /**
     * Метод выводит информацию об авторе.
     *
     * @return возвращает Имя и фамилию автора.
     */
    public String getAuthorNameInfo() {
        return getAuthorFirstName() + " " + getAuthorLastName();
    }
}