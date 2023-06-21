package com.example.Book_my_Show_Application_February.Entities;


import com.example.Book_my_Show_Application_February.Enums.Genre;
import com.example.Book_my_Show_Application_February.Enums.Language;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movies")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieEntity {

    public MovieEntity() {
		super();
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(unique = true,nullable = false)
    private String movieName;

    public MovieEntity(int id, String movieName, double ratings, int duration, Language language, Genre genre,
			List<ShowEntity> showEntityList) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.ratings = ratings;
		this.duration = duration;
		this.language = language;
		this.genre = genre;
		this.showEntityList = showEntityList;
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

	public List<ShowEntity> getShowEntityList() {
		return showEntityList;
	}

	public void setShowEntityList(List<ShowEntity> showEntityList) {
		this.showEntityList = showEntityList;
	}

	private double ratings;

    private int duration;

    @Enumerated(value = EnumType.STRING)
    private Language language;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    //this is parent wrt to shows
    @OneToMany(mappedBy = "movieEntity",cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<ShowEntity> showEntityList = new ArrayList<>();


}
