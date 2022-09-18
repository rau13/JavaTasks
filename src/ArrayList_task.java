import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList_task {
    public static void main(String[] args){
        ArrayList<Book> books_array = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("1.Добавить книгу\n2.Найти книгу\n3.Вывести последние 10 книг");
            String answer = scan.nextLine();
            switch (answer){
                case "1":
                    System.out.println("Введите цену, год, название, автора ");
                    int amount = scan.nextInt();
                    int year = scan.nextInt();
                    scan.nextLine();
                    String name = scan.nextLine();
                    String author = scan.nextLine();
                    Book book = new Book(name, amount, year, author);
                    books_array.add(book);
                    if (book.getName().equals(name)){
                        System.out.println(book.getInfo());
                    }
                    break;
                case "2":
                    System.out.println("Введите навзание");
                    String book_name = scan.nextLine();
                    for(Book i: books_array){
                        if (i.getName().equals(book_name)){
                            System.out.println(i.getInfo());
                        }else{
                            System.out.println("Not found");
                        }
                    }
                case "3":
                    try {
                        for (int i = 0; i<=9; i++){
                            System.out.println(books_array.get(i).getInfo());
                    }
                }catch (Exception e ){
                        System.out.println("Not enough books in library");
                    }
        }

    }
}
static class Book{
    private String name;
    private String author;
    private int amount;
    private int year;
    public Book(){

    }
    public Book(String name, int amount, int year, String author){
        this.name = name;
        this.author = author;
        this.amount = amount;
        this.year = year;
    }
    public String getInfo(){
        return "Book name- " + name + ", Author- " + author + ", Amount- " + amount + ", Year- " + year;
    }

    public String getName() {
        return name;
        }
    }
}