package com.creditcardstatement.admin.repository;

import com.creditcardstatement.admin.model.CreditCard;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CreditCardRepository extends  JpaRepository<CreditCard, Long>{
	
	Page<CreditCard> findById(Long id, Pageable pageable);
}
