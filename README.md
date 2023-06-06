# JSP-Servlets

Gestión de Productos con Servlet y JSP

Aaplicación Java desarrollada con Eclipse que permite gestionar productos utilizando un servlet y un archivo JSP. La aplicación está diseñada para funcionar con un servidor web compatible con servlets, Apache Tomcat 9.

Los archivos que encontrarás en este repositorio son:

Datos.java: código fuente del servlet que maneja las solicitudes relacionadas con la gestión de productos. Implementa la lógica de negocio para agregar productos a la base de datos utilizando el método doPost.

add-product.jsp: formulario para añadir los detalles de un producto y enviarlos al servlet correspondiente para su procesamiento y almacenamiento en la base de datos.

La aplicación sigue el patrón de diseño Modelo-Vista-Controlador (MVC), donde el servlet actúa como el controlador para procesar las solicitudes y el archivo JSP como la vista para mostrar el formulario de ingreso de productos.

Para ejecutar correctamente esta aplicación, asegúrate de tener un servidor web como Apache Tomcat 9 configurado en tu entorno de desarrollo. Puedes compilar y desplegar los archivos .java proporcionados en tu servidor Tomcat para probar la funcionalidad de gestión de productos.
