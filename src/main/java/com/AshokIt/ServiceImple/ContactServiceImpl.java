package com.AshokIt.ServiceImple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AshokIt.Entity.Contact;
import com.AshokIt.Repository.ContactsRepo;
import com.AshokIt.Service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactsRepo Repo;

	@Override
	public String upsert(Contact contact) {
		
		Contact save = Repo.save(contact);
		return "Sucess";
	}

	@Override
	public List<Contact> getAllContacts() {
		
		return Repo.findAll();
	}

	@Override
	public Contact getContact(int cid) {
		
		Optional<Contact> findById = Repo.findById(cid);
		 if(findById.isPresent()) {
			 return findById.get();
		 }
		return null;
	}

	@Override
	public String deleteContact(int cid) {
		
		Repo.deleteById(cid);
		return "Success";
	}

}
