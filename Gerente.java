class Gerente extends SetorAdm{
    @Override
    public void aprovar(String tipo, double valor){
        
        if(tipo == "reembolso" && valor < 999){
            System.out.println("Solicitação de reembolso no valor de R$" + valor + " aprovada por Gerente");
        }else{
            if(proximo != null){
                proximo.aprovar(tipo, valor);

            }
        }
        if(tipo == "compra" && valor < 999){
            System.out.println("Solicitação de compra no valor de R$" + valor + " aprovada por Gerente");
        }
    }

    public void aprovarFerias(){
        System.out.println("Férias aprovadas por Gerente");
    } 
}
