1.1.10
Dados dos números enteros A y B generar un algoritmo que permita determinar si A es 
divisor de B o B es divisor de A.
// B sea divisor de A
// A sea divisor de B
// Que ninguno sea divisor de otro
Acción 1.1.10 () es
        Ambiente
            a, b: entero
        Proceso
            Esc("Ingrese dos números")
            Leer(a, b)
            Si (a MOD b = 0) entonces
            	Esc 'El numero', b,' es divisor de', a 
            Sino
            	Si (b MOD a = 0) entonces 
            		Esc 'El número', a,' es divisor de', b
            	Sino
            		Esc 'Ninguno es divisor de otro'
            	FinSi
            FinSi
FinAcción
