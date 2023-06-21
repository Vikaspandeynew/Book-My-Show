package com.example.Book_my_Show_Application_February.Entities;


import com.example.Book_my_Show_Application_February.Enums.ShowType;
import javax.persistence.*;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="shows")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShowEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate showDate;

    public ShowEntity() {
		super();
	}

	public ShowEntity(int id, LocalDate showDate, LocalTime showTime, ShowType showType, Date createdOn, Date updatedOn,
			MovieEntity movieEntity, TheaterEntity theaterEntity, List<TicketEntity> listOfBookedTickets,
			List<ShowSeatEntity> listOfShowSeats) {
		super();
		this.id = id;
		this.showDate = showDate;
		this.showTime = showTime;
		this.showType = showType;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.movieEntity = movieEntity;
		this.theaterEntity = theaterEntity;
		this.listOfBookedTickets = listOfBookedTickets;
		this.listOfShowSeats = listOfShowSeats;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public ShowType getShowType() {
		return showType;
	}

	public void setShowType(ShowType showType) {
		this.showType = showType;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public MovieEntity getMovieEntity() {
		return movieEntity;
	}

	public void setMovieEntity(MovieEntity movieEntity) {
		this.movieEntity = movieEntity;
	}

	public TheaterEntity getTheaterEntity() {
		return theaterEntity;
	}

	public void setTheaterEntity(TheaterEntity theaterEntity) {
		this.theaterEntity = theaterEntity;
	}

	public List<TicketEntity> getListOfBookedTickets() {
		return listOfBookedTickets;
	}

	public void setListOfBookedTickets(List<TicketEntity> listOfBookedTickets) {
		this.listOfBookedTickets = listOfBookedTickets;
	}

	public List<ShowSeatEntity> getListOfShowSeats() {
		return listOfShowSeats;
	}

	public void setListOfShowSeats(List<ShowSeatEntity> listOfShowSeats) {
		this.listOfShowSeats = listOfShowSeats;
	}

	private LocalTime showTime;


    @Enumerated(value = EnumType.STRING)
    private ShowType showType;

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedOn;


    //This is child wrt to the movieEntity
    @ManyToOne
    @JoinColumn
    private MovieEntity movieEntity;


    @ManyToOne
    @JoinColumn
    private TheaterEntity theaterEntity;

    //Show is parent wrt to ticket
    @OneToMany(mappedBy = "showEntity",cascade = CascadeType.ALL)
    private List<TicketEntity> listOfBookedTickets = new ArrayList<>();

    @OneToMany(mappedBy = "showEntity",cascade = CascadeType.ALL)
    private List<ShowSeatEntity> listOfShowSeats = new ArrayList<>();


}
