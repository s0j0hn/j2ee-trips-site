/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package com.suptrips;

import javax.persistence.*;
import java.io.Serializable;
@Entity

@Table(name = "Trips", schema = "SupTrips")
public class Trips implements Serializable {
	public Trips() {
	}
	
	@Column(name="idtrip", nullable=false, length=11)	
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)

	private Long idtrip;
	
	@Column(name="depart_date", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date depart_date;
	
	@Column(name="arrive_date", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date arrive_date;
	
	@Column(name="depart_campus", nullable=true, length=45)	
	private String depart_campus;
	
	@Column(name="arrive_campus", nullable=true, length=45)	
	private String arrive_campus;
	
	@OneToMany(mappedBy="trip_idtrip", targetEntity=com.suptrips.Users.class)	

	private java.util.Set users = new java.util.HashSet();
	
	private void setIdtrip(Long value) {
		this.idtrip = value;
	}
	
	public Long getIdtrip() {
		return idtrip;
	}
	
	public void setDepart_date(java.util.Date value) {
		this.depart_date = value;
	}
	
	public java.util.Date getDepart_date() {
		return depart_date;
	}
	
	public void setArrive_date(java.util.Date value) {
		this.arrive_date = value;
	}
	
	public java.util.Date getArrive_date() {
		return arrive_date;
	}
	
	public void setDepart_campus(String value) {
		this.depart_campus = value;
	}
	
	public String getDepart_campus() {
		return depart_campus;
	}
	
	public void setArrive_campus(String value) {
		this.arrive_campus = value;
	}
	
	public String getArrive_campus() {
		return arrive_campus;
	}
	
	public void setUsers(java.util.Set value) {
		this.users = value;
	}
	
	public java.util.Set getUsers() {
		return users;
	}

	public String toString() {
		return String.valueOf(getIdtrip());
	}
	
}
