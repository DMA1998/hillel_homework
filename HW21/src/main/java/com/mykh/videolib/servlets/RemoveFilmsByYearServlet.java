package com.mykh.videolib.servlets;

import com.mykh.videolib.dao.FilmDao;
import com.mykh.videolib.service.NumberFormatService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/removeFilmsByYearServlet")
public class RemoveFilmsByYearServlet extends HttpServlet {

    private FilmDao dao;
    private NumberFormatService service;


    public RemoveFilmsByYearServlet() {
        dao = new FilmDao();
        service = new NumberFormatService();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String filmYear = request.getParameter("filmYear");
        request.setAttribute("remove", dao.removeFilmsByYear(service.checkAndParse(filmYear)));
        getServletContext().getRequestDispatcher("/jsp/removeFilmsByYear.jsp").forward(request,response);


    }

}
