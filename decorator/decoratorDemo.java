package decorator;

public class decoratorDemo {
    public static void main(String[] args){
        coffeeshop houseblend = new houseblend();

        coffeeshop darkroasthouseblend = new darkroast(new houseblend());

        System.out.println("normal coffee");

        houseblend.prepare();

        System.out.println("special coffee");
        darkroasthouseblend.prepare();

    }
}
