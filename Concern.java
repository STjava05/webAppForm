package it.ousssein.concern.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="member")
public class Concern implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "ID")
	private long id;

	@Column(name = "FIRSTNAME",nullable=false)
	private String firstName;

	@Column(name = "LASTNAME",nullable=false)
	private String lastName;

	@Column(name = "PROFESSION",nullable=false)
	private String profession;

	@Column(name = "EMAIL" ,nullable=false)
	private String email;

	@Column(name = "DATEOFBIRTH",nullable=false)
	private Date dateOfBirth;

	@Column(name = "CODICEFISCALE",nullable=false)
	private String codiceFiscale;

	@Column(name = "PHONENUMBER",nullable=false)
	private String phoneNumber;

	@Column(name = "ADDRESS",nullable=false)
	private String address;

	@Column(name = "CITYCODE",nullable=false)
	private String cityCode;

	@Column(name = "SEX",nullable=false)
	private String sex;

	@Column(name = "PROVINCIA",nullable=false)
	private String provincia;
	
	@Column(name = "USEFULINFO",nullable=false)
	private String usefulInfo;

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getUsefulInfo() {
		return usefulInfo;
	}

	public void setUsefulInfo(String usefulInfo) {
		this.usefulInfo = usefulInfo;
	}
	
	
	
	

}
