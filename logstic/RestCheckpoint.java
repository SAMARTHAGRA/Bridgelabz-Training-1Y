class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String id, String loc, double dist, double exp, double act) {
        super(id, loc, dist, exp, act);
    }

    public boolean isCritical() {
        return false;
    }

    public String getType() {
        return "RestCheckpoint";
    }

    public double calculatePenalty() {
        double delay = actualDuration - expectedDuration;
        if (delay > 30) {
            return delay * 0.5;
        }
        return 0;
    }
}