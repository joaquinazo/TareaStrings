package Cinco;//Joaquin on 25/1/16.


import java.util.Scanner;

public class ejercicioCinco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = Integer.parseInt(scan.nextLine());
        String[] respuestas = new String[casos];
        for (int i = 0; i < casos; i++) {
            String mensaje = scan.nextLine();
            mensaje.toLowerCase();
            String oculto = scan.nextLine();
            boolean respuesta = true;
            int contador = 0;
            int ultimaPos = -1;
            while (respuesta && contador < oculto.length()) {
                if (oculto.charAt(contador) != ' ') {
                    ultimaPos = mensaje.indexOf(oculto.charAt(contador), ultimaPos);
                    if (ultimaPos == -1) {
                        respuesta = false;
                        respuestas[i] = "NO";
                    } else {
                        respuestas[i] = "SI";
                    }

                }
                contador++;

            }
        }
        for (int i = 0; i < respuestas.length; i++) {
            System.out.println(respuestas[i]);
        }
    }
}
