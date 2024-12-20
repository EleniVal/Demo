package org.example.demo3;

import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class StudentTwo {
    private String firstName;
    private String lastName;
    private String country;
    List<String> countryOptions;

    public StudentTwo() {
       countryOptions= new ArrayList<String>();
        countryOptions.add("India");
        countryOptions.add("USA");
        countryOptions.add("Japan");

    }

    public List<String> getCountryOptions() {
        return countryOptions;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
