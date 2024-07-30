package decorator;

public class darkroast extends coffeeDecorator{
    public darkroast(coffeeshop decoratedcoffee) {
        super(decoratedcoffee);
    }
    @Override public void prepare(){
        decoratedcoffee.prepare();
        darkroastcoffee(decoratedcoffee);

    }

    private void darkroastcoffee(coffeeshop decoratedcoffee){
        System.out.println("darkroast");
    }
}