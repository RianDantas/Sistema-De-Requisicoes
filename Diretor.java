class Diretor extends SetorAdm{
    @Override
    public void aprovar(String tipo, double valor){
        
        
        if(tipo == "reembolso" && valor > 1000){
            System.out.println("Solicitação de reembolso no valor de R$" + valor + " aprovada por Diretor");
        }else{
            if(proximo != null){
                proximo.aprovar(tipo, valor);

            }
        }
        if(tipo == "compra" && valor > 1000){
            System.out.println("Solicitação de compra no valor de R$" + valor + " aprovada por Diretor");
        }
    }

    public void aprovarFerias(){
        System.out.println("Férias aprovadas por Diretor");
    } 
}
