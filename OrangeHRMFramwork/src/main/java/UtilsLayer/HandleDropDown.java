package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass{
	
	public  void handDropdown(WebElement wb,String value)
	{
		Select sel= new Select(wb);
		
		sel.deselectByVisibleText(value);
	}

}
