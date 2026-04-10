package logistic;
class DeliveryCheckpoint extends Checkpoint {

    public DeliveryCheckpoint(String id, String loc, double dist, int expected, int actual) {
        super(id, loc, dist, expected, actual);
    }

    boolean isCritical() {
        return true;
    }

    String getType() {
        return "DeliveryCheckpoint";
    }

    double calculatePenalty() {
        if (!isDelayed()) return 0;
        return (actualDuration - expectedDuration) * 2;
    }
}




