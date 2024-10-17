public class pruebaStrings {
    public static void main(String[] args) {

        String str = "Hola a todos";
        String[] vStr = str.split(" "); //Separador

        System.out.println(str.length()); //Tamaño del String --> 12
        System.out.println(str.charAt(7)); //Carácter de la posición "7" --> t
        System.out.println(str.substring(8)); //Subcadena desde la poscion "8" al final --> odos
        System.out.println(str.substring(7,12)); //Subcadena desde el carácter inicio hasta el fin sin incluir --> todos
        System.out.println(str.substring(7,str.length())); //Igual que el de arriba
        System.out.println(str.indexOf("o")); //Busca "o" en la cadena y dice en que posición está la primera que encuentra --> 1
        System.out.println(str.equals("Hola a todos")); //Muestra "true" si las cadenas son iguales --> true
        System.out.println(str.toUpperCase()); //Muestra la cadena en mayúsculas --> HOLA A TODOS
        System.out.println(str.toLowerCase()); //Muestra la cadena en minúsculas --> hola a todos

        System.out.println(vStr[0]); //Muestra la cadena que está en la posición "0" --> Hola

        System.out.print(vStr[0]);                //
        for(int i = 1; i < vStr.length; i++){    //
            System.out.print(" " + vStr[i]);    //Muestra "Hola a todos" por separado y con espacios; imprimiento "Hola" primero
        }                                      // para que no haya un espacio al final
        System.out.println();                 //

        
        for (int i = 1; i < vStr.length - 1; i++){        //
            System.out.println(vStr[i]);                 //
        }                                               //Lo mismo que el de arriba, pero de otra forma; al revés, primero imprime
        System.out.println(vStr[vStr.length - 1]);     // "Hola a " y luego "todos"
        System.out.println();                         //
    }
}
