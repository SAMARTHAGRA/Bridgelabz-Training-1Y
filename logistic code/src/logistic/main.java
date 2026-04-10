package logistic;

public class main {
    public static void main(String[] args) {

        Driver d = new Driver("D1204", "Kavita Nair");

        d.routeHistory.addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 30, 60, 70));
        d.routeHistory.addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 20, 30, 30));
        d.routeHistory.addCheckpoint(new RestCheckpoint("C3", "Motel X", 10, 40, 45));
        d.routeHistory.addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 60, 80, 95));

        d.printSummary();
    }
}
