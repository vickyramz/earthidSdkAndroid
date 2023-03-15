package com.example.earthidlibservice;

import java.util.ArrayList;

public class Person {
    private String id;
    private String firstName;
    private String lastName;
    private String idCode;
    private String dateOfBirth;
    private String gender;
    private String nationality;
    private String placeOfBirth;
    ArrayList<Object> citizenships = new ArrayList<Object>();


    // Getter Methods

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdCode() {
        return idCode;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    // Setter Methods

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
}
