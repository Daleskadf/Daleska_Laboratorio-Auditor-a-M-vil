package io.flutter.plugins.firebase.storage;

import android.net.Uri;
import android.util.SparseArray;
import com.google.firebase.storage.C;
import com.google.firebase.storage.C0827d;
import com.google.firebase.storage.D;
import java.util.HashMap;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: l  reason: collision with root package name */
    public static final SparseArray f11982l = new SparseArray();

    /* renamed from: a  reason: collision with root package name */
    public final d f11983a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11984b;

    /* renamed from: c  reason: collision with root package name */
    public final com.google.firebase.storage.m f11985c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f11986d;

    /* renamed from: e  reason: collision with root package name */
    public final Uri f11987e;
    public final com.google.firebase.storage.j f;
    public com.google.firebase.storage.v j;

    /* renamed from: g  reason: collision with root package name */
    public final Object f11988g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public final Object f11989h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public final Object f11990i = new Object();

    /* renamed from: k  reason: collision with root package name */
    public Boolean f11991k = Boolean.FALSE;

    public e(d dVar, int i7, com.google.firebase.storage.m mVar, byte[] bArr, Uri uri, com.google.firebase.storage.j jVar) {
        this.f11983a = dVar;
        this.f11984b = i7;
        this.f11985c = mVar;
        this.f11986d = bArr;
        this.f11987e = uri;
        this.f = jVar;
        SparseArray sparseArray = f11982l;
        synchronized (sparseArray) {
            sparseArray.put(i7, this);
        }
    }

    public static void a() {
        synchronized (f11982l) {
            int i7 = 0;
            while (true) {
                try {
                    SparseArray sparseArray = f11982l;
                    if (i7 < sparseArray.size()) {
                        e eVar = (e) sparseArray.valueAt(i7);
                        if (eVar != null) {
                            eVar.b();
                        }
                        i7++;
                    } else {
                        sparseArray.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static e c(int i7) {
        e eVar;
        SparseArray sparseArray = f11982l;
        synchronized (sparseArray) {
            eVar = (e) sparseArray.get(i7);
        }
        return eVar;
    }

    public static HashMap d(Object obj) {
        if (obj instanceof C0827d) {
            C0827d c0827d = (C0827d) obj;
            HashMap hashMap = new HashMap();
            hashMap.put("path", c0827d.f9951b.d().f9930a.getPath());
            boolean isSuccessful = c0827d.f9951b.isSuccessful();
            com.google.firebase.storage.e eVar = c0827d.f9890d;
            if (isSuccessful) {
                hashMap.put("bytesTransferred", Long.valueOf(eVar.f9895p));
            } else {
                hashMap.put("bytesTransferred", Long.valueOf(c0827d.f9889c));
            }
            hashMap.put("totalBytes", Long.valueOf(eVar.f9895p));
            return hashMap;
        }
        C c8 = (C) obj;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("path", c8.f9951b.d().f9930a.getPath());
        hashMap2.put("bytesTransferred", Long.valueOf(c8.f9861c));
        hashMap2.put("totalBytes", Long.valueOf(c8.f9863e.f9872n));
        com.google.firebase.storage.j jVar = c8.f9862d;
        if (jVar != null) {
            hashMap2.put(ExternalParsersConfigReaderMetKeys.METADATA_TAG, c.e(jVar));
        }
        return hashMap2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r1 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r5 = this;
            java.lang.Boolean r0 = r5.f11991k
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.f11991k = r0
            android.util.SparseArray r0 = io.flutter.plugins.firebase.storage.e.f11982l
            monitor-enter(r0)
            com.google.firebase.storage.v r1 = r5.j     // Catch: java.lang.Throwable -> L35
            int r1 = r1.f9959h     // Catch: java.lang.Throwable -> L35
            r1 = r1 & (-465(0xfffffffffffffe2f, float:NaN))
            r2 = 1
            if (r1 == 0) goto L1a
            goto L27
        L1a:
            com.google.firebase.storage.v r1 = r5.j     // Catch: java.lang.Throwable -> L35
            int r1 = r1.f9959h     // Catch: java.lang.Throwable -> L35
            r1 = r1 & 16
            if (r1 == 0) goto L24
            r1 = r2
            goto L25
        L24:
            r1 = 0
        L25:
            if (r1 == 0) goto L37
        L27:
            com.google.firebase.storage.v r1 = r5.j     // Catch: java.lang.Throwable -> L35
            r3 = 256(0x100, float:3.59E-43)
            r4 = 32
            int[] r3 = new int[]{r3, r4}     // Catch: java.lang.Throwable -> L35
            r1.p(r3, r2)     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r1 = move-exception
            goto L62
        L37:
            int r1 = r5.f11984b     // Catch: java.lang.Throwable -> L35
            r0.remove(r1)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r5.f11990i
            monitor-enter(r1)
            java.lang.Object r0 = r5.f11990i     // Catch: java.lang.Throwable -> L5f
            r0.notifyAll()     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r0 = r5.f11988g
            monitor-enter(r0)
            java.lang.Object r1 = r5.f11988g     // Catch: java.lang.Throwable -> L5c
            r1.notifyAll()     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r1 = r5.f11989h
            monitor-enter(r1)
            java.lang.Object r0 = r5.f11989h     // Catch: java.lang.Throwable -> L59
            r0.notifyAll()     // Catch: java.lang.Throwable -> L59
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L59
            return
        L59:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L59
            throw r0
        L5c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5c
            throw r1
        L5f:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5f
            throw r0
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.firebase.storage.e.b():void");
    }

    public final v e(String str) {
        byte[] bArr;
        d dVar = d.BYTES;
        com.google.firebase.storage.m mVar = this.f11985c;
        com.google.firebase.storage.j jVar = this.f;
        d dVar2 = this.f11983a;
        if (dVar2 == dVar && (bArr = this.f11986d) != null) {
            if (jVar == null) {
                D d7 = new D(mVar, (com.google.firebase.storage.j) null, bArr);
                d7.h();
                this.j = d7;
            } else {
                D d8 = new D(mVar, jVar, bArr);
                d8.h();
                this.j = d8;
            }
        } else {
            d dVar3 = d.FILE;
            Uri uri = this.f11987e;
            if (dVar2 == dVar3 && uri != null) {
                if (jVar == null) {
                    D d9 = new D(mVar, (com.google.firebase.storage.j) null, uri);
                    d9.h();
                    this.j = d9;
                } else {
                    D d10 = new D(mVar, jVar, uri);
                    d10.h();
                    this.j = d10;
                }
            } else if (dVar2 == d.DOWNLOAD && uri != null) {
                com.google.firebase.storage.e eVar = new com.google.firebase.storage.e(mVar, uri);
                eVar.h();
                this.j = eVar;
            } else {
                throw new Exception("Unable to start task. Some arguments have no been initialized.");
            }
        }
        return new v(this, mVar.f9931b, this.j, str);
    }
}
