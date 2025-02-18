package com.senai.ecommerce.dtos;

import lombok.Data;

@Data
public class CategoryDTO {
    private Long id;
    private String name;

    public CategoryDTO(Long id, String name) {
    }
}
