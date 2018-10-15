package hello;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/*import java.io.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
*/
@RestController
public class FehlermeldungController {

    @RequestMapping("/melden")
	public Fehlermeldung melden(@RequestParam(value="nr", defaultValue="42") String nr,
			@RequestParam(value="kurztext", defaultValue="beispieltext") String kurztext,
			@RequestParam(value="langtext", defaultValue="beispieltext") String langtext,
			@RequestParam(value="kommmentar", defaultValue="beispieltext") String kommentar) {


    	//TODO: Datenbank aufrufen, naechste ID suchen
    	//int meineDatenbankId = (int) (100 * Math.random());
		//return new Fehlermeldung(meineDatenbankId, nr, text);



    	 Date date = new Date();
    	 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss dd.MM.yyyy");
    	 String format = simpleDateFormat.format(date);
		System.out.println("EingangsDate:" +format);


//    	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8080?user=salam&id=0");
//    	  Statement stmt = con.createStatement();
//

		//Fehlermeldung melgung = new Fehlermeldung(0, nr, eingangsdatum, kurztext,langtext,kommentar);


    	Fehlermeldung fehlermeldung = new Fehlermeldung(0, nr, format, kurztext,langtext,kommentar);

    	new FehlermeldungTextPersistence().save(fehlermeldung);

		return fehlermeldung;
	}

//    public Fehlermeldung melden(String nr, String text) {
//    	return new Fehlermeldung(0, nr, text);
//    }
}
