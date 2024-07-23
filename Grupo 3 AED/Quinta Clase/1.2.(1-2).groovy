Realice una función que dado un número devuelva su cuadrado.

Accion 1.2.1() es 
	Ambiente
		num: entero
		Funcion CuadradoDeNumero(n:entero): entero
			CuadradoDeNumero:= n**2
		FinFuncion
	Proceso
		Esc 'Ingrese un numero'
		Leer(num)
		Esc 'El cuadrado del numero es de:', CuadradoDeNumero(num)
FinAccion 

Diseñe una función que devuelva la suma de los dígitos del número 
natural suministrado como parámetro.

Accion 1.2.2() es 
	Ambiente
		num: entero
		aux: entero
		Funcion SumaDigitos(x:entero):entero es
			aux:=0
			Mientras x <> 0 hacer
				aux:= a + x MOD 10
				x:= x DIV 10
			FinMientras
			SumaDigitos:= aux
		FinFuncion
	Proceso
		Esc 'Ingrese un numero'
		Leer(num)
		Esc 'La suma de los digitos del numero ingresado es de:', SumaDigitos(num)
FinAccion 

