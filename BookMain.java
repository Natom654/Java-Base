package Lesson11;

import java.awt.print.Book;

public class BookMain {
    public static void main(String[] args) {
        Author author =new Author();
        Title title = new Title();
        Content content = new Content ();
        author.setAuthor("Сьерра Кэти");
        title.setTitle("Изучаем Java");
        content.setContent("«Изучаем Java» — это не просто книга. Она не только научит вас теории языка Java и объектно-ориентированного программирования, она сделает вас программистом. ");
        author.show();
        title.show();
        content.show();
    }
}
class Title {
    public String title;
    public void setTitle(String title) {
        this.title = title;
    }
    void show() {
        System.out.println( "Заголовок книги "+ title);}
}
class Author {
    public String author;
    public void setAuthor(String author) {
        this.author = author;
    }
    void show() {
        System.out.println( "Автор:  "+ author);}
}
class Content {
    public String content;
    public void setContent(String content) {
        this.content = content;
    }
    void show() {
        System.out.println( "Описание: "+ content);}
}

