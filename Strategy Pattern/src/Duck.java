import Fly.IFlyBehaviour;
import Quack.IQuackBehaviour;

public abstract class Duck {
    private IFlyBehaviour flyBehaviour;
    private IQuackBehaviour quackBehaviour;

    public Duck() { }

    public void setFlyBehaviour(IFlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(IQuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void performQuack() {
        this.quackBehaviour.quack();
    }

    public void performFly() {
        this.flyBehaviour.fly();
    }

    public void swim() {
        // Every type of Duck can swim
    }

    public abstract void display();
}
