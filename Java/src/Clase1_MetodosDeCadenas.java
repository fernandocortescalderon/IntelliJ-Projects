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
        System.out.println(cadena1.toUpperCase());

        // Convertir a minusculas
        System.out.println(cadena1.toLowerCase());

        // Eliminar espacios al inicio y final de una cadena
        var nombre = " Fernando Cortes ";
        System.out.println(nombre.trim());

        

    }
}
