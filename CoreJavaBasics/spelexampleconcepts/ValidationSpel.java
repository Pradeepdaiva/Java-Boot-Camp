package com.thirdware.spelexampleconcepts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class ValidationSpel {

	@Value("pradeep")
	private String name;
	@Value("pradeep@gmail.com")
	private String email;
	@Value("20")
	private int age;
	String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
	@Value("#{validate.email matches validate.regex}")
	private boolean validemail;
	@Value("#{validate.getAge > 18}")
	private boolean validage;
	@Value("#{validate.getAge eq 18}")
	private boolean ageEqualto18;
	@Value("#{validate.getAge lt 18}")
	private boolean agelessthan18;
	@Value("#{validate.getAge le 18}")
	private boolean lessThanOrEqual18;
	@Value("#{validate.getAge ge 18}")
	private boolean greaterThanOrEqual18;
	@Value("#{validate.getAge gt 18}")
	private boolean greaterThanAlphabetic;
	@Value("#{validate.age eq 20}")
	private boolean b;
	public ValidationSpel(String email, int age, String regex, boolean validemail, boolean validage,
			boolean ageEqualto18, boolean agelessthan18, boolean lessThanOrEqual18, boolean greaterThanOrEqual18,
			boolean greaterThanAlphabetic, boolean b) {
		super();
		this.email = email;
		this.age = age;
		this.regex = regex;
		this.validemail = validemail;
		this.validage = validage;
		this.ageEqualto18 = ageEqualto18;
		this.agelessthan18 = agelessthan18;
		this.lessThanOrEqual18 = lessThanOrEqual18;
		this.greaterThanOrEqual18 = greaterThanOrEqual18;
		this.greaterThanAlphabetic = greaterThanAlphabetic;
		this.b = b;
	}
	public ValidationSpel() {
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRegex() {
		return regex;
	}
	public void setRegex(String regex) {
		this.regex = regex;
	}
	public boolean isValidemail() {
		return validemail;
	}
	public void setValidemail(boolean validemail) {
		this.validemail = validemail;
	}
	public boolean isValidage() {
		return validage;
	}
	public void setValidage(boolean validage) {
		this.validage = validage;
	}
	public boolean isAgeEqualto18() {
		return ageEqualto18;
	}
	public void setAgeEqualto18(boolean ageEqualto18) {
		this.ageEqualto18 = ageEqualto18;
	}
	public boolean isAgelessthan18() {
		return agelessthan18;
	}
	public void setAgelessthan18(boolean agelessthan18) {
		this.agelessthan18 = agelessthan18;
	}
	public boolean isLessThanOrEqual18() {
		return lessThanOrEqual18;
	}
	public void setLessThanOrEqual18(boolean lessThanOrEqual18) {
		this.lessThanOrEqual18 = lessThanOrEqual18;
	}
	public boolean isGreaterThanOrEqual18() {
		return greaterThanOrEqual18;
	}
	public void setGreaterThanOrEqual18(boolean greaterThanOrEqual18) {
		this.greaterThanOrEqual18 = greaterThanOrEqual18;
	}
	public boolean isGreaterThanAlphabetic() {
		return greaterThanAlphabetic;
	}
	public void setGreaterThanAlphabetic(boolean greaterThanAlphabetic) {
		this.greaterThanAlphabetic = greaterThanAlphabetic;
	}
	public boolean getB() {
		return b;
	}
	public void setB(boolean b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "ValidationSpel [email=" + email + ", age=" + age + ", validemail=" + validemail
				+ ", validage=" + validage + ", ageEqualto18=" + ageEqualto18 + ", agelessthan18=" + agelessthan18
				+ ", lessThanOrEqual18=" + lessThanOrEqual18 + ", greaterThanOrEqual18=" + greaterThanOrEqual18
				+ ", greaterThanAlphabetic=" + greaterThanAlphabetic + ", b=" + b +" "+name +"]";
	}
	
	
}
