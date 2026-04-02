package j3;

import D.AbstractC0055e;
import D.AbstractC0059i;
import F3.o;
import F6.C0110x;
import H0.J;
import H4.e1;
import X5.C0388n;
import a4.C0448A;
import a4.C0451D;
import a4.u;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.hardware.camera2.CameraDevice;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.p002firebaseauthapi.zzagz;
import com.google.android.gms.internal.p002firebaseauthapi.zzaia;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import com.google.protobuf.AbstractC0852m;
import h1.r;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n4.C1513B;
import n4.C1529o;
import n4.EnumC1512A;
import n4.EnumC1528n;
import q4.C1711d;
import r6.AbstractC1748a;
import s6.AbstractC1798a;
import w.C1896F;
import x0.C1982h;
import z0.Y;
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static ClassLoader f13438a;

    /* renamed from: b  reason: collision with root package name */
    public static Thread f13439b;

    public f(Y operation) {
        kotlin.jvm.internal.j.e(operation, "operation");
    }

    public static G.h A() {
        if (G.h.f1339c != null) {
            return G.h.f1339c;
        }
        synchronized (G.h.class) {
            try {
                if (G.h.f1339c == null) {
                    G.h.f1339c = new G.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return G.h.f1339c;
    }

    public static G.e C() {
        if (G.i.f1342a != null) {
            return G.i.f1342a;
        }
        synchronized (G.i.class) {
            try {
                if (G.i.f1342a == null) {
                    G.i.f1342a = new G.e(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return G.i.f1342a;
    }

    public static boolean D(C1529o c1529o, C1711d c1711d) {
        boolean z7;
        if (c1529o == null) {
            return false;
        }
        if (!c1529o.f14351c.equals(c1711d.f15349a)) {
            return false;
        }
        EnumC1528n enumC1528n = EnumC1528n.ARRAY_CONTAINS;
        EnumC1528n enumC1528n2 = c1529o.f14349a;
        if (!enumC1528n2.equals(enumC1528n) && !enumC1528n2.equals(EnumC1528n.ARRAY_CONTAINS_ANY)) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (c1711d.f15350b.equals(q4.j.CONTAINS) != z7) {
            return false;
        }
        return true;
    }

    public static boolean E(C1513B c1513b, C1711d c1711d) {
        if (!c1513b.f14268b.equals(c1711d.f15349a)) {
            return false;
        }
        q4.j jVar = q4.j.ASCENDING;
        q4.j jVar2 = c1711d.f15350b;
        boolean equals = jVar2.equals(jVar);
        EnumC1512A enumC1512A = c1513b.f14267a;
        if ((!equals || !enumC1512A.equals(EnumC1512A.ASCENDING)) && (!jVar2.equals(q4.j.DESCENDING) || !enumC1512A.equals(EnumC1512A.DESCENDING))) {
            return false;
        }
        return true;
    }

    public static boolean F(int i7, Parcel parcel) {
        h0(parcel, i7, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static byte G(int i7, Parcel parcel) {
        h0(parcel, i7, 4);
        return (byte) parcel.readInt();
    }

    public static double H(int i7, Parcel parcel) {
        h0(parcel, i7, 8);
        return parcel.readDouble();
    }

    public static Double I(int i7, Parcel parcel) {
        int Q7 = Q(i7, parcel);
        if (Q7 == 0) {
            return null;
        }
        g0(parcel, Q7, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float J(int i7, Parcel parcel) {
        h0(parcel, i7, 4);
        return parcel.readFloat();
    }

    public static Float K(int i7, Parcel parcel) {
        int Q7 = Q(i7, parcel);
        if (Q7 == 0) {
            return null;
        }
        g0(parcel, Q7, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder L(int i7, Parcel parcel) {
        int Q7 = Q(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (Q7 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + Q7);
        return readStrongBinder;
    }

    public static int M(int i7, Parcel parcel) {
        h0(parcel, i7, 4);
        return parcel.readInt();
    }

    public static Integer N(int i7, Parcel parcel) {
        int Q7 = Q(i7, parcel);
        if (Q7 == 0) {
            return null;
        }
        g0(parcel, Q7, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long O(int i7, Parcel parcel) {
        h0(parcel, i7, 8);
        return parcel.readLong();
    }

    public static Long P(int i7, Parcel parcel) {
        int Q7 = Q(i7, parcel);
        if (Q7 == 0) {
            return null;
        }
        g0(parcel, Q7, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int Q(int i7, Parcel parcel) {
        if ((i7 & (-65536)) != -65536) {
            return (char) (i7 >> 16);
        }
        return parcel.readInt();
    }

    public static void R(L5.f binaryMessenger, final C0388n c0388n) {
        Object obj;
        o oVar;
        kotlin.jvm.internal.j.e(binaryMessenger, "binaryMessenger");
        if (c0388n != null && (oVar = c0388n.f6519a) != null) {
            obj = oVar.j();
        } else {
            obj = new Object();
        }
        E.e eVar = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.scrollTo", obj, null, 4);
        if (c0388n != null) {
            eVar.h0(new L5.b() { // from class: X5.J
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    switch (r2) {
                        case 0:
                            C0388n c0388n2 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj5).longValue();
                            try {
                                c0388n2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0388n c0388n3 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj8).longValue();
                            try {
                                c0388n3.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0388n c0388n4 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0388n4.getClass();
                                E8 = G.i.A(new k0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0388n c0388n5 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0388n5.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0388n c0388n6 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0388n6.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        default:
                            C0388n c0388n7 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0399z enumC0399z = (EnumC0399z) obj15;
                            try {
                                c0388n7.getClass();
                                int i7 = W.f6438a[enumC0399z.ordinal()];
                                if (i7 != 1) {
                                    if (i7 != 2) {
                                        if (i7 != 3) {
                                            if (i7 == 4) {
                                                EnumC0399z enumC0399z2 = EnumC0399z.UNKNOWN;
                                                c0388n7.f6519a.getClass();
                                                throw new IllegalArgumentException(enumC0399z2 + " doesn't represent a native value.");
                                            }
                                        } else {
                                            view6.setOverScrollMode(2);
                                        }
                                    } else {
                                        view6.setOverScrollMode(1);
                                    }
                                } else {
                                    view6.setOverScrollMode(0);
                                }
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                    }
                }
            });
        } else {
            eVar.h0(null);
        }
        E.e eVar2 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.scrollBy", obj, null, 4);
        if (c0388n != null) {
            eVar2.h0(new L5.b() { // from class: X5.J
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    switch (r2) {
                        case 0:
                            C0388n c0388n2 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj5).longValue();
                            try {
                                c0388n2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0388n c0388n3 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj8).longValue();
                            try {
                                c0388n3.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0388n c0388n4 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0388n4.getClass();
                                E8 = G.i.A(new k0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0388n c0388n5 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0388n5.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0388n c0388n6 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0388n6.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        default:
                            C0388n c0388n7 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0399z enumC0399z = (EnumC0399z) obj15;
                            try {
                                c0388n7.getClass();
                                int i7 = W.f6438a[enumC0399z.ordinal()];
                                if (i7 != 1) {
                                    if (i7 != 2) {
                                        if (i7 != 3) {
                                            if (i7 == 4) {
                                                EnumC0399z enumC0399z2 = EnumC0399z.UNKNOWN;
                                                c0388n7.f6519a.getClass();
                                                throw new IllegalArgumentException(enumC0399z2 + " doesn't represent a native value.");
                                            }
                                        } else {
                                            view6.setOverScrollMode(2);
                                        }
                                    } else {
                                        view6.setOverScrollMode(1);
                                    }
                                } else {
                                    view6.setOverScrollMode(0);
                                }
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                    }
                }
            });
        } else {
            eVar2.h0(null);
        }
        E.e eVar3 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.getScrollPosition", obj, null, 4);
        if (c0388n != null) {
            eVar3.h0(new L5.b() { // from class: X5.J
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    switch (r2) {
                        case 0:
                            C0388n c0388n2 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj5).longValue();
                            try {
                                c0388n2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0388n c0388n3 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj8).longValue();
                            try {
                                c0388n3.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0388n c0388n4 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0388n4.getClass();
                                E8 = G.i.A(new k0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0388n c0388n5 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0388n5.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0388n c0388n6 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0388n6.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        default:
                            C0388n c0388n7 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0399z enumC0399z = (EnumC0399z) obj15;
                            try {
                                c0388n7.getClass();
                                int i7 = W.f6438a[enumC0399z.ordinal()];
                                if (i7 != 1) {
                                    if (i7 != 2) {
                                        if (i7 != 3) {
                                            if (i7 == 4) {
                                                EnumC0399z enumC0399z2 = EnumC0399z.UNKNOWN;
                                                c0388n7.f6519a.getClass();
                                                throw new IllegalArgumentException(enumC0399z2 + " doesn't represent a native value.");
                                            }
                                        } else {
                                            view6.setOverScrollMode(2);
                                        }
                                    } else {
                                        view6.setOverScrollMode(1);
                                    }
                                } else {
                                    view6.setOverScrollMode(0);
                                }
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                    }
                }
            });
        } else {
            eVar3.h0(null);
        }
        E.e eVar4 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.setVerticalScrollBarEnabled", obj, null, 4);
        if (c0388n != null) {
            eVar4.h0(new L5.b() { // from class: X5.J
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    switch (r2) {
                        case 0:
                            C0388n c0388n2 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj5).longValue();
                            try {
                                c0388n2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0388n c0388n3 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj8).longValue();
                            try {
                                c0388n3.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0388n c0388n4 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0388n4.getClass();
                                E8 = G.i.A(new k0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0388n c0388n5 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0388n5.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0388n c0388n6 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0388n6.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        default:
                            C0388n c0388n7 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0399z enumC0399z = (EnumC0399z) obj15;
                            try {
                                c0388n7.getClass();
                                int i7 = W.f6438a[enumC0399z.ordinal()];
                                if (i7 != 1) {
                                    if (i7 != 2) {
                                        if (i7 != 3) {
                                            if (i7 == 4) {
                                                EnumC0399z enumC0399z2 = EnumC0399z.UNKNOWN;
                                                c0388n7.f6519a.getClass();
                                                throw new IllegalArgumentException(enumC0399z2 + " doesn't represent a native value.");
                                            }
                                        } else {
                                            view6.setOverScrollMode(2);
                                        }
                                    } else {
                                        view6.setOverScrollMode(1);
                                    }
                                } else {
                                    view6.setOverScrollMode(0);
                                }
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                    }
                }
            });
        } else {
            eVar4.h0(null);
        }
        E.e eVar5 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.setHorizontalScrollBarEnabled", obj, null, 4);
        if (c0388n != null) {
            eVar5.h0(new L5.b() { // from class: X5.J
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    switch (r2) {
                        case 0:
                            C0388n c0388n2 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj5).longValue();
                            try {
                                c0388n2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0388n c0388n3 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj8).longValue();
                            try {
                                c0388n3.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0388n c0388n4 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0388n4.getClass();
                                E8 = G.i.A(new k0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0388n c0388n5 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0388n5.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0388n c0388n6 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0388n6.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        default:
                            C0388n c0388n7 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0399z enumC0399z = (EnumC0399z) obj15;
                            try {
                                c0388n7.getClass();
                                int i7 = W.f6438a[enumC0399z.ordinal()];
                                if (i7 != 1) {
                                    if (i7 != 2) {
                                        if (i7 != 3) {
                                            if (i7 == 4) {
                                                EnumC0399z enumC0399z2 = EnumC0399z.UNKNOWN;
                                                c0388n7.f6519a.getClass();
                                                throw new IllegalArgumentException(enumC0399z2 + " doesn't represent a native value.");
                                            }
                                        } else {
                                            view6.setOverScrollMode(2);
                                        }
                                    } else {
                                        view6.setOverScrollMode(1);
                                    }
                                } else {
                                    view6.setOverScrollMode(0);
                                }
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                    }
                }
            });
        } else {
            eVar5.h0(null);
        }
        E.e eVar6 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.setOverScrollMode", obj, null, 4);
        if (c0388n != null) {
            eVar6.h0(new L5.b() { // from class: X5.J
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    switch (r2) {
                        case 0:
                            C0388n c0388n2 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj5).longValue();
                            try {
                                c0388n2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0388n c0388n3 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj8).longValue();
                            try {
                                c0388n3.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0388n c0388n4 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0388n4.getClass();
                                E8 = G.i.A(new k0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0388n c0388n5 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0388n5.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0388n c0388n6 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0388n6.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        default:
                            C0388n c0388n7 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0399z enumC0399z = (EnumC0399z) obj15;
                            try {
                                c0388n7.getClass();
                                int i7 = W.f6438a[enumC0399z.ordinal()];
                                if (i7 != 1) {
                                    if (i7 != 2) {
                                        if (i7 != 3) {
                                            if (i7 == 4) {
                                                EnumC0399z enumC0399z2 = EnumC0399z.UNKNOWN;
                                                c0388n7.f6519a.getClass();
                                                throw new IllegalArgumentException(enumC0399z2 + " doesn't represent a native value.");
                                            }
                                        } else {
                                            view6.setOverScrollMode(2);
                                        }
                                    } else {
                                        view6.setOverScrollMode(1);
                                    }
                                } else {
                                    view6.setOverScrollMode(0);
                                }
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                    }
                }
            });
        } else {
            eVar6.h0(null);
        }
    }

    public static void S(int i7, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + Q(i7, parcel));
    }

    public static int T(Parcel parcel) {
        int readInt = parcel.readInt();
        int Q7 = Q(readInt, parcel);
        char c8 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c8 == 20293) {
            int i7 = Q7 + dataPosition;
            if (i7 >= dataPosition && i7 <= parcel.dataSize()) {
                return i7;
            }
            throw new C0110x(AbstractC0059i.x("Size read is invalid start=", dataPosition, i7, " end="), parcel);
        }
        throw new C0110x("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static ArrayList U(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof io.flutter.plugins.imagepicker.o) {
            io.flutter.plugins.imagepicker.o oVar = (io.flutter.plugins.imagepicker.o) th;
            arrayList.add(oVar.f12373a);
            arrayList.add(oVar.getMessage());
            arrayList.add(null);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }

    public static void a(Throwable th, Throwable exception) {
        kotlin.jvm.internal.j.e(th, "<this>");
        kotlin.jvm.internal.j.e(exception, "exception");
        if (th != exception) {
            Integer num = AbstractC1798a.f15701a;
            if (num != null && num.intValue() < 19) {
                Method method = AbstractC1748a.f15541a;
                if (method != null) {
                    method.invoke(th, exception);
                    return;
                }
                return;
            }
            th.addSuppressed(exception);
        }
    }

    public static final void a0(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i7) {
        if (i7 >= 0 && byteBuffer2.remaining() >= i7 && byteBuffer3.remaining() >= i7 && byteBuffer.remaining() >= i7) {
            for (int i8 = 0; i8 < i7; i8++) {
                byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
            }
            return;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static void b(String str, long j) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static final byte[] b0(byte[] bArr, int i7, byte[] bArr2, int i8, int i9) {
        if (i9 >= 0 && bArr.length - i9 >= i7 && bArr2.length - i9 >= i8) {
            byte[] bArr3 = new byte[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                bArr3[i10] = (byte) (bArr[i10 + i7] ^ bArr2[i10 + i8]);
            }
            return bArr3;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static byte[] c(byte[]... bArr) {
        int i7 = 0;
        for (byte[] bArr2 : bArr) {
            if (i7 <= com.google.android.gms.common.api.f.API_PRIORITY_OTHER - bArr2.length) {
                i7 += bArr2.length;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr3 = new byte[i7];
        int i8 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i8, bArr4.length);
            i8 += bArr4.length;
        }
        return bArr3;
    }

    public static final byte[] c0(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return b0(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static BigDecimal d(int i7, Parcel parcel) {
        int Q7 = Q(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (Q7 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + Q7);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static u d0(zzagz zzagzVar) {
        if (zzagzVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzagzVar.zze())) {
            String zzd = zzagzVar.zzd();
            String zzc = zzagzVar.zzc();
            long zza = zzagzVar.zza();
            String zze = zzagzVar.zze();
            I.e(zze);
            return new C0448A(zzd, zzc, zza, zze);
        } else if (zzagzVar.zzb() == null) {
            return null;
        } else {
            String zzd2 = zzagzVar.zzd();
            String zzc2 = zzagzVar.zzc();
            long zza2 = zzagzVar.zza();
            zzaia zzb = zzagzVar.zzb();
            I.j(zzb, "totpInfo cannot be null.");
            return new C0451D(zzd2, zzc2, zza2, zzb);
        }
    }

    public static Bundle e(int i7, Parcel parcel) {
        int Q7 = Q(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (Q7 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + Q7);
        return readBundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
        if (r1 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.ClassLoader e0() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.f.e0():java.lang.ClassLoader");
    }

    public static byte[] f(int i7, Parcel parcel) {
        int Q7 = Q(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (Q7 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + Q7);
        return createByteArray;
    }

    public static ArrayList f0(List list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                u d02 = d0((zzagz) it.next());
                if (d02 != null) {
                    arrayList.add(d02);
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public static CameraDevice.StateCallback g(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return new CameraDevice.StateCallback();
        }
        if (arrayList.size() == 1) {
            return (CameraDevice.StateCallback) arrayList.get(0);
        }
        return new C1896F(arrayList);
    }

    public static void g0(Parcel parcel, int i7, int i8) {
        if (i7 == i8) {
            return;
        }
        String hexString = Integer.toHexString(i7);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i8);
        sb.append(" got ");
        sb.append(i7);
        sb.append(" (0x");
        throw new C0110x(AbstractC0059i.D(sb, hexString, ")"), parcel);
    }

    public static i1.h h(r rVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = rVar.length();
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (rVar.c(i8, elapsedRealtime)) {
                i7++;
            }
        }
        return new i1.h(1, 0, length, i7);
    }

    public static void h0(Parcel parcel, int i7, int i8) {
        int Q7 = Q(i7, parcel);
        if (Q7 == i8) {
            return;
        }
        String hexString = Integer.toHexString(Q7);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i8);
        sb.append(" got ");
        sb.append(Q7);
        sb.append(" (0x");
        throw new C0110x(AbstractC0059i.D(sb, hexString, ")"), parcel);
    }

    public static float[] i(int i7, Parcel parcel) {
        int Q7 = Q(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (Q7 == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + Q7);
        return createFloatArray;
    }

    public static int[] j(int i7, Parcel parcel) {
        int Q7 = Q(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (Q7 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + Q7);
        return createIntArray;
    }

    public static Parcelable k(Parcel parcel, int i7, Parcelable.Creator creator) {
        int Q7 = Q(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (Q7 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + Q7);
        return parcelable;
    }

    public static String l(int i7, Parcel parcel) {
        int Q7 = Q(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (Q7 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + Q7);
        return readString;
    }

    public static String[] m(int i7, Parcel parcel) {
        int Q7 = Q(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (Q7 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + Q7);
        return createStringArray;
    }

    public static ArrayList n(int i7, Parcel parcel) {
        int Q7 = Q(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (Q7 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + Q7);
        return createStringArrayList;
    }

    public static Object[] o(Parcel parcel, int i7, Parcelable.Creator creator) {
        int Q7 = Q(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (Q7 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + Q7);
        return createTypedArray;
    }

    public static ArrayList p(Parcel parcel, int i7, Parcelable.Creator creator) {
        int Q7 = Q(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (Q7 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + Q7);
        return createTypedArrayList;
    }

    public static Bitmap q(byte[] bArr, int i7) {
        int i8 = 0;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i7, null);
        if (decodeByteArray != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                C1982h c1982h = new C1982h(byteArrayInputStream);
                byteArrayInputStream.close();
                switch (c1982h.c(1, "Orientation")) {
                    case 3:
                    case 4:
                        i8 = 180;
                        break;
                    case 5:
                    case 8:
                        i8 = 270;
                        break;
                    case 6:
                    case 7:
                        i8 = 90;
                        break;
                }
                if (i8 != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i8);
                    return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
                }
                return decodeByteArray;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw J.a(new IllegalStateException(), "Could not decode image data");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, G.a] */
    public static G.a r() {
        if (G.a.f1326a != null) {
            return G.a.f1326a;
        }
        synchronized (G.a.class) {
            try {
                if (G.a.f1326a == null) {
                    G.a.f1326a = new Object();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return G.a.f1326a;
    }

    public static void s(int i7, Parcel parcel) {
        if (parcel.dataPosition() == i7) {
            return;
        }
        throw new C0110x(io.flutter.plugins.pathprovider.b.e(i7, "Overread allowed size end="), parcel);
    }

    public static String t(AbstractC0781h abstractC0781h) {
        StringBuilder sb = new StringBuilder(abstractC0781h.size());
        for (int i7 = 0; i7 < abstractC0781h.size(); i7++) {
            byte e7 = abstractC0781h.e(i7);
            if (e7 != 34) {
                if (e7 != 39) {
                    if (e7 != 92) {
                        switch (e7) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (e7 >= 32 && e7 <= 126) {
                                    sb.append((char) e7);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((e7 >>> 6) & 3) + 48));
                                    sb.append((char) (((e7 >>> 3) & 7) + 48));
                                    sb.append((char) ((e7 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static int u(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return X.c.e(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e7) {
            Log.e("IconCompat", "Unable to get icon resource", e7);
            return 0;
        } catch (NoSuchMethodException e8) {
            Log.e("IconCompat", "Unable to get icon resource", e8);
            return 0;
        } catch (InvocationTargetException e9) {
            Log.e("IconCompat", "Unable to get icon resource", e9);
            return 0;
        }
    }

    public static String v(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return X.c.f(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
        } catch (IllegalAccessException e7) {
            Log.e("IconCompat", "Unable to get icon package", e7);
            return null;
        } catch (NoSuchMethodException e8) {
            Log.e("IconCompat", "Unable to get icon package", e8);
            return null;
        } catch (InvocationTargetException e9) {
            Log.e("IconCompat", "Unable to get icon package", e9);
            return null;
        }
    }

    public static int w(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return X.c.i(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e7) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e7);
            return -1;
        } catch (NoSuchMethodException e8) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e8);
            return -1;
        } catch (InvocationTargetException e9) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e9);
            return -1;
        }
    }

    public static Uri x(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return X.c.j(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e7) {
            Log.e("IconCompat", "Unable to get icon uri", e7);
            return null;
        } catch (NoSuchMethodException e8) {
            Log.e("IconCompat", "Unable to get icon uri", e8);
            return null;
        } catch (InvocationTargetException e9) {
            Log.e("IconCompat", "Unable to get icon uri", e9);
            return null;
        }
    }

    public static boolean y(Context context, String str) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (Build.VERSION.SDK_INT >= 33) {
                of = PackageManager.PackageInfoFlags.of(4096L);
                packageInfo = packageManager.getPackageInfo(packageName, of);
            } else {
                packageInfo = packageManager.getPackageInfo(packageName, RecognitionOptions.AZTEC);
            }
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (str2.equals(str)) {
                        return true;
                    }
                }
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        return false;
    }

    public static G.g z() {
        if (G.g.f1336c != null) {
            return G.g.f1336c;
        }
        synchronized (G.g.class) {
            try {
                if (G.g.f1336c == null) {
                    G.g.f1336c = new G.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return G.g.f1336c;
    }

    public boolean B() {
        throw null;
    }

    public abstract void V(AbstractC0852m abstractC0852m);

    public abstract void W(double d7);

    public abstract void X();

    public abstract void Y(long j);

    public abstract void Z(String str);
}
