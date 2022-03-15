# EVC Vinculaciones

 

## El proyecto EVC, se encarga de crear y asociar una cuenta de Banistmo para un cliente nuevo. Se solicitara al cliente que ingrese datos personales, la toma de una fotografia de su documento de identidad, posteriormente una prueba de vida y luego una confirmacion de datos. Se realizaran busqueda de existencia del cliente en listas negras, tambien que no sea un cliente ya existente en el banco y se realizara una validacion de la identidad frente al tribunal electoral de Panama.
 

Esta aplicacion tiene al momento disponible las siguientes transacciones:

 

```
* Recolectar datos de contacto.
* Confirmacion datos de contacto.
* Captura imagen documento de identidad.
* Solicitud prueba de vida.
* Extraer datos de la cedula.
* Validar cliente hogan.
* Validar cliente en listas negras.
* Validacion datos con tribunal electorar.
* Recolectar datos adicionales.
* Consulta de declaracion cliente por fuera de Panama.
* Seleccionar sucursal de retiro de la TDD.
```

 

## Requerimientos

 

Para correr el proyecto es necesario lo siguiente:

 

```
* [Java JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) 1.8 o superior.
* [Google Chrome](https://www.google.com/intl/es/chrome/) Versi�n 75.0.3770.80 o superior.
* Network Connections "*AWS console"
```

 

Estos requerimientos son necesarios ya que la automatizaci�n esta desarrollada en el lenguaje Java y se ejecuta sobre el navegador de Google Chrome, teniendo como gestor de dependencias gradle el cual se puede ejecutar como wrapper.
 

## **Resumen de codificaci�n**
 
Se utiliza BDD como framework de automatizaci�n sobre el patr�n de arquitectura de ScreenPlay donde segregamos las capas de automatizaci�n.

 

### [features]
(https://dev.azure.com/banistmo/VP%20Servicios%20Corporativos/_git/bipaw0230000-onboarding-app-functional-test?path=%2Fsrc%2Ftest%2Fresources%2Ffeatures):
Se evidencian los casos prueba en lenguaje Gherkin para f�cil entendimiento por parde del negocio siguiendo el modelo **Given** [rol] **When**[caracteri�stica] **Then** [los beneficios]� y sus variaciones, con el se define el comportamiento de la transaccion que vamos a automatizar. Se trata de un lenguaje facil de leer, facil de entender y facil de escribir. Utilizar Gherkin nos va a permitir crear una documentacion viva a la vez que automatizamos los tests.

 

### [Step Definitions]
(https://dev.azure.com/banistmo/VP%20Servicios%20Corporativos/_git/bipaw0230000-onboarding-app-functional-test?path=%2Fsrc%2Ftest%2Fjava%2Fpa%2Fcom%2Fbanistmo%2Fevcvinculacion%2Fstepdefinitions):
Son clases que mapean cada línea de los escenarios definidos en lengua-je Gherkin a métodos java.

 

### [Tasks]
(https://dev.azure.com/banistmo/VP%20Servicios%20Corporativos/_git/bipaw0230000-onboarding-app-functional-test?path=%2Fsrc%2Fmain%2Fjava%2Fpa%2Fcom%2Fbanistmo%2Fevcvinculacion%2Ftasks):
Son tareas a un nivel de granularidad mas alto al de clicks y selects.

 

### [Interactions]
(https://dev.azure.com/banistmo/VP%20Servicios%20Corporativos/_git/bipaw0230000-onboarding-app-functional-test?path=%2Fsrc%2Fmain%2Fjava%2Fpa%2Fcom%2Fbanistmo%2Fevcvinculacion%2Finteractions):
Una interaccion representa una accion directa del usuario con la interfaz como ingresar datos en campos o dar clics en botones.

 

### [Questions]
(https://dev.azure.com/banistmo/VP%20Servicios%20Corporativos/_git/bipaw0230000-onboarding-app-functional-test?path=%2Fsrc%2Fmain%2Fjava%2Fpa%2Fcom%2Fbanistmo%2Fevcvinculacion%2Fquestions):
Es la capa donde se verifican los resultados de las operaciones realizadas en las capas anteriores.

 

### [User interface](https://dev.azure.com/banistmo/VP%20Servicios%20Corporativos/_git/bipaw0230000-onboarding-app-functional-test?path=%2Fsrc%2Fmain%2Fjava%2Fpa%2Fcom%2Fbanistmo%2Fevcvinculacion%2Fuserinterfaces&version=GBtrunk&_a=contents):
Son las clases que mapean los componentes de una interfaz de usuario.

 

### [Integration]
(https://dev.azure.com/banistmo/VP%20Servicios%20Corporativos/_git/bipaw0230000-onboarding-app-functional-test?path=%2Fsrc%2Fmain%2Fjava%2Fpa%2Fcom%2Fbanistmo%2Fevcvinculacion%2Fuserinterfaces):
Capa creada para integraciones con otros subsistemas (Dynamo, Hogan).

 

### [Util]
(https://dev.azure.com/banistmo/VP%20Servicios%20Corporativos/_git/bipaw0230000-onboarding-app-functional-test?path=%2Fsrc%2Fmain%2Fjava%2Fpa%2Fcom%2Fbanistmo%2Fevcvinculacion%2Futils):
Capa trasnversal al proyecto para reutilizacion de metodos.

 

### [Model]
(https://dev.azure.com/banistmo/VP%20Servicios%20Corporativos/_git/bipaw0230000-onboarding-app-functional-test?path=%2Fsrc%2Fmain%2Fjava%2Fpa%2Fcom%2Fbanistmo%2Fevcvinculacion%2Fmodels):
Una capa donde se encontraran todos los objetos complejos de negocio, como clientes para ser usados dentro de cualquier capa del proyecto.

 

### [Exceptions]
(https://dev.azure.com/banistmo/VP%20Servicios%20Corporativos/_git/bipaw0230000-onboarding-app-functional-test?path=%2Fsrc%2Fmain%2Fjava%2Fpa%2Fcom%2Fbanistmo%2Fevcvinculacion%2Fexceptions):
Una capa donde se crearan las excepciones espec�ificas que permitiran la legibilidad de los reportes cuando las pruebas fallen.

 

### [Proyecto de Automatización](https://dev.azure.com/banistmo/VP%20Servicios%20Corporativos/_git/bipaw0230000-onboarding-app-functional-test)

 

Los navegadores de la EVC aun no estan 100% dfinidos, por ahora los fijos son Chrome desktop (Sobre el cual se realiza la automatizacion para validar las funcionalidades), Chrome mobile y safari mobile sobre los cuales se realizan pruebas exploratorias para comprobar el responsive ya que las funcionalidades fueron comprobadas previamente en Chrome desktop. Se trabaja sobre angular 9.

 

El navegador y la version utilizada fue: chrome=83.0.4103.61 y el chromeDriver soportado para esta version es 
chromedriver = 91.0.4472.19 Para mas informacion consultar pagina de compatibilidad �(http://chromedriver.chromium.org/downloads).

 

