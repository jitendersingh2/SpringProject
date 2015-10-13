package com.cognizant.jitender;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware {
	
	
	private List<Point> points;
	private ApplicationContext context;
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	

	
	public void draw(){
		for (Point point: points){
			System.out.println("Points of triangle are: (" + point.getX() + ", "+ point.getY()+")");
		}
		/*System.out.println("PointA of triangle: ("+ getPointA().getX() +", "+getPointA().getY()+")");
		System.out.println("PointB of triangle: ("+ getPointB().getX() +", "+getPointB().getY()+")");
		System.out.println("PointC of triangle: ("+ getPointC().getX() +", "+getPointC().getY()+")");*/
		//System.out.println("Parameter of triangle: "+ sqrt(pow((getPointA().getX()-getPointB().getX()),2)+pow((getPointA().getY()-getPointB().getY()),2)))
	}

	@Override
	public void setApplicationContext(ApplicationContext context) 
			throws BeansException {
				this.context=context;
		
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
