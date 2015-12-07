package com.suptrips;

import javax.persistence.*;

/**
 * Created by root on 07/12/15.
 */
@Entity
@Table(name = "Users", schema = "SupTrips", catalog = "")
public class Userstest {
    private int idbooster;
    private String firstname;
    private String lastname;
    private String email;
    private String campusName;
    private String password;

    @Id
    @Column(name = "idbooster")
    public int getIdbooster() {
        return idbooster;
    }

    public void setIdbooster(int idbooster) {
        this.idbooster = idbooster;
    }

    @Basic
    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "campus_name")
    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Userstest userstest = (Userstest) o;

        if (idbooster != userstest.idbooster) return false;
        if (firstname != null ? !firstname.equals(userstest.firstname) : userstest.firstname != null) return false;
        if (lastname != null ? !lastname.equals(userstest.lastname) : userstest.lastname != null) return false;
        if (email != null ? !email.equals(userstest.email) : userstest.email != null) return false;
        if (campusName != null ? !campusName.equals(userstest.campusName) : userstest.campusName != null) return false;
        if (password != null ? !password.equals(userstest.password) : userstest.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idbooster;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (campusName != null ? campusName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
