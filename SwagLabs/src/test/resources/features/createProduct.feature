#Escenario 1 
Feature: Como usuario deseo poder realizar registro de prodcuto nuevo en startSharp
	
	@Escenario1
	Scenario Outline: Ingresar al home de startSharp y realizar registro exitoso de un producto nuevo
    Given El usuario ingresa a la pagina principal de startSharp
    When Realiza inicio de sesion ingresando "<usuario>" "<contraseña>"
    And Realiza click en iniciar sesion 
    And Selecciona opcion de viento del norte seguido de opcion de productos
    And Selecciona boton de agregar nuevo producto 
    And Ingresa campos obligatorios "<productName>" "<unitsInStock>" "<unitsOnOrder>" "<reorderLevel>"
    Then Selecciona boton guardar  
    
		Examples:
    | usuario			|  contraseña   | productName     |	 unitsInStock	 | unitsOnOrder    |reorderLevel |  							                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
    | admin     	|  serenity			| TEST07022023  	|  			1				 |       1         |		1	       | 
    
    
#Escenario 2 
	@Escenario2 
	Scenario Outline: Ingresar al home de startSharp y realizar consulta exitosa de producto
    Given El usuario ingresa a la pagina principal de startSharp
    When Realiza inicio de sesion ingresando "<usuario>" "<contraseña>"
    And Realiza click en iniciar sesion  
    And Selecciona opcion de viento del norte seguido de opcion de productos
    And Ingresa nombre de producto "<productName>"
    Then Realiza validacion de consulta exitosa
    
		Examples:
    | usuario			|  contraseña   | productName     || 							                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
    | admin     	|  serenity			| TEST07022023  	||                  
    
    	