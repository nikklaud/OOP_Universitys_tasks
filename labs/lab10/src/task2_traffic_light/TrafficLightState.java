package task2_traffic_light;

public interface TrafficLightState {
    void switchLight(TrafficLight trafficLight);
    String getColor();
}