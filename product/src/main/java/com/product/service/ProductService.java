package com.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.product.model.ProductModel;
import com.product.repository.ProductRepository;

@Component
public class ProductService {

	@Autowired
	ProductRepository Repository;

	public ProductModel insertProductModels(ProductModel insert) {
		return Repository.save(insert);
	}

	public List<ProductModel> getAll() {
		return (List<ProductModel>) Repository.findAll();
	}

	public Optional<ProductModel> getProductModelById(Long productNo) {
		return Repository.findById(productNo);
	}

	public ProductModel deletes(ProductModel pm) {
		Repository.delete(pm);
		return (pm);
	}

	public void deleteAllProductModel() {
		Repository.deleteAll();
	}

	public ProductModel updateProductModel(ProductModel pm) {
		return Repository.save(pm);
	}

	public List<ProductModel> getAllProductModel(Integer pageNo, Integer pageSize, String sortBy) {

		Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
		Page<ProductModel> pagedResult = Repository.findAll(paging);
		if (pagedResult.hasContent()) {
			return pagedResult.getContent();

		} else {
			return new ArrayList<ProductModel>();
		}
	}
}
