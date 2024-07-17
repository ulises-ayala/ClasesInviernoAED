1.1.12
Escriba un algoritmo que acepte un número entero mayor a 100 y menor a 1000, y 
muestre como está compuesto (unidades, decenas y centenas) y si es múltiplo de 3 
(Recordar: todo número cuya suma de sus dígitos sea múltiplo de 3, lo es también).
/*101...999
627 
6 -> Centenas
2 -> Decenas
7 -> Unidades
6+2+7= 15 MOD 3 = 0
*/

Accion 1.1.12() es 
	Ambiente 
		num: entero 
		centenas: entero 
		decenas: entero 
		unidades: entero 
		sumadig: entero 
	Proceso 
		Esc 'Ingrese un número' // 627 DIV 10 => 62 MOD 10= 2
		Leer(num)
		centenas:= num DIV 100
		unidades:= num MOD 10
		decenas:= (num DIV 10) MOD 10
		Esc 'El numero', num,' esta compuesto por:'
		Esc centenas,': centenas'
		Esc decenas,': decenas'
		Esc unidades,': unidades'
		sumadig:= centenas + unidades + decenas
		Si (sumadig MOD 3 = 0) entonces 
			Esc 'El número es múltiplo de 3'
		FinSi
FinAccion

Accion 1.1.12(SINVARIABLES) es 
	Ambiente 
		num: entero 
	Proceso 
		Esc 'Ingrese un número' // 627 DIV 10 => 62 MOD 10= 2
		Leer(num)
		Esc 'El numero', num,' esta compuesto por:'
		Esc num DIV 100,': centenas'
		Esc (num DIV 10) MOD 10,':decenas'
		Esc num MOD 10,': unidades'
		Si ((num DIV 100 + num MOD 10 + (num DIV 10) MOD 10) MOD 3 = 0) entonces 
			Esc 'El número es múltiplo de 3'
		FinSi
FinAccion

Accion 12 es 
  Ambiente 
  num,dec,cen,un,suma: entero
 
 Proceso
  Esc ('ingrese un numero')
  Leer (num) // 627
   Si num > 100 y num < 1000 ent
    cen:= num div 100
    dec:= (num div 10) mod 10
    un:= num mod 10
    sum:= cen+dec+un
     Esc ('el valor de la centena es', cen,'la decena es',dec,'y la unidad es',un)

      Si sum mod 3 = 0 ent 
       Esc ('el numero es multiplo de 3')
        Sino
         Esc ('no es multiplo de 3')
      Finsi
   	Sino
   		Esc 'El número no cumple que es mayor que 100 o menor a 1000'
   	FinSi
 finaccion