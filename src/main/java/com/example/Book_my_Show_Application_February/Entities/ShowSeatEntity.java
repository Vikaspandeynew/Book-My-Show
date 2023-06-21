package com.example.Book_my_Show_Application_February.Entities;


import com.example.Book_my_Show_Application_February.Enums.SeatType;
import javax.persistence.*;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="showseats")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShowSeatEntity {

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	public SeatType getSeatType() {
		return seatType;
	}

	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}

	public Date getBookedAt() {
		return bookedAt;
	}

	public void setBookedAt(Date bookedAt) {
		this.bookedAt = bookedAt;
	}

	public ShowEntity getShowEntity() {
		return showEntity;
	}

	public void setShowEntity(ShowEntity showEntity) {
		this.showEntity = showEntity;
	}

	public ShowSeatEntity() {
		super();
	}

	public ShowSeatEntity(int id, boolean isBooked, int price, String seatNo, SeatType seatType, Date bookedAt,
			ShowEntity showEntity) {
		super();
		this.id = id;
		this.isBooked = isBooked;
		this.price = price;
		this.seatNo = seatNo;
		this.seatType = seatType;
		this.bookedAt = bookedAt;
		this.showEntity = showEntity;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private boolean isBooked;

    private int price; //price of CLASSIC Seat for that particualr

    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    private ShowEntity showEntity;

}
