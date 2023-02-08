package PageObject;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Actions.basePage;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

@DefaultUrl ("https://serenity.is/demo/")

public class createProductPageObject extends basePage{

	//VARIABLES GLOBALES
	String user, pass;

	//CREACION ELEMENTOS
	static By texUser = generalElements.texUser.getValor_campo();
	static By textPass = generalElements.textPass.getValor_campo();
	static By btnLogin = generalElements.btnLogin.getValor_campo();
	static By confiLogin = generalElements.confiLogin.getValor_campo();
	static By menuHome = generalElements.menuHome.getValor_campo();
	static By opcProduct = generalElements.opcProduct.getValor_campo();
	static By btnCreate = generalElements.btnCreate.getValor_campo();
	static By nameP = generalElements.nameP.getValor_campo();
	static By num1 = generalElements.num1.getValor_campo();
	static By num2 = generalElements.num2.getValor_campo();
	static By num3 = generalElements.num3.getValor_campo();
	static By saveP = generalElements.saveP.getValor_campo();
	static By inputSearch = generalElements.inputSearch.getValor_campo();



	@WhenPageOpens
	public void maximiseScreen() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(getDriver(),200);
		getDriver().manage().window().maximize();
		Thread.sleep(1000);
	}

	public void ingresarCredenciales(String usuario, String contraseña ) {

		try {
			Thread.sleep(3000);			
			waitImplicit(texUser);
			clear(texUser);
			input(usuario, texUser);
			Thread.sleep(1000);			
			waitImplicit(textPass);
			clear(textPass);
			input(contraseña, textPass);

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[StartSharp.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}
	}

	public void confirmarLogin() {

		try {

			waitImplicit(btnLogin);
			click(btnLogin);
			waitImplicit(btnLogin);
			Thread.sleep(2000);
			isDisplayed(confiLogin);
			System.out.println("***************************************************************************************");
			System.out.println("[StartSharp.com] - INICIO DE SESION EXITOSO");
			System.out.println("***************************************************************************************");

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[StartSharp.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}
	}

	public void seleccionarProducto() {

		try {
			Thread.sleep(2000);
			waitImplicit(menuHome);
			click(menuHome);
			Thread.sleep(2000);
			waitImplicit(opcProduct);
			click(opcProduct);

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[StartSharp.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}
	}

	public void seleccionarNuevoProducto() {

		try {

			Thread.sleep(2000);
			waitImplicit(btnCreate);
			click(btnCreate);

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[StartSharp.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}
	}

	public void registrarProducto(String productName, String unitsInStock, String unitsOnOrder, String reorderLevel) {

		try {
			Thread.sleep(2000);
			waitImplicit(btnCreate);
			input(productName, nameP);

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[StartSharp.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");
			fail();
		}
	}

	public void confirmarRegistro() {

		try {
			Thread.sleep(2000);
			waitImplicit(saveP);
			click(saveP);
			Thread.sleep(2000);
			System.out.println("***************************************************************************************");
			System.out.println("[StartSharp.com] - REGISTRO DE PRODUCTO EXITOSO");
			System.out.println("***************************************************************************************");


		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[StartSharp.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}
	}

	public void conusltaProducto(String productName) {

		try {

			Thread.sleep(2000);
			waitImplicit(inputSearch);
			input(productName, inputSearch);
			Thread.sleep(2000);

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[StartSharp.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}
	}

	public void confirmarConsulta() {

		try {
			
			Thread.sleep(8000);
			System.out.println("***************************************************************************************");
			System.out.println("[StartSharp.com] - CONSULTA EXITOSA");
			System.out.println("***************************************************************************************");

		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[StartSharp.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");
			fail();
		}
	}
}
