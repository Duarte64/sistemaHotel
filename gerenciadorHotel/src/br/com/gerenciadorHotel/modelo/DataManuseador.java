package br.com.gerenciadorHotel.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DataManuseador {
	
	private String data;
	
	public DataManuseador(String data) {
		this.data = data;
	}
	
	public GregorianCalendar formatDate() throws ParseException {
		
		GregorianCalendar dataFormat = null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dataSDF = sdf.parse(this.data);
		Calendar cal = Calendar.getInstance();
		cal.setTime(dataSDF);
		dataFormat = new GregorianCalendar(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH),cal.get(Calendar.DAY_OF_MONTH));

		return dataFormat;
		
	}

}
