package com.mykh.videolib.database;

import com.mykh.videolib.dao.FilmDao;

import java.sql.SQLException;

public class DbRunner {
    public static void main(String[] args) {
        DbConnection db = new DbConnection();

        try {
            FilmDao filmDao = new FilmDao();
            filmDao.findFilmByYear(2019,db.getDbConnection());
        }catch (SQLException e) {
            e.getErrorCode();
        }catch (ClassNotFoundException e) {
            e.getCause();
        }
    }
}
