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

import java.io.Serializable;
import javax.persistence.*;
@Entity

@Table(name="Users")
public class Users implements Serializable {
	public Users() {
	}
	
	@Column(name="idbooster", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="COM_SUPTRIPS_USERS_IDBOOSTER_GENERATOR")	

	private int idbooster;
	
	@Column(name="firstname", nullable=true, length=45)	
	private String firstname;
	
	@Column(name="lastname", nullable=true, length=45)	
	private String lastname;
	
	@Column(name="email", nullable=true, length=45)	
	private String email;

	@Column(name="password", nullable=false, length=45)
	private String password;

	@Column(name="campus_name", nullable=true, length=45)	
	private String campus_name;
	
	@ManyToOne(targetEntity=Trips.class)

	@JoinColumns({ @JoinColumn(name="Trip_idtrip", referencedColumnName="idtrip", nullable=false) })	

	private Trips trip_idtrip;
	
	private void setIdbooster(int value) {
		this.idbooster = value;
	}
	
	public int getIdbooster() {
		return idbooster;
	}
	
	public void setFirstname(String value) {
		this.firstname = value;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setLastname(String value) {
		this.lastname = value;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setCampus_name(String value) {
		this.campus_name = value;
	}
	
	public String getCampus_name() {
		return campus_name;
	}
	
	public void setTrip_idtrip(Trips value) {
		this.trip_idtrip = value;
	}

	public String getPassword(){ return password; }

	public Trips getTrip_idtrip() {
		return trip_idtrip;
	}
	
	public String toString() {
		return String.valueOf(getIdbooster());
	}
	
}
