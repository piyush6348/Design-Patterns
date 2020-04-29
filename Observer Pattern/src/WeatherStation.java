import java.util.ArrayList;

public class WeatherStation implements ISubject {
    private ArrayList<IObserver> observers;

    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
        notifyObservers();
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        int index = observers.indexOf(observer);
        if(index >= 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.pressure, this.temperature, this.humidity);
        }
    }
}
