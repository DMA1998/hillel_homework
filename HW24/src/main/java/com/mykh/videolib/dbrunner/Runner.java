package com.mykh.videolib.dbrunner;

import com.mykh.videolib.dao.FilmDao;
import com.mykh.videolib.dao.UserDao;


public class Runner {
    public static void main(String[] args) {
      UserDao dao = new UserDao();
      FilmDao dao2 = new FilmDao();

       // System.out.println(dao2.findActorsLikeProducers().toString());

      //fixme connection pool
       //System.out.println(dao.usersConnectionPool().toString());


        //todo without connection pool
       // System.out.println(dao.users().toString());



        
    }
}
