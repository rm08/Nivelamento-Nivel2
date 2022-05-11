package aula;

public class Principal {

	public static void main(String[] args) {
		Aluno alunoNovo = new Aluno("Rafael", 1, 7.0, 8.0);

		System.out.println("Nome:" + alunoNovo.nome + " Codigo:" + alunoNovo.codigo + " Nota1:" + alunoNovo.nota1
				+ " Nota2:" + alunoNovo.nota2);

		NovoAluno novoAluno = new NovoAluno();
		novoAluno.setNome("Julia");
		novoAluno.setCodigo(2);
		novoAluno.setNota1(9.0);
		novoAluno.setNota2(7.0);
		
		System.out.println("Nome:" + novoAluno.getNome() + " Codigo:" + novoAluno.getCodigo() + " Nota1:" + novoAluno.getNota1()
				+ " Nota2:" + novoAluno.getNota2());
		
		System.out.println("Média da nota do aluno " + novoAluno.getNome() + " é " + novoAluno.calcular(novoAluno.getNota1(), novoAluno.getNota2()));
	
	}

}
