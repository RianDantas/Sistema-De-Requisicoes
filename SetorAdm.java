public abstract class SetorAdm{
    protected SetorAdm proximo;

    void setProximo(SetorAdm proximo){
        this.proximo = proximo;
    }

    public abstract void aprovar(String tipo, double valor);
    public abstract void aprovarFerias();

}