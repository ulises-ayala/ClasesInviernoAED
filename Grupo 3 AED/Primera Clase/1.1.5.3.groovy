
Se desea comprar una PC y una impresora. Calcular el precio total: 
el cual está dado por la suma de los precios de costos, los porcentajes de
 ganancia del vendedor y un 21% de IVA. Supóngase una ganancia del vendedor 
 del 12% por la PC y 7% por la impresora. Se leen los costos y se imprimen el precio 
 total de ventas.
Accion 1.1.5.3
    Ambiente
        Precio_PC:real
        Precio_impresora: real
        precio_total:real
    Proceso
        Esc "Ingrese precio de la computadora y de la impresora."
        Leer(Precio_PC,Precio_impresora)
        precio_total:= Precio_PC*1.12 + Precio_impresora*1.07
        precio_total:=precio_total*1.21
        Esc "el precio total es",precio_total // Lauti
FinAccion

Accion 1.1.5.3 es
    Ambiente 
        precioIM: real
        precioPC: real
    Proceso
        Esc 'Ingrese el precio de la pc y de la impresora'
        Leer(precioPC,precioIM)
        Esc 'El precio total de venta es de:', (precioPC*1.12 + precioIM*1.07)*1.21
FinAccion

accion 1.1.5.3 es
 ambiente 
  precioIM: real
  precioPC: real
  iva = 1,21
  gananciaPC = 1,12
  gananciaIM = 1,07
  ganancia1: real
  ganancia2: real
 proceso
 esc ('ingrese el precio de la pc')
 leer (precioPC)
 esc ('ingrese el precio de la impresora')
 leer (precioIM)

 ganancia1:= precioPC * gananciaPC
 ganancia2:= precioIM* gananciaIM
 
 preciotot:= (ganancia1 + ganancia2) * iva
 esc ('el precio total es de:',preciotot)