package com.helalubo.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// import javax.servlet.http.HttpSession;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("titulo", "Miguel Alejandro De Moraiz");
        request.setAttribute("curso", "Fullstack Java 2021");
        request.setAttribute("comision", "2112");
        request.setAttribute("descripcion",
                "El temario de clases es muy bueno, fue interesante poder ver un framework como Vue, como ya venia con conocimientos en Angular"
                        + "me arriego tambien a decir que tuvimos una de las mejores profeoras que me toco, codea en vivo y eso es muy valorable con respecto tanto a exito del codigo como a cuales errores se pueden presentar"
                        + "lo cual puede ahorrarle horas de codigo a varios, tambien cabe decir la buena vibra de la clase, fue todo un placer. Tambien fue muy buena la relacion con los compañeros de cursada ya que "
                        + "mediante los diversos medios de comunicacion que teniamos nos pudimos ayudar mucho entre nosotros. ");

        request.getRequestDispatcher("datos.jsp").forward(request, response);

    }

}
