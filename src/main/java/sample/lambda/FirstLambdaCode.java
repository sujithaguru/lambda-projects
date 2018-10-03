package sample.lambda;

public class FirstLambdaCode {

    public void greet( Greeting greeting){

        greeting.perform();

    }

    public static void main(String args[]){
        FirstLambdaCode gr = new FirstLambdaCode();
        SujiGreeting sujiGreeting = new SujiGreeting();
        ManjuGreeting manjuGreeting = new ManjuGreeting();
        gr.greet(sujiGreeting);
        gr.greet(manjuGreeting);

    }

}
