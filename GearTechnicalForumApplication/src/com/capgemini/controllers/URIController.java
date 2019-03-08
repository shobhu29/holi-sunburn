package com.capgemini.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.beans.Query;

@Controller
public class URIController {
	@RequestMapping(value = "/")
	public String getIndexPage() {
		return "indexpage";
	}

	@RequestMapping(value = "/index")
	public String getHomePage() {
		return "indexpage";
	}

	@RequestMapping(value = "/register")
	public String getRegisterPage() {
		return "RegistrationPage";
	}

	@RequestMapping(value = "/Showbalance")
	public String getBalancePage() {
		return "ShowBalance";
	}

	@RequestMapping(value = "/withdraw")
	public String getWithdrawPage() {
		return "Withdraw";
	}

	@RequestMapping(value = "/deposit")
	public String getDepositPage() {
		return "Deposit";
	}

	@RequestMapping(value = "/transferFunds")
	public String getTransferPage() {
		return "TransferFunds";
	}

	@ModelAttribute("customer")
	public Query getCustomer() {
		return new Query();
	}
}
