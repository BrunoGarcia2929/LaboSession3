/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion.pkg3;

import Entidades.Persona;
import Entidades.Persona2;
import Entidades.PersonaDatosBasicos;
import Entidades.PersonaDatosContacto;
import Entidades.PersonaDatosRegistro;

/**
 *
 * @author Estudiante
 */
public class SESION3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona per = new Persona();
        per.setNombre("Juan");
        per.setApellido("Diaz");
        per.setDni("44554545");
        per.setDireccion("av manzanitas");
        per.setTelefono("9090909090");
        per.setCorreo("pepejuan@hotmail.com");
        per.setUsuario("pepejuan");
        per.setContrasena("1234567");
        per.setEmail(("pepepepepee@gmail.com"));

        PersonaDatosBasicos dataB = new PersonaDatosBasicos("Juan", "Diaz", "43434343");
        PersonaDatosContacto dataC = new PersonaDatosContacto("9038213123", "pepep@hotmail.com", "Av. Manzanitas");
        PersonaDatosRegistro dataR = new PersonaDatosRegistro("juanc", "12344444", "pepep@hotmail.com");

        Persona2 per2 = new Persona2(dataB, dataC, dataR);

        Persona carlitos = Persona.Carlos();
        Persona marcos = Persona.Marcos();
        Persona juanita = Persona.Juanita();
    }

}
