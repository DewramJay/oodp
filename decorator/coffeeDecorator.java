package decorator;

public abstract class coffeeDecorator implements coffeeshop{
    protected coffeeshop decoratedcoffee;

    public coffeeDecorator(coffeeshop decoratedcoffee){
        this.decoratedcoffee = decoratedcoffee;
    }

    @Override
    public void prepare() {
        decoratedcoffee.prepare();
    }
}
