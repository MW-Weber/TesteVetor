package vetor;
import java.util.Random;

public class VetorBack {
        int vet[];
        
    /* Construtor */
    public VetorBack(int size){
        vet = new int[size];
    }
    
    /* Preenche o vetor com valores aleatórios*/
    public void randomFill(){
        Random r= new Random();
        for(int i = 0; i < vet.length; i++){
            vet[i] = r.nextInt(1000);
        }
        
    }
    
    /* Implementa o método de ordenação bubbleSort*/
    public void bubbleSort(){
        
    }
    
    /* Converte o vetor para String*/
    public String toString(){
        String s ="";
        for(int i=0;i<vet.length;i++){
            s = s+" "+ String.valueOf(vet[i]);
        }
        return s;
    }
    /* Compara se dois vetores são iguais */
    public boolean equals(int[] v){
        return true;
    }
    
    /* Atribui um valor na posição pos do vetor */
    public void setAt(int pos, int value){
        vet[pos]=value;
    }
    
    /* Retorna o valor na posição pos do vetor. */
    public int valueAt(int pos){
        return vet[pos];
    }
    
    /* Retorna o tamanho do vetor */
    public int length(){
        return vet.length;
    }
    
    /* Concatena dois vetores */
    public VetorBack Concat(VetorBack v){
        return new VetorBack(0);
    }
    

}
