package modujo.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataEmJava3 {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance(); /* pega a data atual */
		
		/* SIMULAR QUE A DATA VEM DO BANCO DE DADOS */
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("30-02-2022"));  /*DEFININDO UMA DATA QUALQUER*/
		
		
		calendar.add(Calendar.DAY_OF_MONTH, 10); /* DATA DE HJ + 10 DIAS */
		System.out.println(	"Somando o dia do mes: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 5); /* SOMA O MES + DIAS */
		System.out.println("Somando o mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.YEAR, 1);
		System.out.println("Somando 1 anos: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
	}
}
