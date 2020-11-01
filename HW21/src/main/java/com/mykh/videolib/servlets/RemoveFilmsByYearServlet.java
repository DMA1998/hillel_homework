package com.mykh.videolib.servlets;

import com.mykh.videolib.dao.FilmDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/removeFilmsByYearServlet")
public class RemoveFilmsByYearServlet extends HttpServlet {

    private FilmDao dao;

    public RemoveFilmsByYearServlet() {
        dao = new FilmDao();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String filmYear = request.getParameter("filmYear");
    int parsed = Integer.parseInt(filmYear);


    }

}
