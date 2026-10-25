package contact_pack;

public class Contact {
	private final String contactId;
	private String firstName;
	private String phone;
	private String lastName;
	private String address;

public Contact(String id, String first, String last, String phoneNumber,String homeAddress){

    if (id == null || id.length() > 10){
        throw new IllegalArgumentException("Invalid contact ID") ;
    }

    contactId = id;

    setFirstName(first);
    setLastName(last);
    setPhone(phoneNumber);
    setAddress(homeAddress);
}

public String getFirstName(){
   return firstName;
    }

public String getLastName(){
   return lastName;
    }

public String getContactId(){
  return contactId;
    }

public String getAddress(){
   return address;
    }

public String getPhone(){
   return phone;
    
}

public void setFirstName(String name){
    if (name == null || name.length()> 10){
    	
        throw new IllegalArgumentException("Invalid name") ;
   
    }
    firstName = name;
    
}

public void setLastName(String name){
    if (name == null || name.length() > 10){
        throw new IllegalArgumentException("Invalid surname");
   
    }

    lastName = name;
}

public void setAddress(String newAddress){
    if (newAddress == null || newAddress.length() > 30){
        throw new IllegalArgumentException("Invalid address");
    }

    address = newAddress;
}

public void setPhone(String number){
    if (number == null || number.length() != 10 || !number.matches("[0-9]+")){
        throw new IllegalArgumentException("Invalid number");
    }

    phone = number;
}}