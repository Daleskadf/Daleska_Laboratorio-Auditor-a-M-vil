package G;

import A3.j0;
import D.AbstractC0055e;
import D.AbstractC0059i;
import F3.o;
import H4.W;
import M0.l;
import S0.m;
import X5.C0383i;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.webkit.ClientCertRequest;
import c4.C0632a;
import c4.r;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import q4.p;
import x0.C1976b;
import x0.C1977c;
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static volatile e f1342a;

    public static List A(Object obj) {
        List singletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.j.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static String B(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str2.length() + str.length());
            for (int i7 = 0; i7 < str.length(); i7++) {
                sb.append(str.charAt(i7));
                if (str2.length() > i7) {
                    sb.append(str2.charAt(i7));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public static void C(J1.d dVar, int i7, K0.c cVar) {
        long x7 = dVar.x(i7);
        List M7 = dVar.M(x7);
        if (M7.isEmpty()) {
            return;
        }
        if (i7 != dVar.e0() - 1) {
            long x8 = dVar.x(i7 + 1) - dVar.x(i7);
            if (x8 > 0) {
                cVar.accept(new J1.a(M7, x7, x8));
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public static io.flutter.plugins.firebase.storage.i D(Exception exc) {
        String str;
        String str2 = "An unknown error occurred";
        String str3 = "UNKNOWN";
        if (exc == null) {
            return new io.flutter.plugins.firebase.storage.i("UNKNOWN", "An unknown error occurred");
        }
        String str4 = "An unknown error occurred:" + exc.getMessage();
        if (exc instanceof com.google.firebase.storage.i) {
            int i7 = ((com.google.firebase.storage.i) exc).f9914a;
            if (i7 != -13040) {
                if (i7 != -13031) {
                    if (i7 != -13030) {
                        if (i7 != -13021) {
                            if (i7 != -13020) {
                                switch (i7) {
                                    case -13013:
                                        str = "quota-exceeded";
                                        break;
                                    case -13012:
                                        str = "project-not-found";
                                        break;
                                    case -13011:
                                        str = "bucket-not-found";
                                        break;
                                    case -13010:
                                        str = "object-not-found";
                                        break;
                                    default:
                                        str = "unknown";
                                        break;
                                }
                            } else {
                                str = "unauthenticated";
                            }
                        } else {
                            str = "unauthorized";
                        }
                    } else {
                        str = "retry-limit-exceeded";
                    }
                } else {
                    str = "invalid-checksum";
                }
            } else {
                str = "canceled";
            }
            if (i7 != -13040) {
                if (i7 != -13031) {
                    if (i7 != -13030) {
                        if (i7 != -13021) {
                            if (i7 != -13020) {
                                switch (i7) {
                                    case -13013:
                                        str2 = "Quota on your Firebase Storage bucket has been exceeded.";
                                        break;
                                    case -13012:
                                        str2 = "No project is configured for Firebase Storage.";
                                        break;
                                    case -13011:
                                        str2 = "No bucket is configured for Firebase Storage.";
                                        break;
                                    case -13010:
                                        str2 = "No object exists at the desired reference.";
                                        break;
                                }
                            } else {
                                str2 = "User is unauthenticated. Authenticate and try again.";
                            }
                        } else {
                            str2 = "User is not authorized to perform the desired action.";
                        }
                    } else {
                        str2 = "The maximum time limit on an operation (upload, download, delete, etc.) has been exceeded.";
                    }
                } else {
                    str2 = "File on the client does not match the checksum of the file received by the server.";
                }
            } else {
                str2 = "User cancelled the operation.";
            }
            str4 = str2;
            str3 = str;
        }
        return new io.flutter.plugins.firebase.storage.i(str3, str4);
    }

    public static void F(L5.f binaryMessenger, final C0383i c0383i) {
        Object obj;
        o oVar;
        kotlin.jvm.internal.j.e(binaryMessenger, "binaryMessenger");
        if (c0383i != null && (oVar = c0383i.f6499a) != null) {
            obj = oVar.j();
        } else {
            obj = new Object();
        }
        E.e eVar = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.cancel", obj, null, 4);
        if (c0383i != null) {
            eVar.h0(new L5.b() { // from class: X5.B
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    switch (r2) {
                        case 0:
                            C0383i c0383i2 = c0383i;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj3;
                            try {
                                c0383i2.getClass();
                                clientCertRequest.cancel();
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0383i c0383i3 = c0383i;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj4;
                            try {
                                c0383i3.getClass();
                                clientCertRequest2.ignore();
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        default:
                            C0383i c0383i4 = c0383i;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj5;
                            Object obj6 = list.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj6;
                            Object obj7 = list.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj7;
                            try {
                                c0383i4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                    }
                }
            });
        } else {
            eVar.h0(null);
        }
        E.e eVar2 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.ignore", obj, null, 4);
        if (c0383i != null) {
            eVar2.h0(new L5.b() { // from class: X5.B
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    switch (r2) {
                        case 0:
                            C0383i c0383i2 = c0383i;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj3;
                            try {
                                c0383i2.getClass();
                                clientCertRequest.cancel();
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0383i c0383i3 = c0383i;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj4;
                            try {
                                c0383i3.getClass();
                                clientCertRequest2.ignore();
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        default:
                            C0383i c0383i4 = c0383i;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj5;
                            Object obj6 = list.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj6;
                            Object obj7 = list.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj7;
                            try {
                                c0383i4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                    }
                }
            });
        } else {
            eVar2.h0(null);
        }
        E.e eVar3 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.proceed", obj, null, 4);
        if (c0383i != null) {
            eVar3.h0(new L5.b() { // from class: X5.B
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    switch (r2) {
                        case 0:
                            C0383i c0383i2 = c0383i;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj3;
                            try {
                                c0383i2.getClass();
                                clientCertRequest.cancel();
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0383i c0383i3 = c0383i;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj4;
                            try {
                                c0383i3.getClass();
                                clientCertRequest2.ignore();
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        default:
                            C0383i c0383i4 = c0383i;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj5;
                            Object obj6 = list.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj6;
                            Object obj7 = list.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj7;
                            try {
                                c0383i4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                    }
                }
            });
        } else {
            eVar3.h0(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a A[LOOP:0: B:23:0x0054->B:25:0x005a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void I(J1.d r13, J1.k r14, K0.c r15) {
        /*
            long r0 = r14.f2377a
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L27
        Le:
            int r4 = r13.g(r0)
            r6 = -1
            if (r4 != r6) goto L19
            int r4 = r13.e0()
        L19:
            if (r4 <= 0) goto L27
            int r6 = r4 + (-1)
            long r6 = r13.x(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L27
            int r4 = r4 + (-1)
        L27:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L52
            int r2 = r13.e0()
            if (r4 >= r2) goto L52
            java.util.List r7 = r13.M(r0)
            long r2 = r13.x(r4)
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L52
            long r8 = r14.f2377a
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 >= 0) goto L52
            J1.a r12 = new J1.a
            long r10 = r2 - r8
            r6 = r12
            r6.<init>(r7, r8, r10)
            r15.accept(r12)
            r2 = 1
            goto L53
        L52:
            r2 = r5
        L53:
            r3 = r4
        L54:
            int r6 = r13.e0()
            if (r3 >= r6) goto L60
            C(r13, r3, r15)
            int r3 = r3 + 1
            goto L54
        L60:
            boolean r14 = r14.f2378b
            if (r14 == 0) goto L89
            if (r2 == 0) goto L68
            int r4 = r4 + (-1)
        L68:
            if (r5 >= r4) goto L70
            C(r13, r5, r15)
            int r5 = r5 + 1
            goto L68
        L70:
            if (r2 == 0) goto L89
            J1.a r14 = new J1.a
            java.util.List r7 = r13.M(r0)
            long r8 = r13.x(r4)
            long r2 = r13.x(r4)
            long r10 = r0 - r2
            r6 = r14
            r6.<init>(r7, r8, r10)
            r15.accept(r14)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G.i.I(J1.d, J1.k, K0.c):void");
    }

    public static HashMap J(Location location) {
        boolean isFromMockProvider;
        boolean hasMslAltitude;
        double mslAltitudeMeters;
        boolean hasMslAltitudeAccuracy;
        float mslAltitudeAccuracyMeters;
        boolean hasSpeedAccuracy;
        float speedAccuracyMetersPerSecond;
        boolean hasBearingAccuracy;
        float bearingAccuracyDegrees;
        boolean hasVerticalAccuracy;
        float verticalAccuracyMeters;
        if (location == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("latitude", Double.valueOf(location.getLatitude()));
        hashMap.put("longitude", Double.valueOf(location.getLongitude()));
        hashMap.put("timestamp", Long.valueOf(location.getTime()));
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            isFromMockProvider = location.isMock();
        } else {
            isFromMockProvider = location.isFromMockProvider();
        }
        hashMap.put("is_mocked", Boolean.valueOf(isFromMockProvider));
        if (location.hasAltitude()) {
            hashMap.put("altitude", Double.valueOf(location.getAltitude()));
        }
        if (i7 >= 26) {
            hasVerticalAccuracy = location.hasVerticalAccuracy();
            if (hasVerticalAccuracy) {
                verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                hashMap.put("altitude_accuracy", Float.valueOf(verticalAccuracyMeters));
            }
        }
        if (location.hasAccuracy()) {
            hashMap.put("accuracy", Double.valueOf(location.getAccuracy()));
        }
        if (location.hasBearing()) {
            hashMap.put("heading", Double.valueOf(location.getBearing()));
        }
        if (i7 >= 26) {
            hasBearingAccuracy = location.hasBearingAccuracy();
            if (hasBearingAccuracy) {
                bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                hashMap.put("heading_accuracy", Float.valueOf(bearingAccuracyDegrees));
            }
        }
        if (location.hasSpeed()) {
            hashMap.put("speed", Double.valueOf(location.getSpeed()));
        }
        if (i7 >= 26) {
            hasSpeedAccuracy = location.hasSpeedAccuracy();
            if (hasSpeedAccuracy) {
                speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                hashMap.put("speed_accuracy", Double.valueOf(speedAccuracyMetersPerSecond));
            }
        }
        if (location.getExtras() != null) {
            if (location.getExtras().containsKey("geolocator_mslAltitude")) {
                hashMap.put("altitude", Double.valueOf(location.getExtras().getDouble("geolocator_mslAltitude")));
            }
            if (location.getExtras().containsKey("geolocator_mslSatelliteCount")) {
                hashMap.put("gnss_satellite_count", Double.valueOf(location.getExtras().getDouble("geolocator_mslSatelliteCount")));
            }
            if (location.getExtras().containsKey("geolocator_mslSatellitesUsedInFix")) {
                hashMap.put("gnss_satellites_used_in_fix", Double.valueOf(location.getExtras().getDouble("geolocator_mslSatellitesUsedInFix")));
            }
            if (i7 >= 34) {
                hasMslAltitude = location.hasMslAltitude();
                if (hasMslAltitude) {
                    mslAltitudeMeters = location.getMslAltitudeMeters();
                    hashMap.put("altitude", Double.valueOf(mslAltitudeMeters));
                    hasMslAltitudeAccuracy = location.hasMslAltitudeAccuracy();
                    if (hasMslAltitudeAccuracy) {
                        mslAltitudeAccuracyMeters = location.getMslAltitudeAccuracyMeters();
                        hashMap.put("altitude_accuracy", Float.valueOf(mslAltitudeAccuracyMeters));
                    }
                }
            }
        }
        return hashMap;
    }

    public static String a(int i7, int i8, String str) {
        if (i7 < 0) {
            return W.z("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return W.z("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i8, "negative size: "));
    }

    public static l b(m mVar, String str, S0.j jVar, int i7) {
        M0.k kVar = new M0.k();
        kVar.f3165a = K0.a.y(str, jVar.f4889c);
        kVar.f3168d = jVar.f4887a;
        kVar.f3169e = jVar.f4888b;
        String a7 = mVar.a();
        if (a7 == null) {
            a7 = K0.a.y(((S0.b) mVar.f4893b.get(0)).f4843a, jVar.f4889c).toString();
        }
        kVar.f = a7;
        kVar.f3170g = i7;
        kVar.f3167c = j0.f157X;
        K0.a.l(kVar.f3165a, "The uri must be set.");
        return new l(kVar.f3165a, kVar.f3166b, null, kVar.f3167c, kVar.f3168d, kVar.f3169e, kVar.f, kVar.f3170g);
    }

    public static void d(int i7, String str, boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException(W.z(str, Integer.valueOf(i7)));
    }

    public static void e(Object obj, String str, boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException(W.z(str, obj));
    }

    public static void f(String str, boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void g(boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void h(boolean z7, String str, long j) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException(W.z(str, Long.valueOf(j)));
    }

    public static void i(int i7, int i8) {
        String z7;
        if (i7 >= 0 && i7 < i8) {
            return;
        }
        if (i7 >= 0) {
            if (i8 >= 0) {
                z7 = W.z("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i8));
            } else {
                throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i8, "negative size: "));
            }
        } else {
            z7 = W.z("%s (%s) must not be negative", "index", Integer.valueOf(i7));
        }
        throw new IndexOutOfBoundsException(z7);
    }

    public static void j(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(String.valueOf(str));
    }

    public static void k(int i7, int i8) {
        if (i7 >= 0 && i7 <= i8) {
            return;
        }
        throw new IndexOutOfBoundsException(a(i7, i8, "index"));
    }

    public static void l(int i7, int i8, int i9) {
        String a7;
        if (i7 >= 0 && i8 >= i7 && i8 <= i9) {
            return;
        }
        if (i7 >= 0 && i7 <= i9) {
            if (i8 >= 0 && i8 <= i9) {
                a7 = W.z("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7));
            } else {
                a7 = a(i8, i9, "end index");
            }
        } else {
            a7 = a(i7, i9, "start index");
        }
        throw new IndexOutOfBoundsException(a7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [B6.f, B6.d] */
    public static void m(int i7) {
        if (new B6.d(2, 36, 1).e(i7)) {
            return;
        }
        StringBuilder k2 = io.flutter.plugins.pathprovider.b.k("radix ", i7, " was not in valid range ");
        k2.append(new B6.d(2, 36, 1));
        throw new IllegalArgumentException(k2.toString());
    }

    public static void n(Object obj, String str, boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalStateException(W.z(str, obj));
    }

    public static void o(String str, boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalStateException(String.valueOf(str));
    }

    public static void p(boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void q(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused) {
            }
        }
    }

    public static long[] r(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i7 = 0; i7 < iArr.length; i7++) {
                jArr[i7] = iArr[i7];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    public static void s(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static void t(C1976b c1976b, C1977c c1977c, int i7) {
        byte[] bArr = new byte[8192];
        while (i7 > 0) {
            int min = Math.min(i7, 8192);
            int read = c1976b.read(bArr, 0, min);
            if (read == min) {
                i7 -= read;
                c1977c.write(bArr, 0, read);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }

    public static final long u(InputStream inputStream, OutputStream outputStream, int i7) {
        byte[] bArr = new byte[i7];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [q4.p, q4.e] */
    public static p v(String str) {
        boolean z7;
        List list;
        boolean z8;
        int length = str.length();
        if (length >= 2) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Invalid path \"%s\"", z7, str);
        if (length == 2) {
            if (str.charAt(0) == 1 && str.charAt(1) == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            m5.d.i("Non-empty path \"%s\" had length 2", z8, str);
            list = Collections.emptyList();
        } else {
            int length2 = str.length() - 2;
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            int i7 = 0;
            while (i7 < length) {
                int indexOf = str.indexOf(1, i7);
                if (indexOf >= 0 && indexOf <= length2) {
                    int i8 = indexOf + 1;
                    char charAt = str.charAt(i8);
                    if (charAt != 1) {
                        if (charAt != 16) {
                            if (charAt == 17) {
                                sb.append(str.substring(i7, i8));
                            } else {
                                throw new IllegalArgumentException(AbstractC0059i.M("Invalid encoded resource path: \"", str, "\""));
                            }
                        } else {
                            sb.append(str.substring(i7, indexOf));
                            sb.append((char) 0);
                        }
                    } else {
                        String substring = str.substring(i7, indexOf);
                        if (sb.length() != 0) {
                            sb.append(substring);
                            substring = sb.toString();
                            sb.setLength(0);
                        }
                        arrayList.add(substring);
                    }
                    i7 = indexOf + 2;
                } else {
                    throw new IllegalArgumentException(AbstractC0059i.M("Invalid encoded resource path: \"", str, "\""));
                }
            }
            list = arrayList;
        }
        p pVar = p.f15369b;
        if (list.isEmpty()) {
            return p.f15369b;
        }
        return new q4.e(list);
    }

    public static void w(ArrayList arrayList) {
        boolean z7;
        boolean z8;
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i7 = 0;
            if (it.hasNext()) {
                C0632a c0632a = (C0632a) it.next();
                c4.h hVar = new c4.h(c0632a);
                for (r rVar : c0632a.f8376b) {
                    if (c0632a.f8379e == 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    c4.i iVar = new c4.i(rVar, !z8);
                    if (!hashMap.containsKey(iVar)) {
                        hashMap.put(iVar, new HashSet());
                    }
                    Set set = (Set) hashMap.get(iVar);
                    if (!set.isEmpty() && z8) {
                        throw new IllegalArgumentException("Multiple components provide " + rVar + ".");
                    }
                    set.add(hVar);
                }
            } else {
                for (Set<c4.h> set2 : hashMap.values()) {
                    for (c4.h hVar2 : set2) {
                        for (c4.j jVar : hVar2.f8392a.f8377c) {
                            if (jVar.f8399c == 0) {
                                if (jVar.f8398b == 2) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                Set<c4.h> set3 = (Set) hashMap.get(new c4.i(jVar.f8397a, z7));
                                if (set3 != null) {
                                    for (c4.h hVar3 : set3) {
                                        hVar2.f8393b.add(hVar3);
                                        hVar3.f8394c.add(hVar2);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set set4 : hashMap.values()) {
                    hashSet.addAll(set4);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    c4.h hVar4 = (c4.h) it2.next();
                    if (hVar4.f8394c.isEmpty()) {
                        hashSet2.add(hVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    c4.h hVar5 = (c4.h) hashSet2.iterator().next();
                    hashSet2.remove(hVar5);
                    i7++;
                    Iterator it3 = hVar5.f8393b.iterator();
                    while (it3.hasNext()) {
                        c4.h hVar6 = (c4.h) it3.next();
                        hVar6.f8394c.remove(hVar5);
                        if (hVar6.f8394c.isEmpty()) {
                            hashSet2.add(hVar6);
                        }
                    }
                }
                if (i7 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    c4.h hVar7 = (c4.h) it4.next();
                    if (!hVar7.f8394c.isEmpty() && !hVar7.f8393b.isEmpty()) {
                        arrayList2.add(hVar7.f8392a);
                    }
                }
                throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
        }
    }

    public static String x(q4.e eVar) {
        StringBuilder sb = new StringBuilder();
        int size = eVar.f15351a.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (sb.length() > 0) {
                sb.append((char) 1);
                sb.append((char) 1);
            }
            String g3 = eVar.g(i7);
            int length = g3.length();
            for (int i8 = 0; i8 < length; i8++) {
                char charAt = g3.charAt(i8);
                if (charAt != 0) {
                    if (charAt != 1) {
                        sb.append(charAt);
                    } else {
                        sb.append((char) 1);
                        sb.append((char) 17);
                    }
                } else {
                    sb.append((char) 1);
                    sb.append((char) 16);
                }
            }
        }
        sb.append((char) 1);
        sb.append((char) 1);
        return sb.toString();
    }

    public static String y(Context context) {
        File dataDir;
        if (Build.VERSION.SDK_INT >= 24) {
            dataDir = context.getDataDir();
            return dataDir.getPath();
        }
        return context.getApplicationInfo().dataDir;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean z(java.lang.String r4) {
        /*
            g2.b r0 = g2.k.f11122a
            java.util.HashSet r0 = g2.c.f11114c
            java.util.Set r0 = j$.util.DesugarCollections.unmodifiableSet(r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r0.next()
            g2.e r2 = (g2.e) r2
            r3 = r2
            g2.c r3 = (g2.c) r3
            java.lang.String r3 = r3.f11115a
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L11
            r1.add(r2)
            goto L11
        L2c:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L54
            java.util.Iterator r4 = r1.iterator()
        L36:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L52
            java.lang.Object r0 = r4.next()
            g2.e r0 = (g2.e) r0
            g2.c r0 = (g2.c) r0
            boolean r1 = r0.a()
            if (r1 != 0) goto L50
            boolean r0 = r0.b()
            if (r0 == 0) goto L36
        L50:
            r4 = 1
            goto L53
        L52:
            r4 = 0
        L53:
            return r4
        L54:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unknown feature "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G.i.z(java.lang.String):boolean");
    }

    public abstract void G();

    public abstract void H();

    public abstract void K(byte[] bArr, int i7, int i8);

    public boolean c() {
        return false;
    }

    public void E() {
    }
}
