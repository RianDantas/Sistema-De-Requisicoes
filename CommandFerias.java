class CommandFerias implements Command{
    private SetorAdm fulano;

    public CommandFerias(SetorAdm fulano){
        this.fulano = fulano;
    }

    @Override
    public void execute(){
        fulano.aprovarFerias();
    }
}