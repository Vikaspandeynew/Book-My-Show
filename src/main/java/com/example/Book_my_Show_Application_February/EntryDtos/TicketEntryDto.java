package com.example.Book_my_Show_Application_February.EntryDtos;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TicketEntryDto {

    public TicketEntryDto() {
		super();
	}

	public TicketEntryDto(int showId, List<String> requestedSeats, int userId) {
		super();
		this.showId = showId;
		this.requestedSeats = requestedSeats;
		this.userId = userId;
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public List<String> getRequestedSeats() {
		return requestedSeats;
	}

	public void setRequestedSeats(List<String> requestedSeats) {
		this.requestedSeats = requestedSeats;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	private int showId;

    private List<String> requestedSeats = new ArrayList<>();

    private int userId;


}
