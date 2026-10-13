//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Producto prod = new Producto("PLP-123-YE", "TECLADO MECANICO" , 1500, 15);

prod.registrarVenta(5);
prod.registrarVenta(6);
prod.registrarVenta(7);

System.out.println("===========================================");
prod.registrarIngresoStock(10);

    System.out.println("--- ESTADO FINAL DEL PRODUCTO ---");
    System.out.println("Código: " + prod.getCodigo());
    System.out.println("Nombre: " + prod.getNombre());
    System.out.println("Precio unitario: $" + prod.getPrecio());
    System.out.println("Stock final disponible: " + prod.getStock());
}
