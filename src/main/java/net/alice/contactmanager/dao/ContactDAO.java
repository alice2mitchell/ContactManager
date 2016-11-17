package net.alice.contactmanager.dao;

/**
 * Created by Alina on 16.11.2016.
 */
import net.alice.contactmanager.domain.Contact;

import java.util.List;

public interface ContactDAO {

    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);
}