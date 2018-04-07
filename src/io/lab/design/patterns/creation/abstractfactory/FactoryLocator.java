package io.lab.design.patterns.creation.abstractfactory;

/**
 * Created by amazimpaka on 2018-04-07
 */
public class FactoryLocator {

    public static Factory locate(int context){

        System.out.println("Locate factory using context[" + context + "]");

        switch (context){
            case 1: return new Factory1();
            case 2: return new Factory2();
            default: throw new IllegalArgumentException(" Invalid context");
        }
    }
}
