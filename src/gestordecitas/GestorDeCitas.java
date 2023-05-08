/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordecitas;

import entidades.Cita;
import entidades.Medico;
import entidades.Paciente;
import java.util.ArrayList;
import java.util.List;
import pantallas.JFrameGestorDeCitas;

/**
 *
 * @author Ronaldo
 */
public class GestorDeCitas {
    
   
    public static List<Cita> citaEnElSitema;
    public static List<Paciente> listaDePaciente;
    public static List<Medico> listaDeMedico;
    
    
    public static List<String> horasDisponible = new ArrayList<>();
    public static List<String> fechasDisponible = new ArrayList<>();
    
    public static void main(String[] args) {
        
        //generar las lista en blanco para todo el sistema hasta que se cierre
        citaEnElSitema = new ArrayList<>();
        listaDePaciente = new ArrayList<>();
        listaDeMedico = new ArrayList<>();
        
        horasDisponible.add("9:00am");
        horasDisponible.add("9:30am");
        horasDisponible.add("10:00am");
        horasDisponible.add("10:30am");
        horasDisponible.add("11:00am");
        
        
        fechasDisponible.add("05/08/2003");
        fechasDisponible.add("06/08/2003");
        fechasDisponible.add("07/08/2003");
        fechasDisponible.add("08/08/2003");
        fechasDisponible.add("09/08/2003");
        
        
        //Incio la ventana principal de gestor de cita
        JFrameGestorDeCitas framePrincipal =new JFrameGestorDeCitas();  //llamar la ventana princal
        framePrincipal.setLocationRelativeTo(null); //Para centrar en la ventana 
        framePrincipal.setVisible(true); //Hacer visible el formulario
        
        
    }
    
}
