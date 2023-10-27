package com.tugas.uas.service
import com.tugas.uas.entity.Books

interface BooksCategoryService {
    List<Books> findAll()
    Books findById(int id)
    Books save(Books books)
    Books update(Books books, int id)
    Books delete(int id)
}
