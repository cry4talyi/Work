package com.ywb.three;

import com.ywb.two.OneBean;
import com.ywb.two.TwoBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ywb.two")//在初始化时spring容器可能未加载这个包，此时用autowired注解会报错，因为找不到这个类
public class Config {
	@Autowired
	private OneBean OneBean;
	@Autowired
	private TwoBean TwoBean;
//	@Autowired
//	private SumBean SumBean;
	
	
	
	@Bean
	public OneBean getOneBean() {
		OneBean.setName("这是OneBean");
		return OneBean;
	}
	
	@Bean
	public TwoBean geTwoBean() {
//		TwoBean twoBean = new TwoBean();
		TwoBean.setName("这是TwoBean");
		return TwoBean;
	}
	
//	@Bean
//	public SumBean getSumBean() {
//		SumBean sumBean = new SumBean();
//		sumBean.setName("这是SumBean");
//		return sumBean;
//	}
}
