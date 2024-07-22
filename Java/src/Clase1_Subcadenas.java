public class Clase1_Subcadenas {
    public static void main(String[] args) {
        // Obtiene una parte de una cadena
        // El último indice no se incluye

        // Cadena original
        var cadena = "hola mundo";

        // Subcadena
        System.out.println(cadena.substring(0, 4));

        // Busqueda de subcadenas
        // "indexOf" devuelve el indice de la primera aparición
        System.out.println(cadena.toLowerCase().indexOf("Hola"));

        // Reemplazar subcadenas
        var cadena1 = "Saludos desde Java";
        System.out.println(cadena1);
        System.out.println(cadena1.replace(" desde Java", " a todos."));

        //
    }
}
