package com.mykh.web.servlets;

import com.mykh.web.utils.FindWord;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/findWordServlet")
public class FindWordServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FindWord finder = new FindWord();
        String word = req.getParameter("word");
        PrintWriter writer = resp.getWriter();
        String htmlRespns = "<html><h3>";
        htmlRespns += "Found " + finder.countWords(word) + " words by search word - " +
        word + " in the text" + "<br/>";
        htmlRespns += "</h3></html>";
        writer.println(htmlRespns);
    }
}




