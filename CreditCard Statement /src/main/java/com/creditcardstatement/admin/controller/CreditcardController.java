package com.creditcardstatement.admin.controller;

import com.creditcardstatement.admin.model.CreditCard;
import com.creditcardstatement.admin.repository.CreditCardRepository;
import com.creditcardstatement.admin.exception.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class CreditcardController {
	
	
	@Autowired
	private CreditCardRepository creditCardRepository;
	
	@GetMapping("/creditCards")
    public Page<CreditCard> getAllCreditCards(Pageable pageable) {
        return creditCardRepository.findAll(pageable);
    }
	
	@DeleteMapping("/creditCards/{Id}")
    public ResponseEntity<?> deletePost(@PathVariable Long Id) {
        return creditCardRepository.findById(Id).map(post -> {
        	creditCardRepository.delete(post);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("CreditId " + Id + " not found"));
    }
	
	
}

