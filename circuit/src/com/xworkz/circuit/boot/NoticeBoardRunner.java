package com.xworkz.circuit.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.circuit.beanThing.NoticeBoard;
import com.xworkz.circuit.componentConfig.NoticeConfig;

public class NoticeBoardRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(NoticeConfig.class);
		System.out.println(applicationContext.getBeanDefinitionCount());
		Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

		NoticeBoard board = applicationContext.getBean("noticeBoard", NoticeBoard.class);
		Stream.of(board).forEach(System.out::println);

		NoticeBoard board2 = applicationContext.getBean("board", NoticeBoard.class);
		Stream.of(board2).forEach(System.out::println);

	}

}
