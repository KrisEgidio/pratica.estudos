public enum DiaDaSemana {
    SEGUNDA_FEIRA("Hoje é segunda-feira"),
    TERCA_FEIRA("Hoje é terça-feira"),
    QUARTA_FEIRA("Hoje é quarta-feira"),
    QUINTA_FEIRA("Hoje é quinta-feira"),
    SEXTA_FEIRA("Hoje é sexta-feira"),
    SABADO("Hoje é sábado"),
    DOMINGO("Hoje é domingo");

    private String mensagem;

    DiaDaSemana(String mensagem){
        this.mensagem = mensagem;
    }

    public String getMensagem(){
        return mensagem;
    }

}
