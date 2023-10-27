package com.tugas.uas.service.impl
import com.tugas.uas.entity.Books
import com.tugas.uas.repository.BooksRepository
import com.tugas.uas.service.BooksCategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BooksCategoryServiceImpl implements BooksCategoryService {
    @Autowired
    private final BooksRepository BooksRepository
    @Override
    List<Books> findAll() {
        BooksRepository.findAll()
        }
        
    @Override
    Books findById(int id) {
        BooksRepository.findById(id)
        }
        
    @Override
    Books save(Books books) {
        BooksRepository.save(books)
        }
        
    @Override
    Books update(Books books, int id) {
        def record = BooksRepository.findById(id)
        record.with {
            name = books.name
            isbn = books.isbn
            }
        BooksRepository.save(record)
        record
        }
        
    @Override
    Books delete(int id) {
        def record = BooksRepository.findById(id)
        BooksRepository.delete(record)
        record
        }
}
