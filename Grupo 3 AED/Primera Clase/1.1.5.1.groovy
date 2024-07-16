Escribir un programa que permita calcular el precio de un artículo para un año dado, 
considerando que la inflación es del 4 por 100 anual.

La fórmula del precio es: P = C * (1 + R) ^ (N - A)

C - Precio actual.
N - Año futuro.
R - Tasa de Inflación.
A - Año actual.

Accion 1.1.5.1() es 
	Ambiente
		c: real
		n: entero      
		r= 0.04
		a: entero
	Proceso
		Esc 'Ingrese el precio actual'
		Leer(c)
		Esc 'Ingrese el año futuro'
		Leer(n)
		Esc 'Ingrese el año actual'
		Leer(a)
		Esc 'El precio es de:', c * (1 + r) ^ (n - a)
FinAccion