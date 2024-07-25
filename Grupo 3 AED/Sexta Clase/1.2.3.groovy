Ejercicio 1.2.3¶
Diseñe una función que permita ingresar 3 números y devuelva el mínimo valor. 
El programa principal debe permitir que este proceso se repita la cantidad de veces
que el usuario desee.


Accion 1.2.3 es 
  Ambiente 

    Funcion Tresnum(a,b,c: entero): entero 
      Si (c<b) y (c<a) entonces
        tresnum:= c
      Sino 
        Si (b<a) y (b<c) entonces
          tresnum:= b 
        Sino
          Si (a<b) y (a<c) entonces
            tresnum:= a 
          Finsi
        Finsi
      Finsi
    FinFuncion

    num1,num2,num3: entero
    opcion: caracter

  Proceso 
    Mientras opcion <> "NO" hacer
      Esc 'ingrese tres numeros'
      Leer (num1,num2,num3)
      Esc 'El resultado menor de estos tres numeros es de:' Tresnum(num1,num2,num3)
      Esc 'Desea repetir este proceso? Ingrese SI-NO'
      Leer(opcion)
    FinMientras
Finaccion

Accion 1.2.3(Lauti) es
    Ambiente
    Num1,num2,num3:entero
    opcion:caracter
    NumMin: entero
    Procedimiento MinimoValor(a,b,c:entero) es
        Si a<>b y a<>c y b<>c Entonces
            si a<b Entonces
                si a < c Entonces
                    escribir("el numero menor es:",a)
                sino
                    Escribir("el numero menor es",c)
                FinSi
            Sino
                si b<c Entonces
                    Escribir("el numero menor es :",b)
                sino
                    Escribir("el numero menor es :",c)
                FinSi
            FinSi
        Sino
            Escribir ("los numeros deben ser diferentes")
        FinSi
    FinFuncion

    Proceso
    Mientras opcion <> "N" hacer
        Esc("Ingrese tres numeros")
        Leer(num1,num2,num3)
        MinimoValor(num1,num2,num3)
        Escribir("Desea repetir el procedimiento S/N?")
        Leer(opcion)
    FinMientras
FinAccion