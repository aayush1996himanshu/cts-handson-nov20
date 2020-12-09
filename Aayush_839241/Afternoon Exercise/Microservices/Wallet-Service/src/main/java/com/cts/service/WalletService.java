package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cts.model.AccountStructure;
import com.cts.model.Wallet;
import com.cts.restclients.WalletClient;

@Service
public class WalletService {

	@Autowired
	private RestTemplate rest;
	
	@Autowired
	private WalletClient client;
	
	public Wallet addAmountToWallet(long bal) {
		
		
		Wallet wallet = new Wallet();
		//AccountStructure account = rest.getForObject("http://ACCOUNT-SERVICE/account/"+bal, AccountStructure.class);
		AccountStructure account = client.fetchAccountById(bal);
		//Double amount = client.getAmountThroughAccount(bal);
		wallet.setBalance(wallet.getBalance()+(account.getAmount()*0.2));
		return wallet;

	}

	
}
