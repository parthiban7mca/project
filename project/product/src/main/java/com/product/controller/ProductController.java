package com.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.ProductModel;
import com.product.repository.ProductRepository;
import com.product.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
@Autowired
ProductService Service;
@Autowired 
ProductRepository Repository;

@PostMapping("insert")
public ProductModel insertProductModel(@RequestBody ProductModel insert) {
	return Service.insertProductModels(insert);
}
@GetMapping("viewall")
public List<ProductModel> getAll(){
	return Service.getAll();
}

@RequestMapping(value= "view/{ProductNo}", method= RequestMethod.GET)
	public ProductModel getProductModelById(@PathVariable Long ProductNo) throws Exception{
    Optional<ProductModel> pm =  Service.getProductModelById(ProductNo);
    if(!pm.isPresent())
        throw new Exception("not find ProductNumber- " + ProductNo);
        return pm.get();
}
@PostMapping("deleteall")
public void deleteAllProductModel() {
Service.deleteAllProductModel();
}
@RequestMapping(value= "/update/{ProductNo}", method= RequestMethod.PUT)
public ProductModel updateProductModel(@RequestBody ProductModel updpm, @PathVariable Long ProductNo) throws Exception {
Optional<ProductModel> pm =  Service. getProductModelById(ProductNo);
System.out.print("update???");
if (!pm.isPresent())
    throw new Exception("not find ProductNunber- " + ProductNo);
if(updpm.getProductName() == null || updpm.getProductName().isEmpty())
    updpm.setProductName(pm.get().getProductName());
updpm.setProductNo(ProductNo);
return Service.updateProductModel(updpm);
}
@RequestMapping(value= "delete/{ProductNo}", method= RequestMethod.DELETE)
public ProductModel delete(@RequestBody ProductModel pm) {
return Service.deletes(pm);
} 
@RequestMapping(value = "/customers", method = RequestMethod.GET)
public List<ProductModel> viewProductModel(@RequestParam(name = "p", defaultValue = "1") int pageNumber,int PAGESIZE) {
   
   System.out.println("------"+pageNumber+PAGESIZE);
 List<ProductModel> product = Service.getPage(pageNumber, PAGESIZE);
 return null ;
}
}
