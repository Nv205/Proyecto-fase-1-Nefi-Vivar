package gt.edu.umes.proy.calculo;

public class LogicaDelNegocio {

    public static final int CANTIDAD_PARAMETROS = 5;

    // Valida que haya 5 parámetros y que todos sean enteros
    public boolean validar(String[] args) {
        if (args == null || args.length != CANTIDAD_PARAMETROS) {
            return false;
        }
        for (String arg : args) {
            try {
                Integer.parseInt(arg.trim());
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }

    // Meses (30 días), semanas, días, horas, minutos -> segundos 
    // 23/10/26
    public long calcularSegundos(int meses, int semanas, int dias, int horas, int minutos) {
        long segundos = 0;
        segundos += (long) meses * 30 * 24 * 60 * 60;
        segundos += (long) semanas * 7 * 24 * 60 * 60;
        segundos += (long) dias * 24 * 60 * 60;
        segundos += (long) horas * 60 * 60;
        segundos += (long) minutos * 60;
        return segundos;
    }
}