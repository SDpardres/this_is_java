package ch01;

import lombok.Data;

@Data
public class Box<K, M>{
	
	private K kind;
	private M model;
}

