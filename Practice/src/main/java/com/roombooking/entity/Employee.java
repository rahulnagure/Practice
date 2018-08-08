package com.roombooking.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employee_id")
	private Long employeeId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="user_name",nullable=false, unique= true)
	private String userName;
	
	@Column(name="password" , unique= true)
	private String password;
	
	@Column(name="email",  unique= true)
	private String email;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@Column(name="joining_date")
	private Date joiningDate;
	
	@Column(name="on_board_date")
	private Date onBoardDate;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="probation")
	private Integer probation;
	
	@Column(name="release_date")
	private Date releaseDate;
	
	@Column(name="pan_number")
	private String panNumber;
	
	@Column(name="passport_number")
	private String passportNumber;
	
	@Column(name="passport_valid_date")
	private Date passportValidDate;
	
	@Column(name="primary_contact_number")
	private Long primaryContactNumber;
	
	@Column(name="secondary_contact_number")
	private Long secondaryContactNumber;
	
	@Column(name="emergency_contact_person")
	private String emergencyContactPerson;
	
	@Column(name="emergency_contact_number")
	private Long emergencyContactNumber;
	
	@Column(name="blood_group")
	private String bloodGroup;
	
	@Column(name="current_address")
	private String currentAddress;	
	
	@Column(name="perment_address")
	private String permentAddress;
	
	@Column(name="two_wheeler_number")
	private String twoWheelerNumber;
	
	@Column(name="four_wheeler_number")
	private String fourWheelerNumber;
	
	@Column(name="code")
	private String code;
	
	@Column(name = "is_active")	
	private boolean active;
	
	@Column(name = "role_id")	
	private Integer roleId;

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Date getOnBoardDate() {
		return onBoardDate;
	}

	public void setOnBoardDate(Date onBoardDate) {
		this.onBoardDate = onBoardDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getProbation() {
		return probation;
	}

	public void setProbation(Integer probation) {
		this.probation = probation;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Date getPassportValidDate() {
		return passportValidDate;
	}

	public void setPassportValidDate(Date passportValidDate) {
		this.passportValidDate = passportValidDate;
	}

	public Long getPrimaryContactNumber() {
		return primaryContactNumber;
	}

	public void setPrimaryContactNumber(Long primaryContactNumber) {
		this.primaryContactNumber = primaryContactNumber;
	}

	public Long getSecondaryContactNumber() {
		return secondaryContactNumber;
	}

	public void setSecondaryContactNumber(Long secondaryContactNumber) {
		this.secondaryContactNumber = secondaryContactNumber;
	}

	public String getEmergencyContactPerson() {
		return emergencyContactPerson;
	}

	public void setEmergencyContactPerson(String emergencyContactPerson) {
		this.emergencyContactPerson = emergencyContactPerson;
	}

	public Long getEmergencyContactNumber() {
		return emergencyContactNumber;
	}

	public void setEmergencyContactNumber(Long emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getPermentAddress() {
		return permentAddress;
	}

	public void setPermentAddress(String permentAddress) {
		this.permentAddress = permentAddress;
	}

	public String getTwoWheelerNumber() {
		return twoWheelerNumber;
	}

	public void setTwoWheelerNumber(String twoWheelerNumber) {
		this.twoWheelerNumber = twoWheelerNumber;
	}

	public String getFourWheelerNumber() {
		return fourWheelerNumber;
	}

	public void setFourWheelerNumber(String fourWheelerNumber) {
		this.fourWheelerNumber = fourWheelerNumber;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", birthDate=" + birthDate + ", joiningDate=" + joiningDate + ", onBoardDate=" + onBoardDate
				+ ", gender=" + gender + ", probation=" + probation + ", releaseDate=" + releaseDate + ", panNumber="
				+ panNumber + ", passportNumber=" + passportNumber + ", passportValidDate=" + passportValidDate
				+ ", primaryContactNumber=" + primaryContactNumber + ", secondaryContactNumber="
				+ secondaryContactNumber + ", emergencyContactPerson=" + emergencyContactPerson
				+ ", emergencyContactNumber=" + emergencyContactNumber + ", bloodGroup=" + bloodGroup
				+ ", currentAddress=" + currentAddress + ", permentAddress=" + permentAddress + ", twoWheelerNumber="
				+ twoWheelerNumber + ", fourWheelerNumber=" + fourWheelerNumber + ", code=" + code + ", active="
				+ active + ", roleId=" + roleId + "]";
	}
	
	
	
	
}
