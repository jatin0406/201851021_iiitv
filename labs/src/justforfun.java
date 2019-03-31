//SAMPKE
import java.util.Scanner;

//building a price predictor ai from scratch in java
public class justforfun{
    public static void main(String[] args){
        int input;
        int output;
        synapse1 syn1=new synapse1();
        synapse2 syn2=new synapse2();
        synapse3 syn3=new synapse3();
        neuron head=new neuron();
        neuron output=new neuron();
        Scanner scan=new Scanner(System.in);
        while(true){
            input=scan.nextInt();
            //we will be dealing with only three layers in this model here
            layer1 lay1=new layer1();
            layer2 lay2=new layer2();
            layer3 lay3=new layer3();
            System.out.println(output.value);

        }
    }
}
class neuron{
    activator active=new activator(this.value);
    int value;
    neuron linkprev=null;
    neuron linkfor=null;
    int weight;
    boolean if_activated=activator.(this.value);
    void value(int x){
        value=x;


    }
}
//creating a synapse handler and three layers of the brain
//synapse1 handles the connection between 1 and second layer
//synapse2 handles the connection between 2 and third layer
//synapse 3 handles the connection between the third layer and output
class synapse1 {
    neuron linkprev=null;
    neuron linkfor=null;
}
class synapse2{
    neuron linkprev=null;
    neuron linkfor=null;
}
class synapse3{
    neuron linkprev=null;
    neuron linkfor=null;
}
class layer1{
    neuron node[]=new neuron[5];
}
class layer2{
    neuron node[]=new neuron[5];
}
class layer3{
    neuron node[]=new neuron[5];
}
class backpropagate extends neuron{

}
//creating a activator for the neuron here
class activator{
    int checker;
    activator(int x){
        this.checker=x;
    }
    boolean if_active(){
     if(checker>1){
         return true;
     }
     else{
         return false;
     }


    }
}