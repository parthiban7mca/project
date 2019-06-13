package com.bankatm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bankatm.model.BankAtmModel;
import com.bankatm.repository.BankAtmRepository;
@Component
public class BankAtmService {
	@Autowired
	BankAtmRepository Repository;

	public BankAtmModel insertBankmodel(BankAtmModel add) {
		return Repository.save(add);
	}

	public List<BankAtmModel> getAll() {
		return Repository.findAll();
	}
	public Optional<BankAtmModel> getBankAtmModelById(Long AccNum){
		return Repository.findById((long) AccNum);
	}
	public BankAtmModel updateBankAtmModel(BankAtmModel acc) {
	    return Repository.save(acc);
	    }
	public BankAtmModel deletes(BankAtmModel acc) {
		Repository.delete(acc);
		return(acc);	
      }
	
	public void deleteAllBankAtmModels() {
	    Repository.deleteAll();
	      }
}
