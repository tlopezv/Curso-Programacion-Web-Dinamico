package com.mycompany.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// http://localhost:8080/intro-servlets/hola
@WebServlet("/hola")
public class HolaMundoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ejecutando hola mundo servlet");

        // consulta a la Base de datos
        String nombreUsuario = "Homer Simpson";

        // PrintWriter respuesta = resp.getWriter();
        // respuesta.print("hola!");

        // pasamos a la vista información:
        req.setAttribute("nombre", nombreUsuario);

        RequestDispatcher respuesta = req.getRequestDispatcher("/hola.jsp");
        respuesta.forward(req, resp);
    }
}
