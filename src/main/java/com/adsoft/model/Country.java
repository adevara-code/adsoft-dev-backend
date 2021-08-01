/**
 * 
 */
package com.adsoft.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author admin
 *
 */
@Entity
@Table(name = "COUNTRY_MASTER")
public class Country implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "COUNTRY_ID")
	private int countryId;
	@Column(name = "COUNTRY_NAME")
	private String countryName;
	@Column(name = "COUNTRY_LANG")
	private String countryLang;
	@Column(name = "COUNTRY_POPULATION")
	private long countryPapulation;

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryLang() {
		return countryLang;
	}

	public void setCountryLang(String countryLang) {
		this.countryLang = countryLang;
	}

	public long getCountryPapulation() {
		return countryPapulation;
	}

	public void setCountryPapulation(long countryPapulation) {
		this.countryPapulation = countryPapulation;
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + ", countryLang=" + countryLang
				+ ", countryPapulation=" + countryPapulation + "]";
	}
	

}
