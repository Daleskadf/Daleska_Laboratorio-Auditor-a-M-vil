package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0757f;
import com.google.android.gms.common.internal.C0761j;
import com.google.android.gms.common.internal.C0770t;
import com.google.android.gms.common.internal.C0772v;
import com.google.android.gms.common.internal.C0773w;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
/* loaded from: classes.dex */
public final class L implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final C0735i f9189a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9190b;

    /* renamed from: c  reason: collision with root package name */
    public final C0728b f9191c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9192d;

    /* renamed from: e  reason: collision with root package name */
    public final long f9193e;

    public L(C0735i c0735i, int i7, C0728b c0728b, long j, long j8) {
        this.f9189a = c0735i;
        this.f9190b = i7;
        this.f9191c = c0728b;
        this.f9192d = j;
        this.f9193e = j8;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.common.internal.C0761j a(com.google.android.gms.common.api.internal.G r4, com.google.android.gms.common.internal.AbstractC0757f r5, int r6) {
        /*
            com.google.android.gms.common.internal.j r5 = r5.getTelemetryConfiguration()
            r0 = 0
            if (r5 == 0) goto L32
            boolean r1 = r5.f9361b
            if (r1 == 0) goto L32
            r1 = 0
            int[] r2 = r5.f9363d
            if (r2 != 0) goto L20
            int[] r2 = r5.f
            if (r2 != 0) goto L15
            goto L27
        L15:
            int r3 = r2.length
            if (r1 >= r3) goto L27
            r3 = r2[r1]
            if (r3 != r6) goto L1d
            goto L32
        L1d:
            int r1 = r1 + 1
            goto L15
        L20:
            int r3 = r2.length
            if (r1 >= r3) goto L32
            r3 = r2[r1]
            if (r3 != r6) goto L2f
        L27:
            int r4 = r4.f9184n
            int r6 = r5.f9364e
            if (r4 >= r6) goto L2e
            return r5
        L2e:
            return r0
        L2f:
            int r1 = r1 + 1
            goto L20
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.L.a(com.google.android.gms.common.api.internal.G, com.google.android.gms.common.internal.f, int):com.google.android.gms.common.internal.j");
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        G g3;
        boolean z7;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        long j;
        long j8;
        C0735i c0735i = this.f9189a;
        if (c0735i.c()) {
            C0773w c0773w = (C0773w) C0772v.b().f9399a;
            if ((c0773w == null || c0773w.f9401b) && (g3 = (G) c0735i.f9260e0.get(this.f9191c)) != null) {
                com.google.android.gms.common.api.g gVar = g3.f9176b;
                if (gVar instanceof AbstractC0757f) {
                    AbstractC0757f abstractC0757f = (AbstractC0757f) gVar;
                    long j9 = this.f9192d;
                    int i14 = (j9 > 0L ? 1 : (j9 == 0L ? 0 : -1));
                    boolean z8 = true;
                    if (i14 > 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    int gCoreServiceId = abstractC0757f.getGCoreServiceId();
                    if (c0773w != null) {
                        z7 &= c0773w.f9402c;
                        boolean hasConnectionInfo = abstractC0757f.hasConnectionInfo();
                        i7 = c0773w.f9403d;
                        int i15 = c0773w.f9400a;
                        if (hasConnectionInfo && !abstractC0757f.isConnecting()) {
                            C0761j a7 = a(g3, abstractC0757f, this.f9190b);
                            if (a7 != null) {
                                if (!a7.f9362c || i14 <= 0) {
                                    z8 = false;
                                }
                                i9 = a7.f9364e;
                                i8 = i15;
                                z7 = z8;
                            } else {
                                return;
                            }
                        } else {
                            i9 = c0773w.f9404e;
                            i8 = i15;
                        }
                    } else {
                        i7 = 5000;
                        i8 = 0;
                        i9 = 100;
                    }
                    int i16 = i7;
                    if (task.isSuccessful()) {
                        i11 = 0;
                        i12 = 0;
                    } else if (task.isCanceled()) {
                        i11 = -1;
                        i12 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof com.google.android.gms.common.api.j) {
                            Status status = ((com.google.android.gms.common.api.j) exception).getStatus();
                            i10 = status.f9153a;
                            W2.b bVar = status.f9156d;
                            if (bVar != null) {
                                i11 = bVar.f6160b;
                                i12 = i10;
                            }
                        } else {
                            i10 = 101;
                        }
                        i11 = -1;
                        i12 = i10;
                    }
                    if (z7) {
                        long currentTimeMillis = System.currentTimeMillis();
                        i13 = (int) (SystemClock.elapsedRealtime() - this.f9193e);
                        j = j9;
                        j8 = currentTimeMillis;
                    } else {
                        i13 = -1;
                        j = 0;
                        j8 = 0;
                    }
                    M m7 = new M(new C0770t(this.f9190b, i12, i11, j, j8, null, null, gCoreServiceId, i13), i8, i16, i9);
                    zau zauVar = c0735i.f9264i0;
                    zauVar.sendMessage(zauVar.obtainMessage(18, m7));
                }
            }
        }
    }
}
