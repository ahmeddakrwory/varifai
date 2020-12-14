 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.varyfai.example.demoviryfay;

import com.varyfi.exampe.demovirfay.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ADMIN
 */
@Repository
public interface UerRepo extends CrudRepository<User, Integer>{
    public User findByNumber(String number);
}
