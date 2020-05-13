package com.example.productconfigapi.model;

public class Config {
	
	private int ram;
	private String diskspace;
	
	public Config(int ram, String diskspace){
		
		this.ram = ram;
		this.diskspace = diskspace;
		
	}
	
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getDiskspace() {
		return diskspace;
	}
	public void setDiskspace(String diskspace) {
		this.diskspace = diskspace;
	}

}
