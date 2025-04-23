package task2_traffic_light;

public class RedState implements TrafficLightState {
    public void switchLight(TrafficLight trafficLight) {
        trafficLight.setState(new GreenState());
    }

    public String getColor() {
        return "RED";
    }
}