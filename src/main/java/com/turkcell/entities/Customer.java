package com.turkcell.entities;

import java.time.LocalDate;

//BaseEntity sınıfını extend edelim (ID özelliği için)
public class Customer extends BaseEntity {
    // Customer nesnesinin özelliklerini yazalım
    public String firstName;
    public String lastName;
    public LocalDate dateOfBirth;
    public String nationalityId;

    //Getter Setter oluşturalım
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
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getNationalityId() {
        return nationalityId;
    }
    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
}
