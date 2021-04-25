package ru.otus.hw13.service;

import org.springframework.data.domain.Pageable;
import ru.otus.hw13.dto.Book;
import ru.otus.hw13.dto.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentService {

    Comment save(Comment comment);

    Optional<Comment> findById(String id);

    List<Comment> findAll();

    List<Comment> findAll(Pageable pageable);

    List<Comment> findByBook(Book book);

    void delete(Comment comment);

    void deleteById(String id);
}
