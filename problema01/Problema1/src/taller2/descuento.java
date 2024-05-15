package taller2;

public class descuento {
    double precio;
    int numProduc;
    double desc,precioF;

    public descuento(double precio, int numProduc) {
        this.precio = precio;
        this.numProduc = numProduc;
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumProduc() {
        return numProduc;
    }

    public void setNumProduc(int numProduc) {
        this.numProduc = numProduc;
    }

    public double getDesc() {
        return desc;
    }

    public void calcularDescuento() {
         if (precio >= 1000 && numProduc >= 10) {
            desc=precio*0.10;
        } else {
            desc=precio * 0.05; 
        }
    }

    public double getPrecioF() {
        return precioF;
    }

    public void calcularPrecioFinal() {
        precioF= precio - desc;
    }
    
}
