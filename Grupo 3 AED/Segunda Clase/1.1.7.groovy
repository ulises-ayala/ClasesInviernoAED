1.1.7
Escriba un algoritmo que acepte dos números, calcule la suma e imprima el 
mensaje de acuerdo al resultado obtenido.
Suma <= 50 // La suma es menor o igual a 50
Suma > 50 y <= 100 // La suma es mayor que 50 pero menor o igual que 100
Suma > 100 y <= 200 // La sua es mayor que 100 pero menor o igual que 200
Suma > 200 // La suma es mayor a 200 

Accion 1.1.7() es 
	Ambiente 
		a: entero 
		b: entero 
		suma: entero
	Proceso
		esc ('Ingrese un número')
		Leer(a)
		esc ('Ingrese otro número')
		Leer(b)
		suma:= a + b //
		Segun (suma) hacer
			<=50 : esc ('La suma es menor o igual a 50')
			<=100: esc ('La suma es mayor que 50 pero menor o igual que 100')
			<=200: esc ('La suma es mayor que 100 pero menor o igual que 200')
			> 200: esc ('La suma es mayor a 200')
		FinSegun 
FinAccion

Accion 1.1.7 ()es
    Ambiente
        num1,num2:entero
        suma:entero
    Proceso
        suma:=0
        Esc("Ingrese dos numeros a continuacion:")
        leer(num1,num2)
        suma:=num1+num2 // 41
        Si (suma<=50) Entonces
            Esc("la suma de ambos numeros es",suma ,"por lo tanto es menor o igual a 50")
        Sino
            Si (suma>50) y (suma<=100) Entonces
                Esc(suma,"es mayor a 50 pero menor a 100")
            Sino
                Si (suma>100) y (suma<=200) Entonces
                    Esc("el numero:", suma,"es mayor a 100 pero menor o igual a 200")
                Sino
                    Esc("el numero", suma,"es mayor a 200")
                FinSi
            FinSi
     	FinSi
FinAccion