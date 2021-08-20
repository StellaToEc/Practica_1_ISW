import org.w3c.dom.css.CSSStyleRule;

import java.io.Serializable;

public class DatosPersona implements  Serializable{
    private String Alias;
    private String Nombre;
    private String PrimApellido;
    private String SegApellido;
    private String RazonSocial;
    private String RFC;
    private String Telefono;
    private String Correo;

    public DatosPersona(String Alias, String Nombre, String PrimApellido, String SegApellido, String RazonSocial, String RFC,String Telefono, String Correo) {
        this.Alias = Alias;
        this.Nombre = Nombre;
        this.PrimApellido = PrimApellido;
        this.SegApellido=SegApellido;
        this.RazonSocial=RazonSocial;
        this.RFC=RFC;
        this.Telefono=Telefono;
        this.Correo=Correo;
    }

    public String getAlias() {return Alias;}
    public String getNombre() {return Nombre;}
    public String getPrimApellido() {return PrimApellido;}
    public String getSegApellido() {return SegApellido;}
    public String getRazonSocial() {return RazonSocial;}
    public String getRFC() {return RFC;}
    public String getTelefono() {return Telefono;}
    public String getCorreo() {return Correo;}
}


