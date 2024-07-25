1.2.1
Realice una función que dado un número devuelva su cuadrado.

Accion 1.2.1() es 
	Ambiente
		num: entero
		Funcion CuadradoDeNumero(k:entero):entero
			CuadradoDeNumero:= k**2
		FinFuncion
	Proceso
		Esc 'Ingrese un numero'
		Leer(num)
		Esc 'El resultado es de:', CuadradoDeNumero(num)
FinAccion
