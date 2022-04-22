package com.AshokIt.Service;

import java.util.List;

import com.AshokIt.Entity.Contact;

public interface ContactService {
	
	public String upsert (Contact contact);

	public List<Contact> getAllContacts();

	public Contact getContact (int cid);

	public String deleteContact (int cid);

}
