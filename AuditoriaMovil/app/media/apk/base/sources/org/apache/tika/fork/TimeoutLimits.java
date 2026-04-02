package org.apache.tika.fork;
/* loaded from: classes.dex */
class TimeoutLimits {
    private final long parseTimeoutMS;
    private final long pulseMS;
    private final long waitTimeoutMS;

    public TimeoutLimits(long j, long j8, long j9) {
        this.pulseMS = j;
        this.parseTimeoutMS = j8;
        this.waitTimeoutMS = j9;
    }

    public long getParseTimeoutMS() {
        return this.parseTimeoutMS;
    }

    public long getPulseMS() {
        return this.pulseMS;
    }

    public long getWaitTimeoutMS() {
        return this.waitTimeoutMS;
    }
}
