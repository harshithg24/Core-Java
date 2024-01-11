package com.xworkz.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Paper implements Serializable{
	
	private String type;
	private int height;
	private float thickness;
	private boolean reusable;

}