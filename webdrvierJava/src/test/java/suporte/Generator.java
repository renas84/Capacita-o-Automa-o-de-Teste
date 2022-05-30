package suporte;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Generator {
	//retorna String no formato datahora -> 20220526113025
	public static String dataHoraParaArquivo() {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat("yyyymmddhhmmss").format(ts);
		
		
	}

}
