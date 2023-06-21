package com.example.Book_my_Show_Application_February.Entities;


import com.example.Book_my_Show_Application_February.Enums.SeatType;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "theater_seats")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class TheaterSeatEntity {

    public TheaterSeatEntity() {
		super();
	}

	public TheaterSeatEntity(int id, SeatType seatType, String seatNo, TheaterEntity theaterEntity) {
		super();
		this.id = id;
		this.seatType = seatType;
		this.seatNo = seatNo;
		this.theaterEntity = theaterEntity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SeatType getSeatType() {
		return seatType;
	}

	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	public TheaterEntity getTheaterEntity() {
		return theaterEntity;
	}

	public void setTheaterEntity(TheaterEntity theaterEntity) {
		this.theaterEntity = theaterEntity;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private String seatNo;

    @ManyToOne
    @JoinColumn
    private TheaterEntity theaterEntity;

}
