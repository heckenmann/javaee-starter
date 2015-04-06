package de.heckenmann.javaeestarter.war;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class MyBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String ausgabe = new String();

	private String neuerAnhang;

	/**
	 * Hängt den übergebenen Text an die Ausgabe an.
	 *
	 * @param text
	 */
	public void addText() {
		if (this.neuerAnhang != null) {
			this.ausgabe = this.ausgabe.concat(
					System.getProperty("line.separator")).concat(
							this.neuerAnhang);
		}
		this.neuerAnhang = null;
	}

	/*
	 * GETTER & SETTER
	 */

	public String getAusgabe() {
		return this.ausgabe;
	}

	public void setAusgabe(final String ausgabe) {
		this.ausgabe = ausgabe;
	}

	public String getNeuerAnhang() {
		return this.neuerAnhang;
	}

	public void setNeuerAnhang(final String neuerAnhang) {
		this.neuerAnhang = neuerAnhang;
	}
}
