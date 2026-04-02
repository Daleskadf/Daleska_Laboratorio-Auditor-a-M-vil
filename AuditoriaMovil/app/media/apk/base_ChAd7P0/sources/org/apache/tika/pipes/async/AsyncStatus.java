package org.apache.tika.pipes.async;

import j$.time.Instant;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.pipes.PipesResult;
import org.apache.tika.pipes.pipesiterator.TotalCountResult;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public class AsyncStatus {
    private Instant lastUpdate;
    private final Instant started;
    private TotalCountResult totalCountResult = new TotalCountResult(0, TotalCountResult.STATUS.NOT_COMPLETED);
    private Map<PipesResult.STATUS, Long> statusCounts = new HashMap();
    private ASYNC_STATUS asyncStatus = ASYNC_STATUS.STARTED;
    private String crashMessage = StringUtils.EMPTY;

    /* loaded from: classes.dex */
    public enum ASYNC_STATUS {
        STARTED,
        COMPLETED,
        CRASHED
    }

    public AsyncStatus() {
        Instant now = Instant.now();
        this.started = now;
        this.lastUpdate = now;
    }

    public ASYNC_STATUS getAsyncStatus() {
        return this.asyncStatus;
    }

    public String getCrashMessage() {
        return this.crashMessage;
    }

    public Instant getLastUpdate() {
        return this.lastUpdate;
    }

    public Instant getStarted() {
        return this.started;
    }

    public Map<PipesResult.STATUS, Long> getStatusCounts() {
        return this.statusCounts;
    }

    public TotalCountResult getTotalCountResult() {
        return this.totalCountResult;
    }

    public String toString() {
        Instant instant = this.started;
        Instant instant2 = this.lastUpdate;
        TotalCountResult totalCountResult = this.totalCountResult;
        Map<PipesResult.STATUS, Long> map = this.statusCounts;
        ASYNC_STATUS async_status = this.asyncStatus;
        String str = this.crashMessage;
        return "AsyncStatus{started=" + instant + ", lastUpdate=" + instant2 + ", totalCountResult=" + totalCountResult + ", statusCounts=" + map + ", asyncStatus=" + async_status + ", crashMessage='" + str + "'}";
    }

    public synchronized void update(Map<PipesResult.STATUS, Long> map, TotalCountResult totalCountResult, ASYNC_STATUS async_status) {
        this.lastUpdate = Instant.now();
        this.statusCounts = map;
        this.totalCountResult = totalCountResult;
        this.asyncStatus = async_status;
    }

    public void updateCrash(String str) {
        this.crashMessage = str;
    }
}
