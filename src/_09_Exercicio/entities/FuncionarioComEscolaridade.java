package _09_Exercicio.entities;

public abstract class FuncionarioComEscolaridade extends Funcionario {
    private String escolaBasico;
    private String escolaMedio;
    private String universidade;
    
   
    

    public FuncionarioComEscolaridade(String nome, String codigoFuncional, String escolaBasico, String escolaMedio, String universidade) {
        super(nome, codigoFuncional);
        this.escolaBasico = escolaBasico;
        this.escolaMedio = escolaMedio;
        this.universidade = universidade;
    }

    public FuncionarioComEscolaridade(String nome, String codigoFuncional, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
    }
    
    public FuncionarioComEscolaridade(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
    }
    
    public String getEscolaBasico() {
        return escolaBasico;
    }

    public String getEscolaMedio() {
        return escolaMedio;
    }

    public String getUniversidade() {
        return universidade;
    }

    public abstract double calcularRendaTotal();
    

    public boolean possuiEscolaridade() {
        return escolaBasico != null || escolaMedio != null || universidade != null;
    }
    
 
}
