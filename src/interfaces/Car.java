package interfaces;

public class Car implements Engine, Media, Brake{
    @Override
    public void start() {
        System.out.println("Starting the car");
    }

    @Override
    public void acc() {
        System.out.println("Accelerating the car");
    }

    @Override
    public void stop() {
        System.out.println("Stoping the car");
    }

    @Override
    public void brake() {
        System.out.println("Applying brakes");
    }
}
