package logistic;

class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String id, String loc, double dist, int expected, int actual) {
        super(id, loc, dist, expected, actual);
    }

    boolean isCritical() {
        return false;
    }

    String getType() {
        return "RestCheckpoint";
    }

    double calculatePenalty() {
        int delay = actualDuration - expectedDuration;
        if (delay > 30) {
            return delay * 0.5;
        }
        return 0;
    }
}
