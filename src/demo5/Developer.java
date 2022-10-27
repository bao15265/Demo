package demo5;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Developer extends Worker{
    @Override
    public void work() throws ArithmeticException {
        super.work();
    }

    @Override
    public void work(String location) throws NullPointerException {
        super.work(location);
    }
}
