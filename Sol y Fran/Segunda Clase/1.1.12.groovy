1.1.12
Escriba un algoritmo que acepte un número entero mayor a 100 y menor a 1000, y 
muestre como está compuesto (unidades, decenas y centenas) y si es múltiplo de 3 
(Recordar: todo número cuya suma de sus dígitos sea múltiplo de 3, lo es también).

Accion 1.1.12() es 
	Ambiente
		num: entero 
		unidades: entero
		centenas: entero 
		decenas: entero 
		sumadig: entero 
	Proceso 
		Esc 'Ingrese un número, el número debe ser mayor a 100 y menor a 1000' 
		Leer(num) 
		Si num > 100 y num < 1000 hacer
			centenas:= num DIV 100 
			decenas := (num DIV 10) MOD 10 
			unidades:= num MOD 10 
			sumadig:= centenas + decenas + unidades
			Esc 'El numero esta compuesto por'
			Esc centenas, ': centenas'
			Esc decenas, ': decenas'
			Esc unidades,': unidades'
			Si sumadig MOD 3 = 0 entonces
				Esc 'El número es múltiplo de 3'
			FinSi 
		Sino
			Esc 'El número ingresado no es correcto'
		FinSi 
FinAccion 