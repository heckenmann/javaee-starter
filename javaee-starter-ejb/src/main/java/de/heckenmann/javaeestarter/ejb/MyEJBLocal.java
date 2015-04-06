package de.heckenmann.javaeestarter.ejb;

import javax.ejb.Local;

@Local
public interface MyEJBLocal {

	public void callLocal();

}
