package gt.edu.umes.proy.calculo;

public class CalculaMinutos {

    public static void main(String[] args) {
        LogicaDelNegocio logica = new LogicaDelNegocio();

        if (!logica.validar(args)) {
            System.out.println("Error: debe ingresar 6 parámetros enteros "
                    + "(meses semanas días horas minutos).");
            return;
        }

        long total = logica.calcularSegundos(
                Integer.parseInt(args[0].trim()),
                Integer.parseInt(args[1].trim()),
                Integer.parseInt(args[2].trim()),
                Integer.parseInt(args[3].trim()),
                Integer.parseInt(args[4].trim()));

        System.out.println("Total en segundos: " + total);
    }
}