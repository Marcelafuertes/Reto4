/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sa.G8.Grupo01.Reto4.repository;


import com.sa.G8.Grupo01.Reto4.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Novosix
 */
public interface CategoryRepository extends JpaRepository<Category, Integer>{
    
    
}
