package com.product.repository;

import org.springframework.stereotype.Repository;
import com.product.model.ProductModel;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

@Repository
public interface ProductRepository extends PagingAndSortingRepository <ProductModel, Long>  {

Page<ProductModel> findAll(Pageable pageable);

Optional<ProductModel> findById(Long productNo);

}
