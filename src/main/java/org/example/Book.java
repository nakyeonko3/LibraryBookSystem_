package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author= author;
        this.isbn = isbn;
    }


    // getBookInfo(): 책의 상세 정보를 출력합니다. (예: "Title: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 1234567890")
    public void getBookInfo() {
        System.out.println(String.format("Title: %s, Author: %s, ISBN: %s", title, author, isbn));
    }

}
