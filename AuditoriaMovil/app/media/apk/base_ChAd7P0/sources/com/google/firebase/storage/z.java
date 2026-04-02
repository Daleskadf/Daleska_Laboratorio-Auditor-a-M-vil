package com.google.firebase.storage;

import android.util.Log;
import c1.RunnableC0626c;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class z extends v {

    /* renamed from: l  reason: collision with root package name */
    public m f9970l;

    /* renamed from: m  reason: collision with root package name */
    public B4.e f9971m;

    /* renamed from: n  reason: collision with root package name */
    public volatile Exception f9972n;

    /* renamed from: o  reason: collision with root package name */
    public volatile int f9973o;

    /* renamed from: p  reason: collision with root package name */
    public J2.e f9974p;

    /* renamed from: q  reason: collision with root package name */
    public long f9975q;

    /* renamed from: r  reason: collision with root package name */
    public long f9976r;

    /* renamed from: s  reason: collision with root package name */
    public BufferedInputStream f9977s;

    /* renamed from: t  reason: collision with root package name */
    public C4.a f9978t;

    /* renamed from: u  reason: collision with root package name */
    public String f9979u;

    @Override // com.google.firebase.storage.v
    public final m d() {
        return this.f9970l;
    }

    @Override // com.google.firebase.storage.v
    public final void e() {
        this.f9971m.f287e = true;
        this.f9972n = i.a(Status.f9151Z);
    }

    @Override // com.google.firebase.storage.v
    public final void f() {
        this.f9976r = this.f9975q;
    }

    @Override // com.google.firebase.storage.v
    public final boolean g() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    @Override // com.google.firebase.storage.v
    public final boolean j() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.firebase.storage.x, java.io.InputStream] */
    @Override // com.google.firebase.storage.v
    public final void k() {
        int i7 = 64;
        if (this.f9972n != null) {
            o(64, false);
        } else if (!o(4, false)) {
        } else {
            E0.b bVar = new E0.b(this, 2);
            ?? inputStream = new InputStream();
            inputStream.f9965a = this;
            inputStream.f9967c = bVar;
            this.f9977s = new BufferedInputStream(inputStream);
            try {
                inputStream.b();
                J2.e eVar = this.f9974p;
                if (eVar != null) {
                    try {
                        y yVar = (y) m();
                        eVar.z(this.f9977s);
                    } catch (Exception e7) {
                        Log.w("StreamDownloadTask", "Exception occurred calling doInBackground.", e7);
                        this.f9972n = e7;
                    }
                }
            } catch (IOException e8) {
                Log.d("StreamDownloadTask", "Initial opening of Stream failed", e8);
                this.f9972n = e8;
            }
            if (this.f9977s == null) {
                this.f9978t.o();
                this.f9978t = null;
            }
            if (this.f9972n == null && this.f9959h == 4) {
                o(4, false);
                o(RecognitionOptions.ITF, false);
                return;
            }
            if (this.f9959h == 32) {
                i7 = RecognitionOptions.QR_CODE;
            }
            if (!o(i7, false)) {
                Log.w("StreamDownloadTask", "Unable to change download task to final state from " + this.f9959h);
            }
        }
    }

    @Override // com.google.firebase.storage.v
    public final void l() {
        AbstractC1740d.f15485e.execute(new RunnableC0626c(this, 5));
    }

    @Override // com.google.firebase.storage.v
    public final u n() {
        return new u(this, i.b(this.f9973o, this.f9972n));
    }
}
