1.1.9
Una persona decide realizar un viaje a Europa, para lo cual necesita una 
determinada cantidad de euros. La persona tiene ahorrada una cierta suma en 
dólares y desea saber si es suficiente y, en caso de haber diferencia (de más o de menos) 
a cuantos pesos equivale. Realice un algoritmo que solucione el problema, para lo cual deberá 
prever que se ingresen las equivalencias de monedas que considere necesarias (por ejemplo la 
cotizacion en pesos de dólar y/o del euro, o a cuantos euros equivale un dólar).

Accion 1.1.9() es 
	Ambiente
		cant_eur: real 
		suma_dol: real 
		pesos_dif: real 
		euro_dolar: real 
		pesos_euros: real
	Proceso
		Esc 'Ingrese la cantidad de euros para el viaje a Europa'
		Leer(cant_eur)
		Esc 'Ingrese su sua en dolares'
		Leer(suma_dol)
		Esc 'Ingrese la equivalencia euro-dolar'
		Leer(euro_dolar)
		Esc 'Ingrese la equivalencia pesos-euro'
		Leer(pesos_euros)
		suma_dol:= suma_dol * euro_dolar // Convierto mis dolares a euros.
		Si suma_dol = cant_eur hacer // Cantidad exacta
			Esc 'Felicidades, tienes el dinero justo para hacer el viaje'
		Sino
			Si suma_dol > cant_eur hacer // Me sobra 
				Esc 'Felicidades, tienes el dinero para hacer el viaje'
				Esc 'Y además le sobran', (suma_dol - cant_eur) * pesos_euro,' pesos argentinos'
			Sino
				Esc 'Lastimosamente, no te alcanza para el viaje' // Me falta
				Esc 'Le falta', (cant_eur - suma_dol) * pesos_euro, ' pesos argentinos'
			FinSi
		FinSi 
FinAccion

