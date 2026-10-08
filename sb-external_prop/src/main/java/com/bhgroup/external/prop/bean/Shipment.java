package com.bhgroup.external.prop.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "shipment")
@Data
public class Shipment {
	private String trackingNo;
	private String pickupFrom;
	private String deliveryTo;
	private Double weight;
}
