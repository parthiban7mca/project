package com.bankatm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bankatm.model.BankAtmModel;
import com.bankatm.service.BankAtmService;

@RestController
@RequestMapping("Bank")
public class BankAtmController {

	@Autowired
	BankAtmService Service;

	@PostMapping("add")
	public BankAtmModel insertEmployee(@RequestBody BankAtmModel insert) {
		return Service.insertBankmodel(insert);
	}

	@GetMapping("viewall")

	public List<BankAtmModel> getAll() {
		return Service.getAll();
		}
	@RequestMapping(value= "view/{AccNo}", method= RequestMethod.GET)
	public BankAtmModel getBankatmModelById(@PathVariable Long AccNo) throws Exception{
    Optional<BankAtmModel> acc =  Service.getBankAtmModelById(AccNo);
    if(!acc.isPresent())
        throw new Exception("not find employeeid- " + AccNo);
        return acc.get();
	}
	@RequestMapping(value= "/update/{AccNo}", method= RequestMethod.PUT)
    public BankAtmModel updateBankatmModel(@RequestBody BankAtmModel updacc, @PathVariable Long AccNo) throws Exception {
    Optional<BankAtmModel> acc =  Service.getBankAtmModelById(AccNo);
    System.out.print("update???");
    if (!acc.isPresent())
        throw new Exception("not find employee AccNo- " + AccNo);
    if(updacc.getAccName() == null || updacc.getAccName().isEmpty())
    	updacc.setAccName(acc.get().getAccName());
    updacc.setAccNo(AccNo);
    return Service.updateBankAtmModel(updacc);
    }
	@RequestMapping(value= "delete/{id}", method= RequestMethod.DELETE)
	   public BankAtmModel deletes(@RequestBody BankAtmModel acc) {
		return Service.deletes(acc);
	   } 
	@PostMapping("deleteall")
    public void deleteAllBankAtmModels() {
	Service.deleteAllBankAtmModels();
    }
	
}
