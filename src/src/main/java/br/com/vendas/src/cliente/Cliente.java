package br.com.vendas.src.cliente;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

	// identificador unico da tabela
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String cpf;
	
	private String nome;
	
	private int idade;
	private char sexo;
	
	@Embedded
	private Endereco endereco;

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Column(name = "data_de_nascimento")
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate dataNascimento;
	
	@Column(name = "limite_de_credito")
	private float limiteCredito;
	
	@Column(name = "volume_de_compra")
	private float volumeCompra;
	
	@Column(name = "primeira_compra")
	private boolean primeiraCompra;
	
	public String getCpf() {
		return this.cpf;
	}
	
	public float getVolumeCompra() {
		return volumeCompra;
	}

	public void setVolumeCompra(float volumeCompra) {
		this.volumeCompra = volumeCompra;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setPrimeiraCompra(boolean primeiraCompra) {
		this.primeiraCompra = primeiraCompra;
	}
	
	public LocalDate getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public float getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(float limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


}



