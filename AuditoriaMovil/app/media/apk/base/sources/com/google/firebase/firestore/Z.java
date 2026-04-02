package com.google.firebase.firestore;

import B5.AbstractActivityC0032e;
import a1.C0423I;
import a1.InterfaceC0427d;
import a1.InterfaceC0428e;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.MimeTypeMap;
import androidx.recyclerview.widget.RecyclerView;
import c4.InterfaceC0635d;
import c6.AbstractC0671h0;
import c6.m2;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.security.Provider;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
/* loaded from: classes.dex */
public final class Z implements F2.b, L2.a, S3.k, T0.g, W1.d, InterfaceC0427d, InterfaceC0635d, m2, k1.u, g7.a, androidx.lifecycle.W {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9798a;

    public /* synthetic */ Z(int i7) {
        this.f9798a = i7;
    }

    public static String A(String str) {
        if (str == null) {
            return null;
        }
        String[] strArr = {"..", "/"};
        String[] split = str.split("/");
        String str2 = split[split.length - 1];
        for (int i7 = 0; i7 < 2; i7++) {
            str2 = str2.replace(strArr[i7], "_");
        }
        return str2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Q6.e, java.lang.Object] */
    public static Q6.o s(String str, boolean z7) {
        kotlin.jvm.internal.j.e(str, "<this>");
        Q6.g gVar = R6.c.f4785a;
        ?? obj = new Object();
        obj.z(str);
        return R6.c.d(obj, z7);
    }

    public static Q6.o t(File file) {
        String str = Q6.o.f4480b;
        String file2 = file.toString();
        kotlin.jvm.internal.j.d(file2, "toString()");
        return s(file2, false);
    }

    public static T1.e u(i1.h hVar, B5.S s7) {
        int i7;
        IOException iOException = (IOException) s7.f336c;
        if (!(iOException instanceof M0.w) || ((i7 = ((M0.w) iOException).f3207d) != 403 && i7 != 404 && i7 != 410 && i7 != 416 && i7 != 500 && i7 != 503)) {
            return null;
        }
        if (hVar.a(1)) {
            return new T1.e(1, 300000L);
        }
        if (!hVar.a(2)) {
            return null;
        }
        return new T1.e(2, 60000L);
    }

