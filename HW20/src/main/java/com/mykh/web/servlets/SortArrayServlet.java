package com.mykh.web.servlets;

import com.mykh.web.utils.SortArray;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet("/sortArrayServlet")
public class SortArrayServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SortArray sorter = new SortArray();
        String userValue = req.getParameter("numbers");
        String[] numbers = userValue.split("[,\\s]");
        int[] numbersToSend = sorter.parsedNumbers(numbers);
        Arrays.sort(numbersToSend);
        PrintWriter writer = resp.getWriter();
        String htmlRespns = "<html><h3>";
        htmlRespns += "Your sorted numbers are : " + Arrays.toString(numbersToSend) + "<br/>";
        htmlRespns += "</h3></html>";
        writer.println(htmlRespns);
    }
}
