package ru.javabegin.training.syntax.var;

public class Advice extends Thought {
    @Override
    public void message() {
        System.out.println("Advice.message");
        super.message();
    }

    public int num(){
        return 12;
    }
}
