Ejemplo de Función

Accion Ejemplop() es 
	Ambiente
		Funcion Division(a,b: entero): entero 
			Division:= a / b 
		FinFuncion
		num1,num2: entero
	Proceso
		Esc 'Ingrese dos numeros'
		Leer(num1,num2)
		Esc 'El resultado de la division es de:', Division(num1,num2)

