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

	@PrimaryKeyJoinColumn
	@ManyToOne(targetEntity=com.suptrips.Users.class)
	private com.suptrips.Users users_idbooster;

	@Column(name="Users_idbooster", nullable=true, insertable=false, updatable=true)
	@Id
	private Long users_idboosterId;

	private void setUsers_idboosterId(Long value) {
		this.users_idboosterId = value;
	}

	public Long getUsers_idboosterId() {
		return users_idboosterId;
	}

	@Column(name="airport_name", nullable=true, length=45)
	private String airport_name;

	public void setIdtrip(Long value) {
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

	public void setAirport_name(String value) {
		this.airport_name = value;
	}

	public String getAirport_name() {
		return airport_name;
	}

	public void setUsers_idbooster(com.suptrips.Users value) {
		this.users_idbooster = value;
	}

	public com.suptrips.Users getUsers_idbooster() {
		return users_idbooster;
	}

}
