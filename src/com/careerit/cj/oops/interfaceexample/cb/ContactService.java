package com.careerit.cj.oops.interfaceexample.cb;

import java.util.List;

public interface ContactService {

	public String addContact(Contact contact);

	public List<Contact> search(String str);

	public List<Contact> allContacts();

	public Contact findById(String id);

	public boolean removeContact(String id);

	public void exportToCSV();
}
