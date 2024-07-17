1.1.8
Escriba un algoritmo que permita conocer la edad de una persona, con solo ingresar 
la fecha de nacimiento y la fecha actual, ambas en el formato: DIA, MES, AÑO

Accion 1.1.8() es 
	Ambiente
	    Edad,Dia,Mes,Año,DiaN,MesN,AñoN: Enteros
	Proceso
	    escribir("Ingresar Dia, Mes y Año actual");
	    Leer (Dia,Mes,Año);
	    escribir("Ingresar Dia, Mes y Año de nacimiento");
	    Leer (DiaN,MesN,AñoN); 
	    Edad:= Año - AñoN // 18 / 07 / 2004 ||| 17 / 09 / 2024
	    // edad = 20
	    Si Mes < MesN Entonces 
	        Edad:= Edad - 1
	    Sino 
	        Si (Mes = MesN) hacer
	        	Si Dia < DiaN entonces
	        		Edad:= Edad - 1
	        	Sino 
	        		Si Dia > DiaN hacer
	        			Esc 'Feliz cumpleaños atrasado'
	        		Sino
	        			Esc 'Feliz cumpleaños!!!'
	        		FinSi
	        	FinSi
	    	FinSi
	    FinSi 
	    escrbir ("La edad actual es",Edad)
FinAccion