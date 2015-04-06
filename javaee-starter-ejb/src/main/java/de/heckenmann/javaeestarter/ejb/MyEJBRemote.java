package de.heckenmann.javaeestarter.ejb;

import javax.ejb.Remote;

@Remote
public interface MyEJBRemote {

	public void callRemote();

}
