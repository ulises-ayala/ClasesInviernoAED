Elabore un algoritmo que calcule el producto de dos enteros A y B empleando sólo la operación suma.


Accion 1.() es 
	Ambiente
		a: entero // 3
		b: entero // 4
		producto: entero
	Proceso
		Esc("Ingrese dos numeros")
		Leer(a,b)
		producto:= 0
		Para i:=1 hasta a hacer
			producto:= producto + b 
		FinPara
		Esc("El resultado del producto es de:", producto)
FinAccion