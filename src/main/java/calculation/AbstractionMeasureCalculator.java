package calculation;

public class AbstractionMeasureCalculator implements IAbstractionMeasureCalculator {

    @Override
    public double calculate(int interfaceCount, int classesCount) throws CalculatorException {
        if (classesCount == 0) {
            throw new CalculatorException("Unable to divide by 0");
        }

        return (double) interfaceCount / classesCount;
    }
}
