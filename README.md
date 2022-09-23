# GestionDeProductosJava
POO con Java ( 5%)POO con Java ( 5%)
Realiza los siguientes ejercicios aplicando los conceptos de POO y usando el lenguaje programación java

3. Nos piden hacer una clase que gestione una serie de productos.

Los productos tienen los siguientes atributos:
Nombre
Precio
Tenemos dos tipos de productos:
Perecedero: tiene un atributo llamado días a caducar
No perecedero: tiene un atributo llamado tipo
Tendremos una función llamada calcular, que según cada clase hará una cosa u otra, a esta función le pasaremos un numero siendo la cantidad de productos.
En Producto, simplemente seria multiplicar el precio por la cantidad de productos pasados.
En Perecedero, aparte de lo que hace producto, el precio se reducirá según los días a caducar:
Si le queda 1 día para caducar, se reducirá 4 veces el precio final.
Si le quedan 2 días para caducar, se reducirá 3 veces el precio final.
Si le quedan 3 días para caducar, se reducirá a la mitad de su precio final.
En No Perecedero, hace lo mismo que en producto
El programa debe permitir visualizar los productos cargados en el stock y generar una cotización.
