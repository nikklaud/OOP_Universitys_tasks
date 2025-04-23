package task2_traffic_light;

public class SimpleTrafficLight extends TrafficLight {
    public SimpleTrafficLight() {
        this.state = new RedState();
    }
}