package com.bsu.project390.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//documents database table name and fields
@Document
//handles constructors,getters,setters
@Data
//intializes  @data
@NoArgsConstructor
@AllArgsConstructor

public class Rescue {
    @Id
private Integer license_number; //set as primary key
private String rescueName;
private String location;
private String license_type;
private String email;

}

