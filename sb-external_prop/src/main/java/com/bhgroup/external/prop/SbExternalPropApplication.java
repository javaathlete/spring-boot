package com.bhgroup.external.prop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.bhgroup.external.prop.bean.Shipment;
import com.bhgroup.external.prop.bean.StepperMotor;

@SpringBootApplication
//@PropertySource("classpath:motor-config.properties")
//@PropertySource("classpath:shipment-config.properties")
//If we desable @PropertySource then object will be created but value cannot injected because 
//@PropertySource is responsible for injecting the value like @value("@${  }placeholder

@PropertySource({
	"classpath:motor-config.properties",
	"classpath:shipment-config.properties"
})
public class SbExternalPropApplication {

    
	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SbExternalPropApplication.class, args);
		StepperMotor sm = ctx.getBean(StepperMotor.class);
		Shipment shipment = ctx.getBean(Shipment.class);
		System.out.println(sm);
		System.out.println(shipment);
	}

}
