package calculadora;


public class Calculadora {
    
    private double result;
    

    public Calculadora() {
    }

    public Calculadora(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    
    
    public double suma(int valor){
        this.result = result + valor;
        return result;
    }
    
    public double resta(int valor){
        this.result = result - valor;
        return result;
    }
    public double mult(int valor){
        this.result= result * valor;
        return result;
    }
    public double div(int valor){
        if(valor==0){
            System.out.println("ERROR! No es posible la división entre cero");
            return 0;
        }else{
            this.result = result / valor;
            return result;
        }
        
    }
    
    public double anterior(int valor, int respAnt){
        switch(respAnt){
            case 1:
                this.result = result - valor;
                break;
            case 2:
                this.result = result + valor;
                break;
            case 3:
                this.result = result / valor;
                break;
            case 4:
                this.result = result * valor;
                break;
        }
        return result;
    }
}
