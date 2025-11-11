package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;


public class ProductDTO {

    private Long id;
    @Size(min = 3, max = 80, message = "O nome deve ter entre 3 e 80 caracteres")
    @NotNull(message = "Campo requerido")
    private String name;
    @Positive(message = "O preço deve ser um valor positivo")
    private Double price;
    @Size(min = 10, message = "A descrição deve ter no mínimo 10 caracteres")
    @NotBlank(message = "Campo requerido")
    private String description;
    private String imgUrl;

    public ProductDTO() {
    }
    
    public ProductDTO(Long id, String name, Double price, String description, String imgUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imgUrl = imgUrl;
    }
    
    public ProductDTO(Product entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.price = entity.getPrice();
        this.description = entity.getDescription();
        this.imgUrl = entity.getImgUrl();
    }
    
    public Long getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public Double getPrice() {
        return price;
    }
    
    public String getDescription() {
        return description;
    }

    public String getImgUrl() {
        return imgUrl;
    }   
     
    public void setId(Long id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
