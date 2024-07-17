1.1.7
Escriba un algoritmo que acepte dos números, calcule la suma e imprima el 
mensaje de acuerdo al resultado obtenido.

Suma <= 50 // La suma es menor o igual a 50
Suma > 50 y <= 100 // La suma es mayor que 50 pero menor o igual que 100
Suma > 100 y <= 200 // La sua es mayor que 100 pero menor o igual que 200
Suma > 200 // La suma es mayor a 200 

Accion 1.1.7() es 
	Ambiente
		a,b: entero
		total: entero
	Proceso
		Esc 'Ingrese los dos números'
		Leer(a,b) // 50 + 500
		total:= a + b // 550
		Segun total Hacer
			<= 50: Esc 'La suma es menor o igual a 50.'
			<=100: Esc 'La suma es mayor que 50 pero menor o igual que 100.'
			<=200: Esc 'La suma es mayor a 100 pero menor o igual que 200.'
			> 200: Esc 'La suma es mayor que 200.'
		FinSegun
FinAccion


