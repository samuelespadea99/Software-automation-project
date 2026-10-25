package contact_pack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	 public void testContactCreation() {

        Contact contact = new Contact( "222333", "Samuele", "Spadea", "0489332233","Melbourne" );

        assertEquals("222333", contact.getContactId());
        assertEquals("Samuele", contact.getFirstName());
        assertEquals("Spadea", contact.getLastName());
        assertEquals("0489332233", contact.getPhone());
        assertEquals("Melbourne", contact.getAddress());

	}

@Test
public void testInvalidContactValues(){

    assertThrows(IllegalArgumentException.class, () -> new Contact("1111333322222", "Samuele", "Spadea", "0489332233", "Melbourne"));

    assertThrows(IllegalArgumentException.class, () -> new Contact(null, "Samuele", "Spadea", "0489332233", "Melbourne"));

    assertThrows(IllegalArgumentException.class, () -> new Contact("222333", "Samueleeeeee", "Spadea", "0489332233", "Melbourne"));

    assertThrows(IllegalArgumentException.class, () -> new Contact("222333", "Samuele", "Spadeaaaaaaa", "0489332233", "Melbourne"));

    assertThrows(IllegalArgumentException.class, () -> new Contact("222333", "Samuele", "Spadea", "333222", "Melbourne"));

    assertThrows(IllegalArgumentException.class, () -> new Contact("222333", "Samuele", "Spadea", "3232323asd", "Melbourne"));

    assertThrows(IllegalArgumentException.class, () -> new Contact("222333", "Samuele", "Spadea", "0489332233","Docklands suburb Melbourne Australia"));

    assertThrows(IllegalArgumentException.class, () -> new Contact("222333",null, "Spadea", "0489332233", "Melbourne"));

    assertThrows(IllegalArgumentException.class, () -> new Contact("222333", "Samuele", null, "0489332233", "Melbourne"));

    assertThrows(IllegalArgumentException.class, () -> new Contact("222333", "Samuele", "Spadea",null, "Melbourne"));

    assertThrows(IllegalArgumentException.class, () -> new Contact("222333", "Samuele", "Spadea", "0489332233", null));

}

@Test
public void testContactUpdates(){

    Contact contact = new Contact( "222333", "Samuele", "Spadea", "0489332233", "Melbourne" );

    contact.setFirstName("Emma") ;
    contact.setLastName("Smith");
    contact.setPhone("3333000000");
    contact.setAddress("Sydney") ;

    assertEquals("Emma", contact.getFirstName());
    assertEquals("Smith", contact.getLastName());
    assertEquals("3333000000", contact.getPhone());
    assertEquals("Sydney", contact.getAddress());
    assertEquals("222333", contact.getContactId());
}}