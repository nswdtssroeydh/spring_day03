package cn.itcast.aop;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyBook {

	//在方法上面使用注解完成增强配置
	public void before()
	{
		System.out.println("before");
	}
	
}
