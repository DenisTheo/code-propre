package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe qui gère du formatage de date
 */
public class DateUtils
{
	/**
	 * formate la date avec le paterne indiqué.
	 * 
	 * @param pattern	le paterne à appliquer
	 * @param date	la date à parser
	 * @return la date parsée au format demandé
	 */
	public static String format(String pattern, Date date)
	{
		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}
	
	/**
	 * Utilise le paterne "dd/MM/yyyy HH:mm:ss" par défaut
	 * 
	 * @param date	la date à parser
	 * @return la date au format "dd/MM/yyyy HH:mm:ss"
	 */
	public static String format(Date date)
	{
		return format("dd/MM/yyyy HH:mm:ss", date);
	}
}
