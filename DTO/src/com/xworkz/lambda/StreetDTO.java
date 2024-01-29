package com.xworkz.lambda;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StreetDTO implements Serializable{
	
	private int streetNo;
	private String place;
	private String name;
	private int kms;
	

}
