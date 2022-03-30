package br.edu.infnet.gerenciador.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
	public static DateTimeFormatter DD_MM_YYYY_HH_mm = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm");
	public static DateTimeFormatter YYYY_MM_DD = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	public static String formataData(LocalDateTime dt) {
		if(dt == null) return "";
		return dt.format(DD_MM_YYYY_HH_mm);
	}
	
	public static String formataData(LocalDateTime dt, DateTimeFormatter formato) {
		if(dt == null) return "";
		return dt.format(formato);
	}
	
	public static LocalDateTime converteData(String dt) {
		return  LocalDate.parse(dt, YYYY_MM_DD).atStartOfDay();
	}
}
