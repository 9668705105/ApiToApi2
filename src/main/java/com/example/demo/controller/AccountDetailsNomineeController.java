package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AccountDetailsNomineeService;
import com.example.demo.vo.RespDetails;



@RestController
public class AccountDetailsNomineeController {
	
		@Autowired
		private AccountDetailsNomineeService adns;
				
		@GetMapping("/accountservice/{crnNo}")
		public @ResponseBody RespDetails findAccountDetailsNominee(@PathVariable String crnNo){
			return adns.getAllDetails(crnNo);	
			
		}
		
		
			

}
