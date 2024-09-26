package inheritance;

import java.util.Random;

public class Action extends Random {

    @Override
    public int nextInt(int bound) {
        return super.nextInt(50) + 50;
    }
}
