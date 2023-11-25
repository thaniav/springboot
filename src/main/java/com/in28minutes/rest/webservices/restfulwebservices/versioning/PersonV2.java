package com.in28minutes.rest.webservices.restfulwebservices.versioning;

class Name{
private String firstName;
private String lastName;


public Name(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
}
public String getFirstName() {
    return firstName;
}
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
public String getLastName() {
    return lastName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}


}
public class PersonV2 {
   private Name name;

   
public PersonV2(Name name) {
    this.name = name;
}

public Name getName() {
    return name;
}

public void setName(Name name) {
    this.name = name;
} 

    
    


}
