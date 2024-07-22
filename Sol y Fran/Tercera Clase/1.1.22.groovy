Elabore un algoritmo que calcule el producto de dos enteros A y B 
empleando sólo la operación suma.

Accion 1.1.22() hacer
	Ambiente
		a: entero 
		b: entero 
		suma: entero 
	Proceso 
		Esc 'Ingrese dos numeros' // a = 15 y b = 2
		Leer(a,b)
		suma:=0
		Para i:=1 hasta b hacer 
			suma:= suma + a 
		FinPara
		Esc 'El producto es igual a', suma 
FinAccion