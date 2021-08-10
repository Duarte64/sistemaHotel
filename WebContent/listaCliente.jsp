<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.gerenciadorHotel.modelo.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Acomodação</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Nunito:wght@200;300;400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
	
	<header>
        <div class="menuNavegacao">
            <nav>
                <ul>
                    <li><a href="cadastroReserva.html">Reservar Acomodação</a></li>
                    <li><a href="">Realizar Cadastros</a>
                        <ul class="">
                            <li class=""><a href="cadastroAcomodacao.html">Acomodação</a></li>
                            <li class=""><a href="cadastroCliente.html">Cliente</a></li>
                        </ul>
                    </li>
                    <li><a href="">Consultar</a>
                        <ul class="">
                            <li class=""><a href="ListaCliente">Clientes</a></li>
                            <li class=""><a href="listaAcomodacao">Acomodações</a></li>
                            <li class=""><a href="listaReserva">Reservas</a></li>
                        </ul>
                    </li>
                    <li><a href="adicionaisInfo.html">Informações Adicionais</a></li>
                </ul>
            </nav>
        </div>
    </header>

	<main class="crudArea">
	
        <c:if test="${not empty cliente}">
            <h3>Cliente ${ cliente } cadastrado com sucesso!</h3>
        </c:if>
        
        <table>
        	<caption><h3>Lista de Clientes</h3></caption>
        	<thead>
        		<tr>
        			<th>ID</th>
        			<th>Nome</th>
        			<th>Idade</th>
        			<th>CPF</th>
        			<th>Endereco</th>
        			<th>Telefone</th>
        			<th>Email</th>
        			<th>Opções</th>
        		</tr>
        	</thead>
        	<tbody>
        		<c:forEach items="${clientes}" var="cliente">
        			<tr>
        				<th>${cliente.id}</th>
        				<th>${cliente.nome}</th>
        				<th>${cliente.idade}</th>
        				<th>${cliente.cpf}</th>
        				<th>${cliente.endereco}</th>
        				<th>${cliente.telefone}</th>
        				<th>${cliente.email}</th>
        				<th><a href="#"><button name="subject" class="editButton" type="submit" value="${cliente.id}">Editar</button></a>&nbsp&nbsp<a href="/gerenciadorHotel/removeCliente?id=${cliente.id}"><button name="subject" class="removeButton" type="submit" value="${cliente.id}">Remover</button></a></th>
        			</tr>
        		</c:forEach>
        	</tbody>
        </table>
 
    </main>

    <footer>
        <div class="contentFooter">
            <p class="textLeft">Projeto para matéria de POO da UFABC.</p>
            <p class="textRight">Gabriel Duarte e Felipe Moreira</p>
        </div>
    </footer>

</body>
</html>