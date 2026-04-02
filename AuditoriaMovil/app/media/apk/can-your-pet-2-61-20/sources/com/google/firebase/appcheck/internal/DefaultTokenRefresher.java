package com.google.firebase.appcheck.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public class DefaultTokenRefresher {
    static final long INITIAL_DELAY_SECONDS = 30;
    static final long MAX_DELAY_SECONDS = 960;
    private static final long UNSET_DELAY = -1;
    private volatile long delayAfterFailureSeconds = -1;
    private final DefaultFirebaseAppCheck firebaseAppCheck;
    private final Executor liteExecutor;
    private volatile ScheduledFuture<?> refreshFuture;
    private final ScheduledExecutorService scheduledExecutorService;

    public DefaultTokenRefresher(DefaultFirebaseAppCheck defaultFirebaseAppCheck, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.firebaseAppCheck = (DefaultFirebaseAppCheck) Preconditions.checkNotNull(defaultFirebaseAppCheck);
        this.liteExecutor = executor;
        this.scheduledExecutorService = scheduledExecutorService;
    }

    public void scheduleRefresh(long j) {
        cancel();
        this.delayAfterFailureSeconds = -1L;
        this.refreshFuture = this.scheduledExecutorService.schedule(new DefaultTokenRefresher$$ExternalSyntheticLambda0(this), Math.max(0L, j), TimeUnit.MILLISECONDS);
    }

    private void scheduleRefreshAfterFailure() {
        cancel();
        this.delayAfterFailureSeconds = getNextRefreshMillis();
        this.refreshFuture = this.scheduledExecutorService.schedule(new DefaultTokenRefresher$$ExternalSyntheticLambda0(this), this.delayAfterFailureSeconds, TimeUnit.SECONDS);
    }

    private long getNextRefreshMillis() {
        return this.delayAfterFailureSeconds == -1 ? INITIAL_DELAY_SECONDS : this.delayAfterFailureSeconds * 2 < MAX_DELAY_SECONDS ? this.delayAfterFailureSeconds * 2 : MAX_DELAY_SECONDS;
    }

    public void onRefresh() {
        this.firebaseAppCheck.fetchTokenFromProvider().addOnFailureListener(this.liteExecutor, new OnFailureListener() { // from class: com.google.firebase.appcheck.internal.DefaultTokenRefresher$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                DefaultTokenRefresher.this.m381x3c9cb14f(exc);
            }
        });
    }

    /* renamed from: lambda$onRefresh$0$com-google-firebase-appcheck-internal-DefaultTokenRefresher */
    public /* synthetic */ void m381x3c9cb14f(Exception exc) {
        scheduleRefreshAfterFailure();
    }

    public void cancel() {
        if (this.refreshFuture == null || this.refreshFuture.isDone()) {
            return;
        }
        this.refreshFuture.cancel(false);
    }
}
