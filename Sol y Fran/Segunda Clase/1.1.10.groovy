1.1.10
Dados dos números enteros A y B generar un algoritmo que permita determinar si A es 
divisor de B o B es divisor de A.

Accion 1.1.10() es 
	Ambiente
        A,B: real 
    Proceso
        Escribir "ingrese dos numeros"
        Leer (A,B)
        Si (A mod B = 0) Entonces
            Escribir (B," es divisor de ", A)
        Sino
             Si (B mod A = 0) Entonces
                 Escribir (A, "es divisor de", B)
             Sino
                 Escribir ("ninguno es divisor")
             FinSi
        FinSi
FinAccion