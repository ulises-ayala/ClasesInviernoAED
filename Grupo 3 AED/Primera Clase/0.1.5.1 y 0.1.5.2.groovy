Diseñe un algoritmo que permita resolver cada uno de los ejercicios 
enunciados a continuación:

1. Leer los datos de un automóvil en la forma ¨Marca¨ seguida de ¨Modelo¨, y 
escribir en la forma ¨Modelo¨ seguido por ¨Marca¨.
2. Convertir una suma en dólares a PESOS. Se debe prever que el valor de 
conversión puede cambiar.

Accion 0.1.5.1() es 
	Ambiente
		marca: alfanúmerico
		modelo: alfanúmerico
	Proceso
		Esc 'Ingrese la marca del automóvil'
		Leer(marca)
		Esc 'Ingrese el modelo del automóvil'
		Leer(modelo)
		Esc 'El modelo es:', modelo, '. La marca es:', marca
FinAccion

Acción 0.1.5.2() es 
	Ambiente
		dolares: real 
		pesos = 1400
		total: real
	Proceso
		Esc 'Ingrese su suma en dolares para convertirlas a pesos' // 20 dolares
		Leer(dolares)
		total:= dolares * pesos
		Esc 'Su suma en dolares es' total
FinAccion