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
        boolean Troca;
        do{
            Troca = false;
            for(int i=0;i<vet.length;i++){
                if(vet[i]>vet[i+1]){
                    int aux = vet[i];
                    vet[i]=vet[i+1];
                    vet[i+1]=aux;
                    Troca=true;
                }
            }
        }while(Troca==true);
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
    public boolean equals(VetorBack v){
        for(int i=0;i<vet.length;i++){
            if(this.valueAt(i)!=v.valueAt(i)){
                return false;
            }
        }
        vet.equals(v);
            return true;
    }
    
    /* Atribui um valor na posição pos do vetor */
    public void setAt(int pos, int value){
        vet[pos]=value;
    }
    
    /* Retorna o valor na posição pos do vetor. */
    public int valueAt(int pos){
        if(pos>=0 && pos<=vet.length){
            return vet[pos];
            }
        return 0;
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
