package com.tugas.uas.repository
import com.tugas.uas.entity.Books
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BooksRepository extends JpaRepository<Books, Integer> {
    List<Books> findAll()
    Books findById(Integer id)
    Books save(Books books)
    void delete(Books books)
}
