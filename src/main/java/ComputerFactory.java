public class ComputerFactory {

    public static final Add add = new Add();
    public static final Sub sub = new Sub();

    public static Computer getComputer(String symbol) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return (Computer) Class.forName(symbol).newInstance();
    }
}
