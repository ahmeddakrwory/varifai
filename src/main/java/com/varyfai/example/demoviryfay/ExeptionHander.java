/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.varyfai.example.demoviryfay;

import com.mysql.jdbc.exceptions.MySQLDataException;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import javax.persistence.PersistenceException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ADMIN
 */
@RestController
@ControllerAdvice
public class ExeptionHander  {
    @ExceptionHandler(Notvaidnumber.class)
    public String notvaid(){
        return "this number is invled";
    }
    @ExceptionHandler(PersistenceException.class)
    public String dubicatednum(){
     return "this number unable to be enterd";   
    }
}
