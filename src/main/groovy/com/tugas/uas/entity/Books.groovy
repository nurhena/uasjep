package com.tugas.uas.entity
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Table
import jakarta.persistence.GenerationType
import jakarta.validation.constraints.NotNull
import jakarta.persistence.Column
import jakarta.persistence.OneToOne
import jakarta.persistence.FetchType
import jakarta.persistence.JoinColumn

@Entity
@Table(name = "books")
class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id
    @NotNull
    @Column(nullable = false)
    String name
    @Column(nullable = true)
    String isbn
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    private Books books;
}
