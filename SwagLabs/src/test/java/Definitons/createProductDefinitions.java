package Definitons;

import Steps.createProductSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class createProductDefinitions {
	
	@Steps
	createProductSteps createProductSteps;

	@Given("^El usuario ingresa a la pagina principal de startSharp$")
	public void el_usuario_ingresa_a_la_pagina_principal_de_startSharp() throws Throwable {
		createProductSteps.openApp();
	}

	@When("^Realiza inicio de sesion ingresando \"([^\"]*)\" \"([^\"]*)\"$")
	public void realiza_inicio_de_sesion_ingresando(String usuario, String contraseña) throws Throwable {
		createProductSteps.ingresarCredenciales(usuario, contraseña);
	}

	@When("^Realiza click en iniciar sesion$")
	public void realiza_click_en_iniciar_sesion() throws Throwable {
		createProductSteps.confirmarLogin();
	}

	@When("^Selecciona opcion de viento del norte seguido de opcion de productos$")
	public void selecciona_opcion_de_viento_del_norte_seguido_de_opcion_de_productos() throws Throwable {
		createProductSteps.seleccionarProducto();
	}

	@When("^Selecciona boton de agregar nuevo producto$")
	public void selecciona_boton_de_agregar_nuevo_producto() throws Throwable {
		createProductSteps.seleccionarNuevoProducto();
	}

	@When("^Ingresa campos obligatorios \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void ingresa_campos_obligatorios(String productName, String unitsInStock, String unitsOnOrder, String reorderLevel) throws Throwable {
		createProductSteps.registrarProducto(productName, unitsInStock, unitsOnOrder, reorderLevel);
	}

	@Then("^Selecciona boton guardar$")
	public void selecciona_boton_guardar() throws Throwable {
		createProductSteps.confirmarRegistro();
	}
	
	@When("^Ingresa nombre de producto \"([^\"]*)\"$")
	public void ingresa_nombre_de_producto(String productName) throws Throwable {
		createProductSteps.conusltaProducto(productName);
	}
	
	@Then("^Realiza validacion de consulta exitosa$")
	public void realiza_validacion_de_consulta_exitosa() throws Throwable {
		createProductSteps.confirmarConsulta();
	}
}
