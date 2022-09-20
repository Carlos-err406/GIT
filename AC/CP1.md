# AC 14 09 22

```
Samuel 54225353
```

## Conceptos (p.8) \*importante

```
- Organizazion
- Arquitectura
- Estructura
- Funcionamiento
```

## Registro

```
Es un espacio en memoria donde se almacena una serie de instrucciones.
En la jerarquia de la memoria el 'registro' es la mas pequena y la mas rapida, la mas cercana al procesador.
Basado en sistema de numeracion binario. Conlleva rapidez, facilidad a la hora de pensar a la hora de ejecutar, son solo dos valores por lo que hace mas eficiente el almacenamiento.
```

## Ejercicio 1

```
Se tiene un procesador que tiene un registro de R.
Para determinar a que direccion acceder de K localizaciones de 8 bit.
La memoria se interpreta como una matriz de K celdas. K=128
```

#### Responda

```
a. que longitud debe tener el registro para acceder a cada una de las posiciones de la memoria

R/ Con un bit (0|1) se puede acceder a 2 lugares, para acceder a 128 posiciones se necesitan 7 bit porque 2^7 = 128. El registro es de tamano 7
```

```
a.2 Como denominarias a esta memoria segun el tamano?

R/Como son 128 localizaciones de 8 bit cada una entonces la memoria es de 128 Bytes, 1Byte = 1bit
```

```
a.3 Cuantos enteros de 4 Bytes se pueden guardar en la memoria?

R/ 128/4=32, un entero son 4 Bytes, la memoria son 128 Bytes
```

```
a.4 Ejemplifica como acceder a la decima posicion de la memoria
?????
R/guardar en un arreglo 'a' el registro y a[9] es la decima posicion
```
```
b.
ROT R
ROT R
```
```
c.
```