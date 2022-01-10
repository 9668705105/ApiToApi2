package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.vo.AcctList;
import com.example.demo.vo.CrnInfo;
import com.example.demo.vo.CustCat;
import com.example.demo.vo.Data;
import com.example.demo.vo.FetchAccountDetailsHeader;
import com.example.demo.vo.RespDetails;
import com.google.gson.Gson;

@Service
public class AccountDetailsNomineeService {
	
	public @ResponseBody RespDetails getAllDetails(String crnNo){
		String result="Please put one correct code";
		RespDetails resp= new RespDetails();
		 Gson gson =new Gson();
		FetchAccountDetailsHeader fetch=new FetchAccountDetailsHeader();
		 fetch.msg_code="Message Code";
		 fetch.source="SRC";
		 fetch.channel="CHNL";
		 fetch.txn_ref_number="SRC_CHNL_00001";
		 fetch.txn_datetime="1498118309808";
		 fetch.ip="10.10.1.19";
		 fetch.device_id="XYWZPQR123";
		 fetch.api_version="1.0.0";
		 Data data=new Data();
		resp.status_code="00";
		 resp.status_msg="SUC";
		 resp.response_datetime="1536233041497";
		 data.cc_list=null;
		 data.dc_list=null;
		 AcctList acctList=new AcctList();
		 acctList.account_id="3111119364";
		 acctList.apac="KM6038736";
		 acctList.is_payment_enabled="1";
		 acctList.sol_id="0651";
		 acctList.sol_desc="MUMBAI - ANDHERI (EAST)";
		 acctList.acct_name="Name of 33111119364";
		 acctList.schme_type="SBA";
		 acctList.schme_code="CSEDG";
		 acctList.acct_open_date="2011-09-21 00:00:00.0";
		 acctList.ifsc_code="KKBK0000651";
		 acctList.cust_reln_code="SOW";
		 acctList.cust_name= "XXXXX XXXXX XXXXX";
		 acctList.clr_bal_amount= "5593";
		 acctList.frez_code= " ";
		 acctList.acct_curr_code= "INR";
		 acctList.acct_status= "A";
		 acctList.effect_bal= null;
		 acctList.nominee="Yes";
		 CustCat custCat=new CustCat();
		 custCat.code="K_EDGE";
		 custCat.desc="Kotak Edge";
		 /*CrnInfo crnInfo=new CrnInfo();
		 crnInfo.name="Gagan Muduli";
		 crnInfo.ifsc="SBIN0006913";
		 crnInfo.accountnumber="32567249818";
		 crnInfo.accType="SAVING";
		 crnInfo.address="Badamba";
		 crnInfo.state="Odisha";
		 crnInfo.city="Bhubaneswar";*/
		
		 List<AcctList> li=new ArrayList<AcctList>();
		 li.add(acctList);
		 data.cust_cat=custCat;
		 data.acct_list=li;
		 //System.out.println(gson.toJson(fetch));
		 //System.out.println(gson.toJson(acctList));
		 //System.out.println(gson.toJson(data));
		 //System.out.println(gson.toJson(custCat));
		 
		 resp.data=data;
		 //resp.crnInfo=crnInfo;
		 resp.header=fetch;
		 
	return resp;
		

	}
	

	
	
	

}
