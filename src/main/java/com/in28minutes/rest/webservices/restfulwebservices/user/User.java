package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {

private int id;

@Size(min=2, message = "Name should have at least 2 characters")
private String name;

@Past
private LocalDate birthDate;



public User(int id, String name, LocalDate birthDate) {
    this.id = id;
    this.name = name;
    this.birthDate = birthDate;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public LocalDate getBirthDate() {
    return birthDate;
}
public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
}

}
