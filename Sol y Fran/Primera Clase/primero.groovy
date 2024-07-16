Escribir un programa que permita calcular el precio de un artículo para un año dado, 
considerando que la inflación es del 4 por 100 anual.

La fórmula del precio es: P = C * (1 + R) ^ (N - A)

C - Precio actual.
N - Año futuro.
R - Tasa de Inflación.
A - Año actual.

Accion 1.1.5() es 
	Ambiente
		c: real
		n: entero 
		r = 0.04
		a: entero 
		p: real
	Proceso
		Esc("Ingrese el precio actual del producto")
		Leer(c)
		Esc("Ingrese un año futuro")
		Leer(n)
		Esc("Ingrese el año actual")
		Leer(a)
		p:= c*(1+R)^(N-A)
		Esc("El precio del producto sera", p)
FinAccion