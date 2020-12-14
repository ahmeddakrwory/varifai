/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.varyfai.example.demoviryfay;

import com.varyfai.example.demoviryfay.Callv;
import com.varyfai.example.demoviryfay.Restsrevice;
import com.varyfi.exampe.demovirfay.entity.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
/**
 *
 * @author ADMIN
 */
@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class ConsumeingRestApi {
    @Autowired
    private UerRepo userrepo;
    @Autowired
    private Restsrevice restservice;
    @GetMapping("/getnumber/{number}")
    public User getnumber(@PathVariable(value = "number") String number){
     
        Callv call=this.restservice.getPostsPlainJSON( number);
        if(call.getValid().equals("true")){
        User user=new User();
        user.setNumber(call.getNumber());
        user.setCountryName(call.getCountry_name());
        user.setCountryPrefix(call.getCountry_prefix());
        user.setCarrier(call.getCarrier());
        user.setInternationalFormat(call.getInternational_format());
        user.setValid(call.getValid());
        user.setLocation(call.getLocation());
        user.setLineType(call.getLine_type());
        user.setLocalFormat(call.getLocal_format());
        user.setCountryCode(call.getCountry_code());
        
        user.setLineType(call.getLine_type());
       User u=userrepo.save(user);
        
        return user;
        }else{
            throw new Notvaidnumber("not valid");
        }
    } 
@GetMapping("/users")
   public List<User>user(){
       ArrayList<User>users=(ArrayList<User>) userrepo.findAll();
   return users;
   }
    @GetMapping("/find/{number}")
    public User find(@PathVariable (value = "number")String number){
        User user=userrepo.findByNumber(number);
        return user;
    }
}
