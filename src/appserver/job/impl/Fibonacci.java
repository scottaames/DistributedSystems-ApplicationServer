package appserver.job.impl;

import appserver.job.Tool;

/**
 * Class [Fibonacci] Simple POC class that implements the Tool interface
 *
 * @author Scott Ames
 */
public class Fibonacci implements Tool {

    FibonacciHelper helper = null;

    @Override
    public Object go(Object parameters) {

        helper = new FibonacciHelper((int) parameters);
        return helper.getFibonacci();
    }
}
