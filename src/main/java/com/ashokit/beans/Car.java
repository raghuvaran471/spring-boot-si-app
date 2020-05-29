package com.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	public Car() {
		System.out.println("Car::Constructor");
	}

	private IEngine eng;

	@Autowired
	public void setEng(IEngine eng) {
		System.out.println("Car::seEng() called");
		this.eng = eng;
	}

	public void drive() {
		int status = eng.start();
		if (status == 0)
			System.out.println("Journey Started.....");
	}
}
