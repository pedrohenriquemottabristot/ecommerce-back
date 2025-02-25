package com.senai.ecommerce.service;

import com.senai.ecommerce.dtos.ProductDTO;
import com.senai.ecommerce.entities.Category;
import com.senai.ecommerce.entities.Product;
import com.senai.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Product product = productRepository.findById(id).orElseThrow();
        ProductDTO productDTO = productToProductDTO(product);
        return productDTO;
    }
    @Transactional(readOnly = true)
    public List<ProductDTO> findAll() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(product -> productToProductDTO(product)).toList();
    }
    @Transactional
    public ProductDTO create(ProductDTO productDTO) {
        Product product = productDTOToProduct(productDTO);
        Product savedProduct = productRepository.save(product);
        return productToProductDTO(savedProduct);
    }

    @Transactional
    public ProductDTO update(Long id, ProductDTO productDTO){
        Product product = productDTOToProduct(productDTO);
        product.setId(id);
        // o repository não consegue salvar um DTO, ele salva entity
        product = productRepository.save(product);
        return productToProductDTO(product);
    }

    @Transactional
    public void delete(Long id){
        productRepository.deleteById(id);
    }


    public ProductDTO productToProductDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setDescription(product.getDescription());
        productDTO.setPrice(product.getPrice());
        productDTO.setImgUrl(product.getImgUrl());
        productDTO.setCategories((List<Category>) product.getCategories());
        return productDTO;
    }

    public Product productDTOToProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        product.setImgUrl(productDTO.getImgUrl());
        product.setCategories(productDTO.getCategories());
        return product;
    }

//    private ProductDTO toDTO(Product product) {
//        return new ProductDTO(product.getId(), product.getName(), product.getDescription(), product.getPrice(), product.getImgUrl(), product.getCategories());
//    }
//    private Product toEntity(ProductDTO productDTO) {
//        return new Product(productDTO.getName(), productDTO.getDescription(), productDTO.getPrice(), productDTO.getImgUrl(), productDTO.getCategories());
//    }
}
