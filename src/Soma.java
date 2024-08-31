public class Soma {
    public  int  somador(int indice, int soma,int k){
        while(k<indice){
            k+=1;
            soma+=k;
        }
        return soma;
    }
}
