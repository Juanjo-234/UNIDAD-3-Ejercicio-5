public class Producto {

    private String codigo;
    private  String nombre;
    private  double precio;
    private int stock;

    public Producto(String codigo, String nombre, double precio, int stock){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void registrarIngresoStock(int cantidad){
        if(cantidad < 0){
            System.out.println("Ingrese una cantidad e productos valida");
        }else{
            this.stock += cantidad;
            System.out.println("Cantidad de productos ingresada correctamente.");
            System.out.println("Cantidad ingresada : " + cantidad);
        }
    }

    public void registrarVenta(int cantidad){
        if(cantidad > this.stock){
            System.out.println("La cantidad solicitada supera el stock actual");
        }else{
            this.stock -= cantidad;
            System.out.println("Venta realizada. Cantidad de unidades vendidas : " + cantidad);

        }
    }

}
