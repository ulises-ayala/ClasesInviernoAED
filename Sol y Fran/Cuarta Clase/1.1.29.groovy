Ejercicio 1.1.29
Escriba un algoritmo para imprimir los números primos menores a un valor dado n.

Accion PrimosMenor() es 
    Ambiente
        num: entero
        divisor: entero
        i: entero
    Proceso 
        Esc 'Ingrese un numero' // 12 -> 2..11
        Leer(num) 
        Para i:=2 hasta (num - 1) hacer 
            divisor:=2
            Mientras (divisor < i) y (i MOD divisor <> 0) hacer 
                divisor:= divisor + 1 // 
            FinMientras
            Si i = divisor entonces 
                Esc 'El numero', i, 'es primo'
            Sino
                Esc 'El numero', i, 'no es primo'
            FinSi
        FinPara
FinAccion 