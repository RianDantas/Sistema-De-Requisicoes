public class Main{
    public static void main(String args[]){

        Diretor diretor = new Diretor();
        LiderDeEquipe liderEquipe = new LiderDeEquipe();
        Gerente gerente = new Gerente();

        liderEquipe.setProximo(gerente);
        gerente.setProximo(diretor);

        Command ferias = new CommandFerias(gerente);
        Command reembolso = new CommandRequisicao(liderEquipe,"reembolso", 19800.0);
        Command compra = new CommandRequisicao(liderEquipe,"compra", 43345.0);
        

        ferias.execute();
        reembolso.execute();
        compra.execute();


    }
}