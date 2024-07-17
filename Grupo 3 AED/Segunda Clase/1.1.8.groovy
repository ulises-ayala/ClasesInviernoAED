1.1.8
Escriba un algoritmo que permita conocer la edad de una persona, con solo ingresar 
la fecha de nacimiento y la fecha actual, ambas en el formato: DIA, MES, AÑO

Accion 1.1.8(Lauti) es
    Ambiente
        edad: entero
        DIA_A,MES_A,AÑO_A: entero               //A= actual
        DIA_N,MES_N,AÑO_N: entero               //N= nacimiento
    Proceso
        Esc("Ingrese su fecha de nacimiento ordenadamente dia , mes y año":)    //DIA/MES/AÑO
        leer(DIA_N,MES_N,AÑO_N)
        Esc("Ingrese la fecha actual DIA/MES/AÑO")
        leer(DIA_A,MES_A,AÑO_A)
        edad:= Año_A-AÑO_N //  
        Si (MES_A<MES_N) Entonces
            edad:=edad-1
        Sino
            Si (MES_A=MES_N) hacer 
            	Si (DIA_A<DIA_N) 
                    edad:= edad-1
                FinSi
            FinSi
        FinSi
FinAccion

Acción 1.1.8 (Ignacio) es;
        Ambiente
            dia_act, mes_act, anio_act: entero
            dia_nac, mes_nac, anio_nac: entero
            edad: entero // edad es de 20
        Proceso
            Esc("Ingrese la fecha actual en formato dd/mm/aa")
            Leer(dia_act, mes_act, anio_act) // 17 07 2024
            Esc("Ingrese su fecha de nacimiento en el mismo formato")
            Leer(dia_nac, mes_nac, anio_nac) // 21 08 2004 
            Si mes_act >= mes_nac entonces
                Edad:= anio_act - anio_nac + 1 
            Sino
                Si dia_act >= dia_nac entonces
                    Edad:= anio_act - anio_nac + 1
                FinSi
            FinSi
            Esc("Su edad es", Edad)
    FinAcción
FinAccion

Accion 8(Ana) Es
  Ambiente 
   edad,diaN, mesN,añoN,diaA,mesA,añoA : enteros
  Proceso
   Esc ('ingrese su fecha de nacimiento en formato dia,mes,año')
   Leer (diaN,mesN,añoN)
   Esc ('ingrese la fecha actual en formato dia,mes,año') 
   Leer (diaA, mesA, añoA)

    edad:= fechaA-fechaN // 2024 - 2004 = 20 // mesA = 7  mesN = 8
     Si mesA < mesN ent
      edad:=edad-1
     Sino
        Si mesA=mesN ent
         Si diaA < diaN ent
          edad:=edad-1
         Sino
         	Si diaA = diaN ent 
         		esc('Feliz cumpleaños')
         	FinSi
       	 FinSi
       FinSi
     FinSi

     Esc ('la edad es',edad)
FinAccion
