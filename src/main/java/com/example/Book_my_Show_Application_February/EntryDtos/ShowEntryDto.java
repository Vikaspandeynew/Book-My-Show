package com.example.Book_my_Show_Application_February.EntryDtos;

import com.example.Book_my_Show_Application_February.Enums.ShowType;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class ShowEntryDto {

    private LocalDate localDate;

    private LocalTime localTime;

    private ShowType showType;

    private int movieId;

    public ShowEntryDto() {
		super();
	}

	public ShowEntryDto(LocalDate localDate, LocalTime localTime, ShowType showType, int movieId, int theaterId,
			int classicSeatPrice, int premiumSeatPrice) {
		super();
		this.localDate = localDate;
		this.localTime = localTime;
		this.showType = showType;
		this.movieId = movieId;
		this.theaterId = theaterId;
		this.classicSeatPrice = classicSeatPrice;
		this.premiumSeatPrice = premiumSeatPrice;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public LocalTime getLocalTime() {
		return localTime;
	}

	public void setLocalTime(LocalTime localTime) {
		this.localTime = localTime;
	}

	public ShowType getShowType() {
		return showType;
	}

	public void setShowType(ShowType showType) {
		this.showType = showType;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}

	public int getClassicSeatPrice() {
		return classicSeatPrice;
	}

	public void setClassicSeatPrice(int classicSeatPrice) {
		this.classicSeatPrice = classicSeatPrice;
	}

	public int getPremiumSeatPrice() {
		return premiumSeatPrice;
	}

	public void setPremiumSeatPrice(int premiumSeatPrice) {
		this.premiumSeatPrice = premiumSeatPrice;
	}

	private int theaterId;

    private int classicSeatPrice;

    private int premiumSeatPrice;


}
