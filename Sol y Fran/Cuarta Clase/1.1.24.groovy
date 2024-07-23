Ejercicio 1.1.24
Escribir un algoritmo que, dado un importe dinero, permia calcular e informar cuanto 
corresponde pagar por un impuesto, en cuantas cuotas y el valor de las mismas. 
Tener en cuenta los siguientes datos:

-	IMPUESTO = 10% del importe dado.
-	Los importes mayores que $500 y menor o igual que $1000 se pagan en dos cuotas.
-	Los mayores de $1000 en tres cuotas. El algoritmo debe permitir tratar varios importes 
finalizando cuando se ingresa 9999 como importe.

Accion 1.1.24() es
	Ambiente
		importe: real 
		total: real // -> el importe con el impuesto aplicado
	Proceso
		Esc 'Ingrese un importe'
		Leer(importe)
		Repetir
			total:= importe * 1.10
			Segun importe hacer
				<= 500 : Esc 'No paga en cuotas'
				<= 1000: Esc 'Paga en dos cuotas de:', total/2
				>  1000: Esc 'Paga en tres cuotas de:', total/3
			FinSegun
			Esc 'El importe con el impuesto aplicado es de:', total
			Esc 'El impuesto es de:', importe * 0.10
			Esc 'Ingrese otro importe, si desea salir, ingrese 9999.'
			Leer(importe) 
		Hasta que importe = 9999
FinAccion
