package com.mj.spring_boot.javers.book.web;


import com.mj.spring_boot.javers.book.BookRepository;
import com.mj.spring_boot.javers.book.entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/book")
public class BookRestController {

    private BookRepository bookRepository;

    @Autowired
    public BookRestController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/{id}")
    private Book getBook(@PathVariable("id") Integer bookId){
        return bookRepository.getOne(bookId);
    }
}
