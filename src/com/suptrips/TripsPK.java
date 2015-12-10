package com.suptrips;


import javax.persistence.*;
import java.io.Serializable;
@Embeddable
public class TripsPK implements Serializable {

	@Column(name="idtrip", nullable=false, length=11)	
	private int idtrip;
	
	public void setIdtrip(int value)  {
		this.idtrip =  value;
	}
	
	public int getIdtrip()  {
		return this.idtrip;
	}
	
	@ManyToOne(targetEntity=com.suptrips.Users.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Users_idbooster", referencedColumnName="idbooster", nullable=false) })	
	@org.hibernate.annotations.Index(name="fk_Trips_Users_idx")	
	private com.suptrips.Users users_idbooster;
	
	public void setUsers_idbooster(com.suptrips.Users value)  {
		this.users_idbooster =  value;
	}
	
	public com.suptrips.Users getUsers_idbooster()  {
		return this.users_idbooster;
	}
	
}
