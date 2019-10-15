package pratica1;

import java.util.ArrayList;
import java.util.Scanner;


public class Rmotocicleta {
    
    ArrayList<Motocicleta> Motocicletas;
    Scanner sn = new Scanner(System.in);
    Rmiembro nueva = new Rmiembro();
    boolean salir = false;
    int opcion2;
    Pratica1 pa = new Pratica1();
    
    public Rmotocicleta(){
        Motocicletas = new ArrayList<>();
        }
    public void AgregarMotocicleta(int Id, String Marca, String Matricula, int coste){
        Motocicleta nuevo = new Motocicleta(Id,Marca,Matricula,coste);
        Motocicletas.add(nuevo);
        OperacionArchivo.crearArchivo(Motocicletas);
}
    public void VisualizarMotocicleta(){
        for(int i = 0; i<Motocicletas.size(); i++){
            System.out.println("------------------------");
            System.out.println("ID: "+Motocicletas.get(i).getId());
            System.out.println("Marca: "+Motocicletas.get(i).getMarca());
            System.out.println("Matricula: "+Motocicletas.get(i).getMatricula());
            System.out.println("Coste: "+Motocicletas.get(i).getCoste());
        }
}
}

