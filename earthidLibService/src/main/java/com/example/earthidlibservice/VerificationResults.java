package com.example.earthidlibservice;

import com.example.earthidlibservice.Person;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class VerificationResults {
    @SerializedName("status")
    private String status;
    @SerializedName("Person")
    Person person;


    // Getter Methods

    public String getStatus() {
        return status;
    }

    public Person getPerson() {
        return person;
    }

    // Setter Methods

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPerson(Person personObject) {
        this.person = personObject;
    }
}
