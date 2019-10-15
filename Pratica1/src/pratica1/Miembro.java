
package pratica1;


public class Miembro {
    private static int count =0;
    private int id;
    private String Nombre;

    public Miembro(String Nombre) {
        count++;
        id = count;
        this.Nombre = Nombre;
    }
    
    public int getId(){ 
        return id; }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
      
}

