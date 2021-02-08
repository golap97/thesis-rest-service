package gola.java.thesis.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "students_db")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Imie jest puste. Wpisz je!")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "Nazwisko jest puste. Wpisz je!")
    @Column(name = "last_name")
    private String lastName;

    @NotBlank(message = "Kierunek studiow jest pusty. Wpisz go!")
    @Column(name = "field_of_study")
    private String fieldOfStudy;

    @NotBlank(message = "Semestr nie jest podany. Wpisz go!")
    @Column(name = "semestr")
    private int semestr;

    @NotBlank(message = "Numer telefonu nie jest podany. Wpisz go!")
    @Column(name = "phone")
    private int phone;

    public Student() {
    }

    public Student(int id, String name, String lastName, String fieldOfStudy, int semestr, int phone) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.fieldOfStudy = fieldOfStudy;
        this.semestr = semestr;
        this.phone = phone;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public int getSemestr() {
        return semestr;
    }

    public void setSemestr(int semestr) {
        this.semestr = semestr;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

}