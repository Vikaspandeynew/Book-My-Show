package com.example.Book_my_Show_Application_February.Entities;


import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name = "tickets")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public TicketEntity() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public LocalDate getShowDate() {
		return showDate;
	}


	public void setShowDate(LocalDate showDate) {
		this.showDate = showDate;
	}


	public LocalTime getShowTime() {
		return showTime;
	}


	public void setShowTime(LocalTime showTime) {
		this.showTime = showTime;
	}


	public int getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}


	public String getTicketId() {
		return ticketId;
	}


	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}


	public String getTheaterName() {
		return theaterName;
	}


	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}


	public String getBookedSeats() {
		return bookedSeats;
	}


	public void setBookedSeats(String bookedSeats) {
		this.bookedSeats = bookedSeats;
	}


	public UserEntity getUserEntity() {
		return userEntity;
	}


	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}


	public ShowEntity getShowEntity() {
		return showEntity;
	}


	public void setShowEntity(ShowEntity showEntity) {
		this.showEntity = showEntity;
	}


	private String movieName;

    public TicketEntity(int id, String movieName, LocalDate showDate, LocalTime showTime, int totalAmount,
			String ticketId, String theaterName, String bookedSeats, UserEntity userEntity, ShowEntity showEntity) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.showDate = showDate;
		this.showTime = showTime;
		this.totalAmount = totalAmount;
		this.ticketId = ticketId;
		this.theaterName = theaterName;
		this.bookedSeats = bookedSeats;
		this.userEntity = userEntity;
		this.showEntity = showEntity;
	}


	private LocalDate showDate;

    private LocalTime showTime;

    private int totalAmount;

    private String ticketId = UUID.randomUUID().toString();

    private String theaterName;

    private String bookedSeats;

    @JoinColumn
    @ManyToOne
    private UserEntity userEntity;


    //Ticket is child wrt to showEntity
    @ManyToOne
    @JoinColumn
    private ShowEntity showEntity;



}
