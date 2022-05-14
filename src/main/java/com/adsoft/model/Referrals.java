/**
 * 
 */
package com.adsoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ashok
 *
 */
@Entity
@Table(name = "REFERRALS")
public class Referrals {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "R_FULLNAME")
	private String referralsFullName;

	@Column(name = "R_EMAIL")
	private String referralsEmail;

	@Column(name = "R_CONTACTNO")
	private String referralsContactNo;

	@Column(name = "R_SKILLS")
	private String referralsSkills;

	@Column(name = "R_EXPERIENCE")
	private String relevantYearsOfEperience;

	@Column(name = "R_LOCATION")
	private String location;

	@Column(name = "R_NOTICEPER")
	private String noticePeriod;

	public Referrals() {

	}

	/**
	 * @param id
	 * @param referralsFullName
	 * @param referralsEmail
	 * @param referralsContactNo
	 * @param referralsSkills
	 * @param relevantYearsOfEperience
	 * @param location
	 * @param noticePeriod
	 */
	public Referrals(int id, String referralsFullName, String referralsEmail, String referralsContactNo,
			String referralsSkills, String relevantYearsOfEperience, String location, String noticePeriod) {
		super();
		this.id = id;
		this.referralsFullName = referralsFullName;
		this.referralsEmail = referralsEmail;
		this.referralsContactNo = referralsContactNo;
		this.referralsSkills = referralsSkills;
		this.relevantYearsOfEperience = relevantYearsOfEperience;
		this.location = location;
		this.noticePeriod = noticePeriod;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReferralsFullName() {
		return referralsFullName;
	}

	public void setReferralsFullName(String referralsFullName) {
		this.referralsFullName = referralsFullName;
	}

	public String getReferralsEmail() {
		return referralsEmail;
	}

	public void setReferralsEmail(String referralsEmail) {
		this.referralsEmail = referralsEmail;
	}

	public String getReferralsContactNo() {
		return referralsContactNo;
	}

	public void setReferralsContactNo(String referralsContactNo) {
		this.referralsContactNo = referralsContactNo;
	}

	public String getReferralsSkills() {
		return referralsSkills;
	}

	public void setReferralsSkills(String referralsSkills) {
		this.referralsSkills = referralsSkills;
	}

	public String getRelevantYearsOfEperience() {
		return relevantYearsOfEperience;
	}

	public void setRelevantYearsOfEperience(String relevantYearsOfEperience) {
		this.relevantYearsOfEperience = relevantYearsOfEperience;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getNoticePeriod() {
		return noticePeriod;
	}

	public void setNoticePeriod(String noticePeriod) {
		this.noticePeriod = noticePeriod;
	}

	@Override
	public String toString() {
		return "Referrals [id=" + id + ", referralsFullName=" + referralsFullName + ", referralsEmail=" + referralsEmail
				+ ", referralsContactNo=" + referralsContactNo + ", referralsSkills=" + referralsSkills
				+ ", relevantYearsOfEperience=" + relevantYearsOfEperience + ", location=" + location
				+ ", noticePeriod=" + noticePeriod + "]";
	}

}
