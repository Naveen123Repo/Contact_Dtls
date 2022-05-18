package com.AshokIt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AshokIt.Entity.Contact;
import com.AshokIt.Service.ContactService;

@RestController
public class ContactRestController {
	
	@Autowired
	private ContactService service;
	
	@PostMapping("/contact")
	public ResponseEntity<String> CreateContact(@RequestBody Contact contact){
		
		String status = service.upsert(contact);
		
		return new ResponseEntity<>(status,HttpStatus.CREATED);	
	}
	
	@GetMapping("/contacts")
	public ResponseEntity<List<Contact>> getAllContacts(){
		
		List<Contact> allContacts = service.getAllContacts();
		
		return new ResponseEntity<>(allContacts,HttpStatus.OK);
		
	}
	
	@GetMapping("/contact/{cid}")
	public ResponseEntity<Contact> getContact(@PathVariable int cid){
		
		Contact contact = service.getContact(cid);
		return new ResponseEntity<>(contact,HttpStatus.OK);
		
	}
	@DeleteMapping("/contact/{id}")
	public ResponseEntity<String> deleteContactById(@PathVariable int id){
		
		String deleteContact = service.deleteContact(id);
		return new ResponseEntity<>(deleteContact,HttpStatus.OK);
		
	}
}
