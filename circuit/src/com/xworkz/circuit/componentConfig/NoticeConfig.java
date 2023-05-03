package com.xworkz.circuit.componentConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.circuit.beanThing.NoticeBoard;

@Configuration
@ComponentScan("com.xworkz.circuit.beanThing")
public class NoticeConfig {

	@Bean
	public NoticeBoard board() {
		NoticeBoard notice = new NoticeBoard("Green");
		notice.setLength(45);
		return notice;
	}
}
