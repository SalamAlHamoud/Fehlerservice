package hello;

public class Fehlermeldung {
	private final long id;

	private final String nr;

	private final String kurztext;
	private final String langtext;

	private final String eingangsdatum;

	private String kommentar;

	public Fehlermeldung(long id, String eingangsdatum, String nr, String kurztext, String langtext, String kommentar) {
		this.id = id;
		this.eingangsdatum = eingangsdatum;
		this.nr = nr;
		this.kurztext = kurztext;
		this.langtext = langtext;
		this.setKommentar(kommentar);

	}

	public String getNr() {
		return nr;
	}

	public long getId() {
		return id;
	}

	public String getLangtext() {
		return langtext;
	}

	public String getKurztext() {
		return kurztext;
	}

	public String getEingangsdatum() {
		return eingangsdatum;
	}

	public String getKommentar() {
		return kommentar;
	}

	public void setKommentar(String kommentar) {
		this.kommentar = kommentar;
	}

/*	@Override
	public String toString() {
		return "" + id + ", " + nr + ", " + kurztext + ", ";
	}
*/
}
