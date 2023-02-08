package PageObject;

import org.openqa.selenium.By;

public enum generalElements {

	//FEATURE INICIO DE SESION
	texUser (By.xpath("//*[@id=\"LoginPanel0_Username\"]")),
	textPass (By.xpath("//*[@id=\"LoginPanel0_Password\"]")),
	btnLogin (By.xpath("//*[@id=\"LoginPanel0_LoginButton\"]")),
	confiLogin (By.xpath("//*[@id=\"s-sidebar-toggler\"]")),
	
	menuHome (By.xpath("(//span[@class='s-sidebar-link-text'])[position()=2]")),
	opcProduct (By.xpath("(//span[@class='s-sidebar-link-text'])[position()=5]")),
	btnCreate (By.xpath("(//span[@class='button-inner'])[position()=1]")),
	
	
	nameP (By.xpath("(//input[@class='editor s-Serenity-StringEditor s-StringEditor required'])[position()=1]")),
	num1 (By.xpath("(//input[@class='editor s-Serenity-IntegerEditor s-IntegerEditor integerQ required valid'])[position()=1]")),
	num2 (By.xpath("(//input[@class='editor s-Serenity-IntegerEditor s-IntegerEditor integerQ required valid'])[position()=2]")),
	num3 (By.xpath("(//input[@class='editor s-Serenity-IntegerEditor s-IntegerEditor integerQ required valid'])[position()=3]")),
	saveP (By.xpath("(//span[@class='button-inner'])[position()=7]")),
	
	inputSearch (By.xpath("(//input[@class='s-Serenity-QuickSearchInput s-QuickSearchInput'])[position()=1]"));
	
	
	
	private By valor_campo;

	private generalElements(By valor_campo) {
		this.valor_campo = valor_campo;
	}

	public By getValor_campo() {
		return valor_campo;
	}

	public void setValor_campo(By valor_campo) {
		this.valor_campo = valor_campo;
	}
}
