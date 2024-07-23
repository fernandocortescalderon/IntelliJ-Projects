import java.util.Scanner;

public class Clase1_GeneradorDeEmail {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        s
        // Solicitar datos del usuario
        System.out.println("¿Cúal es tu nombre?");
        var nombreUsuario = consola.nextLine();
        System.out.println("¿Cúal es tu apellido?");
        var apellidoUsuario = consola.nextLine();

        // Constantes
        final var NOMBRE_EMPRESA = "Nombre de la Empresa";
        var dominio = ".com";

        // Conversión
        var nombre = nombreUsuario.toLowerCase();
        var apellido = apellidoUsuario.toLowerCase();
        var empresa = NOMBRE_EMPRESA.toLowerCase().replace(" ", "");
        
        // Creación de email
        var email = nombre + "." + apellido + "@" + empresa + dominio;

        System.out.println("email = " + email);
    }
}
