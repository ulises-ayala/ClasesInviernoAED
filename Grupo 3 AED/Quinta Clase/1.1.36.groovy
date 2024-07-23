Ejercicio 1.1.36¶

Todo número cuya suma de sus dígitos sea múltiplo de 3 lo es también. 
Ej: 117 → 1+1+7 = 9 que es múltiplo de 3 , entonces 117 es múltiplo de 3 
Realizar un algoritmo que determine si un número es múltiplo de 3 en función de la afirmación 
antes realizada.
20375 -> 2 + 0 + 3 + 7 = 12 -> [12 MOD 3] -> Si es = 0 entonces 2037 es multiplo de 3

Accion 1.1.36() es 
	Ambiente
		num:entero
		sumadigitos: entero 
	Proceso 
		Esc 'Ingrese un numero'
		Leer(num)
		sumadigitos:= 0 
		Mientras num <> 0 hacer 
			sumadigitos:= sumadigitos + (num MOD 10) 
			num:= num DIV 10 
		FinMientras
		Si (sumadigitos MOD 3 = 0) entonces 
			Esc 'El numero es multiplo de 3'
		Sino 
			Esc 'El numero no es multiplo de 3'
		FinSi 
FinAccion

Accion 1.1.36() es 
	Ambiente
		num:entero
		sumadigitos: entero 
	Proceso 
		Esc 'Ingrese un numero'
		Leer(num)
		sumadigitos:= 0 
		Repetir
			sumadigitos:= sumadigitos + (num MOD 10) //..= 7 ->..= 10 -> 10 -> 10 + 2 -> 12
			num:= num DIV 10 
		Hasta que num = 0 
		Si (sumadigitos MOD 3 = 0) entonces 
			Esc 'El numero es multiplo de 3'
		Sino 
			Esc 'El numero no es multiplo de 3'
		FinSi 
FinAccion

Accion 1.1.36() es 
	Ambiente
		num:entero
		sumadigitos: entero
		longitud: entero
		numero_auxiliar: entero
		Procedimiento LongitudDeNumero(x:entero) es 
			longitud:= 0
			numero_auxiliar:= x
			Mientras numero_auxiliar <> 0 hacer 
				numero_auxiliar:= numero_auxiliar DIV 10
				longitud:= longitud + 1 
			FinMientras
		FinProcedimiento

	Proceso 
		Esc 'Ingrese un numero'
		Leer(num)
		LongitudDeNumero(num)
		Para i:=1 hasta longitud hacer 
			sumadigitos:= sumadigitos + (num MOD 10)
			num:= num DIV 10
		FinPara 
		Si (sumadigitos MOD 3 = 0) entonces 
			Esc 'El numero es multiplo de 3'
		Sino 
			Esc 'El numero no es multiplo de 3'
		FinSi
FinAccion