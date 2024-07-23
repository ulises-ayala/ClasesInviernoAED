Ejercicio 1.1.36¶
Todo número cuya suma de sus dígitos sea múltiplo de 3 lo es también. 
Ej: 117 → 1+1+7 = 9 que es múltiplo de 3 , entonces 117 es múltiplo de 3 
Realizar un algoritmo que determine si un número es múltiplo de 3 en función de la afirmación 
antes realizada



654 MOD 10 = 4 -> Ultimo digito
654 DIV 10 = 65-> Me borra el ultimo digito

Accion 1.1.36() es 
	Ambiente 
		numero: entero
		aux: entero
		numero_aux: entero 
	Proceso
		Esc 'Ingrese un numero'
		Leer(numero)
		Repetir
			numero_aux:= numero
			aux:= 0 
			Mientras numero <> 0 hacer 
				aux:= aux + (numero MOD 10) 
				numero:= numero DIV 10 
			FinMientras
			Si aux MOD 3 = 0 entonces 
				Esc 'El numero', numero_aux,' es multiplo de 3'
			Sino 
				Esc 'El numero', numero_aux, 'no es multiplo de 3'
			FinSi
			Esc 'Ingrese otro numero a evaluar, ingrese 0 para salir'
			Leer(numero)
		Hasta que numero = 0
FinAccion