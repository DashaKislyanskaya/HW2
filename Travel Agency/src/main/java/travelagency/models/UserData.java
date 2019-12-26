package travelagency.models;

import java.sql.Date;

public class UserData {
	private int id;
	private String name;
	private String fio;
	private String email;
	private Date dayOfBirthd;
	private String password;
	private String role;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFio() {
		return fio;
	}
	public void setFio(String fio) {
		this.fio = fio;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDayOfBirthd() {
		return dayOfBirthd;
	}
	public void setDayOfBirthd(Date dayOfBirthd) {
		this.dayOfBirthd = dayOfBirthd;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "UserData [id=" + id + ", name=" + name + ", fio=" + fio + ", email=" + email
				+ ", dayOfBirthd=" + dayOfBirthd + ", password=" + password + ", role=" + role + "]";
	}
}
