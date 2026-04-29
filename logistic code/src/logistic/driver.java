package logistic;

class Driver {
    String driverId;
    String name;
    RouteLinkedList<Checkpoint> routeHistory;

    public Driver(String id, String name) {
        this.driverId = id;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    void printSummary() {
        System.out.println("Driver: " + driverId + " – " + name);
        System.out.println("Route Summary:");

        routeHistory.printRoute();

        double distance = routeHistory.computeTotalDistance();
        double penalty = routeHistory.computeTotalPenalty();
        double score = distance - penalty;

        System.out.println("Total Distance: " + distance + " km");
        System.out.println("Total Penalty: " + penalty);
        System.out.println("Route Score: " + score);

        if (routeHistory.checkCritical())
            System.out.println("Critical Route Check: All required checkpoints present");
        else
            System.out.println("Critical Route Check: Missing checkpoints");
    }
}
