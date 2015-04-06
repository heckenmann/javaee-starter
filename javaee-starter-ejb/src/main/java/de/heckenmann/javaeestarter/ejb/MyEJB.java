package de.heckenmann.javaeestarter.ejb;

import java.io.Serializable;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class MyEJB
 */
@Stateless
public class MyEJB implements MyEJBRemote, MyEJBLocal, Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public void callLocal() {
		System.out.println("callLocal()");
	}

	@Override
	public void callRemote() {
		System.out.println("callRemote()");
	}

}
