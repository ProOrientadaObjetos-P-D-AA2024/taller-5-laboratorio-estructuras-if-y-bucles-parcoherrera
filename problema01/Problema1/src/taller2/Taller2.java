package taller2;

import java.util.Scanner;

public class Taller2 {

    public static void main(String[] args) {
        double precio;
        int cantidad;
        Scanner l = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        precio = l.nextDouble();

        System.out.print("Ingrese la cantidad de productos: ");
        cantidad = l.nextInt();

        descuento productoUno = new descuento (precio,cantidad);
        productoUno.calcularDescuento();
        productoUno.calcularPrecioFinal();
        System.out.println("Descuento aplicado: $"+productoUno.getDesc());
        System.out.println("Precio final de la compra: $"+ productoUno.getPrecioF());

    }
}
