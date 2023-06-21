package com.example.Book_my_Show_Application_February.convertors;

import com.example.Book_my_Show_Application_February.Entities.MovieEntity;
import com.example.Book_my_Show_Application_February.EntryDtos.MovieEntryDto;

public class MovieConvertors {


    public static MovieEntity convertEntryDtoToEntity(MovieEntryDto movieEntryDto){

//        MovieEntity movieEntity = MovieEntity.builder()
//                .movieName(movieEntryDto.getMovieName()).duration(movieEntryDto.getDuration())
//                .genre(movieEntryDto.getGenre()).language(movieEntryDto.getLanguage()).ratings(movieEntryDto.getRatings()).build();
        
        
        MovieEntity movieEntity = new MovieEntity();
        movieEntity.setMovieName(movieEntryDto.getMovieName());
        movieEntity.setDuration(movieEntryDto.getDuration());
        movieEntity.setGenre(movieEntryDto.getGenre());
        movieEntity.setLanguage(movieEntryDto.getLanguage());
        movieEntity.setRatings(movieEntryDto.getRatings());

        return movieEntity;
    }
}
