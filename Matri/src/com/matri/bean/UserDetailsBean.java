package com.matri.bean;

import java.util.Date;

public class UserDetailsBean {

	private int userDetailId;

	private String firstName;

	private String middleName;

	private String lastName;

	private String gender;

	private Date dateOfBirth;

	private String emailId;

	private Long contactNumber1;

	private Long contactNumber2;

	private String maritalStatus;

	private String nationality;

	private String password;

	private Boolean isLoggedIn;

	private EducationProffessionBean educationProffessionBean;

	private ExpectationBean expectationBean;

	private FamilyDetailsBean familyDetailBean;

	private HoroscopeBean horoscopeBean;

	private PhysicalAttributesBean physicalAttributesBean;

	private ImageBean imageBean;

	public Boolean getIsLoggedIn() {
		return isLoggedIn;
	}

	public void setIsLoggedIn(Boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}

	public ImageBean getImageBean() {
		return imageBean;
	}

	public void setImageBean(ImageBean imageBean) {
		this.imageBean = imageBean;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserDetailsBean() {
		contactNumber1 = new Long(0);
		contactNumber2 = new Long(0);
	}

	public int getUserDetailId() {
		return userDetailId;
	}

	public void setUserDetailId(int userDetailId) {
		this.userDetailId = userDetailId;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getContactNumber1() {
		return contactNumber1;
	}

	public void setContactNumber1(Long contactNumber1) {
		this.contactNumber1 = contactNumber1;
	}

	public Long getContactNumber2() {
		return contactNumber2;
	}

	public void setContactNumber2(Long contactNumber2) {
		this.contactNumber2 = contactNumber2;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		nationality = nationality;
	}

	public EducationProffessionBean getEducationProffessionBean() {
		return educationProffessionBean;
	}

	public void setEducationProffessionBean(EducationProffessionBean educationProffessionBean) {
		this.educationProffessionBean = educationProffessionBean;
	}

	public ExpectationBean getExpectationBean() {
		return expectationBean;
	}

	public void setExpectationBean(ExpectationBean expectationBean) {
		this.expectationBean = expectationBean;
	}

	public FamilyDetailsBean getFamilyDetailBean() {
		return familyDetailBean;
	}

	public void setFamilyDetailBean(FamilyDetailsBean familyDetailBean) {
		this.familyDetailBean = familyDetailBean;
	}

	public HoroscopeBean getHoroscopeBean() {
		return horoscopeBean;
	}

	public void setHoroscopeBean(HoroscopeBean horoscopeBean) {
		this.horoscopeBean = horoscopeBean;
	}

	public PhysicalAttributesBean getPhysicalAttributesBean() {
		return physicalAttributesBean;
	}

	public void setPhysicalAttributesBean(PhysicalAttributesBean physicalAttributesBean) {
		this.physicalAttributesBean = physicalAttributesBean;
	}

}
