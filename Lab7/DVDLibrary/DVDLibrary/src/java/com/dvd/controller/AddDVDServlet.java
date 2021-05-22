/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dvd.controller;

import com.dvd.model.DVDItem;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TUF
 */
public class AddDVDServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
        
        List errorMsgs = new LinkedList();
        
        try{
            
            String title = request.getParameter("title");
            String year = request. getParameter("year");
            String genre = request.getParameter("newGenre");
            if( (genre==null)||(genre.trim().length()==0)){
                genre=request.getParameter("genre");
            }
            
            if ( title == null || title.trim().length() ==0){
                errorMsgs.add("Please enter the DVD title.");
            }
            if ( year == null || year.trim().length() ==0){
                errorMsgs.add("Please enter the year of release for the DVD.");
            }
            else if ( !year.trim().matches("\\d\\d\\d\\d")){
                errorMsgs.add("Please enter a valid year.");
            }
            if(!errorMsgs.isEmpty()){
                request.setAttribute("errorMsgs", errorMsgs);
                RequestDispatcher view = request.getRequestDispatcher("/add_dvd.view");
                view.forward(request, response);
                return;
            }
            DVDItem item = new DVDItem(title,year,genre);
            
            /*
            PrintWriter out = response.getWriter();
            out.println("SUCCESS: added DVD titled '"+item.getTitle()+"'.");
            out.close();
            */
            
            request.setAttribute("dvdItem",item);
            
            RequestDispatcher view = request.getRequestDispatcher("/success.view");
            view.forward(request,response);
            
        } catch (RuntimeException e){
            errorMsgs.add("An unexpected error:" +e.getMessage());
            request.setAttribute("errorMsgs", errorMsgs);
            RequestDispatcher view = request.getRequestDispatcher("/add_dvd.view");
            view.forward(request, response);
        }
    }
    
    /*
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddDVDServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddDVDServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    } */
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     *

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
