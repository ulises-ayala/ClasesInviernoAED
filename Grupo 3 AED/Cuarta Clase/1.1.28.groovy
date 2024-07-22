1.1.28()
Construya un algoritmo capaz de encontrar todas las cifras de tres dígitos que 
cumplan con la condición de que la suma de los cubos de sus dígitos sea igual al 
número que la cifra representa.

Accion 1.1.28() es 
	Ambiente
		num: entero
		dig1,dig2,dig3: entero
		sumadig: entero
	Proceso 
		Para num:=100 hasta 999 hacer 
			dig1:= num DIV 100 
			dig2:= (num DIV 10) MOD 10 
			dig3:= num MOD 10 
			sumadig:= dig1**3 + dig2**3 + dig3**3 // 
			Si sumadig = num hacer
				Esc 'El numero', num,' cumple con la condición del ejercicio'
			FinSi 
		FinPara
FinAccion

