package observer;

public interface subject {
    void addsubscriber(observer observer);
    void removesubscriber(observer observer);
    void notifysubscriber();
}
