package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.loader.content.a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class zze extends a implements SignInConnectionListener {
    private Semaphore zzbg;
    private Set<GoogleApiClient> zzbh;

    public zze(Context context, Set<GoogleApiClient> set) {
        super(context);
        this.zzbg = new Semaphore(0);
        this.zzbh = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.loader.content.a
    /* renamed from: zzf */
    public final Void loadInBackground() {
        int i10 = 0;
        for (GoogleApiClient googleApiClient : this.zzbh) {
            if (googleApiClient.maybeSignIn(this)) {
                i10++;
            }
        }
        try {
            this.zzbg.tryAcquire(i10, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.zzbg.release();
    }

    @Override // androidx.loader.content.b
    public final void onStartLoading() {
        this.zzbg.drainPermits();
        forceLoad();
    }
}
