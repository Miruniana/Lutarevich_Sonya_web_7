package com.lutarevichsonya;

import com.lutarevichsonya.Models.Animal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(urlPatterns = {"/animal"})
public class AnimalsServlet extends HttpServlet {
    private List<Animal> animals = Arrays.asList(
            new Animal("Lait from Kaedwen", "Wolf", "Artorias", 13),
            new Animal("Anri Will", "Manticore", "Svekla", 2),
            new Animal("Weasel Mistress of the Tower", "Manticore", "Losos'-Alukard-Abaet-Gerasim-Leopold-Strogost'", 10));
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("animals", animals);
        RequestDispatcher dispatcher = req.getRequestDispatcher("static/Animals.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    public void destroy() {
    }
}
