/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.EudoxieProjet2021.repository;

import com.example.EudoxieProjet2021.entity.stage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Tictopia
 */
@Repository
public interface StageRepository extends JpaRepository<stage,Integer>{
    
}
