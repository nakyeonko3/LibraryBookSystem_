package org.example;

import lombok.Builder;
import lombok.Getter;

public class EBook extends Book {
    private String fileFormat;
    public EBook(String title, String author, String isbn, String fileFormat) {
        super(title, author, isbn);
        this.fileFormat = fileFormat;
    }

    @Override
    public void getBookInfo() {
        System.out.println(String.format("Title: %s, Author: %s, ISBN: %s, FileFormat: %s", getTitle(), getAuthor(), getIsbn(), fileFormat));
    }

}
