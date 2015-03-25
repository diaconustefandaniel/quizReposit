package com.jsf.managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;


@ManagedBean(name="helloWorld", eager=true)
@RequestScoped
public class HelloWorld {

	@ManagedProperty(value="#{anotherBean}")
	private AnotherBean anotherBean;
	private String message;
	
	public HelloWorld()
	{
		System.out.println("-----HelloWorldStarted----");
		//this.message="hai salut";
	}

	public String getMessage() {
		if(anotherBean!=null)
			this.message=anotherBean.getMesaj();
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public AnotherBean getAnotherBean() {
		return anotherBean;
	}

	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}
	
	
	
	
}
