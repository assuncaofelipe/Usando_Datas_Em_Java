package modujo.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataEmJava2 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataAtualHoje = simpleDateFormat.parse("10/04/2021");
		Date dataVencimentoBoleto = simpleDateFormat.parse("11/04/2021");
		
		// AFTER : se data 1 é maior que data 2
		// BEFORE : se data 1 é menor que data 2
		
		if (dataVencimentoBoleto.after(dataAtualHoje) ) {
			System.out.println("Boleto vencido");
		} else {
			System.out.println("Boleto não vencido");
		}
	}

}
