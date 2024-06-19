package com.sparta.jk;

import java.util.Objects;

public class Spartan {
    private String firstName;
    private String lastName;

    public Spartan(String firstName, String lastName) {
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

    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
        return (o instanceof Spartan otherSpartan)
         &&   getFirstName().equals(otherSpartan.getFirstName())
         && getLastName().equals(otherSpartan.getLastName());

    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
