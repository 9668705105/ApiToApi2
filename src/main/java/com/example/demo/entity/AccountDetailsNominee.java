//package com.example.demo.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import lombok.Data;
//
//@Data
//@Table(name = "tbl_fetch_account")
//@Entity
//public class AccountDetailsNominee {
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private Long id;
//	@Column(name="Message_Code")
//	private String msgCode;
//	
//	@Column(name="source")
//	private String source;
//	
//	@Column(name="channel")
//	private String channel;
//	
//	@Column(name="txnRefNumber")
//	private String txnRefNumber;
//	
//	@Column(name="txnDatetime")
//	private String txnDatetime;
//	
//	@Column(name="ip")
//	private String ip;
//	
//	@Column(name="deviceId")
//	private String deviceId;
//	
//	@Column(name="apiVersion")
//	private String apiVersion;
//	
////	@Column(name="details")
////	private Details details;
//	
//	@Column(name="auth_crn")
//	public String authCrn;
//	
//	
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getMsgCode() {
//		return msgCode;
//	}
//	public void setMsgCode(String msgCode) {
//		this.msgCode = msgCode;
//	}
//	public String getSource() {
//		return source;
//	}
//	public void setSource(String source) {
//		this.source = source;
//	}
//	public String getChannel() {
//		return channel;
//	}
//	public void setChannel(String channel) {
//		this.channel = channel;
//	}
//	public String getTxnRefNumber() {
//		return txnRefNumber;
//	}
//	public void setTxnRefNumber(String txnRefNumber) {
//		this.txnRefNumber = txnRefNumber;
//	}
//	public String getTxnDatetime() {
//		return txnDatetime;
//	}
//	public void setTxnDatetime(String txnDatetime) {
//		this.txnDatetime = txnDatetime;
//	}
//	public String getIp() {
//		return ip;
//	}
//	public void setIp(String ip) {
//		this.ip = ip;
//	}
//	public String getDeviceId() {
//		return deviceId;
//	}
//	public void setDeviceId(String deviceId) {
//		this.deviceId = deviceId;
//	}
//	public String getApiVersion() {
//		return apiVersion;
//	}
//	public void setApiVersion(String apiVersion) {
//		this.apiVersion = apiVersion;
//	}
////	public Details getDetails() {
////		return details;
////	}
////	public void setDetails(Details details) {
////		this.details = details;
////	}
//	public String getAuthCrn() {
//		return authCrn;
//	}
//	public void setAuthCrn(String authCrn) {
//		this.authCrn = authCrn;
//	}
//	
//	
//}
