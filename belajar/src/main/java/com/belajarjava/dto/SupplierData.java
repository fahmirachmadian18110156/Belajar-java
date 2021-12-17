package com.belajarjava.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class SupplierData {

    @NotEmpty(message = "Name is Required")
    private String name;

    @NotEmpty(message = "address is Required")
    private String address;

    @NotEmpty(message = "Email is Required")
    @Email(message = "Email isn't Valid")
    private String Email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

}
