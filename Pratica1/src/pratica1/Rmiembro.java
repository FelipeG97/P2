
package pratica1;

import java.util.ArrayList;


public class Rmiembro {
    
    ArrayList<Miembro> Miembros;
    
    public Rmiembro(){
    Miembros = new ArrayList<>();
}
    public void AgregarMiembro(String Nombre){
        Miembro nuevo = new Miembro(Nombre);
        Miembros.add(nuevo);
        OperacionArchivo.crearArchivo(Miembros);
}
      public void VisualizarMiembro(){
        for(int i = 0; i<Miembros.size(); i++){
            System.out.println("------------------------");
            System.out.println("ID: "+Miembros.get(i).getId());
            System.out.println("Nombre: "+Miembros.get(i).getNombre());
        }
}
}
