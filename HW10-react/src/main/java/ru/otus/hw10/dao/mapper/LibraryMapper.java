package ru.otus.hw10.dao.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.otus.hw10.dto.Author;
import ru.otus.hw10.dto.Book;
import ru.otus.hw10.dto.Comment;
import ru.otus.hw10.dto.Genre;

@Mapper(componentModel = "spring")
public interface LibraryMapper {

    LibraryMapper INSTANCE = Mappers.getMapper( LibraryMapper.class );

    Genre map(ru.otus.hw10.dao.domain.Genre genre);

    ru.otus.hw10.dao.domain.Genre map(Genre genre);

    Author map(ru.otus.hw10.dao.domain.Author author);

    ru.otus.hw10.dao.domain.Author map(Author author);

    Book map(ru.otus.hw10.dao.domain.Book book);

    ru.otus.hw10.dao.domain.Book map(Book book);

    Comment map(ru.otus.hw10.dao.domain.Comment comment);

    ru.otus.hw10.dao.domain.Comment map(Comment comment);
}
