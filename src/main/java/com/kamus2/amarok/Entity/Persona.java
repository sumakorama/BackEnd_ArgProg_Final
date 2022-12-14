package com.kamus2.amarok.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Size(min=1, max=45, message="Error")
    private String name;
    @NotNull
    @Size(min=1, max=45, message="Error")
    private String surname;
    @NotNull
    @Size(min=1, max=255, message="Error")
    private String description;
    @NotNull
    @Size(min=1, max=255, message="Error")
    private String img;

    public Persona() {
    }

    public Persona(String name, String surname, String description, String img) {
        this.name = name;
        this.surname = surname;
        this.description = description;
        this.img = img;
    }

    public Persona(String name, String description) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    
       
    
}
