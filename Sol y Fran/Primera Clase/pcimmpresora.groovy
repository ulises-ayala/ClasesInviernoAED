Impresora y Pc

Se desea comprar una PC y una impresora. Calcular el precio total: el cual está dado por la suma de 
los precios de costos, los porcentajes de ganancia del vendedor y un 21% de IVA. Supóngase una ganancia 
del vendedor del 12% por la PC y 7% por la impresora. Se leen los costos y se imprimen el precio total de ventas.

Accion 1.1.5.3() es 
	Ambiente
		costopc: real 
		costoimpresora: real 
	Proceso
		Esc 'Ingrese el costo de la pc y el costo de la impresora'
		Leer (costopc,costoimpresora) 
		Esc 'El precio total de ventas es de:', (costopc*1.12 + costoimpresora*1.07)*1.21
FinAccion



Si edad > 18 hacer
	Si DNI >= 4500000
		AccionDNI
	Sino
		AccionDNICONTRARIO
	FinSi
	ACCIONES
Sino
	Si edad = 15 hacer
		---
	FinSi
FinSi

Si reg.corte1 <> resg.corte1 hacer
	Corte1()
Sino
	Si reg.corte2<> resg.corte2 hacer
			Corte2()
	Sino
		Si reg.corte3 <> resg.corte3 hacer
				Corte3()
		FinSi
	FinSi
FinSi


Mientras NFDS(sec) hacer
	Mientras v <> "#" hacer
		Si v <> "H" hacer
			Según v hacer
				---
				--
				--
				---
			FinSegun
		FinSi
	FinMientras
FinMientras