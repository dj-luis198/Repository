package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import base.Base;

public class Example extends Base {
	
	private static Logger log= LogManager.getLogger(Example.class);

	private static String locatorSignInTxt = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a";

	public static void clickOnSingIn() {
		log.info("Estoy en el metodo clickSingIn---------------------------------------------");
		log.error("es un error---------------------------------------------------------------");
		click(locatorSignInTxt);
	}

}
