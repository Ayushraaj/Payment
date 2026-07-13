package com.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.beans.Payment;

@Configuration
public class AppConfig {
	
	
	@Bean("Payment")
	@Scope("singleton")  //one instance per ioc container
	//@Scope("prototype")  // each time a new instance will be created when requested
	public Payment createPayment() {
		Payment pay = new Payment();
		pay.setBankName("HDFC");
		pay.setRefNumber("HDFC121");
		return pay;
	}

}
