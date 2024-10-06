interface Transport {
    void deliver();
}

class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by land in a truck.");
    }
}

class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by sea in a ship.");
    }
}

class Drone implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by air using a drone.");
    }
}

abstract class TransportFactory {
    public abstract Transport createTransport();
}

class LandTransportFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

class SeaTransportFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

class AirTransportFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Drone();
    }
}

public class Main {
    public static void main(String[] args) {
        TransportFactory factory = new LandTransportFactory();
        Transport transport = factory.createTransport();
        transport.deliver();
    }
}

