package modujo.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		Date date = new Date();
		
		System.out.println("Data em milisegundos: " + date.getTime()); //FORMA DE DATA DEPRECIADA
		System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis()); //FORMA ATUALIZADA
		
		System.out.println("\nDia do mes: " + date.getDate()); //FORMA DE DATA DEPRECIADA
		System.out.println("Calendar Dia do mes: " + calendar.get(Calendar.DAY_OF_MONTH)); //FORMA ATUALIZADA
		
		System.out.println("\nDia da semana: " + date.getDay());
		System.out.println("Calendar dia da Semana: " + calendar.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("\nHoras do dia: " + date.getHours());
		System.out.println("Calendar Horas do dia: " + calendar.get(Calendar.HOUR));

		System.out.println("\nMinutos da Hora: " + date.getMinutes());
		System.out.println("Calendar Minutos da Hora: " + + calendar.get(Calendar.MINUTE));
		
		System.out.println("\nSegundos: " + date.getSeconds());
		System.out.println("Calendar Segundos: " + calendar.get(Calendar.SECOND));
		
		System.out.println("\nAno: " + (date.getYear() + 1900));
		System.out.println("Calendar Ano: " + calendar.get(Calendar.YEAR));
		
		System.out.println("\n");
		/* ---------------- SIMPLE DATE FORMAT --------------*/
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		System.out.println("Data atual em formato padrao e string: " + simpleDateFormat.format(calendar.getTime()));
				
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		System.out.println("Data em formato para Banco de Dados: " + simpleDateFormat.format(calendar.getTime()));
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Objeto Date: " + simpleDateFormat.parse("18/10/1987"));;
			
		
	}
}
