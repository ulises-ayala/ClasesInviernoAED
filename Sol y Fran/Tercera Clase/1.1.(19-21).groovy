Escribir un algoritmo que ingrese una variable V y emita el valor de ésta, su cuadrado y su cubo.

Accion 1.1.19() es 
	Ambiente 
		v: entero 
	Proceso 
		Esc 'Ingrese un número'
		Leer(v)
		Esc 'El valor es de:', v 
		Esc 'El cuadrado es de:', v**2
		Esc 'El cubo es de:', v**3 
FinAccion

Teniendo en cuenta el ejercicio anterior, realizar un incremento de la variable 
V en forma constante y creciente recalculando los demás valores 10 veces.

/*
v = 2 // 3 // 4 //... // 12
v**2= 4 // 9 // 16 //...// 12**2
v**3= 8 // 27 // 4**3 // ... // 12**3
*/

Accion 1.1.19() es 
	Ambiente 
		v: entero
		cont: entero
	Proceso 
	Esc 'Ingrese un número'
	Leer(v)
	cont:= 0	 // 2...// v = 12
	Repetir
		Esc 'El valor es de:', v 
		Esc 'El cuadrado es de:', v**2
		Esc 'El cubo es de:', v**3 
		v:= v + 1 // 3
		cont:= cont + 1 // 1 .../ cont = 10
	Hasta que cont = 10
FinAccion 

Accion 1.1.19() es 
	Ambiente 
		v: entero
		i: entero 
	Proceso 
	Esc 'Ingrese un número'
	Leer(v)
	Para i:=1 hasta 10 hacer
		Esc 'El valor es de:', v 
		Esc 'El cuadrado es de:', v**2
		Esc 'El cubo es de:', v**3 
		v:= v + 1 
	FinPara
FinAccion 


Repita el ejercicio anterior con un cálculo de n veces, con n > 1. Por final 
emitir la suma de los cuadrados de V.

Accion 1.1.21() es 
	Ambiente 
		v: entero 
		sumacuadrados: entero 
		vueltas: entero 
		i: entero
	Proceso 
		Esc 'Ingrese un numero'
		Leer(v)
		Esc 'Ingrese la cantidad de vueltas' // 5
		Leer(vueltas)
		Si vueltas <= 1 hacer 
			Mientras vueltas <= 1 hacer
				Esc 'Cantidad no valida, ingrese de vuelta' //
				Leer(vueltas)
			FinMientras
		FinSi
		sumacuadrados:= 0
		Para i:=1 hasta (vueltas) hacer 
			Esc 'El valor es de:', v 
			Esc 'El cuadrado es de:', v**2
			Esc 'El cubo es de:', v**3 
			sumacuadrados:= sumacuadrados + v**2
			v:= v + 1 
		FinPara
		Esc 'La suma de los cuadrados de mis numeros es de:', sumacuadrados
FinAccion

