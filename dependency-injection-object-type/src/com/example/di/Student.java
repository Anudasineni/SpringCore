package com.example.di;

public class Student {
   // MathCheat mathcheat=new MathCheat();//Student wants to cheat maths subject which MathCheat class.
    // so we create refernce of Mathcheat class in student.we dont want create a object in a student class.
    // to achieve loose coupling ,injecting objects with the help of setter methods or constructor(bean.xml).
   // so how can we inject the value of "mathcheat" reference from different class.
   private MathCheat mathcheat;
private Science sciencecheat;
    public void setMathcheat(MathCheat mathcheat) {
        this.mathcheat = mathcheat;//here mathcheat is nothing but "new MathCheat()"
    }

    public void setSciencecheat(Science sciencecheat) {
        this.sciencecheat = sciencecheat;
    }

    public void cheating(){
        mathcheat.mathCheat();
        sciencecheat.scienceCheat();
    }
}
