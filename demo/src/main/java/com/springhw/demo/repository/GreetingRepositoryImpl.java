
package com.springhw.demo.repository;

import com.springhw.demo.model.Greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class GreetingRepositoryImpl implements GreetingRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    
    @Override
    public int saveGreeting(Greeting greeting) {
       
        //Save the greeing to the H2 database using JDBCTemplate
        return jdbcTemplate.update( "insert into GREETING  (ID, CONTENT) values(?,?)",  greeting.getId(), greeting.getContent());
 
    }
     
    

}