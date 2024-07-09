package com.saket.spring.week1Introduction.IntroductionToSpringBoot;


import org.springframework.stereotype.Service;

@Service
public class DBService {

   private DB db;
   public DBService(DB db) {
       this.db = db;
   }

    String getData(){
        return db.getData();
    }
}
