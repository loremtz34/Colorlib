package com.choucair.formacion.pageobjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.containsString;

public class ColorlibMenuPage extends PageObject {

	//Menu forms
	@FindBy (xpath="//*[@id='menu']/li[6]/a")
	public WebElement menuForms;
	
	//subMenu Form General
	@FindBy (xpath="//*[@id='menu']/li[6]/ul/li[1]/a")
	public WebElement menuFormGenerals;
	
	//submenu Form Validation
	@FindBy (xpath="//*[@id='menu']/li[6]/ul/li[2]/a")
	public WebElement menuFormValidation;
	
	//Form Validation = label informativo
	@FindBy (xpath="//*[@id='content']/div/div/div[1]/div/div/header/h5")
	public WebElement lblFormValidation;
			
	public void menuFormValidation() {
		menuForms.click();
		menuFormValidation.click();
		String strMensaje = lblFormValidation.getText();
		assertThat(strMensaje, containsString("Popup Validation"));
		
	}
}
