package com.Juan.Stock.service;

import com.Juan.Stock.model.Product;
import com.Juan.Stock.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    public List<Product>getAllProducts(){
        return productRepository.findAll();
    }
    public Optional<Product> getProductById(int id){
        return productRepository.findById(id);
    }
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }
    public boolean deleteProduct(int id){
        if(productRepository.existsById(id)){
            productRepository.deleteById(id);
            return true;
        }
        return  false;
    }
    public Optional<Product> updateProduct(int id,Product product){
        return productRepository.findById(id).map(existingProduct ->{
            existingProduct.setName(product.getName());
            existingProduct.setPrice(product.getPrice());
            return productRepository.save(existingProduct);
        });
    }
}
