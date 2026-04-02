package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import c1.RunnableC0626c;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class e extends v {

    /* renamed from: l  reason: collision with root package name */
    public final Uri f9891l;

    /* renamed from: m  reason: collision with root package name */
    public long f9892m;

    /* renamed from: n  reason: collision with root package name */
    public final m f9893n;

    /* renamed from: o  reason: collision with root package name */
    public final B4.e f9894o;

    /* renamed from: p  reason: collision with root package name */
    public long f9895p = -1;

    /* renamed from: q  reason: collision with root package name */
    public String f9896q = null;

    /* renamed from: r  reason: collision with root package name */
    public volatile Exception f9897r = null;

    /* renamed from: s  reason: collision with root package name */
    public long f9898s = 0;

    /* renamed from: t  reason: collision with root package name */
    public int f9899t;

    public e(m mVar, Uri uri) {
        this.f9893n = mVar;
        this.f9891l = uri;
        f fVar = mVar.f9931b;
        U3.h hVar = fVar.f9900a;
        hVar.a();
        this.f9894o = new B4.e(hVar.f5749a, fVar.b(), fVar.a(), fVar.f);
    }

    @Override // com.google.firebase.storage.v
    public final m d() {
        return this.f9893n;
    }

    @Override // com.google.firebase.storage.v
    public final void e() {
        this.f9894o.f287e = true;
        this.f9897r = i.a(Status.f9151Z);
    }

    @Override // com.google.firebase.storage.v
    public final void k() {
        boolean z7;
        String str;
        if (this.f9897r != null) {
            o(64, false);
        } else if (!o(4, false)) {
        } else {
            do {
                this.f9892m = 0L;
                this.f9897r = null;
                this.f9894o.f287e = false;
                C4.a aVar = new C4.a(this.f9893n.b(), this.f9893n.f9931b.f9900a, this.f9898s);
                this.f9894o.b(aVar, false);
                this.f9899t = aVar.f542e;
                Exception exc = aVar.f538a;
                if (exc == null) {
                    exc = this.f9897r;
                }
                this.f9897r = exc;
                int i7 = this.f9899t;
                if ((i7 == 308 || (i7 >= 200 && i7 < 300)) && this.f9897r == null && this.f9959h == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    this.f9895p = aVar.f543g + this.f9898s;
                    String j = aVar.j("ETag");
                    if (!TextUtils.isEmpty(j) && (str = this.f9896q) != null && !str.equals(j)) {
                        Log.w("FileDownloadTask", "The file at the server has changed.  Restarting from the beginning.");
                        this.f9898s = 0L;
                        this.f9896q = null;
                        aVar.o();
                        l();
                        return;
                    }
                    this.f9896q = j;
                    try {
                        z7 = q(aVar);
                    } catch (IOException e7) {
                        Log.e("FileDownloadTask", "Exception occurred during file write.  Aborting.", e7);
                        this.f9897r = e7;
                    }
                }
                aVar.o();
                if (z7 && this.f9897r == null && this.f9959h == 4) {
                    o(RecognitionOptions.ITF, false);
                    return;
                }
                File file = new File(this.f9891l.getPath());
                if (file.exists()) {
                    this.f9898s = file.length();
                } else {
                    this.f9898s = 0L;
                }
                if (this.f9959h == 8) {
                    o(16, false);
                    return;
                } else if (this.f9959h == 32) {
                    if (!o(RecognitionOptions.QR_CODE, false)) {
                        Log.w("FileDownloadTask", "Unable to change download task to final state from " + this.f9959h);
                        return;
                    }
                    return;
                }
            } while (this.f9892m > 0);
            o(64, false);
        }
    }

    @Override // com.google.firebase.storage.v
    public final void l() {
        AbstractC1740d.f15485e.execute(new RunnableC0626c(this, 5));
    }

    @Override // com.google.firebase.storage.v
    public final u n() {
        return new C0827d(this, i.b(this.f9899t, this.f9897r), this.f9892m + this.f9898s);
    }

    public final boolean q(C4.a aVar) {
        FileOutputStream fileOutputStream;
        InputStream inputStream = aVar.f544h;
        if (inputStream != null) {
            File file = new File(this.f9891l.getPath());
            if (!file.exists()) {
                if (this.f9898s <= 0) {
                    if (!file.createNewFile()) {
                        Log.w("FileDownloadTask", "unable to create file:" + file.getAbsolutePath());
                    }
                } else {
                    throw new IOException("The file to download to has been deleted.");
                }
            }
            if (this.f9898s > 0) {
                Log.d("FileDownloadTask", "Resuming download file " + file.getAbsolutePath() + " at " + this.f9898s);
                fileOutputStream = new FileOutputStream(file, true);
            } else {
                fileOutputStream = new FileOutputStream(file);
            }
            try {
                byte[] bArr = new byte[262144];
                boolean z7 = true;
                while (z7) {
                    int i7 = 0;
                    boolean z8 = false;
                    while (i7 != 262144) {
                        try {
                            int read = inputStream.read(bArr, i7, 262144 - i7);
                            if (read == -1) {
                                break;
                            }
                            i7 += read;
                            z8 = true;
                        } catch (IOException e7) {
                            this.f9897r = e7;
                        }
                    }
                    if (!z8) {
                        i7 = -1;
                    }
                    if (i7 == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i7);
                    this.f9892m += i7;
                    if (this.f9897r != null) {
                        Log.d("FileDownloadTask", "Exception occurred during file download. Retrying.", this.f9897r);
                        this.f9897r = null;
                        z7 = false;
                    }
                    if (!o(4, false)) {
                        z7 = false;
                    }
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                inputStream.close();
                return z7;
            } catch (Throwable th) {
                fileOutputStream.flush();
                fileOutputStream.close();
                inputStream.close();
                throw th;
            }
        }
        this.f9897r = new IllegalStateException("Unable to open Firebase Storage stream.");
        return false;
    }
}
