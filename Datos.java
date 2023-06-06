package com.empresa.codigo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
/**
 * Servlet implementation class Datos
 */
@WebServlet("/Datos")
public class Datos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Datos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);

		        String jdbcUrl = "jdbc:mysql://localhost/test?user=root&password=";
		        String query = "INSERT INTO productos (id, nombre, unidades, precio) VALUES (?, ?, ?, ?)";

		        try {
		            // Cargar el driver de MySQL
		            Class.forName("com.mysql.cj.jdbc.Driver");

		            // Establecer la conexión a la base de datos
		            Connection conn = DriverManager.getConnection(jdbcUrl);

		            // Preparar la sentencia SQL
		            PreparedStatement stmt = conn.prepareStatement(query);
		            stmt.setString(1, request.getParameter("product-id")); // id
		            stmt.setString(2, request.getParameter("product-name")); // nombre
		            stmt.setString(3, request.getParameter("product-units")); // unidades
		            stmt.setString(4, request.getParameter("product-price")); // precio

		            // Ejecutar la sentencia SQL
		            int rowsInserted = stmt.executeUpdate();
		            System.out.println(rowsInserted + " fila(s) insertada(s)");

		            // Cerrar la conexión
		            conn.close();
		        } catch (ClassNotFoundException | SQLException e) {
		            e.printStackTrace();
		        }
		    }
		}

