package com.example.Book_my_Show_Application_February.Entities;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "theaters")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class TheaterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public TheaterEntity() {
		super();
	}


	public TheaterEntity(int id, String name, String location, List<TheaterSeatEntity> theaterSeatEntityList,
			List<ShowEntity> showEntityList) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.theaterSeatEntityList = theaterSeatEntityList;
		this.showEntityList = showEntityList;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


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


	public List<TheaterSeatEntity> getTheaterSeatEntityList() {
		return theaterSeatEntityList;
	}


	public void setTheaterSeatEntityList(List<TheaterSeatEntity> theaterSeatEntityList) {
		this.theaterSeatEntityList = theaterSeatEntityList;
	}


	public List<ShowEntity> getShowEntityList() {
		return showEntityList;
	}


	public void setShowEntityList(List<ShowEntity> showEntityList) {
		this.showEntityList = showEntityList;
	}


	private String location;


    //This is the parent wrt to theaterSeats
    @OneToMany(mappedBy = "theaterEntity",cascade = CascadeType.ALL)
    private List<TheaterSeatEntity> theaterSeatEntityList = new ArrayList<>();


    @OneToMany(mappedBy = "theaterEntity",cascade = CascadeType.ALL)
    private List<ShowEntity> showEntityList = new ArrayList<>();


}
