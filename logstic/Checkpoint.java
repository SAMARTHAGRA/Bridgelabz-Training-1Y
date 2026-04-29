public abstract class Checkpoint {
    String checkpointId;
    String locationName;
    double distanceFromLast;
    double expectedDuration;
    double actualDuration;

    public Checkpoint(String checkpointId, String locationName,
                      double distanceFromLast, double expectedDuration, double actualDuration) {
        this.checkpointId = checkpointId;
        this.locationName = locationName;
        this.distanceFromLast = distanceFromLast;
        this.expectedDuration = expectedDuration;
        this.actualDuration = actualDuration;
    }

    public abstract boolean isCritical();
    public abstract String getType();
    public abstract double calculatePenalty();

    public boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    @Override
    public String toString() {
        return getType() + " – " + locationName +
                (isDelayed() ? " – Delayed" : " – On Time") +
                " – Penalty: " + calculatePenalty();
    }
}