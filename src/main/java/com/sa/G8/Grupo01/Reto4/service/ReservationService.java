
package com.sa.G8.Grupo01.Reto4.service;

import com.sa.G8.Grupo01.Reto4.entity.Reservation;
import com.sa.G8.Grupo01.Reto4.repository.ReservationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Grupo01
 */

/**
 * anotacion que identifica la clase como  un sevicio
 */
@Service

/**
 * crea la clase
 */
public class ReservationService {
    /**
    * anotacion que permite el enlace con el repositorio
    */
    @Autowired
     /**
    * instancia el repositorio
    */
    private ReservationRepository repository;
    /**
    * crea la funcion para guardar una nueva resrvacion
    */    
    
    public Reservation saveReservation(Reservation game){
       return repository.save(game);
    }
    /**
    * crea la funcion para generar todas las resevaciones
    */  
    public List<Reservation> getReservation(){
        return repository.findAll();
    }
    /**
    * crea la funcion para  encontrar una reservacion por su llave primaria
    */  
    public Reservation getReservationById(int id){
        return repository.findById(id).orElse(null);
    }
    
    /**
    * crea la funcion borrar una reservacion por su llaver primaria
    */        
    public String deleteReservation(int id){
        /**
        * utiliza el metodo del repositorio para borrar con la llave primaria
        */    
        repository.deleteById(id);
        return "Reservacion eliminada "+id;
    }
    
    /**
    * crea la funcion actualizar una reservacion
    */       
    public Reservation updateReservation(Reservation reservation){
        /**
        * busca si existe la reservacion con su llave primaria, de lo contrario
        * regresa un null
        */   
        Reservation existingReservation=repository.findById(reservation.getIdReservation()).orElse(null);
        /**
        * establece la fecha de devolucion con la suministrada por el usuario
        */ 
        existingReservation.setDevolutionDate(reservation.getDevolutionDate());
        /**
        * establece la fecha de incio con la suministrada por el usuario
        */ 
        existingReservation.setStartDate(reservation.getStartDate());
        /**
        * establece el estado de la reservacion 
        */ 
        existingReservation.setStatus(reservation.getStatus());
        /**
        * guarda los nuevos parametros
        */ 
       return repository.save(existingReservation);
    }
}
