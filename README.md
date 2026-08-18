@startuml

class Producto {
    - nombre: String
    - precio: double
    - cantidad: int
    - codigo: String
    + Producto(nombre: String, precio: double, cantidad: int, codigo: String)
    + Producto(nombre: String, precio: double, codigo: String)
    + Producto(nombre: String, precio: double)
    + Producto()
    + aplicarDescuento(porcentaje: double): double
    + aplicarDescuento(montoFijo: double, esFijo: boolean): double
    + calcularValorInventario(): double
    + calcularValorConDescuento(descuento: double): double
    + getNombre(): String
    + setNombre(nombre: String): void
    + getPrecio(): double
    + setPrecio(precio: double): void
    + getCantidad(): int
    + setCantidad(cantidad: int): void
    + getCodigo(): String
    + setCodigo(codigo: String): void
}

class Inventario {
    - productos: ArrayList<Producto>
    + agregarProducto(p: Producto): void
    + eliminarProducto(codigo: String): void
    + buscarProducto(nombre: String): Producto
    + ordenarPorPrecio(): void
    + buscarProductosPorRango(min: double, max: double): ArrayList<Producto>
    + obtenerProductoPorPosicion(posicion: int): Producto
    + obtenerProductoSeguro(posicion: int): Producto
    - registrarError(posicion: int, detalle: String): void
}

class GestorArchivos {
    + {static} guardarInventarioEnArchivo(inventario: ArrayList<Producto>, nombreArchivo: String): void
    - {static} crearRespaldo(archivoOriginal: File): void
}

class Laboratorio_2 {
    + {static} main(args: String[]): void
}

Inventario "1" o-- "*" Producto : Agregacion
GestorArchivos ..> Producto : Dependencia
Laboratorio_2 ..> Inventario : Uso
Laboratorio_2 ..> Producto : Uso

@enduml
