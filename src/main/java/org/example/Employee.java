package org.example;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "Employees", schema = "w3schools")
public class Employee {

    @Id
    @Column(name = "EmployeeID", nullable = false)
    private int id;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "BirthDate")
    private LocalDate birthDate;

    @Column(name = "Photo")
    private String photo;

    @Column(name = "Notes")
    private String notes;

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public Employee(String lastName, String firstName, LocalDate birthDate, String photo, String notes) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.photo = photo;
        this.notes = notes;
    }

    public Employee(int id, String lastName, String firstName, LocalDate birthDate, String photo, String notes) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.photo = photo;
        this.notes = notes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && Objects.equals(lastName, employee.lastName) && Objects.equals(firstName, employee.firstName) && Objects.equals(birthDate, employee.birthDate) && Objects.equals(photo, employee.photo) && Objects.equals(notes, employee.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, birthDate, photo, notes);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birthDate=" + birthDate +
                ", photo='" + photo + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
