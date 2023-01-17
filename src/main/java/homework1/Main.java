package homework1;



public class Main {
    public static void main(String[] args) {
        Author michaelBulgakov = new Author("Michael", "Bulgakov");
        Book firstBook = new Book("dog's heart", michaelBulgakov, 1925);
        System.out.println(michaelBulgakov.equals(firstBook));
        System.out.println(firstBook.getBookName()+" "+ firstBook.getPublishYear()+" "+firstBook.getAuthor().getName()+""+firstBook.getAuthor().getSurname());

        System.out.println(firstBook);
        firstBook.setPuplishYear("");
        System.out.println(firstBook.getPublishYear(1));
    }

}