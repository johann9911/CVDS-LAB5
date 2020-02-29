# Laboratorio5-CVDS

# PARTE UNO

3. Antes de que el servidor cierre la conexión por falta de comunicación:
Revise la página 36 del RFC del protocolo HTTP, sobre cómo realizar una petición GET. Con esto, solicite al servidor el recurso ‘sssss/abc.html’, usando la versión 1.0 de HTTP.
Asegúrese de presionar ENTER dos veces después de ingresar el comando.
Revise el resultado obtenido. ¿Qué codigo de error sale?, revise el significado del mismo en la lista de códigos de estado HTTP.

**Error 301: Se refiere a un error de tipo REDIRECCIONAMIENTO utilizando la version HTTP 1.0** 

¿Qué otros códigos de error existen?, ¿En qué caso se manejarán?
**Error 400: Se refiere a un error de tipo cliente utilizando la version HTTP 1.1** 


5. Seleccione el contenido HTML de la respuesta y copielo al cortapapeles CTRL-SHIFT-C. Ejecute el comando wc (word count) para
 contar palabras con la opción -c para contar el número de caracteres:
 
 3742
 
 6. En la practica no se utiliza telnet para hacer peticiones a sitios web sino el comando curl con ayuda de la linea de comandos:

**UTILIZANDO curl -v www.httpbin.org**

~~~
* Rebuilt URL to: www.httpbin.org/
*   Trying 52.202.2.199...
* TCP_NODELAY set
* Connected to www.httpbin.org (52.202.2.199) port 80 (#0)
> GET / HTTP/1.1
> Host: www.httpbin.org
> User-Agent: curl/7.58.0
> Accept: */*
~~~

**UTILIZANDO curl -i www.httpbin.org**

~~~
HTTP/1.1 200 OK
Date: Thu, 20 Feb 2020 12:58:46 GMT
Content-Type: text/html; charset=utf-8
Content-Length: 9593
Connection: keep-alive
Server: gunicorn/19.9.0
Access-Control-Allow-Origin: *
Access-Control-Allow-Credentials: true
~~~


# PARTE DOS

### Usando GET 
- lleva los datos de forma visible al cliente
- El medio de envio es la url

### Usando POST
- Consiste en datos ocultos enviados por un formulario cuyo metodo es post
- Es adecuado para formularios
- Los datos no son visbles

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/c42353620eed40daaf4102f82214411e)](https://app.codacy.com/manual/johann9911/CVDS-LAB5/dashboard)

[![CircleCI](https://circleci.com/gh/PDSW-ECI/base-proyectos.svg?style=svg)](https://circleci.com/gh/johann9911/workflows/CVDS-LAB5)