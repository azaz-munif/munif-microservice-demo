package com.munifec.munifmswebclient.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.munifec.munifmswebclient.model.Account;

public class RemoteAccountRepository implements AccountRepository {
	
@Autowired
public RestTemplate restTemplate;

public String serviceUrl;

public RemoteAccountRepository(String serviceUrl) {
	this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
		: "http://" + serviceUrl;
}


  @Override public List<Account> getAllAccounts() { 
	  Account[] accounts = restTemplate.getForObject(serviceUrl+"/accounts", Account[].class); 
	  return Arrays.asList(accounts); 
  }
	  
  @Override public Account getAccount(String number) {
	  return restTemplate.getForObject(serviceUrl + "/accounts/{id}", Account.class,number); 
  }
 

}
