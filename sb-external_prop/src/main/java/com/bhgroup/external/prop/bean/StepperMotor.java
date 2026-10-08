package com.bhgroup.external.prop.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "motor")
public class StepperMotor {
	private int stepCount;
    private int currentPosition;
    private int speed;
    private boolean running;

}
