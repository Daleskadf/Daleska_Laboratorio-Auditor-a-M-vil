package com.google.firebase.storage;

import a.AbstractC0412a;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import b4.InterfaceC0593a;
import c1.RunnableC0626c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.libraries.barhopper.RecognitionOptions;
import f3.C0988a;
import f5.C0993a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class D extends v {

    /* renamed from: D  reason: collision with root package name */
    public static final Random f9864D = new Random();

    /* renamed from: E  reason: collision with root package name */
    public static final C0993a f9865E = new C0993a(1);

    /* renamed from: F  reason: collision with root package name */
    public static final C0988a f9866F = C0988a.f11051a;

    /* renamed from: A  reason: collision with root package name */
    public volatile String f9867A;

    /* renamed from: B  reason: collision with root package name */
    public volatile long f9868B;

    /* renamed from: C  reason: collision with root package name */
    public int f9869C;

    /* renamed from: l  reason: collision with root package name */
    public final m f9870l;

    /* renamed from: m  reason: collision with root package name */
    public final Uri f9871m;

    /* renamed from: n  reason: collision with root package name */
    public final long f9872n;

    /* renamed from: o  reason: collision with root package name */
    public final B4.d f9873o;

    /* renamed from: p  reason: collision with root package name */
    public final AtomicLong f9874p;

    /* renamed from: q  reason: collision with root package name */
    public final InterfaceC0593a f9875q;

    /* renamed from: r  reason: collision with root package name */
    public final Z3.b f9876r;

    /* renamed from: s  reason: collision with root package name */
    public int f9877s;

    /* renamed from: t  reason: collision with root package name */
    public final B4.e f9878t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f9879u;

    /* renamed from: v  reason: collision with root package name */
    public volatile j f9880v;

    /* renamed from: w  reason: collision with root package name */
    public volatile Uri f9881w;

    /* renamed from: x  reason: collision with root package name */
    public volatile Exception f9882x;

    /* renamed from: y  reason: collision with root package name */
    public volatile Exception f9883y;

    /* renamed from: z  reason: collision with root package name */
    public volatile int f9884z;

    public D(m mVar, j jVar, byte[] bArr) {
        this.f9874p = new AtomicLong(0L);
        this.f9877s = 262144;
        this.f9881w = null;
        this.f9882x = null;
        this.f9883y = null;
        this.f9884z = 0;
        this.f9869C = 0;
        I.i(bArr);
        f fVar = mVar.f9931b;
        this.f9872n = bArr.length;
        this.f9870l = mVar;
        this.f9880v = jVar;
        InterfaceC0593a b5 = fVar.b();
        this.f9875q = b5;
        Z3.b a7 = fVar.a();
        this.f9876r = a7;
        this.f9871m = null;
        this.f9873o = new B4.d(new ByteArrayInputStream(bArr));
        this.f9879u = true;
        this.f9868B = 60000L;
        U3.h hVar = fVar.f9900a;
        hVar.a();
        this.f9878t = new B4.e(hVar.f5749a, b5, a7, fVar.f9904e);
    }

    @Override // com.google.firebase.storage.v
    public final m d() {
        return this.f9870l;
    }

    @Override // com.google.firebase.storage.v
    public final void e() {
        C4.f fVar;
        this.f9878t.f287e = true;
        if (this.f9881w != null) {
            fVar = new C4.f(this.f9870l.b(), this.f9870l.f9931b.f9900a, this.f9881w, 0);
        } else {
            fVar = null;
        }
        if (fVar != null) {
            AbstractC1740d.f15483c.execute(new H.h(this, fVar, 13, false));
        }
        this.f9882x = i.a(Status.f9151Z);
    }

    @Override // com.google.firebase.storage.v
    public final void i() {
        this.f9882x = null;
        this.f9883y = null;
        this.f9884z = 0;
        this.f9867A = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    @Override // com.google.firebase.storage.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.storage.D.k():void");
    }

    @Override // com.google.firebase.storage.v
    public final void l() {
        AbstractC1740d.f15484d.execute(new RunnableC0626c(this, 5));
    }

    @Override // com.google.firebase.storage.v
    public final u n() {
        Exception exc;
        if (this.f9882x != null) {
            exc = this.f9882x;
        } else {
            exc = this.f9883y;
        }
        return new C(this, i.b(this.f9884z, exc), this.f9874p.get(), this.f9880v);
    }

    public final boolean q(C4.e eVar) {
        try {
            Log.d("UploadTask", "Waiting " + this.f9869C + " milliseconds");
            f9865E.getClass();
            Thread.sleep((long) (this.f9869C + f9864D.nextInt(250)));
            String r7 = AbstractC0412a.r(this.f9875q);
            String q2 = AbstractC0412a.q(this.f9876r);
            U3.h hVar = this.f9870l.f9931b.f9900a;
            hVar.a();
            eVar.n(hVar.f5749a, r7, q2);
            boolean r8 = r(eVar);
            if (r8) {
                this.f9869C = 0;
            }
            return r8;
        } catch (InterruptedException e7) {
            Log.w("UploadTask", "thread interrupted during exponential backoff.");
            Thread.currentThread().interrupt();
            this.f9883y = e7;
            return false;
        }
    }

    public final boolean r(C4.d dVar) {
        int i7 = dVar.f542e;
        this.f9878t.getClass();
        if (B4.e.a(i7)) {
            i7 = -2;
        }
        this.f9884z = i7;
        this.f9883y = dVar.f538a;
        this.f9867A = dVar.j("X-Goog-Upload-Status");
        int i8 = this.f9884z;
        if ((i8 == 308 || (i8 >= 200 && i8 < 300)) && this.f9883y == null) {
            return true;
        }
        return false;
    }

    public final boolean s(boolean z7) {
        long j;
        C4.f fVar = new C4.f(this.f9870l.b(), this.f9870l.f9931b.f9900a, this.f9881w, 1);
        if ("final".equals(this.f9867A)) {
            return false;
        }
        if (z7) {
            this.f9878t.b(fVar, true);
            if (!r(fVar)) {
                return false;
            }
        } else {
            String r7 = AbstractC0412a.r(this.f9875q);
            String q2 = AbstractC0412a.q(this.f9876r);
            U3.h hVar = this.f9870l.f9931b.f9900a;
            hVar.a();
            fVar.n(hVar.f5749a, r7, q2);
            if (!r(fVar)) {
                return false;
            }
        }
        if ("final".equals(fVar.j("X-Goog-Upload-Status"))) {
            this.f9882x = new IOException("The server has terminated the upload session");
            return false;
        }
        String j8 = fVar.j("X-Goog-Upload-Size-Received");
        if (!TextUtils.isEmpty(j8)) {
            j = Long.parseLong(j8);
        } else {
            j = 0;
        }
        long j9 = this.f9874p.get();
        int i7 = (j9 > j ? 1 : (j9 == j ? 0 : -1));
        if (i7 > 0) {
            this.f9882x = new IOException("Unexpected error. The server lost a chunk update.");
            return false;
        }
        if (i7 < 0) {
            try {
                long j10 = j - j9;
                if (this.f9873o.a((int) j10) != j10) {
                    this.f9882x = new IOException("Unexpected end of stream encountered.");
                    return false;
                } else if (!this.f9874p.compareAndSet(j9, j)) {
                    Log.e("UploadTask", "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen");
                    this.f9882x = new IllegalStateException("uploaded bytes changed unexpectedly.");
                    return false;
                }
            } catch (IOException e7) {
                Log.e("UploadTask", "Unable to recover position in Stream during resumable upload", e7);
                this.f9882x = e7;
                return false;
            }
        }
        return true;
    }

    public final boolean t() {
        if ("final".equals(this.f9867A)) {
            if (this.f9882x == null) {
                this.f9882x = new IOException("The server has terminated the upload session", this.f9883y);
            }
            o(64, false);
            return false;
        }
        return true;
    }

    public final boolean u() {
        boolean z7;
        if (this.f9959h == 128) {
            return false;
        }
        if (Thread.interrupted()) {
            this.f9882x = new InterruptedException();
            o(64, false);
            return false;
        } else if (this.f9959h == 32) {
            o(RecognitionOptions.QR_CODE, false);
            return false;
        } else if (this.f9959h == 8) {
            o(16, false);
            return false;
        } else if (!t()) {
            return false;
        } else {
            if (this.f9881w == null) {
                if (this.f9882x == null) {
                    this.f9882x = new IllegalStateException("Unable to obtain an upload URL.");
                }
                o(64, false);
                return false;
            } else if (this.f9882x != null) {
                o(64, false);
                return false;
            } else {
                if (this.f9883y == null && this.f9884z >= 200 && this.f9884z < 300) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                C0988a c0988a = f9866F;
                c0988a.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime() + this.f9868B;
                c0988a.getClass();
                long elapsedRealtime2 = SystemClock.elapsedRealtime() + this.f9869C;
                if (z7) {
                    if (elapsedRealtime2 <= elapsedRealtime && s(true)) {
                        this.f9869C = Math.max(this.f9869C * 2, (int) PipesIterator.DEFAULT_QUEUE_SIZE);
                    } else {
                        if (t()) {
                            o(64, false);
                        }
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [long] */
    /* JADX WARN: Type inference failed for: r5v9, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public D(com.google.firebase.storage.m r12, com.google.firebase.storage.j r13, android.net.Uri r14) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.storage.D.<init>(com.google.firebase.storage.m, com.google.firebase.storage.j, android.net.Uri):void");
    }
}
