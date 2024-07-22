1.1.24()
Escribir un algoritmo que, dado un importe dinero, permita calcular e informar cuanto 
corresponde pagar por un impuesto, en cuantas cuotas y el valor de las mismas. Tener en 
cuenta los siguientes datos:

-	IMPUESTO = 10% del importe dado.
-	Los importes mayores que $500 y menor o igual que $1000 se pagan en dos cuotas.
-	Los mayores de $1000 en tres cuotas. El algoritmo debe permitir tratar varios importes 	 
finalizando cuando se ingresa 9999 como importe.

Accion 1.1.24(PostTest) es 
	Ambiente 
		importe: real
		total: real
	Proceso
		Esc 'Ingrese un importe'
		Leer(importe)
		Repetir // 1700
			total:= importe * 1.10 
			Segun importe hacer 
				<= 500: Esc 'No corresponde a pagar en cuotas'
				<= 1000: Esc 'Le corresponde dos cuotas de:', total/2
				> 1000: Esc 'Le corresponde tres cuotas de', total/3
			FinSegun
			Esc 'El total a pagar aplicando el 10% de impuesto es de:', total
			Esc 'El impuesto fue de:', importe * 0.10
			Esc 'Ingrese otro importe, si desea finalizar, ingrese 9999' // 9999
			Leer(importe)
		Hasta que importe = 9999
FinAccion

Accion 1.1.24(Pre-Test) es 
	Ambiente 
		importe: real
		total: real
	Proceso
		Esc 'Ingrese un importe'
		Leer(importe) 
		Mientras importe <> 9999 hacer
			total:= importe * 1.10 
			Segun importe hacer 
				<= 500: Esc 'No corresponde a pagar en cuotas'
				<= 1000: Esc 'Le corresponde dos cuotas de:', total/2
				> 1000: Esc 'Le corresponde tres cuotas de', total/3
			FinSegun
			Esc 'El total a pagar aplicando el 10% de impuesto es de:', total
			Esc 'El impuesto fue de:', importe * 0.10
			Esc 'Ingrese otro importe, si desea finalizar, ingrese 9999' 
			Leer(importe) 
		FinMientras
FinAccion
















Accion 24(ANA) Es
  Ambiente
    importe, impuesto, val_cuota: reales 
  Proceso
    Escribir ('Ingrese su importe de dinero')
    Leer (importe)
    Repetir 
      Si (importe > 500) y (importe <= 1000) ent 
        Escribir ('se paga en dos cuotas')
        cuotas:= 2
      Sino 
          Si (importe > 1000) ent 
            Escribir ('se paga en tres cuotas')
            cuotas:= 3
          Finsi
      Finsi
      impuesto:= importe * 0.10
      val_cuota:= importe / cuotas
    Hasta que (importe = 9999)
    Escribir ('le corresponde pagar de impuesto:', impuesto,'en', cuotas,'cuotas','con un valor de', val_cuota)
Finaccion

Acción 1.1.24 (Ignacio) es;
        Ambiente
            importe_dinero: real
            impuesto = 0.10
            dinero_impuesto: real
        Proceso
            Esc("Ingrese el monto de dinero para calcular cuantas cuotas tiene que pagar por el impuesto")
            Leer(importe_dinero) 
            dinero_impuesto:= importe_dinero * 0,1 // 600
            Mientras importe <> 9999 hacer
                Si dinero_impuesto > 500 hacer
                Esc("Su monto total, con el impuesto, es mayor que $500. Podrá pagar en 2 cuotas")
                FinSi
                Si dinero_impuesto <= 1000 hacer
                Esc("Su monto total, con el impuesto, es menor o igual que $1000. Podrá pagar en 2 cuotas")
                FinSi
                Si dinero_impuesto > 1000 hacer
                Esc("Su monto total, con el impuesto, es mayor que $1000. Podrá pagar en 3 cuotas")
            FinMientras
    FinAcción




