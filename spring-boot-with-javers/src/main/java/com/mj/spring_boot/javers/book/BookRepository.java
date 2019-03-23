package com.mj.spring_boot.javers.book;

import com.mj.spring_boot.javers.book.entity.Book;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@JaversSpringDataAuditable
public interface BookRepository extends JpaRepository<Book,Integer> {
}
