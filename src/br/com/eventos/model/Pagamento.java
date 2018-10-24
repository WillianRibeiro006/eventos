package br.com.eventos.model;

public enum Pagamento {
	DINHEIRO("Dinheiro"),
    CARTAO_D("Cart�o - D�bito"),
    CARTAO_C("Cart�o - Cr�dito"),
    BOLETO("Boleto"),
    CHEQUE("Cheque");

    private String nome;

    private Pagamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
