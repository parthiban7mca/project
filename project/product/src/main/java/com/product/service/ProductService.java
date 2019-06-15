package com.product.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.product.model.ProductModel;
import com.product.repository.ProductRepository;

@Component
public class ProductService {

	@Autowired
	ProductRepository Repository;
	public ProductModel insertProductModels(ProductModel insert) {
		return Repository.save(insert);
	      }
	    public List<ProductModel> getAll(){
		return (List<ProductModel>) Repository.findAll();
		  }
	    public Optional<ProductModel> getProductModelById(Long ProductNo){
		return Repository.findById((long) ProductNo);
		  }
	    public ProductModel deletes(ProductModel pm) {
			Repository.delete(pm);
			return(pm);	
	      }
	    public void deleteAllProductModel() {
	    Repository.deleteAll();
	      }
	    public ProductModel updateProductModel(ProductModel pm) {
	    return Repository.save(pm);
	    }
	    public List<ProductModel> getPage(@RequestParam int pageNumber,int PAGESIZE) {
	    	
	        @SuppressWarnings("deprecation")
			PageRequest request = new PageRequest(pageNumber - 1, PAGESIZE, Sort.Direction.ASC, "ProdectNo");
	    	 return Repository.findAll(request).getContent();
	          } 
	    public Page<ProductModel> findJsonDataByCondition(String orderBy, String direction, int page, int size) {
	    	Sort sort = null;
	    	if (direction.equals("ASC")) {
	    	sort = new Sort(new Sort.Order(Direction.ASC, orderBy));
	    	}
	    	if (direction.equals("DESC")) {
	    	sort = new Sort(new Sort.Order(Direction.DESC, orderBy));
	    	}
	    	Pageable pageable = (Pageable) new PageRequest(page, size, sort);
	    	Page<ProductModel> data = Repository.findAll(pageable);
	    	return data;
	    	     }
}
