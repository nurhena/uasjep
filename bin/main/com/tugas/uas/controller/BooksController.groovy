package com.tugas.uas.controller
import com.tugas.uas.entity.Books
import com.tugas.uas.service.BooksCategoryService
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping('/books')
class BooksController {
    @Autowired
    private final BooksCategoryService booksCategoryService
    @GetMapping('')
    List<Books> findAll() {
        booksCategoryService.findAll()
        }

@GetMapping('{id}')
Books findById(@PathVariable('id') int id) {
    booksCategoryService.findById(id)
    }

@PostMapping()
Books save(@RequestBody Books books) {
    booksCategoryService.save(books)
    }

@PutMapping('{id}')
Books update(@RequestBody Books books, @PathVariable('id') int id) {
    booksCategoryService.update(books, id)
    }

@DeleteMapping('{id}')
Books delete(@PathVariable('id') int id) {
    booksCategoryService.delete(id)
    }
}
