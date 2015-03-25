package com.jsf.managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="anotherBean", eager=true)
@RequestScoped
public class AnotherBean {

	private String mesaj ="This is AnotherMessage";

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}
	
	
	
}
