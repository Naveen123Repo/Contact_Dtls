package com.AshokIt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AshokIt.Entity.Contact;

public interface ContactsRepo extends JpaRepository<Contact, Integer> {

}
