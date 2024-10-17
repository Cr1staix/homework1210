public class Main {
    public static void main(String[] args) {
        Author leoTolstoy = new Author("Лев", "Толстой");
        Author fyodorDostoevsky = new Author("Фёдор", "Достоевский");
        Author pirate = new Author("Капитан Джек", "Воробей");

        Book warAndPeace = new Book("Война и мир", leoTolstoy, 1869);
        Book thePlayer = new Book("Игрок", fyodorDostoevsky, 1866);

        System.out.println(warAndPeace);
        System.out.println(thePlayer);

        warAndPeace.setTitle("War And Peace");
        warAndPeace.setYearPublication(1867);
        fyodorDostoevsky.setFirstName("Джек");
        fyodorDostoevsky.setLastName("Воробей");
        System.out.println(thePlayer);
        /* Я не совсем понял задание, можно поменять автора методом setAuthor и создать новый объект класса Author,
        а можно изменить поля для прежнего объекта методами setFirstName и setLastName. Сделал двумя способами
        */
        thePlayer.setAuthor(pirate);
        System.out.println(warAndPeace);
        System.out.println(thePlayer);

        System.out.println(warAndPeace.getTitle() + " " + warAndPeace.getYearPublication() + " "
                + leoTolstoy.getFirstName() + " " + leoTolstoy.getLastName());

        System.out.println(thePlayer.getTitle() + " " + thePlayer.getYearPublication() + " "
                + pirate.getFirstName() + " " + pirate.getLastName());
        /* Опять не совсем понял задание, в задании написано вывести всё через геттеры, но точно так же всё выводится через
           toString, вывел двумя способами. Изменил в таком случае свои геттеры на public, в прошлом ДЗ я делал их private,
           наверное их и нужно было сразу делать public, потому что у меня получается не было отдельного доступа к информации каждого поля.
           И ещё, я правильно мыслю, что те поля которые логически изменяться не должны (например для книги дата публикации или фио автора)
           для них нужно поставить модификатор final? У уже изданной книги не может же измениться название или автор или дата издания (final),
           но может измениться например количество страниц (двоечник их решил вырвать).
        */
    }
}