package com.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.ProductModel;
import com.product.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
	@Autowired
	ProductService Service;

	@PostMapping("insert")
	public ProductModel insertProductModel(@RequestBody ProductModel insert) {
		return Service.insertProductModels(insert);
	}

	@GetMapping("viewall")
	public List<ProductModel> getAll() {
		return Service.getAll();
	}

	@RequestMapping(value = "view/{productNo}", method = RequestMethod.GET)
	public ProductModel getProductModelById(@PathVariable Long productNo) throws Exception {
		Optional<ProductModel> pm = Service.getProductModelById(productNo);
		if (!pm.isPresent())
			throw new Exception("not find ProductNumber- " + productNo);
		return pm.get();
	}

	@PostMapping("deleteall")
	public void deleteAllProductModel() {
		Service.deleteAllProductModel();
	}

	@RequestMapping(value = "/update/{productNo}", method = RequestMethod.PUT)
	public ProductModel updateProductModel(@RequestBody ProductModel updpm, @PathVariable Long productNo)
			throws Exception {
		Optional<ProductModel> pm = Service.getProductModelById(productNo);
		System.out.print("update???");
		if (!pm.isPresent())
			throw new Exception("not find ProductNunber- " + productNo);
		if (updpm.getProductName() == null || updpm.getProductName().isEmpty())
			updpm.setProductName(pm.get().getProductName());
		updpm.setProductNo(productNo);
		return Service.updateProductModel(updpm);
	}

	@RequestMapping(value = "delete/{productNo}", method = RequestMethod.DELETE)
	public ProductModel delete(@RequestBody ProductModel pm) {
		return Service.deletes(pm);
	}

	@RequestMapping(value = "pagination", method = RequestMethod.GET)
	public ResponseEntity<List<ProductModel>> getAllProductModel(@RequestParam(defaultValue = "0") Integer pageNo,
			@RequestParam(defaultValue = "3") Integer pageSize,
			@RequestParam(defaultValue = "productNo") String sortBy) {
		List<ProductModel> list = Service.getAllProductModel(pageNo, pageSize, sortBy);

		return new ResponseEntity<List<ProductModel>>(list, new HttpHeaders(), HttpStatus.OK);
	}

}
