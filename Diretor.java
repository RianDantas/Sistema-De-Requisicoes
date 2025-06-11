class Diretor extends SetorAdm{
    @Override
    public void aprovar(String tipo, double valor){
        
        if(tipo == "solicitacaoFerias"){
                System.out.println("Solicitação de Férias aprovada por líder de Equipe");
            }

        if(tipo == "reembolso" && valor > 1000){
            System.out.println("Solicitação de reembolso no valor de R$" + valor + " aprovada por Diretor");
        }else{
            if(proximo != null){
                proximo.aprovar(tipo, valor);

            }
        }
        if(tipo == "SolicitaçãoCompra" && valor > 1000){
            System.out.println("Solicitação de compra no valor de R$" + valor + " aprovada por Diretor");
        }else{
            if(proximo != null){
                proximo.aprovar(tipo, valor);

            }
        }
    }
}
