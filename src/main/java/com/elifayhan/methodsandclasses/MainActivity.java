package com.elifayhan.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("on create called");
        testMethod(); //ilk açıldığında çağır dedik.
        System.out.println(math(3,5));
        System.out.println(newMethod("Elif"));
        makeMusicians(); //çağırdık
        makeSimpsons();
    }
    public void makeSimpsons(){
        Simpsons homer= new Simpsons("homer", 50,"nuclear");
        //yazdırmadan önce yaşını değiştirmek istedik.

        System.out.println(homer.getName());
        homer.setName("Homer Simpsons");
        System.out.println(homer.getName());

    }

    public void makeMusicians(){

        Musicians number1 =new Musicians(50,"elif","guitar"); //Musicians sınıfından number1 diye bir nesne oluşturduk.
        System.out.println(number1.age);
    }

    public void testMethod(){
        int x=4+4;
        System.out.println("the value of x:"+x);
    }
    public int math(int a, int b){
        return a+b;
    }
    public String newMethod(String x){
        return x+" is a new method";
    }
    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on resume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on pause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on stop called");
    }
}