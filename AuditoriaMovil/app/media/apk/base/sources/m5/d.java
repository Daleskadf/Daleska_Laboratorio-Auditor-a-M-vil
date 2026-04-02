package m5;

import D.AbstractC0055e;
import D.C0054d;
import F3.o;
import H4.C0160g;
import H4.C0163h0;
import H4.p1;
import K0.x;
import M0.h;
import M0.l;
import X5.C0392s;
import android.content.Context;
import android.content.res.TypedArray;
import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageReader;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import b4.C0610s;
import com.google.android.gms.internal.p002firebaseauthapi.zzagt;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import com.google.protobuf.N0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.j;
import o4.AbstractC1559b;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p5.C1697c;
import q4.s;
import q6.C1715b;
import w.C1908S;
import w6.InterfaceC1959a;
import x.C1967a;
import x.p;
/* loaded from: classes.dex */
public abstract class d {
    public static void A(Parcel parcel, int i7, Parcelable parcelable, int i8, boolean z7) {
        if (parcelable == null) {
            if (z7) {
                K(parcel, i7, 0);
                return;
            }
            return;
        }
        int G2 = G(i7, parcel);
        parcelable.writeToParcel(parcel, i8);
        J(G2, parcel);
    }

    public static void B(Parcel parcel, int i7, String str, boolean z7) {
        if (str == null) {
            if (z7) {
                K(parcel, i7, 0);
                return;
            }
            return;
        }
        int G2 = G(i7, parcel);
        parcel.writeString(str);
        J(G2, parcel);
    }

    public static void C(Parcel parcel, int i7, String[] strArr, boolean z7) {
        if (strArr == null) {
            if (z7) {
                K(parcel, i7, 0);
                return;
            }
            return;
        }
        int G2 = G(i7, parcel);
        parcel.writeStringArray(strArr);
        J(G2, parcel);
    }

    public static void D(Parcel parcel, int i7, List list) {
        if (list == null) {
            return;
        }
        int G2 = G(i7, parcel);
        parcel.writeStringList(list);
        J(G2, parcel);
    }

    public static void E(Parcel parcel, int i7, Parcelable[] parcelableArr, int i8) {
        if (parcelableArr == null) {
            return;
        }
        int G2 = G(i7, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i8);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        J(G2, parcel);
    }

