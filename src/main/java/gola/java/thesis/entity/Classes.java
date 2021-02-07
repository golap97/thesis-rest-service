package gola.java.thesis.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "classes_db")
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @NotBlank(message = "Podaj przedmiot.")
    private String subject;
    @NotBlank(message = "Podaj prowadzącego.")
    private String lecturer;
    @NotBlank(message = "Podaj forme zajęć (seminarium, wykład, laboratoria, ćwiczenia).")
    private String form;
    @NotBlank(message = "Zaliczenie true, czy false?")
    private boolean pass;

    public Classes() {
    }

    public Classes(int id, String subject, String lecturer, String form, boolean pass) {
        this.id = id;
        this.subject = subject;
        this.lecturer = lecturer;
        this.form = form;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public boolean isPass() {
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }
}
