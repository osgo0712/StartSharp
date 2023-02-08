package Steps;

import PageObject.createProductPageObject;
import net.thucydides.core.annotations.Step;

public class createProductSteps {

	createProductPageObject createProductPageObject;
	
	@Step
	public void openApp() {
		createProductPageObject.open();
	}
	
	@Step
	public void ingresarCredenciales(String usuario, String contraseña) {
		createProductPageObject.ingresarCredenciales(usuario, contraseña);
	}
	
	@Step
	public void confirmarLogin() {
		createProductPageObject.confirmarLogin();
	}
	
	@Step
	public void seleccionarProducto() {
		createProductPageObject.seleccionarProducto();
	}
	
	@Step
	public void seleccionarNuevoProducto() {
		createProductPageObject.seleccionarNuevoProducto();
	}
	
	@Step
	public void registrarProducto(String productName, String unitsInStock, String unitsOnOrder, String reorderLevel) {
		createProductPageObject.registrarProducto(productName, unitsInStock, unitsOnOrder, reorderLevel);
	}
	
	@Step
	public void confirmarRegistro() {
		createProductPageObject.confirmarRegistro();
	}

	@Step
	public void conusltaProducto(String productName) {
		createProductPageObject.conusltaProducto(productName);
	}
	
	@Step
	public void confirmarConsulta() {
		createProductPageObject.confirmarConsulta();
	}
	
}
