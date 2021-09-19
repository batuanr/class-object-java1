package StopWatch;

public class StopWatch {
    long startTime;
    long endTime;
    StopWatch (){
    }
    private long getStartTime () {
        return this.startTime;
    }
    private long getEndTime () {
        return this.endTime;
    }
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public long getElapsedTime () {
        return getEndTime() - getStartTime();
    }
}
