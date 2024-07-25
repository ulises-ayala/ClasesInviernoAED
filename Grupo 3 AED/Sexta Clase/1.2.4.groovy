Ejercicio 1.2.4¶

Elaborar una función que reciba un número entero y retorne -1 si el 
número es negativo. Si el número es positivo debe devolver una clave 
calculada de la siguiente manera: Se suma cada dígito que compone el número y a 
esa suma se le calcula el modulo 7.

Por ejemplo: para la cifra 513, la clave será 5+1+3 =9; 9 mod 7 = 2.

Utilice la función para diseñar un algoritmo que permita leer varios valores 
y determine, para cada uno, si el número leído fue negativo o, si fue positivo, 
que clave le corresponde.

Accion 1.2.4 es 
  Ambiente 

    Funcion numclave(x: entero):entero
      Ambiente
      	sum: entero
      Proceso
      Si (x<0)entonces 
        numclave:= -1
      Sino
      	  sum:= 0 
        Mientras (x > 0) hacer 
          sum:= sum + (x mod 10)
          x:= x div 10
        Finmientras
        numclave:= sum mod 7
      Finsi 
    Finfuncion
    num, n: entero
    i: entero
  Proceso
    Esc ('ingrese la cantidad de veces que quiere repetir este proceso')
    Leer (n)
    Para i:=1 hasta n hacer 
     Esc 'ingrese un numero'
     Leer(num)
     Esc 'La clave que le corresponde a ese numero es de:'numclave(num)
    Finpara 
Finaccion


Accion 1.2.4 es 
  Ambiente 

    Funcion numclave(-17: entero):entero
      Ambiente
      	sum: entero
      Proceso
      Si (x<0)entonces 
        numclave:= -1
      Sino
      	  sum:= 0 
        Mientras (x > 0) hacer 
          sum:= sum + (x mod 10)
          x:= x div 10
        Finmientras
        numclave:= sum mod 7
      Finsi 
    Finfuncion
    num, n: entero
  Proceso
    Repetir
    	Esc 'Ingrese un numero' // -17
    	Leer(num)
     	Esc 'La clave que le corresponde a ese numero es de:' Numclave(num) 
     	Esc 'Desea repetir el proceso, ingrese 0 para terminar' // 0
     	Leer(n)
    Hasta que n = 0
FinAccion