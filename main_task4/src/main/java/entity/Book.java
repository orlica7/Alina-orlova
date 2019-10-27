package main.java.entity;

import java.util.Objects;

public class Book extends Edition {
    public Genre genre;
    private String author;

    public Book(String name, int pages, int age, Genre genre, String author, EditionType type) {
        super(name, pages, age, type);
        this.genre = genre;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Objects.equals(genre, book.genre) &&
                Objects.equals(author, book.author) &&
                Objects.equals(name, book.name) && pages == book.pages
                && age == book.age && Objects.equals(type, book.type);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Book{" +
                "genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                ", age=" + age +
                '}';
    }

    public Book(String name, int pages, int age, EditionType type) {
        super(name, pages, age, type);
    }


    public Genre getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }



}



