package com.example.Book_my_Show_Application_February.convertors;

import com.example.Book_my_Show_Application_February.Entities.UserEntity;
import com.example.Book_my_Show_Application_February.EntryDtos.UserEntryDto;

public class UserConvertor {

    //Static is kept to avoid calling it via objects/instances
    public static UserEntity convertDtoToEntity(UserEntryDto userEntryDto){

//        UserEntity userEntity =  UserEntity.builder().age(userEntryDto.getAge()).address(userEntryDto.getAddress())
//                .email(userEntryDto.getEmail()).name(userEntryDto.getName()).mobNo(userEntryDto.getMobNo())
//                .build();
        
        UserEntity userEntity = new UserEntity();
        userEntity.setAge(userEntryDto.getAge());
        userEntity.setAddress(userEntryDto.getAddress());
        userEntity.setEmail(userEntryDto.getEmail());
        userEntity.setName(userEntryDto.getName());
        userEntity.setMobNo(userEntryDto.getMobNo());

        return userEntity;

    }

}
