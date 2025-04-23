package task2_traffic_light;

public class GreenState implements TrafficLightState {
    public void switchLight(TrafficLight trafficLight) {
        trafficLight.setState(new YellowState());
    }

    public String getColor() {
        return "GREEN";
    }
}