class CommandRequisicao implements Command{
    private SetorAdm fulano;
    private double valor;
    private String tipo;

    public CommandRequisicao(SetorAdm fulano, String tipo, double valor){
        this.fulano = fulano;
        this.valor = valor;
        this.tipo = tipo;
    }

    @Override
    public void execute(){
        fulano.aprovar(tipo, valor);
    }
}