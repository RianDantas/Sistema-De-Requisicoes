public abstract class SetorAdm{
    protected SetorAdm proximo;

    void setSetorAdm(SetorAdm proximo){
        this.proximo = proximo;
    }

    public abstract void aprovar(String tipo, double valor);
    public abstract void aprovar(String tipo);

}