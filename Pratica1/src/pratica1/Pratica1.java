
package pratica1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gruff
 */
public class Pratica1 {

   
    public static void main(String[] args) {
        
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       boolean salir2;
       int opcion;
       int opcion2;
       int resp;
       String nom = "";
       int cas1 = 3;
       int cas2 = 2;
       int cas3 = 2;
       int cas4 = 2;
       int cas5 = 2;
       Rmiembro nueva = new Rmiembro();
       Rmotocicleta nueva1 = new Rmotocicleta();
       
        
       while(!salir){
           
           System.out.println("--------------------------------------------------------");
           System.out.println("MENÚ");
           System.out.println("1. Registrar un nuevo miembro\n"
           + "2. Registrar una nueva motocicleta\n"
           + "3. Registrar una cesión\n"
           + "4. Listar en pantalla los miembros con motos en posesión\n"
           + "5. Listar todas las motos\n"
           + "6. Mostrar las cesiones realizadas\n"
           + "7. Salir del programa\n");
           
            
           try {
                System.out.println("--------------------------------------------------------");
                System.out.print("Ingrese una de las opciones: "); opcion = sn.nextInt();
          
            switch(opcion){
               case 1:
                   
                   System.out.println("--------------------------------------------------------");
                   System.out.println("REGISTRE UN MIEMBRO");
                   System.out.print("Ingrese nombre del nuevo miembro: "); nom = sn.next();
                   while (nom.equals("")){
                       System.out.print("Ingrese nombre del nuevo miembro: "); nom = sn.next();
                      
                       if (!nom.matches("^[A-Za-z ]*$")){
                           nom = "";
                       }
                       
                   }
                   
                   nueva.AgregarMiembro(nom);
                   break;
                   
               case 2:
                   salir2 = false;
                   while(!salir2){
                   System.out.println("--------------------------------------------------------");
                   System.out.println("REGISTRE UNA MOTOCICLETA");
                   System.out.println("1. Vespa Primavera, de 125 CC\n"
                   + "2. Motobenae Poney AG2, de 70 CC\n"
                   + "3. Bultaco de 200 CC,\n"
                   + "4. Guzzi Cardelino 73, de 75 CC,\n"
                   + "5. Ducati mini de 49 CC\n"
                   + "6. Volver");
                   try {
 
                System.out.print("Ingrese una de las opciones: "); opcion2 = sn.nextInt();
          
            switch(opcion2){
                case 1:
                    cas1 = cas1 - 1;
                    if ((cas1 == 1) | (cas1 == 2)){
                    
                    nueva1.AgregarMotocicleta(0,"Vespa Primavera, de 125 CC","8276JSH",2500);
                    System.out.println("--------------------------------------------------------");
                    System.out.println("ASIGNE UN ID A LA MOTOCICLETA SELECCIONADA");
                    nueva.VisualizarMiembro();
                    System.out.println("------------------------");
                    System.out.print("Ingrese un ID: "); resp = sn.nextInt();
                    nueva1.Motocicletas.get(resp-1).setId(resp);
                    nueva1.Motocicletas.get(resp-1).setMarca("Vespa Primavera, de 125 CC");
                    nueva1.Motocicletas.get(resp-1).setMatricula("8276JSH");
                    nueva1.Motocicletas.get(resp-1).setCoste(2500);
                    break; 
                    } else{
                        System.out.println("No quedan más motocicletas, por favor eliga otra.");
                        break;
                    }
                    
                case 2:
                    cas2 = cas2 - 1;
                    if (cas2 == 2){
                    nueva1.AgregarMotocicleta(0,"Motobenae Poney AG2, de 70 CC","6374STW",2300);
                    System.out.println("--------------------------------------------------------");
                    System.out.println("ASIGNE UN ID A LA MOTOCICLETA SELECCIONADA");
                    nueva.VisualizarMiembro();
                    System.out.println("------------------------");
                    System.out.print("Ingrese un ID: "); resp = sn.nextInt();
                    nueva1.Motocicletas.get(resp-1).setId(resp);
                    nueva1.Motocicletas.get(resp-1).setMarca("Motobenae Poney AG2, de 70 CC");
                    nueva1.Motocicletas.get(resp-1).setMatricula("6374STW");
                    nueva1.Motocicletas.get(resp-1).setCoste(2300);
                    break;
                    }else if (cas2 == 1){
                    nueva1.AgregarMotocicleta(0,"Motobenae Poney AG2, de 70 CC","8736JSG",2300);
                    System.out.println("--------------------------------------------------------");
                    System.out.println("ASIGNE UN ID A LA MOTOCICLETA SELECCIONADA");
                    nueva.VisualizarMiembro();
                    System.out.println("------------------------");
                    System.out.print("Ingrese un ID: "); resp = sn.nextInt();
                    nueva1.Motocicletas.get(resp-1).setId(resp);
                    nueva1.Motocicletas.get(resp-1).setMarca("Motobenae Poney AG2, de 70 CC");
                    nueva1.Motocicletas.get(resp-1).setMatricula("8736JSG");
                    nueva1.Motocicletas.get(resp-1).setCoste(2300);
                    break;
                    }else{
                        System.out.println("No quedan más motocicletas, por favor eliga otra.");
                        break;
                    }
                case 3:
                    cas3 = cas3 - 1;
                    if (cas2 == 1){
                    nueva1.AgregarMotocicleta(0,"Bultaco de 200 CC","6273ATF",3800);
                    System.out.println("--------------------------------------------------------");
                    System.out.println("ASIGNE UN ID A LA MOTOCICLETA SELECCIONADA");
                    nueva.VisualizarMiembro();
                    System.out.println("------------------------");
                    System.out.print("Ingrese un ID: "); resp = sn.nextInt();
                    nueva1.Motocicletas.get(resp-1).setId(resp);
                    nueva1.Motocicletas.get(resp-1).setMarca("Bultaco de 200 CC");
                    nueva1.Motocicletas.get(resp-1).setMatricula("6273ATF");
                    nueva1.Motocicletas.get(resp-1).setCoste(3800);
                    break;
                    }else{
                        System.out.println("No quedan más motocicletas, por favor eliga otra.");
                        break;
                    }
                case 4:
                    cas4 = cas4 - 1;
                    if (cas3 == 1){
                    nueva1.AgregarMotocicleta(0,"Guzzi Cardelino 73, de 75 CC","8736QYH",1200);
                    System.out.println("--------------------------------------------------------");
                    System.out.println("ASIGNE UN ID A LA MOTOCICLETA SELECCIONADA");
                    nueva.VisualizarMiembro();
                    System.out.println("------------------------");
                    System.out.print("Ingrese un ID: "); resp = sn.nextInt();
                    nueva1.Motocicletas.get(resp-1).setId(resp);
                    nueva1.Motocicletas.get(resp-1).setMarca("Guzzi Cardelino 73, de 75 CC");
                    nueva1.Motocicletas.get(resp-1).setMatricula("8736QYH");
                    nueva1.Motocicletas.get(resp-1).setCoste(1200);
                    break;
                    }else{
                        System.out.println("No quedan más motocicletas, por favor eliga otra.");
                        break;
                    }
                case 5:
                    cas5 = cas5 - 1;
                    if (cas3 == 1){
                    nueva1.AgregarMotocicleta(0,"Ducati mini de 49 CC","9813TCS",4000);
                    System.out.println("--------------------------------------------------------");
                    System.out.println("ASIGNE UN ID A LA MOTOCICLETA SELECCIONADA");
                    nueva.VisualizarMiembro();
                    System.out.println("------------------------");
                    System.out.print("Ingrese un ID: "); resp = sn.nextInt();
                    nueva1.Motocicletas.get(resp-1).setId(resp);
                    nueva1.Motocicletas.get(resp-1).setMarca("Ducati mini de 49 CC");
                    nueva1.Motocicletas.get(resp-1).setMatricula("9813TCS");
                    nueva1.Motocicletas.get(resp-1).setCoste(4000);
                    break;
                    }else{
                        System.out.println("No quedan más motocicletas, por favor eliga otra.");
                        break;
                    }
                case 6:
                    salir2=true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 6");
            }
                   }catch (InputMismatchException e) {
                System.out.println("Debes ingresar una de las opciones");
                sn.next();
            }
                   }
                case 3:
                   
                   break;
                case 4:
                   int mi2 = nueva1.Motocicletas.size();
                   System.out.println("MIEMBROS CON MOTOS EN POSESIÓN"); 
                   for(int x=0;x< mi2 ;x++) {
                      int re = nueva.Miembros.get(x).getId();
                      int re2 = nueva1.Motocicletas.get(x).getId();
                       if (re == re2){
                          System.out.println("------------------------");
                          System.out.println("ID: "+nueva.Miembros.get(x).getId());
                          System.out.println("Nombre: "+nueva.Miembros.get(x).getNombre());
                          System.out.println("Marca: "+nueva1.Motocicletas.get(x).getMarca()); 
                      }else{
                           System.out.println("------------------------");
                       }
}
                   break;
                case 5:
                    int mi = nueva1.Motocicletas.size();
                    System.out.println("LISTA DE TODAS LAS MOTOS");
                   for(int x=0;x< mi ;x++) {
                      int re = nueva.Miembros.get(x).getId();
                      int re2 = nueva1.Motocicletas.get(x).getId();
                       if (re == re2){
                          System.out.println("------------------------");
                          System.out.println("ID: "+nueva1.Motocicletas.get(x).getId());
                          System.out.println("Marca: "+nueva1.Motocicletas.get(x).getMarca());
                          System.out.println("Nombre: "+nueva.Miembros.get(x).getNombre());
                      }else{
                           System.out.println("------------------------");
                       }
}
                   break;
                case 6:
                   nueva.VisualizarMiembro();
                   break;
                case 7:
                   
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 7");
                   
            } 
           }catch (InputMismatchException e) {
               System.out.println("--------------------------------------------------------");
                System.out.println("Debes ingresar una de las opciones");
                sn.next();
            }
            
       }
    }
    
}
