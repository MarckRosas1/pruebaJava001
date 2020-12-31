
import java.util.Scanner;

//Mi clase en java
public class HolaMundo {

    public static void main(String args[]) {

        //Tipos de variables
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariebleCadena = "Saludos";
        System.out.println(miVariebleCadena);

        String miVariableCadena = "Adiós";
        System.out.println(miVariableCadena);

        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Hola Hola";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        //***************************************************************

        //valores permitidos en el nombre de variable
        var miVarible = 1;
        var _miVariable = 1;
        var $miVariable = 1;

        // var áVariable=1;   No se recomienda utilizar
        // var #miVariable = 1;   No se recomienda utilizar
        var usuario = "Marco";
        var titulo = "Ingeniero";
        //****************************************************************

        //Concatenación
        var union = titulo + usuario;

        System.out.println("union = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j);
        System.out.println(i + j + usuario);
        System.out.println(usuario + i + j);
        System.out.println(usuario + (i + j));
        //***************************************************

        //Caracteres espaciales
        var nombre = "Karla";
        System.out.println("Nueva línea: \n " + nombre);
        System.out.println("Tabulador: \t " + nombre);
        System.out.println("Retroceso: \b " + nombre);
        System.out.println("Retroceso: \b \b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
        //************************************************************

        System.out.print("Escribe tu nombre: \n");
        Scanner consola = new Scanner(System.in);
        var usuarioIn = consola.nextLine();
        System.out.println("usuario = " + usuarioIn);
        System.out.println("Escribe título: ");
        var tituloIn = consola.nextLine();
        System.out.println("Resultado:  " + tituloIn + " " + usuarioIn);
        //****************************              
        //Tipos primitivos
        
        byte numeroByte = 127;
        //byte numeroByte = (byte) 129;
        System.out.println("Valor byte " + numeroByte );
        System.out.println("Valor mínimo byte = " + Byte.MIN_VALUE);
        System.out.println("Valor máximo byte= " + Byte.MAX_VALUE);
        
        short numeroShort = 32767;
        //short numeroShort = (short)32768;
         System.out.println("Valor byte " + numeroShort);
        System.out.println("Valor mínimo byte = " + Short.MIN_VALUE);
        System.out.println("Valor máximo byte= " + Short.MAX_VALUE);

    }

}
