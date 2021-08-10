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
    <title>Listagem de Reservas</title>
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
	
	<main class="crudAcomodacaoArea">
        
        <h2>Lista de Reservas</h2>
        
            <c:forEach items="${reservas}" var="reserva">
                <div class="crudAcomodacaoBox">
                    <div class="bannerTextContent2">
                        <p>ID da Reserva: ${reserva.id} - ${reserva.acomodacao.tipo } </p>
                        <p>Cliente: ${reserva.cliente.nome } - Acomodação: ${reserva.acomodacao.nome }.</p>
                        <p>Data de Entrada: ${reserva.dataEntrada } -> Data de Saída: ${reserva.dataSaida }</p>
                        <p>Quantidade de Dias ${reserva.duracaoReserva } - Valor da Reserva: ${reserva.valorReserva }</p>
                    </div>
                    <div class ="buttonsBannerSection">
                    	<c:if test="${reserva.acomodacao.tipo == 'Acomodação de Luxo'}">
							<button class="campo buttonOptions" onclick="alert('${reserva.acomodacao.servicoPraia()}')">Serviço de Praia</button>
						</c:if>
						<c:if test="${(reserva.acomodacao.tipo == 'Acomodação de Luxo') || (reserva.acomodacao.tipo == 'Acomodação Padrão')}">
							<button class="campo buttonOptions" onclick="alert('${reserva.acomodacao.enviaRefeicao()}')">Enviar Refeição</button>
							<button class="campo buttonOptions" onclick="alert('${reserva.acomodacao.servicoQuarto()}')">Serviço de Quarto</button>
						</c:if>
                	</div>  
                </div>
            </c:forEach>
            <br><hr>
    </main>
	
    <footer>
        <div class="contentFooter">
            <p class="textLeft">Projeto para matéria de POO da UFABC.</p>
            <p class="textRight">Gabriel Duarte e Felipe Moreira</p>
        </div>
    </footer> 
    
</body>
</html>