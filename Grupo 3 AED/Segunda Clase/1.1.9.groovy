1.1.9
Una persona decide realizar un viaje a Europa, para lo cual necesita una 
determinada cantidad de euros. La persona tiene ahorrada una cierta suma en 
dólares y desea saber si es suficiente y, en caso de haber diferencia (de más o de menos) 
a cuantos pesos equivale. Realice un algoritmo que solucione el problema, para lo cual deberá 
prever que se ingresen las equivalencias de monedas que considere necesarias (por ejemplo la 
cotizacion en pesos de dólar y/o del euro, o a cuantos euros equivale un dólar).



Accion 1.1.9() es 
	Ambiente
		sumadolares: real 
		costo_viaje: real 
		dolar_euro: real 
		euro_peso: real 
	Proceso
		Esc 'Ingreseme el valor del viaje'
		Leer(costo_viaje)
		Esc 'Ingreseme sus ahorros en dolares'
		Leer(sumadolares)
		Esc 'Ingrese la equivalencia dolar - euro'
		Leer(dolar_euro)
		Esc 'Ingrese la equivalencia euro - peso'
		Leer(euro_peso)
		sumadolares:= sumadolares * dolar_euro 
		Segun sumadolares hacer
			= costo_viaje: Esc 'Felicidades, le alcanza justo para comprar el viaje :)'
			< costo_viaje: Esc 'Lastimosamente, le falta para poder comprar el viaje'
						   Esc 'Su faltante en pesos argentinos es:$'(costo_viaje-sumadolares)*euro_peso
			> costo_viaje: Esc 'Felicidades, le alcanza para comprar el viaje :)'
						   Esc 'Además, le sobra en pesos argentinos:$'(sumadolares-costo_viaje)*euro_peso
		FinSegun 
FinAccion


Accion 1.1.9() es 
	Ambiente
		sumadolares: real 
		costo_viaje: real 
		dolar_euro: real 
		euro_peso: real 
	Proceso
		Esc 'Ingreseme el valor del viaje'
		Leer(costo_viaje)
		Esc 'Ingreseme sus ahorros en dolares'
		Leer(sumadolares)
		Esc 'Ingrese la equivalencia dolar - euro'
		Leer(dolar_euro)
		Esc 'Ingrese la equivalencia euro - peso'
		Leer(euro_peso)
		sumadolares:= sumadolares * dolar_euro 
		Si sumadolares = costo_viaje entonces
			Esc 'Felicidades, le alcanza justo para el viaje'
		Sino
			Si sumadolares > costo_viaje hacer 
				Esc 'Felicidades, le alcanza y además le sobra plata'
				Esc 'El sobrante en pesos es de:', (sumadolares - costo_viaje) * euro_peso
			Sino // sumadolares < costo_viaje
				Esc 'Lastimosamente, no le alcanza para poder viajar'
				Esc 'El faltanta en pesos es de:'(costo_viaje - sumadolares) * euro_peso
			FinSi 
		FinSi
FinAccion





Accion 1.1.9 () es
    Ambiente
        ahorro:real
        dolar_peso:real
        euro_peso,euro_dolar:real
        euro_viaje:real
        opcion: alfanumerico
    Proceso
        euro_peso:= 1009.70       // 1Euro = 1.009 pesos argentinos
        euro_dolar:= 1.09           // 1 euro = 1,09 USD
        Esc("Ingrese la cantidad de euros que usted necesita") 
        leer(euro_viaje)
        Esc("Ingrese cuanto dinero tiene en dolares") 
        leer(ahorro)
        Esc ("Ingrese cuanto esta el dolar en pesos en la actualidad")
        leer(dolar_peso)
        Esc("Usted tiene $",ahorro*dolar_peso,"en pesos argentinos. Y en euros tiene",ahorro/euro_dolar ) 
        Si (ahorro < euro_viaje) Entonces
            ahorro:= ahorro * dolar_peso // con esto convertimos nuestro ahorro en pesos
            euro_viaje:= euro_viaje*euro_peso // conversion euro a peso
            Esc("usted necesita",euro_viaje - ahorro,"pesos argentinos para poder viajar comodamente")
        Sino
            Si (ahorro>=euro_viaje) Entonces
                Esc("A usted no le falta dinero y en pesos argentinos tiene:""$",euro_viaje)
            FinSi
        FinSi 
    Esc("Desea convertir su monto a euro?S/N")
    Leer(opcion)
    Si (opcion<>"n") Entonces
        Esc("La cantidad de pesos argentinos en euros es", euro_viaje / euro_peso)
    FinSi
FinAccion


Acción 1.1.9 () es;
        Ambiente
            dol, eur, pesos: real
        Proceso
            Esc("Ingrese la cantidad de dólares que tiene y la cantidad de euros que necesita para viajar")
            Leer(dol, eur)
            dol:= dol * 0.92 
            Si dol > eur entonces // ahorro < viaje o ahorro = viaje
                pesos:= ((dol - eur) * 1405)
                Esc("Usted tiene el dinero necesario para poder viajar, disfrute de su viaje")
                Esc 'Le sobra:', pesos
            Sino
                pesos:= ((eur - dol) * 1405)
                Esc("Su cantidad de dólares es inferior a la cantidad de euros que necesita.
                Esc("Su faltante en pesos es de: " pesos)
            FinSi
            Si dol = eur
                Esc("Le alcanza justo para poder comprar el viaje")
            FinSi
    FinAcción