package lab8p2_equipo11;

import java.io.Serializable;
import java.util.ArrayList;

public class SerVivo {
    private String nombres;
    private int ID;
    private int Poder;
    private int Anios;
    private Universo UniversoDprocedencia;
    private String Raza;

    public SerVivo() {
    }

    public SerVivo(String nombres, int ID, int Poder, int Anios, Universo UniversoDprocedencia, String Raza) {
        
        this.nombres = nombres;
        this.ID = ID;
        this.Poder = Poder;
        this.Anios = Anios;
        this.UniversoDprocedencia = UniversoDprocedencia;
        this.Raza = Raza;
    }
    

    public String getNombre() {
        return nombres;
    }

    public void setNombre(String nombre) {
        this.nombres = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPoder() {
        return Poder;
    }

    public void setPoder(int Poder) {
        this.Poder = Poder;
    }

    public int getAnios() {
        return Anios;
    }

    public void setAnios(int Anios) {
        this.Anios = Anios;
    }

    public Universo getUniversoDprocedencia() {
        return UniversoDprocedencia;
    }

    public void setUniversoDprocedencia(Universo UniversoDprocedencia) {
        this.UniversoDprocedencia = UniversoDprocedencia;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    @Override
    public String toString() {
        return "SerVivo{" + "nombre=" + nombres + ", ID=" + ID + ", UniversoDprocedencia=" + UniversoDprocedencia.getNombre() + "Raza"+Raza;
    }
    
    
}
