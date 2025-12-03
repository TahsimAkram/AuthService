package com.mj.bj.auth.dto;

import lombok.Data;

@Data
public class DefaultContactObject extends BaseObject {
	private String contactPhone;
	private String contactFax;
	private String contactMobile;
	private String contactAddress1;
	private String contactAddress2;
	private CityObject contactCity;
	private StateObject contactState;
	private String contactPostalCode;
	private CountryObject contactCountry;

}
