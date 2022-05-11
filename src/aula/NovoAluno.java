package aula;

public class NovoAluno {
	private String nome;
	private int codigo;
	private Double nota1;
	private Double nota2;
	
	public NovoAluno() {
	}

	public NovoAluno(String nome, int codigo, Double nota1, Double nota2) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	
	public static Double calcular(Double nota1, Double nota2) {
		return (nota1 + nota2) / 2;
	}
	
}
