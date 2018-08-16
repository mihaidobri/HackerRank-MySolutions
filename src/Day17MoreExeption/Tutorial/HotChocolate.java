package Day17MoreExeption.Tutorial;

import java.util.concurrent.TimeUnit;

public class HotChocolate {

    public static final double tooHot = 185;
    public static final double tooCold = 160;


    public static void drinkHotChocolate(double cocoTemp) throws TooHotException, TooColdeException {
        if (cocoTemp >= tooHot) {
            throw new TooHotException();
        } else if (cocoTemp <= tooCold) {
            throw new TooColdeException();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        double curentCocaoTemp = 170;
        boolean wrongtemp = true;

        while (wrongtemp) {
            try {
                drinkHotChocolate(curentCocaoTemp);
                System.out.println("The coco was soo goood");
                wrongtemp = false;

            } catch (TooHotException e1) {
                System.out.println("This is way too hot");
                curentCocaoTemp = curentCocaoTemp - 5;

            } catch (TooColdeException e2) {
                System.out.println("This is fucking cold");
                curentCocaoTemp = curentCocaoTemp + 5;
            }

            TimeUnit.SECONDS.sleep(2);
        }
        System.out.println("******COCO is gone");
    }

}

