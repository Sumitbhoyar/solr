package com.example.solr.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection = "books2")
public class Book {
    @Id
    @Indexed(name = "id", type = "string")
    private String bookId;

    @Indexed(name = "cat", type = "string")
    private String category;

    @Indexed(name = "name", type = "string")
    private String name;

    @Indexed(name = "sequence_i", type = "string")
    private String sequence;

    @Indexed(name = "price", type = "pdoubles")
    private Double price;

    @Indexed(name = "author", type = "string")
    private String author;

    @Indexed(name = "genre_s_", type = "string")
    private String genre;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
