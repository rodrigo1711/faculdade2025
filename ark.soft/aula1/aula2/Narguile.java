public class Narguile{
    
    private String rosh;
    private String tipoCarvao;
    private String essencia;
    private int qtdCarvao;
    
    public Narguile(String rosh,String tipoCarvao, String essencia,
                        int qtdCarvao){
        this.rosh = rosh;
        this.tipoCarvao = tipoCarvao;
        this.essencia = essencia;
        this.qtdCarvao= qtdCarvao;
    }
    
    
    //get e set
    public String getRosh(){
        return this.rosh;
    }
    
    public String getTipoCarvao(){
        return this.tipoCarvao;
    }
    
    public String getEssencia(){
        return this.essencia;
    }
    
    public int getQtdCarvao(){
        return this.qtdCarvao;
    }
    
    public void setRosh(String rosh){
        this.rosh = rosh;
    }
    
    public void setQtdCarvao(int qtdCarvao){
        this.qtdCarvao = qtdCarvao;
    }
    
}
​
