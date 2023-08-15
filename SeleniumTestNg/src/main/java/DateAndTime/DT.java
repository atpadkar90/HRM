package DateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DT {

	public static void main(String[] args) {


		SimpleDateFormat simple = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 
		 System.out.println(simple.format(new Date()));
		 

	}

}
