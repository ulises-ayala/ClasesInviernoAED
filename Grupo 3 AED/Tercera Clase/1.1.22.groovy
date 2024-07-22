Escriba un algoritmo que determine si un número es primo.

Accion numprimo(ANA) es 
 Ambiente
  n, cont, x: entero 
 Proceso
  cont:= 0
  Esc ('ingrese un numero')
  Leer (n)                                                  
   Para x:=2 hasta (n-1) hacer
        Si (n mod x = 0) entonces 
         cont:= cont + 1 
        Finsi 
   Finpara 

    Si (cont > 0) entonces
     Esc ('no es primo')
      Sino
       Esc ('es primo')
    Finsi
FinAccion

Accion  1.1.22 es
    Ambiente
        i,A:entero 
        bandera: booleano
    Proceso
    Esc("ingrese un numero")
    leer(a) 
    bandera:= verdadera
    Para i:=2 hasta (a-1) hacer
    	Si (a MOD i = 0) entonces
    		bandera:= falsa 
    	FinSi 
    FinPara
    Si bandera entonces
    	Esc 'Es primo'
    Sino 
    	Esc 'No es primo'
    FinSi 
FinAccion