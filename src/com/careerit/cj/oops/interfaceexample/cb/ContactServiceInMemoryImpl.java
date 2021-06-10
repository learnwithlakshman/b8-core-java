package com.careerit.cj.oops.interfaceexample.cb;

import java.util.ArrayList;
import java.util.List;

public class ContactServiceInMemoryImpl implements ContactService {

	private List<Contact> contacts;
	
	
	public ContactServiceInMemoryImpl() {
		this.contacts = new ArrayList<>();
	}

	@Override
	public String addContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> allContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeContact(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void exportToCSV() {
		// TODO Auto-generated method stub

	}

}
