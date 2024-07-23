Ejecutar un algoritmo que para 100 valores, contar la cantidad de numeros pares 
ingresados. Debe manejar que sea par con un valor logico/booleano

Accion NumerosPar() es 
	Ambiente
		num: entero 
		cont: entero
		i: entero
		par: booleano

		Funcion EsPar(x:entero):booleano es
			Si x MOD 2 = 0 entonces
				EsPar:= verdadero
			Sino 
				EsPar:= falso
			FinSi
		FinFuncion

	Proceso 
		cont:=0
		Para i:=1 hasta 100 hacer
			Esc 'Ingrese un numero' // num = 45
			Leer(num)
			par:= EsPar(num)
			Si par entonces
				cont:= cont + 1
			FinSi 
		FinPara




