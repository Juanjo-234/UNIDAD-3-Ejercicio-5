Este programa está diseñado para modelar y gestionar el inventario de un producto mediante la aplicación estricta del principio de encapsulamiento (ocultación de datos) y validaciones defensivas de stock para operaciones de ventas y reabastecimiento en programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase Producto: Declara atributos privados (codigo, nombre, precio y stock) para proteger el estado interno del producto frente a modificaciones externas no controladas.

Implementa métodos de control de inventario:

registrarIngresoStock(int cantidad): Valida que la cantidad a ingresar sea positiva y la suma de forma segura al stock actual.

registrarVenta(int cantidad): Comprueba de manera estricta que la cantidad solicitada no supere el stock disponible; si no hay suficientes unidades, la venta es rechazada de inmediato para evitar stock negativo.

Oculta el atributo stock: Limita el acceso al inventario mediante el uso exclusivo de un método getter (getStock()), impidiendo que clases externas alteren el stock directamente.

Ejecuta la prueba en el main: Instancia un producto con stock inicial, simula operaciones de venta exitosas, ingresos de mercadería, intentos fallidos de venta por falta de stock y muestra el estado final por consola.
