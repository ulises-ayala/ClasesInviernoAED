Escriba un algoritmo que determine si un número es primo.

1343

// 6

(2, ..., 1342)

1 y el 5 son divisores 

Accion Primo() es 
	Ambiente 
		num: entero 
		i: entero
		divisores: booleano
	Proceso 
		Esc 'Ingrese un número'
		Leer(num) 
		divisores:= falso
		Para i:=2 hasta (num - 1) hacer
			Si (num MOD i = 0) hacer 
				divisores:= verdadero 
			FinSi 
		FinPara
		Si divisores entonces
			Esc 'No es primo'
		Sino 
			Esc 'Es primo'
		FinSi 
FinAccion

Accion PrimoPreTest() hacer 
	Ambiente 
		num: entero 
		cont: entero 
		divisores: entero
	Proceso 
		Esc 'Ingrese un número'
		Leer(num)
		divisores:= 0
		cont:= 2
		Mientras (cont < num) y (divisores) hacer 
			Si (num MOD cont = 0) hacer 
				divisores:= 1
			FinSi 
			cont:= cont + 1
		FinMientras
		Si divisores <> 1 hacer
			Esc 'Es primo'
		Sino 
			Esc 'No es primo'
		FinSi
FinAccion