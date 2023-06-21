package com.example.Book_my_Show_Application_February.EntryDtos;


import lombok.Data;

@Data
public class TheaterEntryDto {

    //Attributes that we require
    private String name;
    private String location;

    private int classicSeatsCount;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getClassicSeatsCount() {
		return classicSeatsCount;
	}

	public void setClassicSeatsCount(int classicSeatsCount) {
		this.classicSeatsCount = classicSeatsCount;
	}

	public int getPremiumSeatsCount() {
		return premiumSeatsCount;
	}

	public void setPremiumSeatsCount(int premiumSeatsCount) {
		this.premiumSeatsCount = premiumSeatsCount;
	}

	public TheaterEntryDto() {
		super();
	}

	public TheaterEntryDto(String name, String location, int classicSeatsCount, int premiumSeatsCount) {
		super();
		this.name = name;
		this.location = location;
		this.classicSeatsCount = classicSeatsCount;
		this.premiumSeatsCount = premiumSeatsCount;
	}

	private int premiumSeatsCount;
}

