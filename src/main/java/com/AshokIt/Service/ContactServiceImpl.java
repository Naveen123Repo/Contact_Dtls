package com.AshokIt.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AshokIt.Entity.Contact;
import com.AshokIt.Repository.ContactsRepo;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactsRepo repo;

	@Override
	public String upsert(Contact contact) {
	contact.setActiveSw("Y");
		Contact saved = repo.save(contact);
		
		return "Sucess";
	}

	@Override
	public List<Contact> getAllContacts() {

		List<Contact> findAll = repo.findAll();
		return findAll;
	}

	@Override
	public Contact getContact(int cid) {
		Optional<Contact> findById = repo.findById(cid);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public String deleteContact(int cid) {
//		repo.deleteById(cid);
		Optional<Contact> findById = repo.findById(cid);	
		if(findById.isPresent()) {
			Contact contact = findById.get();
			contact.setActiveSw("N");
			repo.save(contact);
		}
		
		return "Successfully Deleted";
	}

}
