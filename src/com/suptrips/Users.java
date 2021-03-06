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

@Table(name="Users" , schema="SupTrips" )
public class Users implements Serializable {
	public Users() {
	}

	@Column(name="idbooster", nullable=false, length=11)
	@Id
	private Long idbooster;

	@Column(name="firstname", nullable=true, length=45)
	private String firstname;

	@Column(name="lastname", nullable=true, length=45)
	private String lastname;

	@Column(name="email", nullable=true, length=45)
	private String email;

	@Column(name="campus_name", nullable=true, length=45)
	private String campus_name;

	@Column(name="password", nullable=false, length=45)
	private String password;

	@OneToMany(mappedBy="users_idbooster", targetEntity=com.suptrips.Trips.class)

	private java.util.Set trips = new java.util.HashSet();

	public void setIdbooster(Long value) {
		this.idbooster = value;
	}

	public Long getIdbooster() {
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

	public void setPassword(String value) {
		this.password = value;
	}

	public String getPassword() {
		return password;
	}

	public void setTrips(java.util.Set value) {
		this.trips = value;
	}

	public java.util.Set getTrips() {
		return trips;
	}

	public String toString() {
		return String.valueOf(getIdbooster());
	}

}
