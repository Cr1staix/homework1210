public class Main {
    public static void main(String[] args) {
        Author leoTolstoy = new Author();
        leoTolstoy.setAuthorFirstName("Лев");
        leoTolstoy.setAuthorLastName("Толстой");

        Author fyodorDostoevsky = new Author();
        fyodorDostoevsky.setAuthorFirstName("Фёдор");
        fyodorDostoevsky.setAuthorLastName("Достоевский");

        Book warAndPeace = new Book();
        warAndPeace.setAuthor(leoTolstoy);
        warAndPeace.setBookName("Война и мир");
        warAndPeace.setYearPublication(1869);

        Book thePlayer = new Book();
        thePlayer.setAuthor(fyodorDostoevsky);
        thePlayer.setBookName("Игрок");
        thePlayer.setYearPublication(1866);

        System.out.println(warAndPeace.getBookInfo());
        System.out.println(thePlayer.getBookInfo());
    }
}