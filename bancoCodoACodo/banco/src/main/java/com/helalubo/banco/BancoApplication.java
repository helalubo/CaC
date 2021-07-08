package com.helalubo.banco;

import com.helalubo.banco.mook.cliente.application.services.clienteService;
import com.helalubo.banco.mook.cliente.domain.cliente;
import com.helalubo.banco.mook.banco.application.services.bancoService;
import com.helalubo.banco.mook.banco.domain.banco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoApplication implements CommandLineRunner {

	// private clienteService clienteService = new clienteService();
	// @Autowired
	// public clienteRepository repo;
	@Autowired
	private clienteService clienteService;

	@Autowired
	private bancoService bancoService;

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// obtengo banco
		float rta;

		banco banco = new banco();
		banco = bancoService.obtenerUno(1);
		System.out.println(banco.toString());
		System.out.println("cliente depositando...");
		// creo cliente
		cliente cliente = new cliente("Alejandro", 22.5f);
		rta = bancoService.depositar(cliente.getcantidad(), banco);

		System.out.println("Se han depositado " + cliente.getcantidad() + "pesos");
		System.out.println("Seu saldo actual es de  " + rta + "pesos");

		bancoService.update(banco);
		System.out.println(banco.toString());

	}
}
