package com.sub.springdemo2.bootstrap;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sub.springdemo2.model.Author;
import com.sub.springdemo2.model.Book;
import com.sub.springdemo2.model.Publisher;
import com.sub.springdemo2.repository.AuthorRepository;
import com.sub.springdemo2.repository.BookRepository;
import com.sub.springdemo2.repository.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepo;
    private final BookRepository bookRepo;
    private final PublisherRepository pubRepo;

    public BootStrapData(AuthorRepository authorRepo, BookRepository bookRepo, PublisherRepository pubRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
        this.pubRepo = pubRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher("pub1", "address1");
        pubRepo.save(publisher);

        Author a1 = new Author("John", "Black");
        Book b1 = new Book("bn1", "bid1");
        a1.getBooks().add(b1);
        b1.getAuthors().add(a1);
        b1.setPublisher(publisher);
        publisher.getBooks().add(b1);
        authorRepo.save(a1);
        bookRepo.save(b1);
        pubRepo.save(publisher);

        Author a2 = new Author("Alex", "Pen");
        Book b2 = new Book("bn2", "bid2");
        a2.getBooks().add(b2);
        b2.getAuthors().add(a2);
        b2.setPublisher(publisher);
        publisher.getBooks().add(b2);
        authorRepo.save(a2);
        bookRepo.save(b2);
        pubRepo.save(publisher);

        System.out.println("Started a bootstrap, number of books: " + bookRepo.count());
        System.out.println("Publisher in db: " + pubRepo.findAll());

    }

}
