package br.edu.infnet.gerenciador.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
	public static DateTimeFormatter DD_MM_YYYY_HH_mm = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm");

	public static String formataData(LocalDateTime dt) {
		return dt.format(DD_MM_YYYY_HH_mm);
	}
	
	public static String formataData(LocalDateTime dt, DateTimeFormatter formato) {
		return dt.format(formato);
	}
}
