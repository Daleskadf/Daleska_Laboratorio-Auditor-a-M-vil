package h3;

import A.m;
import C3.e;
import C5.i;
import D.AbstractC0055e;
import D.AbstractC0059i;
import F3.o;
import H4.e1;
import H4.p1;
import X5.C0392s;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.net.http.SslCertificate;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Range;
import android.view.Surface;
import androidx.camera.core.impl.C0501c;
import androidx.camera.core.impl.C0505g;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.InterfaceC0515q;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.Z;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.protobuf.N0;
import g0.c;
import h0.AbstractC1057q;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j3.f;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.j;
import n6.C1536b;
import n6.g;
import n6.h;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.utils.XMLReaderUtils;
import v0.C1880b;
/* renamed from: h3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1079a {

    /* renamed from: a  reason: collision with root package name */
    public static Context f11332a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f11333b;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f11334c;

    public static void a(CaptureRequest.Builder builder, Z z7) {
        m j02 = i.k0(z7).j0();
        for (C0501c c0501c : j02.u().H()) {
            CaptureRequest.Key key = c0501c.f7608c;
            try {
                builder.set(key, j02.u().G(c0501c));
            } catch (IllegalArgumentException unused) {
                org.slf4j.helpers.i.t("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static void b(CaptureRequest.Builder builder, int i7, A.a aVar) {
        Map emptyMap;
        if (i7 == 3 && aVar.f0a) {
            HashMap hashMap = new HashMap();
            hashMap.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            emptyMap = DesugarCollections.unmodifiableMap(hashMap);
        } else {
            if (i7 == 4) {
                if (aVar.f1b) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                    emptyMap = DesugarCollections.unmodifiableMap(hashMap2);
                }
            } else {
                aVar.getClass();
            }
            emptyMap = Collections.emptyMap();
        }
        for (Map.Entry entry : emptyMap.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    public static CaptureRequest c(E e7, CameraDevice cameraDevice, HashMap hashMap, boolean z7, A.a aVar) {
        CaptureRequest.Builder createCaptureRequest;
        int i7;
        InterfaceC0515q interfaceC0515q;
        if (cameraDevice == null) {
            return null;
        }
        List<J> unmodifiableList = DesugarCollections.unmodifiableList(e7.f7535a);
        ArrayList arrayList = new ArrayList();
        for (J j : unmodifiableList) {
            Surface surface = (Surface) hashMap.get(j);
            if (surface != null) {
                arrayList.add(surface);
            } else {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int i8 = e7.f7537c;
        if (i8 == 5 && (interfaceC0515q = e7.f7540g) != null && (interfaceC0515q.m() instanceof TotalCaptureResult)) {
            org.slf4j.helpers.i.l("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            createCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) interfaceC0515q.m());
        } else {
            org.slf4j.helpers.i.l("Camera2CaptureRequestBuilder", "createCaptureRequest");
            if (i8 == 5) {
                if (z7) {
                    i7 = 1;
                } else {
                    i7 = 2;
                }
                createCaptureRequest = cameraDevice.createCaptureRequest(i7);
            } else {
                createCaptureRequest = cameraDevice.createCaptureRequest(i8);
            }
        }
        b(createCaptureRequest, i8, aVar);
        C0501c c0501c = E.j;
        Object obj = C0505g.f;
        Z z8 = e7.f7536b;
        try {
            obj = z8.G(c0501c);
        } catch (IllegalArgumentException unused) {
        }
        Range range = (Range) obj;
        Objects.requireNonNull(range);
        Object obj2 = C0505g.f;
        if (!range.equals(obj2)) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            try {
                obj2 = z8.G(E.j);
            } catch (IllegalArgumentException unused2) {
            }
            Range range2 = (Range) obj2;
            Objects.requireNonNull(range2);
            createCaptureRequest.set(key, range2);
        }
        if (e7.a() != 1 && e7.b() != 1) {
            if (e7.a() == 2) {
                createCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
            } else if (e7.b() == 2) {
                createCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
            }
        } else {
            createCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        }
        C0501c c0501c2 = E.f7533h;
        TreeMap treeMap = z8.f7596a;
        if (treeMap.containsKey(c0501c2)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) z8.G(c0501c2));
        }
        C0501c c0501c3 = E.f7534i;
        if (treeMap.containsKey(c0501c3)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) z8.G(c0501c3)).byteValue()));
        }
        a(createCaptureRequest, z8);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            createCaptureRequest.addTarget((Surface) it.next());
        }
        createCaptureRequest.setTag(e7.f);
        return createCaptureRequest.build();
    }

    public static CaptureRequest d(E e7, CameraDevice cameraDevice, A.a aVar) {
        if (cameraDevice == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("template type = ");
        int i7 = e7.f7537c;
        sb.append(i7);
        org.slf4j.helpers.i.l("Camera2CaptureRequestBuilder", sb.toString());
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(i7);
        b(createCaptureRequest, i7, aVar);
        a(createCaptureRequest, e7.f7536b);
        return createCaptureRequest.build();
    }

    public static void e() {
        boolean z7;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z7 = true;
        } else {
            z7 = false;
        }
        c.g("Not in application's main thread", z7);
    }

    public static long f(long j, long j8) {
        boolean z7;
        long j9 = j + j8;
        boolean z8 = false;
        if ((j ^ j8) < 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if ((j ^ j9) >= 0) {
            z8 = true;
        }
        if (z7 | z8) {
            return j9;
        }
        StringBuilder sb = new StringBuilder("overflow: checkedAdd(");
        sb.append(j);
        sb.append(", ");
        throw new ArithmeticException(AbstractC0059i.C(sb, j8, ")"));
    }

    public static long g(long j, long j8, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j9 = j / j8;
        long j10 = j - (j8 * j9);
        int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i7 == 0) {
            return j9;
        }
        int i8 = ((int) ((j ^ j8) >> 63)) | 1;
        switch (e.f532a[roundingMode.ordinal()]) {
            case 1:
                if (i7 == 0) {
                    return j9;
                }
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return j9;
            case 3:
                if (i8 >= 0) {
                    return j9;
                }
                break;
            case 4:
                break;
            case 5:
                if (i8 <= 0) {
                    return j9;
                }
                break;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j10);
                int i9 = ((abs - (Math.abs(j8) - abs)) > 0L ? 1 : ((abs - (Math.abs(j8) - abs)) == 0L ? 0 : -1));
                if (i9 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j9) == 0)) {
                        return j9;
                    }
                } else if (i9 <= 0) {
                    return j9;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j9 + i8;
    }

    public static long h(long j, long j8) {
        f.b("a", j);
        f.b("b", j8);
        if (j == 0) {
            return j8;
        }
        if (j8 == 0) {
            return j;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j9 = j >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j8);
        long j10 = j8 >> numberOfTrailingZeros2;
        while (j9 != j10) {
            long j11 = j9 - j10;
            long j12 = (j11 >> 63) & j11;
            long j13 = (j11 - j12) - j12;
            j10 += j12;
            j9 = j13 >> Long.numberOfTrailingZeros(j13);
        }
        return j9 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:298:0x050b, code lost:
        if ("gta8wifi".equalsIgnoreCase(r3) == false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0569, code lost:
        if ("Spreadtrum".equalsIgnoreCase(r8) == false) goto L213;
     */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x05b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static A.m i(x.j r14) {
        /*
            Method dump skipped, instructions count: 1512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.AbstractC1079a.i(x.j):A.m");
    }

    public static g j(g gVar, h key) {
        j.e(key, "key");
        if (!j.a(gVar.getKey(), key)) {
            return null;
        }
        return gVar;
    }

    public static String k(int i7) {
        ArrayList arrayList = new ArrayList();
        if ((i7 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i7 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i7 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "|");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 >= 2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int l(io.flutter.plugins.imagepicker.p r5) {
        /*
            java.lang.Long r5 = r5.f12376c
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L9
            goto L14
        L9:
            r1 = 30
            if (r0 < r1) goto L19
            int r0 = B5.AbstractC0047u.C()
            r1 = 2
            if (r0 < r1) goto L19
        L14:
            int r0 = B5.AbstractC0029b.a()
            goto L1c
        L19:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L1c:
            if (r5 == 0) goto L39
            long r1 = r5.longValue()
            long r3 = (long) r0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L39
            long r0 = r5.longValue()
            int r5 = (int) r0
            long r2 = (long) r5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L33
            r0 = r5
            goto L39
        L33:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            r5.<init>()
            throw r5
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.AbstractC1079a.l(io.flutter.plugins.imagepicker.p):int");
    }

    public static N0 m(p1 p1Var) {
        return p1Var.N().A("__local_write_time__").Q();
    }

    public static p1 n(p1 p1Var) {
        p1 z7 = p1Var.N().z("__previous_value__");
        if (o(z7)) {
            return n(z7);
        }
        return z7;
    }

    public static boolean o(p1 p1Var) {
        p1 z7;
        if (p1Var == null) {
            z7 = null;
        } else {
            z7 = p1Var.N().z("__type__");
        }
        if (z7 != null && "server_timestamp".equals(z7.P())) {
            return true;
        }
        return false;
    }

    public static n6.i p(g gVar, h key) {
        j.e(key, "key");
        if (j.a(gVar.getKey(), key)) {
            return n6.j.f14394a;
        }
        return gVar;
    }

    public static n6.i q(g gVar, n6.i context) {
        j.e(context, "context");
        if (context != n6.j.f14394a) {
            return (n6.i) context.fold(gVar, C1536b.f14389c);
        }
        return gVar;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [v0.b, h0.q] */
    public static C1880b r(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i7 = duplicate.getShort() & 65535;
        if (i7 <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i8 = 0;
            while (true) {
                if (i8 < i7) {
                    int i9 = duplicate.getInt();
                    duplicate.position(duplicate.position() + 4);
                    j = duplicate.getInt() & 4294967295L;
                    duplicate.position(duplicate.position() + 4);
                    if (1835365473 == i9) {
                        break;
                    }
                    i8++;
                } else {
                    j = -1;
                    break;
                }
            }
            if (j != -1) {
                duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j8 = duplicate.getInt() & 4294967295L;
                for (int i10 = 0; i10 < j8; i10++) {
                    int i11 = duplicate.getInt();
                    long j9 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i11 || 1701669481 == i11) {
                        duplicate.position((int) (j9 + j));
                        ?? abstractC1057q = new AbstractC1057q();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        abstractC1057q.f11209d = duplicate;
                        abstractC1057q.f11206a = position;
                        int i12 = position - duplicate.getInt(position);
                        abstractC1057q.f11207b = i12;
                        abstractC1057q.f11208c = ((ByteBuffer) abstractC1057q.f11209d).getShort(i12);
                        return abstractC1057q;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static void s(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            c.g("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }

    public static long t(long j, long j8) {
        boolean z7;
        boolean z8;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j8) + Long.numberOfLeadingZeros(j8) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j8;
        }
        long j9 = ((j ^ j8) >>> 63) + Long.MAX_VALUE;
        boolean z9 = false;
        if (numberOfLeadingZeros < 64) {
            z7 = true;
        } else {
            z7 = false;
        }
        int i7 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i7 < 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (j8 == Long.MIN_VALUE) {
            z9 = true;
        }
        if (z7 | (z9 & z8)) {
            return j9;
        }
        long j10 = j * j8;
        if (i7 != 0 && j10 / j != j8) {
            return j9;
        }
        return j10;
    }

    public static void w(Drawable drawable, int i7) {
        drawable.setTint(i7);
    }

    public static void x(L5.f binaryMessenger, final C0392s c0392s) {
        Object obj;
        o oVar;
        j.e(binaryMessenger, "binaryMessenger");
        if (c0392s != null && (oVar = c0392s.f6530a) != null) {
            obj = oVar.j();
        } else {
            obj = new Object();
        }
        E.e eVar = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getCName", obj, null, 4);
        if (c0392s != null) {
            eVar.h0(new L5.b() { // from class: X5.I
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                c0392s2.getClass();
                                E4 = G.i.A(dName.getCName());
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                c0392s3.getClass();
                                E7 = G.i.A(dName2.getDName());
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                c0392s4.getClass();
                                E8 = G.i.A(dName3.getOName());
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        default:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                c0392s5.getClass();
                                E9 = G.i.A(dName4.getUName());
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                    }
                }
            });
        } else {
            eVar.h0(null);
        }
        E.e eVar2 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getDName", obj, null, 4);
        if (c0392s != null) {
            eVar2.h0(new L5.b() { // from class: X5.I
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                c0392s2.getClass();
                                E4 = G.i.A(dName.getCName());
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                c0392s3.getClass();
                                E7 = G.i.A(dName2.getDName());
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                c0392s4.getClass();
                                E8 = G.i.A(dName3.getOName());
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        default:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                c0392s5.getClass();
                                E9 = G.i.A(dName4.getUName());
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                    }
                }
            });
        } else {
            eVar2.h0(null);
        }
        E.e eVar3 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getOName", obj, null, 4);
        if (c0392s != null) {
            eVar3.h0(new L5.b() { // from class: X5.I
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                c0392s2.getClass();
                                E4 = G.i.A(dName.getCName());
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                c0392s3.getClass();
                                E7 = G.i.A(dName2.getDName());
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                c0392s4.getClass();
                                E8 = G.i.A(dName3.getOName());
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        default:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                c0392s5.getClass();
                                E9 = G.i.A(dName4.getUName());
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                    }
                }
            });
        } else {
            eVar3.h0(null);
        }
        E.e eVar4 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getUName", obj, null, 4);
        if (c0392s != null) {
            eVar4.h0(new L5.b() { // from class: X5.I
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                c0392s2.getClass();
                                E4 = G.i.A(dName.getCName());
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                c0392s3.getClass();
                                E7 = G.i.A(dName2.getDName());
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                c0392s4.getClass();
                                E8 = G.i.A(dName3.getOName());
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        default:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                c0392s5.getClass();
                                E9 = G.i.A(dName4.getUName());
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                    }
                }
            });
        } else {
            eVar4.h0(null);
        }
    }

    public static Status y(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499, null, null, null);
        }
        String[] split = str.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, 2);
        split[0] = split[0].trim();
        if (split.length > 1 && (str2 = split[1]) != null) {
            split[1] = str2.trim();
        }
        List asList = Arrays.asList(split);
        if (asList.size() > 1) {
            return z((String) asList.get(0), (String) asList.get(1));
        }
        return z((String) asList.get(0), null);
    }

    public static Status z(String str, String str2) {
        int i7;
        str.getClass();
        char c8 = 65535;
        switch (str.hashCode()) {
            case -2130504259:
                if (str.equals("USER_CANCELLED")) {
                    c8 = 0;
                    break;
                }
                break;
            case -2065866930:
                if (str.equals("INVALID_RECIPIENT_EMAIL")) {
                    c8 = 1;
                    break;
                }
                break;
            case -2014808264:
                if (str.equals("WEB_CONTEXT_ALREADY_PRESENTED")) {
                    c8 = 2;
                    break;
                }
                break;
            case -2005236790:
                if (str.equals("INTERNAL_SUCCESS_SIGN_OUT")) {
                    c8 = 3;
                    break;
                }
                break;
            case -2001169389:
                if (str.equals("INVALID_IDP_RESPONSE")) {
                    c8 = 4;
                    break;
                }
                break;
            case -1944433728:
                if (str.equals("DYNAMIC_LINK_NOT_ACTIVATED")) {
                    c8 = 5;
                    break;
                }
                break;
            case -1800638118:
                if (str.equals("QUOTA_EXCEEDED")) {
                    c8 = 6;
                    break;
                }
                break;
            case -1774756919:
                if (str.equals("WEB_NETWORK_REQUEST_FAILED")) {
                    c8 = 7;
                    break;
                }
                break;
            case -1699246888:
                if (str.equals("INVALID_RECAPTCHA_VERSION")) {
                    c8 = '\b';
                    break;
                }
                break;
            case -1603818979:
                if (str.equals("RECAPTCHA_NOT_ENABLED")) {
                    c8 = '\t';
                    break;
                }
                break;
            case -1587614300:
                if (str.equals("EXPIRED_OOB_CODE")) {
                    c8 = '\n';
                    break;
                }
                break;
            case -1584641425:
                if (str.equals("UNAUTHORIZED_DOMAIN")) {
                    c8 = 11;
                    break;
                }
                break;
            case -1583894766:
                if (str.equals("INVALID_OOB_CODE")) {
                    c8 = '\f';
                    break;
                }
                break;
            case -1458751677:
                if (str.equals("MISSING_EMAIL")) {
                    c8 = '\r';
                    break;
                }
                break;
            case -1421414571:
                if (str.equals("INVALID_CODE")) {
                    c8 = 14;
                    break;
                }
                break;
            case -1368998244:
                if (str.equals("INVALID_HOSTING_LINK_DOMAIN")) {
                    c8 = 15;
                    break;
                }
                break;
            case -1345867105:
                if (str.equals("TOKEN_EXPIRED")) {
                    c8 = 16;
                    break;
                }
                break;
            case -1340100504:
                if (str.equals("INVALID_TENANT_ID")) {
                    c8 = 17;
                    break;
                }
                break;
            case -1242922234:
                if (str.equals("ALTERNATE_CLIENT_IDENTIFIER_REQUIRED")) {
                    c8 = 18;
                    break;
                }
                break;
            case -1232010689:
                if (str.equals("INVALID_SESSION_INFO")) {
                    c8 = 19;
                    break;
                }
                break;
            case -1202691903:
                if (str.equals("SECOND_FACTOR_EXISTS")) {
                    c8 = 20;
                    break;
                }
                break;
            case -1112393964:
                if (str.equals("INVALID_EMAIL")) {
                    c8 = 21;
                    break;
                }
                break;
            case -1063710844:
                if (str.equals("ADMIN_ONLY_OPERATION")) {
                    c8 = 22;
                    break;
                }
                break;
            case -974503964:
                if (str.equals("MISSING_OR_INVALID_NONCE")) {
                    c8 = 23;
                    break;
                }
                break;
            case -863830559:
                if (str.equals("INVALID_CERT_HASH")) {
                    c8 = 24;
                    break;
                }
                break;
            case -828507413:
                if (str.equals("NO_SUCH_PROVIDER")) {
                    c8 = 25;
                    break;
                }
                break;
            case -749743758:
                if (str.equals("MFA_ENROLLMENT_NOT_FOUND")) {
                    c8 = 26;
                    break;
                }
                break;
            case -736207500:
                if (str.equals("MISSING_PASSWORD")) {
                    c8 = 27;
                    break;
                }
                break;
            case -646022241:
                if (str.equals("CREDENTIAL_TOO_OLD_LOGIN_AGAIN")) {
                    c8 = 28;
                    break;
                }
                break;
            case -595928767:
                if (str.equals("TIMEOUT")) {
                    c8 = 29;
                    break;
                }
                break;
            case -505579581:
                if (str.equals("INVALID_REQ_TYPE")) {
                    c8 = 30;
                    break;
                }
                break;
            case -406804866:
                if (str.equals("INVALID_LOGIN_CREDENTIALS")) {
                    c8 = 31;
                    break;
                }
                break;
            case -380728810:
                if (str.equals("INVALID_RECAPTCHA_ACTION")) {
                    c8 = ' ';
                    break;
                }
                break;
            case -333672188:
                if (str.equals("OPERATION_NOT_ALLOWED")) {
                    c8 = '!';
                    break;
                }
                break;
            case -294485423:
                if (str.equals("WEB_INTERNAL_ERROR")) {
                    c8 = '\"';
                    break;
                }
                break;
            case -217128228:
                if (str.equals("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                    c8 = '#';
                    break;
                }
                break;
            case -122667194:
                if (str.equals("MISSING_MFA_ENROLLMENT_ID")) {
                    c8 = '$';
                    break;
                }
                break;
            case -75433118:
                if (str.equals("USER_NOT_FOUND")) {
                    c8 = '%';
                    break;
                }
                break;
            case -52772551:
                if (str.equals("CAPTCHA_CHECK_FAILED")) {
                    c8 = '&';
                    break;
                }
                break;
            case -40686718:
                if (str.equals("WEAK_PASSWORD")) {
                    c8 = '\'';
                    break;
                }
                break;
            case 15352275:
                if (str.equals("EMAIL_NOT_FOUND")) {
                    c8 = '(';
                    break;
                }
                break;
            case 210308040:
                if (str.equals("UNSUPPORTED_FIRST_FACTOR")) {
                    c8 = ')';
                    break;
                }
                break;
            case 269327773:
                if (str.equals("INVALID_SENDER")) {
                    c8 = '*';
                    break;
                }
                break;
            case 278802867:
                if (str.equals("MISSING_PHONE_NUMBER")) {
                    c8 = '+';
                    break;
                }
                break;
            case 408411681:
                if (str.equals("INVALID_DYNAMIC_LINK_DOMAIN")) {
                    c8 = ',';
                    break;
                }
                break;
            case 423563023:
                if (str.equals("MISSING_MFA_PENDING_CREDENTIAL")) {
                    c8 = '-';
                    break;
                }
                break;
            case 429251986:
                if (str.equals("UNSUPPORTED_PASSTHROUGH_OPERATION")) {
                    c8 = '.';
                    break;
                }
                break;
            case 483847807:
                if (str.equals("EMAIL_EXISTS")) {
                    c8 = '/';
                    break;
                }
                break;
            case 491979549:
                if (str.equals("INVALID_ID_TOKEN")) {
                    c8 = '0';
                    break;
                }
                break;
            case 492072102:
                if (str.equals("WEB_STORAGE_UNSUPPORTED")) {
                    c8 = '1';
                    break;
                }
                break;
            case 492515765:
                if (str.equals("MISSING_CLIENT_TYPE")) {
                    c8 = '2';
                    break;
                }
                break;
            case 530628231:
                if (str.equals("MISSING_RECAPTCHA_VERSION")) {
                    c8 = '3';
                    break;
                }
                break;
            case 542728406:
                if (str.equals("PASSWORD_LOGIN_DISABLED")) {
                    c8 = '4';
                    break;
                }
                break;
            case 582457886:
                if (str.equals("UNVERIFIED_EMAIL")) {
                    c8 = '5';
                    break;
                }
                break;
            case 605031096:
                if (str.equals("REJECTED_CREDENTIAL")) {
                    c8 = '6';
                    break;
                }
                break;
            case 745638750:
                if (str.equals("INVALID_MFA_PENDING_CREDENTIAL")) {
                    c8 = '7';
                    break;
                }
                break;
            case 786916712:
                if (str.equals("INVALID_VERIFICATION_PROOF")) {
                    c8 = '8';
                    break;
                }
                break;
            case 799258561:
                if (str.equals("INVALID_PROVIDER_ID")) {
                    c8 = '9';
                    break;
                }
                break;
            case 819646646:
                if (str.equals("CREDENTIAL_MISMATCH")) {
                    c8 = ':';
                    break;
                }
                break;
            case 844240628:
                if (str.equals("WEB_CONTEXT_CANCELED")) {
                    c8 = ';';
                    break;
                }
                break;
            case 886186878:
                if (str.equals("REQUIRES_SECOND_FACTOR_AUTH")) {
                    c8 = '<';
                    break;
                }
                break;
            case 895302372:
                if (str.equals("MISSING_CLIENT_IDENTIFIER")) {
                    c8 = '=';
                    break;
                }
                break;
            case 922685102:
                if (str.equals("INVALID_MESSAGE_PAYLOAD")) {
                    c8 = '>';
                    break;
                }
                break;
            case 989000548:
                if (str.equals("RESET_PASSWORD_EXCEED_LIMIT")) {
                    c8 = '?';
                    break;
                }
                break;
            case 1034932393:
                if (str.equals("INVALID_PENDING_TOKEN")) {
                    c8 = '@';
                    break;
                }
                break;
            case 1072360691:
                if (str.equals("INVALID_CUSTOM_TOKEN")) {
                    c8 = 'A';
                    break;
                }
                break;
            case 1094975491:
                if (str.equals("INVALID_PASSWORD")) {
                    c8 = 'B';
                    break;
                }
                break;
            case 1107081238:
                if (str.equals("<<Network Error>>")) {
                    c8 = 'C';
                    break;
                }
                break;
            case 1113992697:
                if (str.equals("INVALID_RECAPTCHA_TOKEN")) {
                    c8 = 'D';
                    break;
                }
                break;
            case 1141576252:
                if (str.equals("SESSION_EXPIRED")) {
                    c8 = 'E';
                    break;
                }
                break;
            case 1199811910:
                if (str.equals("MISSING_CODE")) {
                    c8 = 'F';
                    break;
                }
                break;
            case 1226505451:
                if (str.equals("FEDERATED_USER_ID_ALREADY_LINKED")) {
                    c8 = 'G';
                    break;
                }
                break;
            case 1308491624:
                if (str.equals("MISSING_RECAPTCHA_TOKEN")) {
                    c8 = 'H';
                    break;
                }
                break;
            case 1388786705:
                if (str.equals("INVALID_IDENTIFIER")) {
                    c8 = 'I';
                    break;
                }
                break;
            case 1433767024:
                if (str.equals("USER_DISABLED")) {
                    c8 = 'J';
                    break;
                }
                break;
            case 1442968770:
                if (str.equals("INVALID_PHONE_NUMBER")) {
                    c8 = 'K';
                    break;
                }
                break;
            case 1494923453:
                if (str.equals("INVALID_APP_CREDENTIAL")) {
                    c8 = 'L';
                    break;
                }
                break;
            case 1497901284:
                if (str.equals("TOO_MANY_ATTEMPTS_TRY_LATER")) {
                    c8 = 'M';
                    break;
                }
                break;
            case 1803454477:
                if (str.equals("MISSING_CONTINUE_URI")) {
                    c8 = 'N';
                    break;
                }
                break;
            case 1898790704:
                if (str.equals("MISSING_SESSION_INFO")) {
                    c8 = 'O';
                    break;
                }
                break;
            case 2063209097:
                if (str.equals("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                    c8 = 'P';
                    break;
                }
                break;
            case 2082564316:
                if (str.equals("UNSUPPORTED_TENANT_OPERATION")) {
                    c8 = 'Q';
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                i7 = 18001;
                break;
            case 1:
                i7 = 17033;
                break;
            case 2:
                i7 = 17057;
                break;
            case 3:
                i7 = 17091;
                break;
            case 4:
            case 31:
            case RecognitionOptions.EAN_8 /* 64 */:
                i7 = 17004;
                break;
            case 5:
                i7 = 17068;
                break;
            case 6:
                i7 = 17052;
                break;
            case 7:
                i7 = 17061;
                break;
            case '\b':
                i7 = 17206;
                break;
            case '\t':
                i7 = 17200;
                break;
            case '\n':
                i7 = 17029;
                break;
            case 11:
                i7 = 17038;
                break;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                i7 = 17030;
                break;
            case '\r':
                i7 = 17034;
                break;
            case 14:
                i7 = 17044;
                break;
            case 15:
                i7 = 17214;
                break;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                i7 = 17021;
                break;
            case 17:
                i7 = 17079;
                break;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                i7 = 18002;
                break;
            case 19:
                i7 = 17046;
                break;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                i7 = 17087;
                break;
            case 21:
            case 'I':
                i7 = 17008;
                break;
            case 22:
                i7 = 17085;
                break;
            case 23:
                i7 = 17094;
                break;
            case 24:
                i7 = 17064;
                break;
            case 25:
                i7 = 17016;
                break;
            case 26:
                i7 = 17084;
                break;
            case 27:
                i7 = 17035;
                break;
            case 28:
                i7 = 17014;
                break;
            case 29:
            case 'C':
                i7 = 17020;
                break;
            case 30:
                i7 = 17207;
                break;
            case RecognitionOptions.EAN_13 /* 32 */:
                i7 = 17203;
                break;
            case '!':
            case '4':
                i7 = 17006;
                break;
            case '\"':
                i7 = 17062;
                break;
            case '#':
                i7 = 17088;
                break;
            case '$':
                i7 = 17082;
                break;
            case '%':
            case '(':
                i7 = 17011;
                break;
            case '&':
                i7 = 17056;
                break;
            case '\'':
                i7 = 17026;
                break;
            case ')':
                i7 = 17089;
                break;
            case '*':
                i7 = 17032;
                break;
            case '+':
                i7 = 17041;
                break;
            case ',':
                i7 = 17074;
                break;
            case '-':
                i7 = 17081;
                break;
            case '.':
                i7 = 17095;
                break;
            case '/':
                i7 = 17007;
                break;
            case '0':
                i7 = 17017;
                break;
            case '1':
                i7 = 17065;
                break;
            case '2':
                i7 = 17204;
                break;
            case '3':
                i7 = 17205;
                break;
            case '5':
                i7 = 17086;
                break;
            case '6':
                i7 = 17075;
                break;
            case '7':
                i7 = 17083;
                break;
            case '8':
                i7 = 17049;
                break;
            case '9':
                i7 = 17071;
                break;
            case ':':
                i7 = 17002;
                break;
            case ';':
                i7 = 17058;
                break;
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                i7 = 17078;
                break;
            case '=':
                i7 = 17093;
                break;
            case '>':
                i7 = 17031;
                break;
            case '?':
            case 'M':
                i7 = 17010;
                break;
            case 'A':
                i7 = 17000;
                break;
            case 'B':
                i7 = 17009;
                break;
            case 'D':
                i7 = 17202;
                break;
            case 'E':
                i7 = 17051;
                break;
            case 'F':
                i7 = 17043;
                break;
            case 'G':
                i7 = 17025;
                break;
            case 'H':
                i7 = 17201;
                break;
            case 'J':
                i7 = 17005;
                break;
            case 'K':
                i7 = 17042;
                break;
            case 'L':
                i7 = 17028;
                break;
            case 'N':
                i7 = 17040;
                break;
            case 'O':
                i7 = 17045;
                break;
            case 'P':
                i7 = 17090;
                break;
            case 'Q':
                i7 = 17073;
                break;
            default:
                i7 = 17499;
                break;
        }
        if (i7 == 17499) {
            if (str2 != null) {
                return new Status(i7, AbstractC0059i.A(str, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, str2), null, null);
            }
            return new Status(i7, str, null, null);
        }
        return new Status(i7, str2, null, null);
    }

    public abstract void v(boolean z7);

    public void u(boolean z7) {
    }
}
