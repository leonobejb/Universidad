import java.util.Scanner;

public class Censo_2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        //Pregunta del número de familias
        System.out.println("Ingrese la cantidad de Familias censadas: ");
        int cantidadFamilias = scanner.nextInt();
        scanner.nextLine();

        // arreglos para consolidar los datos de las familias
        String[] familias = new String[cantidadFamilias];
        int[] estratos = new int[cantidadFamilias];
        double[] agua = new double[cantidadFamilias];
        double[] luz = new double[cantidadFamilias];
        double [] gas = new double[cantidadFamilias];
        double [] descuentos = new double[cantidadFamilias];

        //inicio el ciclo para guardar los datos de las familias

        for (int i = 0; i< cantidadFamilias; i++){
            System.out.println("Familia n°: " + i + ":");


            //Ingresa el apellido de cada familia
            System.out.print("Nombre de la Familia: " );
            familias[i] = scanner.nextLine();

            //Ingresa el dato de estrato  para cada familia
            System.out.print("Ingrese el estrato de la familia: ");
            estratos[i] = scanner.nextInt();
            scanner.nextLine();

            // Ingrese el valor del recibo del agua
            System.out.print("Ingrese el valor del recibo del agua; ");
            agua[i] = scanner.nextDouble();
            scanner.nextLine();

            // Ingrese el valor del recibo de la luz
            System.out.print("Ingrese el valor del recibo de la luz: ");
            luz[i] = scanner.nextDouble();
            scanner.nextLine();

            // Ingrese el valor del recibio del gas
            System.out.print("Ingrese el valor del recibio del gas: ");
            gas[i] = scanner.nextDouble();
            scanner.nextLine();

            //definición de descuentos
            if (estratos[i] == 1) {
                descuentos[i] = 0.20; //descuento del 20%
            } else if (estratos[i] == 2) {
                descuentos[i] = 0.15; //Descuento para estrato 2 del 15%
            } else if (estratos[i] == 3) {
                descuentos[i] = 0.09;
            } else descuentos[i] = 0 ;


        }



        //visualizacion de los datos
        System.out.println("\n -- Datos de las familias censadas");
        for (int i = 0; i< cantidadFamilias; i++){
            System.out.println("Familia " + (i + 1 ));
            System.out.println("Apellido: " + familias[i]);
            System.out.println("Estratos: " + estratos[i]);
            System.out.println("Agua: " + agua[i]);
            System.out.println("Luz: " + luz[i]);
            System.out.println("Gas: " + gas[i]);
            System.out.println("Descuento:" + (descuentos[i] * 100) +"%" );
            System.out.println(" ------------------------------");
            System.out.println("Nuevo valor a pagar de agua: " + (agua[i] - (agua[i] * descuentos[i])) );
            System.out.println("Nuevo valor a pagar de luz: " + (luz[i] - (luz[i] * descuentos[i])) );
            System.out.println("Nuevo valor a pagar de gas: " + (gas[i] - (gas[i] * descuentos[i])) );
        }

        scanner.close();

    }
}
