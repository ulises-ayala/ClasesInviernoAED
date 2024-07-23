Escriba un algoritmo que acepte un número entero que representa una suma de
dinero e indique cuantos billetes de cada denominación necesita, suponiendo que 
solo existen billetes de 500, 100, 50, 20, 10, 5 y 1 peso.

Accion
    Ambiente
        Dinero:entero
        500pesos:entero
        100pesos:entero 
        50pesos:entero 
        20pesos:entero
        10pesos:entero
        5pesos:entero
        1peso:entero
    Proceso
        500pesos:=0
        100pesos:=0
        50pesos:=0
        20pesos:=0
        10pesos:=0
        5pesos:=0
        1peso:=0
        Esc ("ingrese el dinero")
        Leer (dinero)
        Repetir
            Segun dinero Hacer // 776 -> 276 -> 176 -> 76 -> 26 -> 6 -> 1 -> 0
                >=500: 500pesos:= 500pesos + 1 // 1
                       dinero:=dinero - 500
                >=100: 100pesos:= 100pesos + 1 // 2
                       dinero:= dinero - 100
                >= 50: 50pesos := 50pesos + 1 // 1
                       dinero:= dinero - 50
                >= 20: 20pesos:= 20pesos + 1 // 1
                       dinero:= dinero - 20
                >= 10: 10pesos:= 10pesos + 1
                        dinero:= dinero  - 10
                >= 5 : 5pesos:= 5pesos + 1 // 1
                        dinero:= dinero - 5
                >= 1 : 1pesos:= 1pesos + 1 // 1
                        dinero:= dinero - 1
            Finsegun
        Hasta que dinero = 0
        Esc 'Para obtener esa cantidad de dinero necesito estos billetes'
        Esc 'Necesito de $500 una cantidad de:', 500pesos
        Esc 'Necesito de $100 una cantidad de:', 100pesos
        Esc 'Necesito de $50 una cantidad de:', 50pesos
        Esc 'Necesito de $20 una cantidad de:', 20pesos
        Esc 'Necesito de $10 una cantidad de:', 10pesos
        Esc 'Necesito de $5 una cantidad de:', 5pesos
        Esc 'Necesito de $1 una cantidad de:', 1pesos
Finaccion