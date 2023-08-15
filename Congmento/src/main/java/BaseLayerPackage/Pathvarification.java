package BaseLayerPackage;

import java.io.File;

public class Pathvarification {
	

	public Pathvarification(String path)
	{
		File f= new File(path);
		System.out.println(f.exists());
	}

	public static void main(String[] args) {
		
		Pathvarification b= new Pathvarification(System.getProperty("user.dir")+"\\src\\main\\java\\TestData\\Cogmento CRM test Data.xlsx");

	}

}
