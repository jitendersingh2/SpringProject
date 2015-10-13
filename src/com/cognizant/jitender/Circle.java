package com.cognizant.jitender;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Circle implements InitializingBean, DisposableBean, BeanNameAware {
	
	private Point center;
	
	
	public Point getCenter() {
		return center;
	}


	public void setCenter(Point center) {
		this.center = center;
	}


	public void draw(){
		System.out.println("Circle drawn with center @: (" + getCenter().getX()+", " + getCenter().getY() + ")");
	}


	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name is: " + beanName);
		// TODO Auto-generated method stub
		
	}


	@Override
	public void afterPropertiesSet() 
			throws Exception {
		System.out.println("Bean has been initialized");	
		
	}


	@Override
	public void destroy() 
			throws Exception {
		System.out.println("Bean has been destroyed");
		
	}

}
