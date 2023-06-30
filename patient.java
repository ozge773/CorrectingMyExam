package it.polito.med;
// It requires providing the patient's SSN, name, surname, the doctor's code ID, the appointment date, and the slot to be booked
//String ssn, String name, String surname, String code, String date, String slot
public class patient {
	
	String ssn, name,  surname,  code, date, slot;
	String doctor;
	public patient(String ssn, String name, String surname){
		this.name = name;
		this.surname = surname;
		this.ssn = ssn;


		
	}
	public void setDoctor(String code) {
		doctor = code;
	}
	
	public String getDoctor() {
		return doctor;
	}
	
}
