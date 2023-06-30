package it.polito.med;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Doctor {
	String name, id, surname, speciality;
	public Doctor(String name){
		this.name = name;
		
	}
	public Doctor(String id, String name, String surname, String speciality){
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.speciality = speciality;

		
	}
	
	public String ID2speciality(){
		return speciality;
		
	}
	//
	public 	String getSpec() {
		// TODO Auto-generated method stub
		return speciality;
	}
	public String code2name(String code) {
		return name;
	}
	public String code2surname(String code) {
		// TODO Auto-generated method stub
		return surname;
	}
	Map<String, List<String>> date2slot= new TreeMap<>(Comparator.naturalOrder());
	List<String> slotList = new ArrayList<>();
	public void addSlots(String date, String time) 
	{
		slotList.add(time);
		date2slot.put(date, slotList);
	}
	

	public Integer slots() 
	{
		return slotList.size();
	}
	List<String> giveSlotList(){
		return slotList;
	}
	Map<String, List<String>> giveDate2Slot(){return date2slot;}
}




