Ejercicio 1.2.2¶
Diseñe una función que devuelva la suma de los dígitos del número natural 
suministrado como parámetro.

Accion 1.2.3() es 
	Ambiente
		num: entero
		Funcion SumaDigitos(x: entero): entero
			guardardigitos:= 0
			Mientras x <> 0 hacer
				guardardigitos:= guardardigitos + (x MOD 10)
				x:= x DIV 10
			FinMientras
			SumaDigitos:= guardardigitos
		FinFuncion
		guardardigitos: entero
	Proceso
		Esc 'Ingrese un numero'
		Leer(num)
		Esc 'La suma de los digitos de ese numero es de:', SumaDigitos(num)
FinAccion
