package io.lab.design.patterns.creation.abstractfactory;

/**
 * Created by amazimpaka on 2018-04-07
 */
public class Client {

    public static void main(String[] args) {
        // Generate random context
        final int context = random(1,3);

        // Locate factory to be used
        final Factory factory = FactoryLocator.locate(context);

        // Build and test product A
        final ProductA productA = factory.createProductA();
        productA.check();

        // Build and test product B
        final ProductB productB = factory.createProductB();
        productB.execute();

    }



    private static int random(int min, int max) {
        if(min > max){
            throw new IllegalArgumentException(String.format("Invalid range[%s,%s]",min,max));
        }
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }
}
