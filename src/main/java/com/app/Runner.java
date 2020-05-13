package com.app;

import com.app.model.Book;
import com.app.storage.BookStorage;

public class Runner {
	
    public static void main(String[] args) {

        BookStorage storage = new BookStorage();

        storage.getBooks().stream().forEach((Book b) -> System.out.println(b));

    }

}
