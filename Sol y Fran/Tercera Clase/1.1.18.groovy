Elabore un algoritmo que calcule el cociente de dos enteros F y G y el Resto de la operación, 
empleando sólo las operaciones suma y diferencia.

COCIENTE = ?
RESTO = ?

G = DIVISOR
F = DIVIDENDO

F DIV G = COCIENTE
F MOD G = RESTO 

SOLO USANDO SUMA Y RESTA

Accion 1.1.18() es 
	Ambiente 
		F, G: enteros
		cociente: entero 
		resto: entero 
	Proceso 
		Esc 'Ingrese el divisor y el dividendo'
		Leer(G,F) 
		cociente:= 0 // 10 DIV 0 = INFINITO
		resto:= F // 0 DIV 15 = 0 
		Si G > 0 hacer 
			Mientras resto >= G hacer 
				cociente:= cociente + 1 // 1 -> 2 -> 3 -> 4 -> 5
				resto:= resto - G // 10 - 2 => 8 - 2 => 6 - 2 => 4 - 2 => 2 - 2 = [ 0 ]
			FinMientras
			Esc 'El cociente de la división es de:', cociente
			Esc 'El resto de la división es de:', resto
		Sino
			Esc 'La división no se puede realizar'
		FinSi 	
FinAccion