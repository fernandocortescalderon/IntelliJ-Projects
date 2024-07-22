import java.util.Locale;

public class Clase1_MetodosDeCadenas {
    public static void main(String[] args) {
        // Longitud de cadenas
        var cadena1 = "Hola mundo";
        System.out.println(cadena1.length());

        // Reemplazar caracteres
        var cadena2 = "Nueva cadena";
        // var cadena3 = cadena2.replace('a', 'e');
        System.out.println(cadena2.replace('a', 'e'));

        // Convertir a mayúsculas
        var mayusculas = cadena1.toUpperCase();
        //System.out.println(mayusculas);
        System.out.println(mayusculas);

        // Convertir a minusculas
        System.out.println(cadena1.toLowerCase());

        // Eliminar espacios al inicio y final de una cadena
        var nombre = " Fernando Cortes ";
        System.out.println(nombre.trim());

        // Concatenaciones
        var hola = "Hola";
        var mundo = "Mundo";
        var holaMundo = hola.concat(" ").concat(mundo);
        System.out.println(holaMundo);

        // StringBuilder
        var constructor = new StringBuilder();
        constructor.append(hola);
        constructor.append(" ");
        constructor.append(mundo);
        var string = constructor.toString();
        System.out.println("string = " + string);

        // StringBuffer: Varios procesos corren a la vez
        var stringBuffer = new StringBuffer();
        stringBuffer.append(hola).append(" ").append(mundo);
        var resultado = stringBuffer.toString();
        System.out.println("resultado = " + resultado);
        
        // Join
        resultado = String.join("-", hola, mundo);
        System.out.println("resultado = " + resultado);

    }
}
