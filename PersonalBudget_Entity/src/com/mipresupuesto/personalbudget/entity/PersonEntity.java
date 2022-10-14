package com.mipresupuesto.personalbudget.entity;


import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;

public class PersonEntity {
	
	private UUID id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String lastName;
	private String name;
	private String completeName;
	
	public PersonEntity() {
		
		setId(UtilUUID.DEFAULT_UUID);
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		setLastName("");
		setName("");
		setCompleteName("");
		
	}
	public PersonEntity(final UUID id,final String idCard,final String firstName,final String middleName,final String lastName,final String name, final String completeName){
		
		setId(id);
		setIdCard(idCard);
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
		setName(name);
		setCompleteName(completeName);
		
	}
	
	
	public final void setId(final UUID id) {
		this.id= id;
	}

	public final void setIdCard(final String idCard) {
		this.idCard = idCard;
	}

	public final void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public final void setMiddleName(final String middleName) {
		this.middleName = middleName;
	}

	public final void setLastName(final String lastName) {
		this.lastName = lastName;
	
	}
	
	public final UUID getId() {
		
		if(id == null) {
			setId(UtilUUID.DEFAULT_UUID);
		}
		
		return id;
	}

	public final String getIdCard() {
		
		if (idCard == null) {
			setIdCard("");
		}
		return idCard.trim();
	}

	public final String getFirstName() {
		if (firstName == null) {
			setFirstName("");
		}
		return firstName.trim();
	}

	public final String getMiddleName() {
		if (middleName == null) {
			setMiddleName("");
		}
		return middleName.trim();
	}
	
	public final String getLastName() {
		if (lastName == null ) {
			setLastName("");
		}
		return lastName.trim();
	}
	public String getName() {
		if (name == null ) {
			setName("");
		}
		return name.trim();
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompleteName() {
		
		if (completeName == null) {
			setCompleteName("");
		}
		return completeName.trim();
	}
	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}



}
