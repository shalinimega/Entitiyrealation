package com.Onesoft.Filpkart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Onesoft.Filpkart.entity.ProductEntity;

public interface ProductRepository  extends JpaRepository<ProductEntity, Integer>{

}
