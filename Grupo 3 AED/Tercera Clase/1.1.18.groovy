/*Elabore un algoritmo que calcule el cociente de dos enteros F y G y el 
Resto de la operación, empleando sólo las operaciones suma y diferencia.

COCIENTE = ?
RESTO = ?

F = DIVISOR
G = DIVIDENDO

F DIV G

SOLO USANDO SUMA Y RESTA
*/


Accion 1.1.18() es 
	Ambiente
		F: entero 
		G: entero 
		COCIENTE: entero 
	Proceso // F DIV G
		Esc 'Ingrese un dividendo'  
		Leer(F)  // 0
		Esc 'Ingrese un divisor'  
		Leer(G) // 30
		cociente:= 0 
		Si G <> 0 hacer
			Mientras (F => G) hacer 
				cociente:= cociente + 1 
				F:= F - G 
			FinMientras
			Esc 'El cociente de la división es de:', cociente 
			Esc 'El resto de la división es de:', F
		Sino 
			Esc 'La división no se puede hacer, es indeterminado'
		FinSi 
FinAccion