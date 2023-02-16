package com.example;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        looper();
    }
    public static void looper(){
        int output = 0;
        while(output < 10){
            System.out.print("output is: ");
            System.out.println(output);
            output++;
        }
    }
}
