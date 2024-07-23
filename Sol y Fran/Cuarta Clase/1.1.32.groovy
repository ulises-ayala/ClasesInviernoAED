Ejercicio 1.1.32
La fecha del domingo de Pascua corresponde al primer domingo 
después de la primera luna llena que sigue al equinoccio de primavera. 
La secuencia de cálculos que permite conocer esta fecha es:

A = anio mod 19
B = anio mod 4
C = anio mod 7
D = ( 19 * A + 24 ) mod 30 
E = ( 2 * B + 4 * C + 6 * D + 5 ) mod 7
N = ( 22 + D + E )

Donde N indica el número del día del mes de marzo (o abril si N es superior a 31) 
correpondiente al domingo de Pascua. Realizar un algoritmo que determine esta fecha 
para los años comprendidos entre 1990 y 2010.

Accion DomingoPascua() es 
	Ambiente
		A: entero 
		B: entero 
		C: entero 
		D: entero 
		E: entero 
		N: entero 
		año: entero
	Proceso
		Para año:=1990 hasta 2010 hacer
			A:= año mod 19
			B:= año mod 4
			C:= año mod 7
			D:= ( 19 * A + 24 ) mod 30 
			E:= ( 2 * B + 4 * C + 6 * D + 5 ) mod 7
			N:= ( 22 + D + E ) 
			Si N > 31 hacer
				Esc 'El domingo de pascua del año:', año, 'fue el dia', (N-31),' de abril'
			Sino
				Esc 'El domingo de pascua del año', año, 'fue el dia', N,' de marzo'
			FinSi 
		FinPara
FinAccion

