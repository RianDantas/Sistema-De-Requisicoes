class LiderDeEquipe extends SetorAdm{
    @Override
        public void aprovar(String tipo, double valor){
            if(tipo == "solicitacaoFerias"){
                System.out.println("Solicitação de Férias aprovada por líder de Equipe");
            }
            if (tipo == "reembolso" && valor < 500) {
                System.out.println("Solicitação de reembolso no valor de R$" + valor + " aprovada por líder de Equipe");
                
            } else{
                if(proximo != null){
                    proximo.aprovar(tipo, valor);

                }
            }
        }
}