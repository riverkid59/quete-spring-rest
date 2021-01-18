package BookRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import BookEntity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	
	List<Book> findByTitleContainingOrDescriptionContaining(String searchTerm, String searchTerm2);

}
