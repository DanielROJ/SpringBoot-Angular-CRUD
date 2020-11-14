package com.co.projectsa.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name ="employ")
public class Employ implements Serializable {

    @Id
    @Column(name = "idemploy")
    private int idEmploy;

    @Column(name = "nameemploy")
    private String nameEmploy;

    @Column(name = "rol")
    private String rolEmploy;

    public Employ() {
    }

    public Employ(int idEmploy, String nameEmploy, String rolEmploy) {
        this.idEmploy = idEmploy;
        this.nameEmploy = nameEmploy;
        this.rolEmploy = rolEmploy;
    }

    public int getIdEmploy() {
        return idEmploy;
    }

    public void setIdEmploy(int idEmploy) {
        this.idEmploy = idEmploy;
    }

    public String getNameEmploy() {
        return nameEmploy;
    }

    public void setNameEmploy(String nameEmploy) {
        this.nameEmploy = nameEmploy;
    }

    public String getRolEmploy() {
        return rolEmploy;
    }

    public void setRolEmploy(String rolEmploy) {
        this.rolEmploy = rolEmploy;
    }


}
