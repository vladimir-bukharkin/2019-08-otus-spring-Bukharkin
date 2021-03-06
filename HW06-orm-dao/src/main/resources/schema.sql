DROP TABLE IF EXISTS Authors;
DROP TABLE IF EXISTS Genres;
DROP TABLE IF EXISTS Books;
DROP TABLE IF EXISTS AuthorBookRelations;
CREATE TABLE Authors(
    Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(255) NOT NULL,
    LastName VARCHAR(255),
    UNIQUE (FirstName, LastName)
);
CREATE TABLE Genres(
    Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(255) NOT NULL UNIQUE
);
CREATE TABLE Books(
    Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(255) NOT NULL,
    GenreId INT NOT NULL,
    FOREIGN KEY (GenreId) REFERENCES Genres(Id)
);
CREATE TABLE AuthorBookRelations(
    AuthorId INT NOT NULL,
    BookId INT NOT NULL,
    FOREIGN KEY (AuthorId) REFERENCES Authors(Id),
    FOREIGN KEY (BookId) REFERENCES Books(Id),
    UNIQUE (AuthorId, BookId)
);
