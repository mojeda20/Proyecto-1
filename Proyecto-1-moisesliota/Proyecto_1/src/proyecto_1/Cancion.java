/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_1;

/**
 *
 * @author moise
 */
public class Cancion {
    
    //Atributos de la clase Cancion
     int num_song;
     String name_song;
     String artista;
     int num_repro;
     int age;
     String idioma;
   
    //Constructos de la clase Cancion
    public Cancion(int num_song, String name_song, String artista, int num_repro, int age, String idioma) {
        this.num_song = num_song;
        this.name_song = name_song;
        this.artista = artista;
        this.num_repro = num_repro;
        this.age = age;
        this.idioma = idioma;
    }

    public Cancion() {
        this.num_song = 0;
        this.name_song = null;
        this.artista = null;
        this.num_repro = 0;
        this.age = 0;
        this.idioma = null;
    }

    //Getter y Setter de la clase Cancion

    public int getNum_song() {
        return num_song;
    }

    public void setNum_song(int num_song) {
        this.num_song = num_song;
    }

    public String getName_song() {
        return name_song;
    }

    public void setName_song(String name_song) {
        this.name_song = name_song;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getNum_repro() {
        return num_repro;
    }

    public void setNum_repro(int num_repro) {
        this.num_repro = num_repro;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    

    @Override
    public String toString() {
        return  num_song + "," + name_song + ", " + artista + ", " + num_repro + ", " + age + ", " + idioma;
    }
    
}
