Ejercicio 1.1.28
Construya un algoritmo capaz de encontrar todas las cifras de tres dígitos que 
cumplan con la condición de que la suma de los cubos de sus dígitos sea igual al número 
que la cifra representa.

100....999

Accion 1.1.28() es 
	Ambiente 
		i: entero
		aux1: entero
		aux2: entero 
		aux3: entero
		suma_aux: entero
	Proceso
		Para i:=100 hasta 999 hacer
			aux1:= i DIV 100 
			aux2:= (i DIV 10) MOD 10 
			aux3:= i MOD 10 
			suma_aux:= aux1**3 + aux2**3 + aux3**3 
			Si suma_aux = i hacer 
				Esc 'El numero:', i,' cumple con la condicion'
			FinSi
		FinPara
FinAccion