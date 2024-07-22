Escribir un algoritmo que ingrese una variable V y emita el valor de ésta, su cuadrado y su cubo.

Accion 1.1.19() es 
	Ambiente
		v: entero
	Proceso
		Esc("Ingrese un numero")
		Leer(v)
		Esc("El valor es de:", v)
		Esc("El cuadrado es de:", v**2)
		Esc("El cubo es de:", v**3)
FinAcción


Teniendo en cuenta el ejercicio anterior, realizar un incremento de la variable V en forma constante y creciente recalculando los demás valores 10 veces.

Accion 1.1.20() es 
	Ambiente
		v: entero
	Proceso
		Esc("Ingrese un número") // 2 -> 12
		Leer(v) // 2
		Para i:=10 hasta 10 hacer
			Esc("El valor es de:", v)
			Esc("El cuadrado es de:", v**2)
			Esc("El cubo es de:", v**3)
			v:=v + 1
		FinPara
FinAccion


Repita el ejercicio anterior con un cálculo de n veces, con n > 1. Por final emitir la suma de los cuadrados de V.

Accion 1.1.21() es 
	Ambiente
		v: entero
		n: entero
		sumacuadrados: entero
		i: entero
	Proceso
		Esc("Ingrese un numero")
		Leer(v) // 15 
		Esc("Ingrese la cantidad de veces que quiera repetir el calculo")
		Leer(n) // n = 20
		sumacuadrados:= 0
		Para i:=1 hasta n hacer
			Esc("El valor es de:", v)
			Esc("El cuadrado es de:", v**2) 
			Esc("El cubo es de:", v**3) 
			sumacuadrados:= sumacuadrados + v**2 
			v:=v + 1 
		FinPara
		Esc("La suma de todos los cuadrados de v es de:", sumacuadrados)
FinAccion

