package com.example.repo;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Appleentity;




/*connecting backend db and frontend*/
@Repository
public interface Applerepo extends MongoRepository<Appleentity, Integer>{
    

}
