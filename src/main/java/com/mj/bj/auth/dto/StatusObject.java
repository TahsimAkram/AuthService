package com.mj.bj.auth.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class StatusObject {
	private String statusDomain;
	private String statusCode;
	private String statusDescription;
	private BigDecimal BidPrice;
	private BigDecimal BidPriceTwo;
	private BigDecimal bidQuantity;
	private String proxyFlag="N";
	private int round=0;
}
