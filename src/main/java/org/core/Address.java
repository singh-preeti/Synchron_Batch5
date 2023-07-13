package org.core;

public class Address {
private String city;
private int roadNo;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(String city, int roadNo) {
	super();
	this.city = city;
	this.roadNo = roadNo;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getRoadNo() {
	return roadNo;
}
public void setRoadNo(int roadNo) {
	this.roadNo = roadNo;
}
@Override
public String toString() {
	return "Address [city=" + city + ", roadNo=" + roadNo + "]";
}


}
