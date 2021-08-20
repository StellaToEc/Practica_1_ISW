import jdk.swing.interop.SwingInterOpUtils;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Practica_1_isw {

    private final ArrayList<DatosPersona> personaArrayList = new ArrayList<>();

    public  Practica_1_isw() {
        String clave = "";
        int elec;
        do {
            Scanner reader = new Scanner(System.in);
            System.out.println("Bienvenido por favor ingresa la palabra de seguridad:");
            clave = reader.nextLine();
        } while (clave.equals("ISW") == false);

        do {
            Scanner reader = new Scanner(System.in);
            System.out.println("\n\n\n\n¿Que deseas realizar? \n\n1-Agregar Cliente \n2-Modificar Cliente\n3-Eliminar Cliente\n4-Listar Clientes\n0-Salir");
            elec = reader.nextInt();

            switch (elec) {
                case 1 : {
                    agregarPersona();
                    break;
                }
                case 2 : {
                    modificarPersona();
                    break;
                }
                case 3 : {
                    eliminaPersona();
                    break;
                }
                case 4 : {
                    System.out.println("\n");
                    listarPersona();
                    break;
                }
            }
        }while (elec!=0);
    }

public void agregarPersona(){
    String Alias;
    String Nombre;
    String Papellido;
    String Sapellido;
    String RazSocial;
    String RFC;
    String tel;
    String correo;

    Scanner reader = new Scanner(System.in);
    System.out.println("Ingrese el Alias");
    Alias = reader.nextLine();
    System.out.println("Ingrese su Nombre");
    Nombre = reader.nextLine();
    System.out.println("Ingrese su Primer Apellido");
    Papellido = reader.nextLine();
    System.out.println("Ingrese su Segundo Apellido");
    Sapellido = reader.nextLine();
    System.out.println("Ingrese el nombre de su empresa");
    RazSocial = reader.nextLine();
    System.out.println("Ingrese su RFC");
    RFC = reader.nextLine();
    System.out.println("Ingrese su numero telefonico");
    tel = reader.nextLine();
    System.out.println("Ingrese su correo electronico");
    correo = reader.nextLine();

    DatosPersona datosPersona = new DatosPersona(Alias,Nombre,Papellido,Sapellido,RazSocial,RFC,tel,correo);
    personaArrayList.add(datosPersona);
}

public void modificarPersona(){
    int elec= 0;

    Scanner reader = new Scanner(System.in);
    System.out.println("\n\n\n¿Que cliente deseas modificar? (inserta numero de cliente en la lista)");
    listarPersona();
    elec= reader.nextInt()-1;
    System.out.println("\n\nEsta es la informacion registrada del cliente seleccionado:\n\nAlias: "+personaArrayList.get(elec).getAlias()+
            "\nNombre: "+personaArrayList.get(elec).getNombre()+
            "\nPrimer Apellido: "+personaArrayList.get(elec).getPrimApellido()+
            "\nSegundo Apellido: "+personaArrayList.get(elec).getSegApellido()+
            "\nRazon Social: "+personaArrayList.get(elec).getRazonSocial()+
            "\nRFC: "+personaArrayList.get(elec).getRFC()+
            "\nTelefono: "+personaArrayList.get(elec).getTelefono()+
            "\nCorreo: "+personaArrayList.get(elec).getCorreo()+"\n\n"
            );
    agregarPersona();
    personaArrayList.remove(elec);
    System.out.println("Modificado exitosamente");
}

public void eliminaPersona(){
    int elec= 0;

    Scanner reader = new Scanner(System.in);
    System.out.println("\n\n\n¿Que cliente deseas eliminar? (inserta numero de cliente en la lista)");
    listarPersona();
    elec= reader.nextInt();
    personaArrayList.remove(elec-1);
    System.out.println("Eliminado exitosamente");
    listarPersona();
}

public void listarPersona(){
    int index = 0;
    System.out.println("\n");
    for (DatosPersona datosPersona : personaArrayList) {
        index++;
        System.out.println("Cliente "+index+": "+datosPersona.getNombre());
    }
}

    public static void main(String[] args) { new Practica_1_isw(); }
}