    public static String v(AbstractActivityC0032e abstractActivityC0032e, Uri uri) {
        String fileExtensionFromUrl;
        try {
            if (uri.getScheme().equals("content")) {
                fileExtensionFromUrl = MimeTypeMap.getSingleton().getExtensionFromMimeType(abstractActivityC0032e.getContentResolver().getType(uri));
            } else {
                fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
            }
            if (fileExtensionFromUrl != null && !fileExtensionFromUrl.isEmpty()) {
                return "." + A(fileExtensionFromUrl);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
        r4.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069 A[Catch: all -> 0x007f, TryCatch #6 {IOException | IllegalArgumentException | SecurityException -> 0x00ec, blocks: (B:3:0x0005, B:46:0x00d3, B:4:0x000d, B:13:0x004f, B:24:0x0063, B:26:0x0069, B:31:0x0081, B:38:0x00a4, B:45:0x00d0, B:53:0x00e0, B:52:0x00dd, B:33:0x0088, B:37:0x009a, B:36:0x0096, B:22:0x005f, B:20:0x005c, B:19:0x0059), top: B:69:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5 A[Catch: all -> 0x00d7, LOOP:0: B:41:0x00be->B:43:0x00c5, LOOP_END, TryCatch #3 {all -> 0x00d7, blocks: (B:40:0x00bc, B:41:0x00be, B:43:0x00c5, B:44:0x00c9), top: B:61:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String x(B5.AbstractActivityC0032e r13, android.net.Uri r14) {
        /*
            java.lang.String r0 = "image_picker"
            java.lang.String r1 = "Cannot get file name for "
            r2 = 0
            android.content.ContentResolver r3 = r13.getContentResolver()     // Catch: java.lang.Throwable -> Lec
            java.io.InputStream r3 = r3.openInputStream(r14)     // Catch: java.lang.Throwable -> Lec
            java.util.UUID r4 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7f
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L7f
            java.io.File r6 = r13.getCacheDir()     // Catch: java.lang.Throwable -> L7f
            r5.<init>(r6, r4)     // Catch: java.lang.Throwable -> L7f
            r5.mkdir()     // Catch: java.lang.Throwable -> L7f
            r5.deleteOnExit()     // Catch: java.lang.Throwable -> L7f
            android.content.ContentResolver r7 = r13.getContentResolver()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r4 = "_display_name"
            java.lang.String[] r9 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L7f
            r11 = 0
            r12 = 0
            r10 = 0
            r8 = r14
            android.database.Cursor r4 = r7.query(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L7f
            r6 = 0
            if (r4 == 0) goto L5d
            boolean r7 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto L5d
            int r7 = r4.getColumnCount()     // Catch: java.lang.Throwable -> L53
            r8 = 1
            if (r7 >= r8) goto L47
            goto L5d
        L47:
            java.lang.String r7 = r4.getString(r6)     // Catch: java.lang.Throwable -> L53
            java.lang.String r7 = A(r7)     // Catch: java.lang.Throwable -> L53
            r4.close()     // Catch: java.lang.Throwable -> L7f
            goto L63
        L53:
            r13 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L58
            goto L5c
        L58:
            r14 = move-exception
            r13.addSuppressed(r14)     // Catch: java.lang.Throwable -> L7f
        L5c:
            throw r13     // Catch: java.lang.Throwable -> L7f
        L5d:
            if (r4 == 0) goto L62
            r4.close()     // Catch: java.lang.Throwable -> L7f
        L62:
            r7 = r2
        L63:
            java.lang.String r13 = v(r13, r14)     // Catch: java.lang.Throwable -> L7f
            if (r7 != 0) goto L86
            java.lang.String r4 = "FileUtils"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7f
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L7f
            r7.append(r14)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r14 = r7.toString()     // Catch: java.lang.Throwable -> L7f
            android.util.Log.w(r4, r14)     // Catch: java.lang.Throwable -> L7f
            if (r13 != 0) goto L81
            java.lang.String r13 = ".jpg"
            goto L81
        L7f:
            r13 = move-exception
            goto Le1
        L81:
            java.lang.String r7 = r0.concat(r13)     // Catch: java.lang.Throwable -> L7f
            goto La4
        L86:
            if (r13 == 0) goto La4
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7f
            r14.<init>()     // Catch: java.lang.Throwable -> L7f
            r0 = 46
            int r0 = r7.lastIndexOf(r0)     // Catch: java.lang.Throwable -> L7f
            if (r0 >= 0) goto L96
            goto L9a
        L96:
            java.lang.String r7 = r7.substring(r6, r0)     // Catch: java.lang.Throwable -> L7f
        L9a:
            r14.append(r7)     // Catch: java.lang.Throwable -> L7f
            r14.append(r13)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r7 = r14.toString()     // Catch: java.lang.Throwable -> L7f
        La4:
            java.io.File r13 = new java.io.File     // Catch: java.lang.Throwable -> L7f
            r13.<init>(r5, r7)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r13 = r13.getPath()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r14 = r5.getCanonicalPath()     // Catch: java.lang.Throwable -> L7f
            java.io.File r13 = z(r13, r14)     // Catch: java.lang.Throwable -> L7f
            java.io.FileOutputStream r14 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7f
            r14.<init>(r13)     // Catch: java.lang.Throwable -> L7f
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> Ld7
        Lbe:
            int r1 = r3.read(r0)     // Catch: java.lang.Throwable -> Ld7
            r4 = -1
            if (r1 == r4) goto Lc9
            r14.write(r0, r6, r1)     // Catch: java.lang.Throwable -> Ld7
            goto Lbe
        Lc9:
            r14.flush()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r13 = r13.getPath()     // Catch: java.lang.Throwable -> Ld7
            r14.close()     // Catch: java.lang.Throwable -> L7f
            r3.close()     // Catch: java.lang.Throwable -> Lec
            return r13
        Ld7:
            r13 = move-exception
            r14.close()     // Catch: java.lang.Throwable -> Ldc
            goto Le0
        Ldc:
            r14 = move-exception
            r13.addSuppressed(r14)     // Catch: java.lang.Throwable -> L7f
        Le0:
            throw r13     // Catch: java.lang.Throwable -> L7f
        Le1:
            if (r3 == 0) goto Leb
            r3.close()     // Catch: java.lang.Throwable -> Le7
            goto Leb
        Le7:
            r14 = move-exception
            r13.addSuppressed(r14)     // Catch: java.lang.Throwable -> Lec
        Leb:
            throw r13     // Catch: java.lang.Throwable -> Lec
        Lec:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.Z.x(B5.e, android.net.Uri):java.lang.String");
    }

    public static long y(B5.S s7) {
        Throwable th = (IOException) s7.f336c;
        if (!(th instanceof H0.J) && !(th instanceof FileNotFoundException) && !(th instanceof M0.t) && !(th instanceof i1.m)) {
            int i7 = M0.i.f3158b;
            while (th != null) {
                if (!(th instanceof M0.i) || ((M0.i) th).f3159a != 2008) {
                    th = th.getCause();
                }
            }
            return Math.min((s7.f335b - 1) * PipesIterator.DEFAULT_QUEUE_SIZE, 5000);
        }
        return -9223372036854775807L;
    }

    public static File z(String str, String str2) {
        File file = new File(str);
        if (file.getCanonicalPath().startsWith(str2)) {
            return file;
        }
        throw new IllegalArgumentException("Trying to open path outside of the expected directory. File: " + file.getCanonicalPath() + " was expected to be within directory: " + str2 + ".");
    }

    @Override // g7.a
    public g7.b a(String str) {
        return org.slf4j.helpers.b.f14624a;
    }

    @Override // T0.g
    public /* synthetic */ void b() {
    }

    @Override // androidx.lifecycle.W
    public androidx.lifecycle.U c(Class cls) {
        return new z0.N(true);
    }

    @Override // c4.InterfaceC0635d
    public Object d(M3.q qVar) {
        return new e5.d(qVar.e(e5.h.class));
    }

    @Override // androidx.lifecycle.W
    public /* synthetic */ androidx.lifecycle.U e(kotlin.jvm.internal.e eVar, B0.c cVar) {
        return androidx.datastore.preferences.protobuf.Y.a(this, eVar, cVar);
    }

    public boolean equals(Object obj) {
        switch (this.f9798a) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj != null && Z.class == obj.getClass()) {
                    return true;
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    @Override // T0.g
    public /* synthetic */ T0.f f(T0.d dVar, H0.r rVar) {
        return T0.f.f5290a;
    }

    @Override // S3.k
    public Object g(String str, Provider provider) {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }

    @Override // k6.InterfaceC1408a
    public Object get() {
        e5.b bVar = new e5.b(7);
        HashMap hashMap = new HashMap();
        A2.d dVar = A2.d.DEFAULT;
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            hashMap.put(dVar, new I2.c(30000L, 86400000L, emptySet));
            A2.d dVar2 = A2.d.HIGHEST;
            Set emptySet2 = Collections.emptySet();
            if (emptySet2 != null) {
                hashMap.put(dVar2, new I2.c(1000L, 86400000L, emptySet2));
                A2.d dVar3 = A2.d.VERY_LOW;
                if (Collections.emptySet() != null) {
                    Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(I2.e.NETWORK_UNMETERED, I2.e.DEVICE_IDLE)));
                    if (unmodifiableSet != null) {
                        hashMap.put(dVar3, new I2.c(86400000L, 86400000L, unmodifiableSet));
                        if (hashMap.keySet().size() >= A2.d.values().length) {
                            new HashMap();
                            return new I2.b(bVar, hashMap);
                        }
                        throw new IllegalStateException("Not all priorities have been configured");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
            }
            throw new NullPointerException("Null flags");
        }
        throw new NullPointerException("Null flags");
    }

    @Override // a1.InterfaceC0427d
    public InterfaceC0428e j(int i7) {
        int i8;
        C0423I c0423i = new C0423I();
        C0423I c0423i2 = new C0423I();
        boolean z7 = false;
        try {
            c0423i.f6783a.e(m5.d.h(0));
            int g3 = c0423i.g();
            if (g3 % 2 == 0) {
                z7 = true;
            }
            if (z7) {
                i8 = g3 + 1;
            } else {
                i8 = g3 - 1;
            }
            c0423i2.f6783a.e(m5.d.h(i8));
            if (z7) {
                c0423i.f6784b = c0423i2;
                return c0423i;
            }
            c0423i2.f6784b = c0423i;
            return c0423i2;
        } catch (IOException e7) {
            m5.d.a(c0423i);
            m5.d.a(c0423i2);
            throw e7;
        }
    }

    @Override // T0.g
    public A.m k(T0.d dVar, H0.r rVar) {
        if (rVar.f1890q == null) {
            return null;
        }
        return new A.m(new T0.b(6001, new Exception()), 17);
    }

    @Override // c6.m2
    public Object l() {
        return Executors.newCachedThreadPool(AbstractC0671h0.e("grpc-okhttp-%d"));
    }

    @Override // androidx.lifecycle.W
    public androidx.lifecycle.U n(Class cls, B0.c cVar) {
        return c(cls);
    }

    @Override // L2.a
    public long o() {
        return SystemClock.elapsedRealtime();
    }

    @Override // T0.g
    public int q(H0.r rVar) {
        if (rVar.f1890q != null) {
            return 1;
        }
        return 0;
    }

    @Override // c6.m2
    public void r(Object obj) {
        ((ExecutorService) ((Executor) obj)).shutdown();
    }

    @Override // T0.g
    public /* synthetic */ void release() {
    }

    public String toString() {
        switch (this.f9798a) {
            case 0:
                return "MemoryEagerGcSettings{}";
            default:
                return super.toString();
        }
    }

    public int w(int i7) {
        if (i7 == 7) {
            return 6;
        }
        return 3;
    }

    public Z(RecyclerView recyclerView) {
        this.f9798a = 13;
    }

    @Override // W1.d
    public void N() {
    }

    @Override // k1.u
    public void h() {
    }

    @Override // k1.u
    public void m() {
    }

    @Override // W1.d
    public void i(int i7, Serializable serializable) {
    }

    @Override // T0.g
    public void p(Looper looper, P0.k kVar) {
    }
}