    public static void F(Parcel parcel, int i7, List list, boolean z7) {
        if (list == null) {
            if (z7) {
                K(parcel, i7, 0);
                return;
            }
            return;
        }
        int G2 = G(i7, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            Parcelable parcelable = (Parcelable) list.get(i8);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        J(G2, parcel);
    }

    public static int G(int i7, Parcel parcel) {
        parcel.writeInt(i7 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void J(int i7, Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i7 - 4);
        parcel.writeInt(dataPosition - i7);
        parcel.setDataPosition(dataPosition);
    }

    public static void K(Parcel parcel, int i7, int i8) {
        parcel.writeInt(i7 | (i8 << 16));
    }

    public static void a(h hVar) {
        if (hVar != null) {
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static C0054d b(int i7, int i8, int i9, int i10) {
        return new C0054d(ImageReader.newInstance(i7, i8, i9, i10));
    }

    public static void c(Object obj, String str, String str2) {
        Log.d("TransportRuntime.".concat(str), String.format(str2, obj));
    }

    public static byte[] d(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = i7 * 2;
                int digit = Character.digit(str.charAt(i8), 16);
                int digit2 = Character.digit(str.charAt(i8 + 1), 16);
                if (digit != -1 && digit2 != -1) {
                    bArr[i7] = (byte) ((digit * 16) + digit2);
                } else {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }

    public static String e(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b5 : bArr) {
            int i7 = b5 & ForkServer.ERROR;
            sb.append("0123456789abcdef".charAt(i7 / 16));
            sb.append("0123456789abcdef".charAt(i7 % 16));
        }
        return sb.toString();
    }

    public static final C1715b f(Enum[] entries) {
        j.e(entries, "entries");
        return new C1715b(entries);
    }

    public static void g(String str, Object... objArr) {
        throw new AssertionError("INTERNAL ASSERTION FAILED: ".concat(String.format(str, objArr)));
    }

    public static l h(int i7) {
        int i8 = x.f2529a;
        Locale locale = Locale.US;
        return new l(Uri.parse("rtp://0.0.0.0:" + i7), 1, null, Collections.emptyMap(), 0L, -1L, null, 0);
    }

    public static void i(String str, boolean z7, Object... objArr) {
        if (z7) {
            return;
        }
        g(str, objArr);
        throw null;
    }

    public static void j(Object obj, String str, Object... objArr) {
        if (obj != null) {
            return;
        }
        g(str, objArr);
        throw null;
    }

    public static boolean k(String str, p pVar) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) pVar.b(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i7 : iArr) {
                    if (i7 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (C1967a e7) {
            throw new Exception(new Exception(e7));
        }
    }

    public static boolean l(byte b5) {
        if (b5 > -65) {
            return true;
        }
        return false;
    }

    public static l6.g m(InterfaceC1959a initializer) {
        j.e(initializer, "initializer");
        return new l6.g(initializer);
    }

    public static void n(L5.f binaryMessenger, final C0392s c0392s) {
        Object obj;
        o oVar;
        j.e(binaryMessenger, "binaryMessenger");
        if (c0392s != null && (oVar = c0392s.f6530a) != null) {
            obj = oVar.j();
        } else {
            obj = new Object();
        }
        E.e eVar = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.pigeon_defaultConstructor", obj, null, 4);
        if (c0392s != null) {
            eVar.h0(new L5.b() { // from class: X5.M
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
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(new b0(c0392s2), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var = (b0) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0392s3.getClass();
                                b0Var.f6453c = booleanValue;
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var2 = (b0) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0392s4.getClass();
                                b0Var2.f6454d = booleanValue2;
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var3 = (b0) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0392s5.getClass();
                                b0Var3.f6455e = booleanValue3;
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var4 = (b0) obj10;
                            Object obj11 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0392s6.getClass();
                                b0Var4.f = booleanValue4;
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        default:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var5 = (b0) obj12;
                            Object obj13 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0392s7.getClass();
                                b0Var5.f6456g = booleanValue5;
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
        E.e eVar2 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnShowFileChooser", obj, null, 4);
        if (c0392s != null) {
            eVar2.h0(new L5.b() { // from class: X5.M
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
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(new b0(c0392s2), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var = (b0) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0392s3.getClass();
                                b0Var.f6453c = booleanValue;
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var2 = (b0) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0392s4.getClass();
                                b0Var2.f6454d = booleanValue2;
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var3 = (b0) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0392s5.getClass();
                                b0Var3.f6455e = booleanValue3;
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var4 = (b0) obj10;
                            Object obj11 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0392s6.getClass();
                                b0Var4.f = booleanValue4;
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        default:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var5 = (b0) obj12;
                            Object obj13 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0392s7.getClass();
                                b0Var5.f6456g = booleanValue5;
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
        E.e eVar3 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnConsoleMessage", obj, null, 4);
        if (c0392s != null) {
            eVar3.h0(new L5.b() { // from class: X5.M
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
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(new b0(c0392s2), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var = (b0) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0392s3.getClass();
                                b0Var.f6453c = booleanValue;
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var2 = (b0) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0392s4.getClass();
                                b0Var2.f6454d = booleanValue2;
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var3 = (b0) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0392s5.getClass();
                                b0Var3.f6455e = booleanValue3;
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var4 = (b0) obj10;
                            Object obj11 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0392s6.getClass();
                                b0Var4.f = booleanValue4;
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        default:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var5 = (b0) obj12;
                            Object obj13 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0392s7.getClass();
                                b0Var5.f6456g = booleanValue5;
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
        E.e eVar4 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsAlert", obj, null, 4);
        if (c0392s != null) {
            eVar4.h0(new L5.b() { // from class: X5.M
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
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(new b0(c0392s2), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var = (b0) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0392s3.getClass();
                                b0Var.f6453c = booleanValue;
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var2 = (b0) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0392s4.getClass();
                                b0Var2.f6454d = booleanValue2;
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var3 = (b0) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0392s5.getClass();
                                b0Var3.f6455e = booleanValue3;
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var4 = (b0) obj10;
                            Object obj11 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0392s6.getClass();
                                b0Var4.f = booleanValue4;
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        default:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var5 = (b0) obj12;
                            Object obj13 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0392s7.getClass();
                                b0Var5.f6456g = booleanValue5;
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
        E.e eVar5 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsConfirm", obj, null, 4);
        if (c0392s != null) {
            eVar5.h0(new L5.b() { // from class: X5.M
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
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(new b0(c0392s2), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var = (b0) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0392s3.getClass();
                                b0Var.f6453c = booleanValue;
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var2 = (b0) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0392s4.getClass();
                                b0Var2.f6454d = booleanValue2;
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var3 = (b0) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0392s5.getClass();
                                b0Var3.f6455e = booleanValue3;
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var4 = (b0) obj10;
                            Object obj11 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0392s6.getClass();
                                b0Var4.f = booleanValue4;
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        default:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var5 = (b0) obj12;
                            Object obj13 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0392s7.getClass();
                                b0Var5.f6456g = booleanValue5;
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
        E.e eVar6 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsPrompt", obj, null, 4);
        if (c0392s != null) {
            eVar6.h0(new L5.b() { // from class: X5.M
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
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(new b0(c0392s2), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var = (b0) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0392s3.getClass();
                                b0Var.f6453c = booleanValue;
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var2 = (b0) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0392s4.getClass();
                                b0Var2.f6454d = booleanValue2;
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var3 = (b0) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0392s5.getClass();
                                b0Var3.f6455e = booleanValue3;
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var4 = (b0) obj10;
                            Object obj11 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0392s6.getClass();
                                b0Var4.f = booleanValue4;
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        default:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            b0 b0Var5 = (b0) obj12;
                            Object obj13 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0392s7.getClass();
                                b0Var5.f6456g = booleanValue5;
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

    public static int o(Context context, int i7) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i7});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static ArrayList p(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static void q(Parcel parcel, int i7, Bundle bundle, boolean z7) {
        if (bundle == null) {
            if (z7) {
                K(parcel, i7, 0);
                return;
            }
            return;
        }
        int G2 = G(i7, parcel);
        parcel.writeBundle(bundle);
        J(G2, parcel);
    }

    public static void r(Parcel parcel, int i7, byte[] bArr, boolean z7) {
        if (bArr == null) {
            if (z7) {
                K(parcel, i7, 0);
                return;
            }
            return;
        }
        int G2 = G(i7, parcel);
        parcel.writeByteArray(bArr);
        J(G2, parcel);
    }

    public static void s(Parcel parcel, int i7, Double d7) {
        if (d7 == null) {
            return;
        }
        K(parcel, i7, 8);
        parcel.writeDouble(d7.doubleValue());
    }

    public static void t(Parcel parcel, int i7, float[] fArr, boolean z7) {
        if (fArr == null) {
            if (z7) {
                K(parcel, i7, 0);
                return;
            }
            return;
        }
        int G2 = G(i7, parcel);
        parcel.writeFloatArray(fArr);
        J(G2, parcel);
    }

    public static void u(Parcel parcel, int i7, Float f) {
        if (f == null) {
            return;
        }
        K(parcel, i7, 4);
        parcel.writeFloat(f.floatValue());
    }

    public static void v(Parcel parcel, int i7, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int G2 = G(i7, parcel);
        parcel.writeStrongBinder(iBinder);
        J(G2, parcel);
    }

    public static void w(p1 p1Var, j3.f fVar) {
        long j;
        switch (AbstractC1559b.f14591a[p1Var.R().ordinal()]) {
            case 1:
                fVar.Y(5);
                return;
            case 2:
                fVar.Y(10);
                if (p1Var.H()) {
                    j = 1;
                } else {
                    j = 0;
                }
                fVar.Y(j);
                return;
            case 3:
                double K7 = p1Var.K();
                if (Double.isNaN(K7)) {
                    fVar.Y(13);
                    return;
                }
                fVar.Y(15);
                if (K7 == -0.0d) {
                    fVar.W(0.0d);
                    return;
                } else {
                    fVar.W(K7);
                    return;
                }
            case 4:
                fVar.Y(15);
                fVar.W(p1Var.M());
                return;
            case 5:
                N0 Q7 = p1Var.Q();
                fVar.Y(20);
                fVar.Y(Q7.z());
                fVar.Y(Q7.y());
                return;
            case 6:
                String P7 = p1Var.P();
                fVar.Y(25);
                fVar.Z(P7);
                fVar.Y(2L);
                return;
            case 7:
                fVar.Y(30);
                fVar.V(p1Var.I());
                fVar.Y(2L);
                return;
            case 8:
                String O7 = p1Var.O();
                fVar.Y(37);
                q4.p l8 = q4.p.l(O7);
                int size = l8.f15351a.size();
                for (int i7 = 5; i7 < size; i7++) {
                    String g3 = l8.g(i7);
                    fVar.Y(60);
                    fVar.Z(g3);
                }
                return;
            case 9:
                C1697c L6 = p1Var.L();
                fVar.Y(45);
                fVar.W(L6.y());
                fVar.W(L6.z());
                return;
            case 10:
                p1 p1Var2 = s.f15373a;
                if (s.f15376d.equals(p1Var.N().y().get("__type__"))) {
                    fVar.Y((long) com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                    return;
                } else if (s.j(p1Var)) {
                    Map y2 = p1Var.N().y();
                    fVar.Y(53);
                    int A7 = ((p1) y2.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR)).G().A();
                    fVar.Y(15);
                    fVar.Y(A7);
                    fVar.Y(25);
                    fVar.Z(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
                    w((p1) y2.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR), fVar);
                    return;
                } else {
                    C0163h0 N7 = p1Var.N();
                    fVar.Y(55);
                    for (Map.Entry entry : N7.y().entrySet()) {
                        fVar.Y(25);
                        fVar.Z((String) entry.getKey());
                        w((p1) entry.getValue(), fVar);
                    }
                    fVar.Y(2L);
                    return;
                }
            case 11:
                C0160g G2 = p1Var.G();
                fVar.Y(50);
                for (p1 p1Var3 : G2.a()) {
                    w(p1Var3, fVar);
                }
                fVar.Y(2L);
                return;
            default:
                throw new IllegalArgumentException("unknown index value type " + p1Var.R());
        }
    }

    public static void x(Parcel parcel, int i7, int[] iArr, boolean z7) {
        if (iArr == null) {
            if (z7) {
                K(parcel, i7, 0);
                return;
            }
            return;
        }
        int G2 = G(i7, parcel);
        parcel.writeIntArray(iArr);
        J(G2, parcel);
    }

    public static void y(Parcel parcel, int i7, Integer num) {
        if (num == null) {
            return;
        }
        K(parcel, i7, 4);
        parcel.writeInt(num.intValue());
    }

    public static void z(Parcel parcel, int i7, Long l8) {
        if (l8 == null) {
            return;
        }
        K(parcel, i7, 8);
        parcel.writeLong(l8.longValue());
    }

    public Task H(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction) {
        boolean z7;
        C0610s c0610s = new C0610s(3);
        c0610s.f8291b = this;
        C1908S o7 = firebaseAuth.o();
        if (o7 != null) {
            synchronized (o7.f16112a) {
                try {
                    zzagt zzagtVar = (zzagt) o7.f16114c;
                    if (zzagtVar != null && zzagtVar.zzc("EMAIL_PASSWORD_PROVIDER")) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z7) {
                Task h8 = o7.h(str, Boolean.FALSE, recaptchaAction);
                return h8.continueWithTask(c0610s).continueWithTask(new E.e(str, o7, recaptchaAction, c0610s, 13));
            }
        }
        Task I7 = I(null);
        E.e eVar = new E.e(12, false);
        eVar.f920b = recaptchaAction;
        eVar.f921c = firebaseAuth;
        eVar.f922d = str;
        eVar.f923e = c0610s;
        return I7.continueWithTask(eVar);
    }

    public abstract Task I(String str);
}
