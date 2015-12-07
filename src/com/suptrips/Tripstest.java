package com.suptrips;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by root on 07/12/15.
 */
@Entity
@Table(name = "Trips", schema = "SupTrips", catalog = "")
public class Tripstest {
    private int idtrip;
    private Date departDate;
    private Date arriveDate;
    private String departCampus;
    private String arriveCampus;

    @Id
    @Column(name = "idtrip")
    public int getIdtrip() {
        return idtrip;
    }

    public void setIdtrip(int idtrip) {
        this.idtrip = idtrip;
    }

    @Basic
    @Column(name = "depart_date")
    public Date getDepartDate() {
        return departDate;
    }

    public void setDepartDate(Date departDate) {
        this.departDate = departDate;
    }

    @Basic
    @Column(name = "arrive_date")
    public Date getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    @Basic
    @Column(name = "depart_campus")
    public String getDepartCampus() {
        return departCampus;
    }

    public void setDepartCampus(String departCampus) {
        this.departCampus = departCampus;
    }

    @Basic
    @Column(name = "arrive_campus")
    public String getArriveCampus() {
        return arriveCampus;
    }

    public void setArriveCampus(String arriveCampus) {
        this.arriveCampus = arriveCampus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tripstest tripstest = (Tripstest) o;

        if (idtrip != tripstest.idtrip) return false;
        if (departDate != null ? !departDate.equals(tripstest.departDate) : tripstest.departDate != null) return false;
        if (arriveDate != null ? !arriveDate.equals(tripstest.arriveDate) : tripstest.arriveDate != null) return false;
        if (departCampus != null ? !departCampus.equals(tripstest.departCampus) : tripstest.departCampus != null)
            return false;
        if (arriveCampus != null ? !arriveCampus.equals(tripstest.arriveCampus) : tripstest.arriveCampus != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtrip;
        result = 31 * result + (departDate != null ? departDate.hashCode() : 0);
        result = 31 * result + (arriveDate != null ? arriveDate.hashCode() : 0);
        result = 31 * result + (departCampus != null ? departCampus.hashCode() : 0);
        result = 31 * result + (arriveCampus != null ? arriveCampus.hashCode() : 0);
        return result;
    }
}
