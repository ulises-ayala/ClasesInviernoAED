1.1.6
Escriba un algoritmo que permita ingresar 3 valores numéricos y determine cuál es el 
mayor, el medio y el menor. (era el 3 de los complementarios)

Accion 1.1.6() es 
	Ambiente
		a: entero // 
		b: entero // 
		c: entero // 
	Proceso
		Esc 'Ingrese tres números'
		Leer(a,b,c)
		Si (a > b) y (a > c) hacer
			Si (b > c) entonces
				Esc 'El número mayor es', a,', el numero del medio es', b,'y el menor es',c
			Sino
				Esc 'El número mayor es', a,', el numero del medio es', c,'y el menor es',b
			FinSi
		FinSi
		Si (b > a) y (b > c) hacer
			Si (c > a) hacer
				Esc 'El número mayor es', b,', el numero del medio es', c,'y el menor es',a
			Sino
				Esc 'El número mayor es', b,', el numero del medio es', a,'y el menor es',c
			FinSi
		FinSi 
		Si (c > a) y (c > b) hacer
			Si (b > a) hacer
				Esc 'El número mayor es', c,', el numero del medio es', b,'y el menor es',a
			Sino
				Esc 'El número mayor es', c,', el numero del medio es', a,'y el menor es',b
			FinSi
		FinSi 
FinAccion 