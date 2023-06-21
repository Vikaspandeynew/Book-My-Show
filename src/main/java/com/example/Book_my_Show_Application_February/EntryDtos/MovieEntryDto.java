package com.example.Book_my_Show_Application_February.EntryDtos;


import com.example.Book_my_Show_Application_February.Enums.Genre;
import com.example.Book_my_Show_Application_February.Enums.Language;
import javax.persistence.*;
import lombok.Data;

@Data
public class MovieEntryDto {

    private String movieName;

    private double ratings;

    private int duration;

    public MovieEntryDto(String movieName, double ratings, int duration, Language language, Genre genre) {
		super();
		this.movieName = movieName;
		this.ratings = ratings;
		this.duration = duration;
		this.language = language;
		this.genre = genre;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	private Language language;

    private Genre genre;

}
