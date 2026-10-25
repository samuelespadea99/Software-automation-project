package contact_pack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
    public void testDeleteContact(){

        ContactService service = new ContactService();

        Contact con = new Contact("222333","Samuele", "Spadea", "0489332233", "Melbourne");

        service.addContact(con);
        
        service.deleteContact("222333");
        assertNull(service.getContact("222333"));
    
	}

    @Test
    public void testAddContact(){

        ContactService service = new ContactService();

        Contact con = new Contact("222333","Samuele", "Spadea", "0489332233", "Melbourne");

        service.addContact(con);

        assertEquals(con, service.getContact("222333"));
    }

    @Test
    public void testDuplicateContactId() {

        ContactService service = new ContactService();

        Contact con1 = new Contact( "222333", "Samuele", "Spadea", "0489332233", "Melbourne" );

        Contact con2 = new Contact( "222333", "Emma","Smith", "3333000000", "Sydney" );

        service.addContact(con1);

        assertThrows(IllegalArgumentException.class, () ->
            service.addContact(con2));
    }

    @Test
    public void testUpdateContact() {

        ContactService service = new ContactService();

        Contact con = new Contact( "222333", "Samuele", "Spadea", "0489332233", "Melbourne" );

        service.addContact(con);

        service.updateFirstName("222333", "Emma");
        service.updateLastName("222333", "Smith");
        service.updatePhone("222333", "3333000000");
        service.updateAddress("222333", "Sydney");

        Contact upd = service.getContact("222333");

        assertEquals("Emma", upd.getFirstName());
        assertEquals("Smith", upd.getLastName());
        assertEquals("3333000000", upd.getPhone());
        assertEquals("Sydney", upd.getAddress());
    }
}