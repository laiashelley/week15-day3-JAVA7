// 3- En la siguiente frase:

// String fraseAleatoria = "Los errores del pasado son la sabiduría del presente";

// Decir si existe la letra "e", cuántas veces aparece, y en qué posiciones

public class Java7ejercicio3 {
    public static void main(String[] args) throws Exception {
        
        String fraseAleatoria = "Los errores del pasado son la sabiduría del presente";

        if (fraseAleatoria.contains("e")){
            System.out.println("Esta frase contiene la letra e");
        } else {
            System.out.println("Esta frase no contiene la letra e");
        }

        int contador = 0;
        
        for (int i = 0; i < fraseAleatoria.length(); i++){
            if (fraseAleatoria.charAt(i) == 'e'){
                contador++;
                System.out.println("La letra E se encuentra en la posición:" + i);
            }
        }

        System.out.println("Hay " + contador + "E's en la frase");

        String fraseAleatoria2 = "Los rrors dl pasado son la sabiduría dl prsnt";

        if (fraseAleatoria2.contains("e")){
            System.out.println("Esta frase contiene la letra e");
        } else {
            System.out.println("Esta frase no contiene la letra e");
        }



    }
}


// Sergio: FYI Por si el e sirve a alguien para el 3er ejercicio, que yo no lo sabía: se ve que si escribes "e" es un String, y si lo escribes con las comillas simples 'e' es un character