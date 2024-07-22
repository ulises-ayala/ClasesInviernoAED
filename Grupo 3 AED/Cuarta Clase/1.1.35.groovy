1.1.35

Escriba un algoritmo que acepte un número entero que representa una suma de
dinero e indique cuantos billetes de cada denominación necesita, suponiendo que 
solo existen billetes de 500, 100, 50, 20, 10, 5 y 1 peso.
// 
// pOSAKJ39Ap0eaisjh2|1iSJASS$
// v


Accion 1.1.35() es 
	Ambiente 
		monto: entero 
		b500: entero 
		b100: entero 
		b50: entero 
		b20: entero 
		b10: entero  
		b5: entero 
		b1: entero 
	Proceso
		b500:= 0 
		b100:= 0 
		b50:= 0 
		b20:= 0
		b10:= 0 
		b5 := 0 
		b1 := 0 
		Esc 'Ingrese el monto'
		Leer(monto)
		Repetir 
			Segun monto hacer
				>= 500: b500:= b500 + 1
						monto:= monto - 500
				>= 100: b100:= b100 + 1 
						monto:= monto - 100
				>= 50 : b50:= b50 + 1
						monto:= monto - 50
				>= 20 : b20:= b20 + 1 
						monto:= monto - 20 
				>= 10 : b10 := b10 + 1
						monto:= monto - 10 
				>= 5 :  b5:= b5 + 1 
						monto:= monto - 5
				>= 1 :  b1:= b1 + 1 
						monto:= monto - 1
			FinSegun
		Hasta que monto = 0
		Esc 'Necesito de cada denominacion de billetes esta cantidad:'
		Esc 'De $500 necesito:', b500 
		Esc 'De $100 necesito', b100 
		Esc 'De $50 necesito', b50 
		Esc 'De $20 necesito', b20
		Esc 'De $10 necesito', b10
		Esc 'De $5 necesito', b5
		Esc 'De $1 necesito', b1 
FinAccion
