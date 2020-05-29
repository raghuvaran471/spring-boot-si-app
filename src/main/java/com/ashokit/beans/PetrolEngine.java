package com.ashokit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public  class PetrolEngine implements IEngine {
	
	public PetrolEngine () {
		System.out.println("Engine constructor but ambigity");
	}

	@Override
	public int start() {
		System.out.println("petrol car engine satrted");
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
