package K0;

import H0.J;
import a1.y;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.google.android.libraries.barhopper.RecognitionOptions;
import d6.C0907d;
import d6.z;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.tika.metadata.ClimateForcast;
import org.apache.tika.metadata.TikaCoreProperties;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: e  reason: collision with root package name */
    public static o f2501e;

    /* renamed from: a  reason: collision with root package name */
    public int f2502a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2503b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2504c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f2505d;

    public o(d6.p pVar, C0907d c0907d) {
        this.f2503b = pVar;
        this.f2504c = c0907d;
        this.f2502a = 65535;
        this.f2505d = new z(this, 0, 65535, null);
    }

    public static void a(int i7, o oVar) {
        synchronized (oVar.f2505d) {
            try {
                if (oVar.f2502a != i7) {
                    oVar.f2502a = i7;
                    Iterator it = ((CopyOnWriteArrayList) oVar.f2504c).iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        i1.f fVar = (i1.f) weakReference.get();
                        if (fVar != null) {
                            fVar.a(i7);
                        } else {
                            ((CopyOnWriteArrayList) oVar.f2504c).remove(weakReference);
                        }
                    }
                }
            } finally {
            }
        }
    }

    public static synchronized o d(Context context) {
        o oVar;
        synchronized (o.class) {
            try {
                if (f2501e == null) {
                    f2501e = new o(context);
                }
                oVar = f2501e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    public void b(boolean z7, z zVar, Q6.e eVar, boolean z8) {
        boolean z9;
        G.i.j(eVar, ClimateForcast.SOURCE);
        int min = Math.min(zVar.f10499c, ((z) zVar.f10502g.f2505d).f10499c);
        Q6.e eVar2 = zVar.f10497a;
        if (eVar2.f4462b > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i7 = (int) eVar.f4462b;
        if (!z9 && min >= i7) {
            zVar.b(i7, eVar, z7);
        } else {
            if (!z9 && min > 0) {
                zVar.b(min, eVar, false);
            }
            eVar2.l(eVar, (int) eVar.f4462b);
            zVar.f = z7 | zVar.f;
        }
        if (z8) {
            try {
                ((C0907d) this.f2504c).flush();
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    public String c(S0.t tVar, Uri uri, int i7) {
        int i8 = this.f2502a;
        if (i8 != 1) {
            if (i8 == 2) {
                String str = (String) this.f2504c;
                String str2 = (String) this.f2503b;
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    String h8 = a1.z.h(i7);
                    Charset charset = y.f6919X;
                    String Y3 = x.Y(messageDigest.digest((x.Y(messageDigest.digest((tVar.f4912b + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + str2 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + tVar.f4913c).getBytes(charset))) + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + str + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + x.Y(messageDigest.digest((h8 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + uri).getBytes(charset)))).getBytes(charset)));
                    String str3 = (String) this.f2505d;
                    if (str3.isEmpty()) {
                        return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", tVar.f4912b, str2, str, uri, Y3);
                    }
                    return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", tVar.f4912b, str2, str, uri, Y3, str3);
                } catch (NoSuchAlgorithmException e7) {
                    throw new J(null, e7, false, 4);
                }
            }
            throw new J(null, new UnsupportedOperationException(), false, 4);
        }
        String encodeToString = Base64.encodeToString((tVar.f4912b + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + tVar.f4913c).getBytes(y.f6919X), 0);
        int i9 = x.f2529a;
        Locale locale = Locale.US;
        return io.flutter.plugins.pathprovider.b.h("Basic ", encodeToString);
    }

    public int e() {
        int i7;
        synchronized (this.f2505d) {
            i7 = this.f2502a;
        }
        return i7;
    }

    public int f() {
        int i7 = this.f2502a;
        if (i7 != 2) {
            if (i7 != 3) {
                return 0;
            }
            return RecognitionOptions.UPC_A;
        }
        return RecognitionOptions.PDF417;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, B5.L] */
    public void g(z zVar, int i7) {
        if (zVar == 0) {
            ((z) this.f2505d).a(i7);
            h();
            return;
        }
        zVar.a(i7);
        ?? obj = new Object();
        zVar.c(Math.min(zVar.f10499c, ((z) zVar.f10502g.f2505d).f10499c), obj);
        if (obj.f327a > 0) {
            try {
                ((C0907d) this.f2504c).flush();
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, B5.L] */
    public void h() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f2503b
            d6.p r0 = (d6.p) r0
            d6.z[] r1 = r0.k()
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.Collections.shuffle(r2)
            java.lang.Object r2 = r13.f2505d
            d6.z r2 = (d6.z) r2
            int r2 = r2.f10499c
            int r3 = r1.length
        L16:
            r4 = 0
            if (r3 <= 0) goto L6a
            if (r2 <= 0) goto L6a
            float r5 = (float) r2
            float r6 = (float) r3
            float r5 = r5 / r6
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            r6 = r4
            r7 = r6
        L26:
            if (r7 >= r3) goto L68
            if (r2 <= 0) goto L68
            r8 = r1[r7]
            int r9 = r8.f10499c
            Q6.e r10 = r8.f10497a
            long r11 = r10.f4462b
            int r11 = (int) r11
            int r9 = java.lang.Math.min(r9, r11)
            int r9 = java.lang.Math.max(r4, r9)
            int r11 = r8.f10500d
            int r9 = r9 - r11
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.min(r2, r9)
            if (r9 <= 0) goto L4e
            int r11 = r8.f10500d
            int r11 = r11 + r9
            r8.f10500d = r11
            int r2 = r2 - r9
        L4e:
            int r9 = r8.f10499c
            long r10 = r10.f4462b
            int r10 = (int) r10
            int r9 = java.lang.Math.min(r9, r10)
            int r9 = java.lang.Math.max(r4, r9)
            int r10 = r8.f10500d
            int r9 = r9 - r10
            if (r9 <= 0) goto L65
            int r9 = r6 + 1
            r1[r6] = r8
            r6 = r9
        L65:
            int r7 = r7 + 1
            goto L26
        L68:
            r3 = r6
            goto L16
        L6a:
            B5.L r1 = new B5.L
            r1.<init>()
            d6.z[] r0 = r0.k()
            int r2 = r0.length
            r3 = r4
        L75:
            if (r3 >= r2) goto L83
            r5 = r0[r3]
            int r6 = r5.f10500d
            r5.c(r6, r1)
            r5.f10500d = r4
            int r3 = r3 + 1
            goto L75
        L83:
            int r0 = r1.f327a
            if (r0 <= 0) goto L96
            java.lang.Object r0 = r13.f2504c     // Catch: java.io.IOException -> L8f
            d6.d r0 = (d6.C0907d) r0     // Catch: java.io.IOException -> L8f
            r0.flush()     // Catch: java.io.IOException -> L8f
            goto L96
        L8f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.o.h():void");
    }

    public o(int i7, String str, String str2, String str3) {
        this.f2502a = i7;
        this.f2503b = str;
        this.f2504c = str2;
        this.f2505d = str3;
    }

    public o(Context context) {
        this.f2503b = new Handler(Looper.getMainLooper());
        this.f2504c = new CopyOnWriteArrayList();
        this.f2505d = new Object();
        this.f2502a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new n(this, 0), intentFilter);
    }

    public o(int i7, String str, int i8, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f2503b = str;
        this.f2502a = i8;
        if (arrayList == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.f2504c = unmodifiableList;
        this.f2505d = bArr;
    }
}
