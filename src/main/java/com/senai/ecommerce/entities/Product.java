package com.senai.ecommerce.entities;

import com.senai.ecommerce.dtos.CategoryDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "tb_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double price;
    private String imgUrl;

    @ManyToMany
    @JoinTable(name = "tb_product_category",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories = new HashSet<>();


    public Product(@Size(min = 2, max = 100, message = "O Campo nome precisa ter entre 2 e 100 caracteres") @NotBlank(message = "O campo nome não pode ser vazio") String name, @Size(min = 10, message = "O campo descrição precisa ter entre 2 e 500 caracteres") @NotBlank(message = "O campo descrição não pode ser vazio") String description, @NotNull(message = "O campo preço não pode ser vazio") @Positive(message = "O campo preço precisa ser positivo") double price, String imgUrl, @NotEmpty(message = "O campo categorias não pode ser vazio") List<CategoryDTO> categories) {
    }

    public Product() {

    }

    public void setCategories(@NotEmpty(message = "O campo categorias não pode ser vazio") List<CategoryDTO> categories) {
    }
}
