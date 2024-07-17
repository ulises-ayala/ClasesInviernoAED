1.1.6
Escriba un algoritmo que permita ingresar 3 valores numéricos y determine cuál es el 
mayor, el medio y el menor. (era el 3 de los complementarios)

Accion 1.1.6() es 
	Ambiente
		a: entero // 
		b: entero // 
		c: entero // 
	Proceso 
		esc ('Ingrese tres numeros')
		Leer(a,b,c)
		Si (a > b) y (a > c) hacer
			Si (b > c) entonces
				esc ('El mayor es', a, ', el del medio es', b,' y el menor es',c)
			Sino
				esc ('El mayor es', a, ', el del medio es', c,' y el menor es',b)
			FinSi
		FinSi

		Si (c > b) y (c > a) hacer
			Si (b > a) entonces
				esc ('El mayor es', c, ', el del medio es', b,' y el menor es',a)
			Sino
				esc ('El mayor es', c, ', el del medio es', a,' y el menor es',b)
			FinSi
		FinSi
		
		Si (b > a) y (b > c) hacer
			Si (c > a) entonces
				esc ('El mayor es', b, ', el del medio es', c,' y el menor es',a)
			Sino
				esc ('El mayor es', b, ', el del medio es', a,' y el menor es',c)
			FinSi
		FinSi
FinAccion