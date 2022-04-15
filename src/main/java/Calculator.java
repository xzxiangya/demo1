public class Calculator {
    public int compute(int num1, int num2, String symbol) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Computer computer = ComputerFactory.getComputer(symbol);
        return computer.compute(num1,num2);
    }
}
