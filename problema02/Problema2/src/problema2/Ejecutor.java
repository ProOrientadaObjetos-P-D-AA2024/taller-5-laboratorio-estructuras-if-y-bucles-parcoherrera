package problema2;

import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        String nombreEmpleado;
        double salarioEmpleado;
        int edadEmpleado;
        double promedioSalarios;
        int porcentajeAumento;
        double aumento, salarioTotal;
        
        
        int numeroEmpleados;
        System.out.println("Ingrese la cantidad de empleados a registrar:");
        numeroEmpleados = entrada.nextInt();
        
        System.out.println("Ingrese los datos de los empleados:");
        
        Empleado [] empleado = new Empleado[numeroEmpleados];
        
        for (int i = 0; i < numeroEmpleados; i++) {
            
            entrada.nextLine();
            
            System.out.println("Ingrese el nombre del empleado ["+(i+1)+"]:");
            nombreEmpleado = entrada.nextLine();

            System.out.println("Ingrese el salario del empleado ["+(i+1)+"]:");
            salarioEmpleado = entrada.nextDouble();

            System.out.println("Ingrese la edad del empleado ["+(i+1)+"]:");
            edadEmpleado = entrada.nextInt();

            Empleado e = new Empleado(nombreEmpleado,salarioEmpleado,edadEmpleado);
            
            empleado[i] = e;
            
        }
        System.out.println("---------------------");
        System.out.println("Lista de empleados:");
        System.out.println("---------------------");
        
        for (int i = 0; i < numeroEmpleados; i++) {
            System.out.println("EMPLEADO "+i);
            System.out.println(empleado[i].toString());
        }
        
        //AUMENTO SALARIAL
        System.out.println("AUMENTO SALARIAL");
        //Calcular el promedio de los salarios de los trabajadores
        promedioSalarios = (empleado[0].getSalario() + empleado[1].getSalario() + empleado[2].getSalario()) / 3;
        //Pedir porcentaje
        System.out.println("Ingrese el porcentaje de aumento salarial:");
        porcentajeAumento = entrada.nextInt();
        //Imprimir empleados con aumneto
        for (int i = 0; i < numeroEmpleados; i++) {
            if (empleado[i].getSalario()<promedioSalarios) {
                aumento = empleado[i].getSalario() * porcentajeAumento / 100;
                salarioTotal = empleado[i].getSalario() + aumento;
                System.out.println("El empleado " +empleado[i].getNombre()
                        +" recibio un aumento de $"+aumento +" y su salario total es de $"
                        +salarioTotal+".");
            }
        }
    }
    
}
