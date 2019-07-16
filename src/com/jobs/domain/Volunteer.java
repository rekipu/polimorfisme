package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	private String description;

	public Volunteer(String name, String address, String phone) throws Exception {
		super(name, address, phone);
		this.description = description;
		
	}

	
	@Override
	public void pay() {
		//TODO
		
	}

}
