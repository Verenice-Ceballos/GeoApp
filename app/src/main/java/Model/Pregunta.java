package Model;

/**
 * Created by Verenice on 02/06/2016.
 */
public class Pregunta {
    private Integer idResTexto;
    private boolean RespuestaVerdadera;

    public Pregunta (Integer idResTexto, Boolean RespuestaVerdadera){
        this.idResTexto=idResTexto;
        this.RespuestaVerdadera=RespuestaVerdadera;


    }
    public void setIdResTexto(Integer idResTexto){
        this.idResTexto=idResTexto;
    }

    public Integer getIdResTexto(){
        return this.idResTexto;

    }
    public void setRespuestaVerdadera(Boolean RespuestaVerdadera){
        this.RespuestaVerdadera=RespuestaVerdadera;

    }
    public boolean isRespuestaVerdadera(){
        return this.RespuestaVerdadera;
    }
}

