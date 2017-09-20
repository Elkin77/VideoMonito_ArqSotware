package co.edu.uniminuto.arqSw.Modelo;
// Generated 20-sep-2017 0:59:45 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Idioma generated by hbm2java
 */
public class Idioma  implements java.io.Serializable {


     private Integer idIdioma;
     private String lenguaje;
     private String subtitulos;
     private String doblaje;
     private Set videoPorIdiomas = new HashSet(0);

    public Idioma() {
    }

	
    public Idioma(String lenguaje, String subtitulos, String doblaje) {
        this.lenguaje = lenguaje;
        this.subtitulos = subtitulos;
        this.doblaje = doblaje;
    }
    public Idioma(String lenguaje, String subtitulos, String doblaje, Set videoPorIdiomas) {
       this.lenguaje = lenguaje;
       this.subtitulos = subtitulos;
       this.doblaje = doblaje;
       this.videoPorIdiomas = videoPorIdiomas;
    }
   
    public Integer getIdIdioma() {
        return this.idIdioma;
    }
    
    public void setIdIdioma(Integer idIdioma) {
        this.idIdioma = idIdioma;
    }
    public String getLenguaje() {
        return this.lenguaje;
    }
    
    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    public String getSubtitulos() {
        return this.subtitulos;
    }
    
    public void setSubtitulos(String subtitulos) {
        this.subtitulos = subtitulos;
    }
    public String getDoblaje() {
        return this.doblaje;
    }
    
    public void setDoblaje(String doblaje) {
        this.doblaje = doblaje;
    }
    public Set getVideoPorIdiomas() {
        return this.videoPorIdiomas;
    }
    
    public void setVideoPorIdiomas(Set videoPorIdiomas) {
        this.videoPorIdiomas = videoPorIdiomas;
    }




}


