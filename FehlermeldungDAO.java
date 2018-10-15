package hello;

public class FehlermeldungDAO {

	public String getFehlermeldungString(Fehlermeldung meldung) {
		return "" + meldung.getId() + "|" + meldung.getEingangsdatum() + "|" + meldung.getNr() + "|"
				+ meldung.getKurztext() + "|" + meldung.getLangtext() + "|" + meldung.getKommentar();
	}

	public Fehlermeldung getFehlermeldungObject(String meldungstext) {
		String[] splits = meldungstext.split("|");
		long id = Long.parseLong(splits[0]);
		String eingangsdatum = splits[1];
		String nr = splits[2];
		String kurztext = splits[3];
		String langtext = splits[4];
		String kommentar = splits[5];
		return new Fehlermeldung(id, eingangsdatum, nr, kurztext, langtext, kommentar);
	}
}
