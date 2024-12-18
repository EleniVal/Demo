package org.example.demo3;

import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class StudentFour {

    private String firstName;
    private String lastName;
    private List<String > languages;

    public StudentFour() {
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

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }
}
