package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    /**
     * Utilisez la classe java.util.Calendar pour créer une instance de Date à la date du
     * 19 mai 2016 à 23h59 et 30 secondes et affichez-la au format suivant :
     * ▪ jour/mois/année
     * o Utilisez la classe java.util.Calendar pour créer une instance de Date à la date du
     * jour.
     * o Affichez l’instance ainsi créée au format suivant :
     * ▪ année/mois/jour heure:minute:seconde
     * o Affichez la même instance avec le nom des jours et des mois en français, russe,
     * chinois et allemand.
     * @param args
     */
    public static void main(String[] args) {

        SimpleDateFormat formateurJour = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formateurJourHMS = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        SimpleDateFormat formateurCompletFR = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss");
        SimpleDateFormat formateurCompletRU = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.of("ru", "RU"));
        SimpleDateFormat formateurCompletCH = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.CHINA);
        SimpleDateFormat formateurCompletAL = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.GERMANY);

        Calendar cal = Calendar.getInstance();
        cal.set(2016, Calendar.MAY, 19, 23, 59, 30);
        Date dateMai2016 = cal.getTime();

        System.out.println(formateurJour.format(dateMai2016));

        // Point 2
        cal.set(2024, Calendar.OCTOBER, 22, 0, 0, 0);
        Date dateJour = cal.getTime();
        System.out.println(formateurJourHMS.format(dateJour));

        System.out.println(formateurCompletFR.format(dateJour));
        System.out.println(formateurCompletRU.format(dateJour));
        System.out.println(formateurCompletCH.format(dateJour));
        System.out.println(formateurCompletAL.format(dateJour));
    }

}
