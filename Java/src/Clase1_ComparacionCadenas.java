public class Clase1_ComparacionCadenas {
    public static void main(String[] args) {
        // Comparación de cadenas
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        // == compara la referencia en memoria
        System.out.println(cadena1 == cadena2);
        System.out.println(cadena1 == cadena3);

        //comparacion de contenido de cadenas con método "equals"
        System.out.println(cadena1.equals(cadena3));
    }
}
