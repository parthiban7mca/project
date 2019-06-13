package com.bankatm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankatm.model.BankAtmModel;
@Repository
public interface BankAtmRepository extends JpaRepository<BankAtmModel, Long>{

}
