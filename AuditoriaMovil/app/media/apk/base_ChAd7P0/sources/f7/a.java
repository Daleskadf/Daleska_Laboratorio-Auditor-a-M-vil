package f7;

import B2.c;
import D.AbstractC0055e;
import D.AbstractC0059i;
import F3.o;
import F6.C0108v;
import F6.H;
import H3.d;
import H4.e1;
import K0.q;
import K0.x;
import K6.t;
import L5.f;
import W.AbstractC0361d;
import X5.C0396w;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.opengl.Matrix;
import android.os.Binder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import com.example.appecoactivate.R;
import com.google.android.gms.common.internal.I;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.crypto.tink.shaded.protobuf.AbstractC0777d;
import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0785l;
import com.google.crypto.tink.shaded.protobuf.AbstractC0792t;
import com.google.crypto.tink.shaded.protobuf.AbstractC0798z;
import com.google.crypto.tink.shaded.protobuf.C;
import com.google.crypto.tink.shaded.protobuf.D;
import com.google.crypto.tink.shaded.protobuf.F;
import com.google.crypto.tink.shaded.protobuf.M;
import com.google.crypto.tink.shaded.protobuf.W;
import com.google.crypto.tink.shaded.protobuf.g0;
import com.google.crypto.tink.shaded.protobuf.j0;
import com.google.crypto.tink.shaded.protobuf.v0;
import h0.AbstractC1066z;
import h0.C1065y;
import io.flutter.plugins.pathprovider.b;
import j$.util.Objects;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.RoundingMode;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.u;
import o6.EnumC1565a;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
import r3.C1737a;
import w6.InterfaceC1959a;
import w6.l;
import w6.p;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f11072a = false;

    /* renamed from: b  reason: collision with root package name */
    public static Method f11073b;

    /* renamed from: c  reason: collision with root package name */
    public static C1737a f11074c;

    public static int A(byte[] bArr, int i7, C c8, c cVar) {
        AbstractC0798z abstractC0798z = (AbstractC0798z) c8;
        int K7 = K(bArr, i7, cVar);
        int i8 = cVar.f249a + K7;
        while (K7 < i8) {
            K7 = K(bArr, K7, cVar);
            abstractC0798z.h(cVar.f249a);
        }
        if (K7 == i8) {
            return K7;
        }
        throw F.g();
    }

    public static int B(byte[] bArr, int i7, C c8, c cVar) {
        M m7 = (M) c8;
        int K7 = K(bArr, i7, cVar);
        int i8 = cVar.f249a + K7;
        while (K7 < i8) {
            K7 = M(bArr, K7, cVar);
            m7.h(cVar.f250b);
        }
        if (K7 == i8) {
            return K7;
        }
        throw F.g();
    }

    public static int C(int i7, byte[] bArr, int i8, int i9, C c8, c cVar) {
        AbstractC0798z abstractC0798z = (AbstractC0798z) c8;
        int K7 = K(bArr, i8, cVar);
        abstractC0798z.h(d.d(cVar.f249a));
        while (K7 < i9) {
            int K8 = K(bArr, K7, cVar);
            if (i7 != cVar.f249a) {
                break;
            }
            K7 = K(bArr, K8, cVar);
            abstractC0798z.h(d.d(cVar.f249a));
        }
        return K7;
    }

    public static int D(int i7, byte[] bArr, int i8, int i9, C c8, c cVar) {
        M m7 = (M) c8;
        int M7 = M(bArr, i8, cVar);
        m7.h(d.e(cVar.f250b));
        while (M7 < i9) {
            int K7 = K(bArr, M7, cVar);
            if (i7 != cVar.f249a) {
                break;
            }
            M7 = M(bArr, K7, cVar);
            m7.h(d.e(cVar.f250b));
        }
        return M7;
    }

    public static int E(byte[] bArr, int i7, c cVar) {
        int K7 = K(bArr, i7, cVar);
        int i8 = cVar.f249a;
        if (i8 >= 0) {
            if (i8 == 0) {
                cVar.f251c = StringUtils.EMPTY;
                return K7;
            }
            cVar.f251c = new String(bArr, K7, i8, D.f9598a);
            return K7 + i8;
        }
        throw F.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x001a -> B:9:0x001b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int F(int r4, byte[] r5, int r6, int r7, com.google.crypto.tink.shaded.protobuf.C r8, B2.c r9) {
        /*
            int r6 = K(r5, r6, r9)
            int r0 = r9.f249a
            if (r0 < 0) goto L45
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r8.add(r1)
            goto L1b
        L10:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.D.f9598a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
        L1a:
            int r6 = r6 + r0
        L1b:
            if (r6 >= r7) goto L44
            int r0 = K(r5, r6, r9)
            int r2 = r9.f249a
            if (r4 == r2) goto L26
            goto L44
        L26:
            int r6 = K(r5, r0, r9)
            int r0 = r9.f249a
            if (r0 < 0) goto L3f
            if (r0 != 0) goto L34
            r8.add(r1)
            goto L1b
        L34:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.D.f9598a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
            goto L1a
        L3f:
            com.google.crypto.tink.shaded.protobuf.F r4 = com.google.crypto.tink.shaded.protobuf.F.e()
            throw r4
        L44:
            return r6
        L45:
            com.google.crypto.tink.shaded.protobuf.F r4 = com.google.crypto.tink.shaded.protobuf.F.e()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.a.F(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.C, B2.c):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0025). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int G(int r5, byte[] r6, int r7, int r8, com.google.crypto.tink.shaded.protobuf.C r9, B2.c r10) {
        /*
            int r7 = K(r6, r7, r10)
            int r0 = r10.f249a
            if (r0 < 0) goto L63
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r9.add(r1)
            goto L25
        L10:
            int r2 = r7 + r0
            org.slf4j.helpers.i r3 = com.google.crypto.tink.shaded.protobuf.v0.f9700a
            int r3 = r3.K(r6, r7, r2)
            if (r3 != 0) goto L5e
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.D.f9598a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
        L24:
            r7 = r2
        L25:
            if (r7 >= r8) goto L5d
            int r0 = K(r6, r7, r10)
            int r2 = r10.f249a
            if (r5 == r2) goto L30
            goto L5d
        L30:
            int r7 = K(r6, r0, r10)
            int r0 = r10.f249a
            if (r0 < 0) goto L58
            if (r0 != 0) goto L3e
            r9.add(r1)
            goto L25
        L3e:
            int r2 = r7 + r0
            org.slf4j.helpers.i r3 = com.google.crypto.tink.shaded.protobuf.v0.f9700a
            int r3 = r3.K(r6, r7, r2)
            if (r3 != 0) goto L53
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.D.f9598a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
            goto L24
        L53:
            com.google.crypto.tink.shaded.protobuf.F r5 = com.google.crypto.tink.shaded.protobuf.F.b()
            throw r5
        L58:
            com.google.crypto.tink.shaded.protobuf.F r5 = com.google.crypto.tink.shaded.protobuf.F.e()
            throw r5
        L5d:
            return r7
        L5e:
            com.google.crypto.tink.shaded.protobuf.F r5 = com.google.crypto.tink.shaded.protobuf.F.b()
            throw r5
        L63:
            com.google.crypto.tink.shaded.protobuf.F r5 = com.google.crypto.tink.shaded.protobuf.F.e()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.a.G(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.C, B2.c):int");
    }

    public static int H(byte[] bArr, int i7, c cVar) {
        int K7 = K(bArr, i7, cVar);
        int i8 = cVar.f249a;
        if (i8 >= 0) {
            if (i8 == 0) {
                cVar.f251c = StringUtils.EMPTY;
                return K7;
            }
            cVar.f251c = v0.f9700a.n(bArr, K7, i8);
            return K7 + i8;
        }
        throw F.e();
    }

    public static int I(int i7, byte[] bArr, int i8, int i9, j0 j0Var, c cVar) {
        if ((i7 >>> 3) != 0) {
            int i10 = i7 & 7;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 5) {
                                j0Var.d(i7, Integer.valueOf(l(bArr, i8)));
                                return i8 + 4;
                            }
                            throw F.a();
                        }
                        j0 c8 = j0.c();
                        int i11 = (i7 & (-8)) | 4;
                        int i12 = 0;
                        while (true) {
                            if (i8 >= i9) {
                                break;
                            }
                            int K7 = K(bArr, i8, cVar);
                            int i13 = cVar.f249a;
                            if (i13 == i11) {
                                i12 = i13;
                                i8 = K7;
                                break;
                            }
                            i12 = i13;
                            i8 = I(i13, bArr, K7, i9, c8, cVar);
                        }
                        if (i8 <= i9 && i12 == i11) {
                            j0Var.d(i7, c8);
                            return i8;
                        }
                        throw F.f();
                    }
                    int K8 = K(bArr, i8, cVar);
                    int i14 = cVar.f249a;
                    if (i14 >= 0) {
                        if (i14 <= bArr.length - K8) {
                            if (i14 == 0) {
                                j0Var.d(i7, AbstractC0781h.f9648b);
                            } else {
                                j0Var.d(i7, AbstractC0781h.h(bArr, K8, i14));
                            }
                            return K8 + i14;
                        }
                        throw F.g();
                    }
                    throw F.e();
                }
                j0Var.d(i7, Long.valueOf(n(bArr, i8)));
                return i8 + 8;
            }
            int M7 = M(bArr, i8, cVar);
            j0Var.d(i7, Long.valueOf(cVar.f250b));
            return M7;
        }
        throw F.a();
    }

    public static int J(int i7, byte[] bArr, int i8, c cVar) {
        int i9 = i7 & 127;
        int i10 = i8 + 1;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            cVar.f249a = i9 | (b5 << 7);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 7);
        int i12 = i8 + 2;
        byte b7 = bArr[i10];
        if (b7 >= 0) {
            cVar.f249a = i11 | (b7 << 14);
            return i12;
        }
        int i13 = i11 | ((b7 & Byte.MAX_VALUE) << 14);
        int i14 = i8 + 3;
        byte b8 = bArr[i12];
        if (b8 >= 0) {
            cVar.f249a = i13 | (b8 << 21);
            return i14;
        }
        int i15 = i13 | ((b8 & Byte.MAX_VALUE) << 21);
        int i16 = i8 + 4;
        byte b9 = bArr[i14];
        if (b9 >= 0) {
            cVar.f249a = i15 | (b9 << 28);
            return i16;
        }
        int i17 = i15 | ((b9 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] < 0) {
                i16 = i18;
            } else {
                cVar.f249a = i17;
                return i18;
            }
        }
    }

    public static int K(byte[] bArr, int i7, c cVar) {
        int i8 = i7 + 1;
        byte b5 = bArr[i7];
        if (b5 >= 0) {
            cVar.f249a = b5;
            return i8;
        }
        return J(b5, bArr, i8, cVar);
    }

    public static int L(int i7, byte[] bArr, int i8, int i9, C c8, c cVar) {
        AbstractC0798z abstractC0798z = (AbstractC0798z) c8;
        int K7 = K(bArr, i8, cVar);
        abstractC0798z.h(cVar.f249a);
        while (K7 < i9) {
            int K8 = K(bArr, K7, cVar);
            if (i7 != cVar.f249a) {
                break;
            }
            K7 = K(bArr, K8, cVar);
            abstractC0798z.h(cVar.f249a);
        }
        return K7;
    }

    public static int M(byte[] bArr, int i7, c cVar) {
        byte b5;
        int i8 = i7 + 1;
        long j = bArr[i7];
        if (j >= 0) {
            cVar.f250b = j;
            return i8;
        }
        int i9 = i7 + 2;
        byte b7 = bArr[i8];
        long j8 = (j & 127) | ((b7 & Byte.MAX_VALUE) << 7);
        int i10 = 7;
        while (b7 < 0) {
            int i11 = i9 + 1;
            i10 += 7;
            j8 |= (b5 & Byte.MAX_VALUE) << i10;
            b7 = bArr[i9];
            i9 = i11;
        }
        cVar.f250b = j8;
        return i9;
    }

    public static int N(int i7, byte[] bArr, int i8, int i9, C c8, c cVar) {
        M m7 = (M) c8;
        int M7 = M(bArr, i8, cVar);
        m7.h(cVar.f250b);
        while (M7 < i9) {
            int K7 = K(bArr, M7, cVar);
            if (i7 != cVar.f249a) {
                break;
            }
            M7 = M(bArr, K7, cVar);
            m7.h(cVar.f250b);
        }
        return M7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [h0.y, java.lang.Object] */
    public static boolean O(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        Field field = AbstractC1066z.f11214a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C1065y.f11210d;
        C1065y c1065y = (C1065y) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        C1065y c1065y2 = c1065y;
        if (c1065y == null) {
            ?? obj = new Object();
            obj.f11211a = null;
            obj.f11212b = null;
            obj.f11213c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, obj);
            c1065y2 = obj;
        }
        WeakReference weakReference2 = c1065y2.f11213c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c1065y2.f11213c = new WeakReference(keyEvent);
        if (c1065y2.f11212b == null) {
            c1065y2.f11212b = new SparseArray();
        }
        SparseArray sparseArray = c1065y2.f11212b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static int P(int i7, int i8, RoundingMode roundingMode) {
        boolean z7;
        roundingMode.getClass();
        if (i8 != 0) {
            int i9 = i7 / i8;
            int i10 = i7 - (i8 * i9);
            if (i10 == 0) {
                return i9;
            }
            boolean z8 = true;
            int i11 = ((i7 ^ i8) >> 31) | 1;
            switch (C3.d.f531a[roundingMode.ordinal()]) {
                case 1:
                    if (i10 == 0) {
                        return i9;
                    }
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                case 2:
                    return i9;
                case 3:
                    if (i11 >= 0) {
                        return i9;
                    }
                    break;
                case 4:
                    break;
                case 5:
                    if (i11 <= 0) {
                        return i9;
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    int abs = Math.abs(i10);
                    int abs2 = abs - (Math.abs(i8) - abs);
                    if (abs2 == 0) {
                        if (roundingMode != RoundingMode.HALF_UP) {
                            if (roundingMode == RoundingMode.HALF_EVEN) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if ((i9 & 1) == 0) {
                                z8 = false;
                            }
                            if (!(z7 & z8)) {
                                return i9;
                            }
                        }
                    } else if (abs2 <= 0) {
                        return i9;
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            return i9 + i11;
        }
        throw new ArithmeticException("/ by zero");
    }

    public static final Class R(e eVar) {
        Class a7 = eVar.a();
        j.c(a7, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a7;
    }

    public static final Class S(C6.c cVar) {
        j.e(cVar, "<this>");
        Class a7 = ((kotlin.jvm.internal.d) cVar).a();
        if (!a7.isPrimitive()) {
            return a7;
        }
        String name = a7.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.class;
                }
                return a7;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return a7;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return a7;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return a7;
            case 3327612:
                if (name.equals("long")) {
                    return Long.class;
                }
                return a7;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return a7;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.class;
                }
                return a7;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return a7;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return a7;
            default:
                return a7;
        }
    }

    public static File W(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i7 = 0; i7 < 100; i7++) {
            File file = new File(cacheDir, str + i7);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a0(int i7, RoundingMode roundingMode) {
        boolean z7;
        if (i7 > 0) {
            boolean z8 = true;
            switch (C3.d.f531a[roundingMode.ordinal()]) {
                case 1:
                    if (i7 > 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (((i7 - 1) & i7) != 0) {
                        z8 = false;
                    }
                    if (!(z7 & z8)) {
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    }
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    return 32 - Integer.numberOfLeadingZeros(i7 - 1);
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i7);
                    return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i7))) >>> 31);
                default:
                    throw new AssertionError();
            }
            return 31 - Integer.numberOfLeadingZeros(i7);
        }
        throw new IllegalArgumentException(b.f("x (", i7, ") must be > 0"));
    }

    public static int b(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String permissionToOp = AppOpsManager.permissionToOp(str);
        if (permissionToOp != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 == myUid && Objects.equals(packageName2, packageName)) {
                if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    int callingUid = Binder.getCallingUid();
                    int i7 = 1;
                    if (appOpsManager == null) {
                        noteProxyOpNoThrow = 1;
                    } else {
                        noteProxyOpNoThrow = appOpsManager.checkOpNoThrow(permissionToOp, callingUid, packageName);
                    }
                    if (noteProxyOpNoThrow == 0) {
                        String a7 = AbstractC0361d.a(context);
                        if (appOpsManager != null) {
                            i7 = appOpsManager.checkOpNoThrow(permissionToOp, myUid, a7);
                        }
                        noteProxyOpNoThrow = i7;
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
            } else {
                noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
            }
            if (noteProxyOpNoThrow != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static int b0(Object obj, g0 g0Var, byte[] bArr, int i7, int i8, int i9, c cVar) {
        int I7 = ((W) g0Var).I(obj, bArr, i7, i8, i9, cVar);
        cVar.f251c = obj;
        return I7;
    }

    public static int c(int i7, int i8) {
        boolean z7;
        long j = i7 + i8;
        int i9 = (int) j;
        if (j == i9) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            return i9;
        }
        throw new ArithmeticException(AbstractC0059i.y("overflow: checkedAdd(", i7, ", ", i8, ")"));
    }

    public static int c0(Object obj, g0 g0Var, byte[] bArr, int i7, int i8, c cVar) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = J(i10, bArr, i9, cVar);
            i10 = cVar.f249a;
        }
        int i11 = i9;
        if (i10 >= 0 && i10 <= i8 - i11) {
            int i12 = i10 + i11;
            g0Var.f(obj, bArr, i11, i12, cVar);
            cVar.f251c = obj;
            return i12;
        }
        throw F.g();
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static MappedByteBuffer d0(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
            fileInputStream.close();
            openFileDescriptor.close();
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    public static boolean e(File file, Resources resources, int i7) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i7);
            try {
                boolean f = f(file, inputStream);
                d(inputStream);
                return f;
            } catch (Throwable th) {
                th = th;
                d(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static int e0(int i7) {
        int i8 = i7 % 65536;
        if (i8 < 0) {
            return i8 + 65536;
        }
        return i8;
    }

    public static boolean f(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e7) {
                e = e7;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[RecognitionOptions.UPC_E];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    d(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
            }
        } catch (IOException e8) {
            e = e8;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            d(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            d(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static int g(int i7, byte[] bArr, int i8, int i9, C c8, c cVar) {
        boolean z7;
        boolean z8;
        AbstractC0777d abstractC0777d = (AbstractC0777d) c8;
        int M7 = M(bArr, i8, cVar);
        if (cVar.f250b != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        abstractC0777d.h(z7);
        while (M7 < i9) {
            int K7 = K(bArr, M7, cVar);
            if (i7 != cVar.f249a) {
                break;
            }
            M7 = M(bArr, K7, cVar);
            if (cVar.f250b != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            abstractC0777d.h(z8);
        }
        return M7;
    }

    public static int h(byte[] bArr, int i7, c cVar) {
        int K7 = K(bArr, i7, cVar);
        int i8 = cVar.f249a;
        if (i8 >= 0) {
            if (i8 <= bArr.length - K7) {
                if (i8 == 0) {
                    cVar.f251c = AbstractC0781h.f9648b;
                    return K7;
                }
                cVar.f251c = AbstractC0781h.h(bArr, K7, i8);
                return K7 + i8;
            }
            throw F.g();
        }
        throw F.e();
    }

    public static void h0(float[] fArr, float f) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x001b -> B:10:0x001c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int i(int r2, byte[] r3, int r4, int r5, com.google.crypto.tink.shaded.protobuf.C r6, B2.c r7) {
        /*
            int r4 = K(r3, r4, r7)
            int r0 = r7.f249a
            if (r0 < 0) goto L53
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L4e
            if (r0 != 0) goto L14
            com.google.crypto.tink.shaded.protobuf.g r0 = com.google.crypto.tink.shaded.protobuf.AbstractC0781h.f9648b
            r6.add(r0)
            goto L1c
        L14:
            com.google.crypto.tink.shaded.protobuf.g r1 = com.google.crypto.tink.shaded.protobuf.AbstractC0781h.h(r3, r4, r0)
            r6.add(r1)
        L1b:
            int r4 = r4 + r0
        L1c:
            if (r4 >= r5) goto L4d
            int r0 = K(r3, r4, r7)
            int r1 = r7.f249a
            if (r2 == r1) goto L27
            goto L4d
        L27:
            int r4 = K(r3, r0, r7)
            int r0 = r7.f249a
            if (r0 < 0) goto L48
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L43
            if (r0 != 0) goto L3b
            com.google.crypto.tink.shaded.protobuf.g r0 = com.google.crypto.tink.shaded.protobuf.AbstractC0781h.f9648b
            r6.add(r0)
            goto L1c
        L3b:
            com.google.crypto.tink.shaded.protobuf.g r1 = com.google.crypto.tink.shaded.protobuf.AbstractC0781h.h(r3, r4, r0)
            r6.add(r1)
            goto L1b
        L43:
            com.google.crypto.tink.shaded.protobuf.F r2 = com.google.crypto.tink.shaded.protobuf.F.g()
            throw r2
        L48:
            com.google.crypto.tink.shaded.protobuf.F r2 = com.google.crypto.tink.shaded.protobuf.F.e()
            throw r2
        L4d:
            return r4
        L4e:
            com.google.crypto.tink.shaded.protobuf.F r2 = com.google.crypto.tink.shaded.protobuf.F.g()
            throw r2
        L53:
            com.google.crypto.tink.shaded.protobuf.F r2 = com.google.crypto.tink.shaded.protobuf.F.e()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.a.i(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.C, B2.c):int");
    }

    public static void i0(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }

    public static double j(byte[] bArr, int i7) {
        return Double.longBitsToDouble(n(bArr, i7));
    }

    public static long j0(q qVar, int i7, int i8) {
        qVar.G(i7);
        if (qVar.a() < 5) {
            return -9223372036854775807L;
        }
        int h8 = qVar.h();
        if ((8388608 & h8) != 0 || ((2096896 & h8) >> 8) != i8 || (h8 & 32) == 0 || qVar.u() < 7 || qVar.a() < 7 || (qVar.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        qVar.f(bArr, 0, 6);
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((bArr[4] & 255) >> 7);
    }

    public static int k(int i7, byte[] bArr, int i8, int i9, C c8, c cVar) {
        AbstractC0785l abstractC0785l = (AbstractC0785l) c8;
        abstractC0785l.h(j(bArr, i8));
        int i10 = i8 + 8;
        while (i10 < i9) {
            int K7 = K(bArr, i10, cVar);
            if (i7 != cVar.f249a) {
                break;
            }
            abstractC0785l.h(Double.longBitsToDouble(n(bArr, K7)));
            i10 = K7 + 8;
        }
        return i10;
    }

    public static int l(byte[] bArr, int i7) {
        return ((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (bArr[i7] & ForkServer.ERROR) | ((bArr[i7 + 1] & ForkServer.ERROR) << 8) | ((bArr[i7 + 2] & ForkServer.ERROR) << 16);
    }

    public static int l0(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static int m(int i7, byte[] bArr, int i8, int i9, C c8, c cVar) {
        AbstractC0798z abstractC0798z = (AbstractC0798z) c8;
        abstractC0798z.h(l(bArr, i8));
        int i10 = i8 + 4;
        while (i10 < i9) {
            int K7 = K(bArr, i10, cVar);
            if (i7 != cVar.f249a) {
                break;
            }
            abstractC0798z.h(l(bArr, K7));
            i10 = K7 + 4;
        }
        return i10;
    }

    public static long n(byte[] bArr, int i7) {
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public static void n0(f binaryMessenger, final C0396w c0396w) {
        Object obj;
        o oVar;
        j.e(binaryMessenger, "binaryMessenger");
        if (c0396w != null && (oVar = c0396w.f6533a) != null) {
            obj = oVar.j();
        } else {
            obj = new Object();
        }
        E.e eVar = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedBy", obj, null, 4);
        if (c0396w != null) {
            eVar.h0(new L5.b() { // from class: X5.H
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    Long l8;
                    List E9;
                    Long l9;
                    List E10;
                    X509Certificate x509Certificate;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c0396w2.getClass();
                                E4 = G.i.A(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0396w3.getClass();
                                E7 = G.i.A(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c0396w4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                if (validNotAfterDate != null) {
                                    l8 = Long.valueOf(validNotAfterDate.getTime());
                                } else {
                                    l8 = null;
                                }
                                E8 = G.i.A(l8);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0396w c0396w5 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c0396w5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                if (validNotBeforeDate != null) {
                                    l9 = Long.valueOf(validNotBeforeDate.getTime());
                                } else {
                                    l9 = null;
                                }
                                E9 = G.i.A(l9);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        default:
                            C0396w c0396w6 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z7 = false;
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c0396w6.f6533a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    z7 = true;
                                }
                                if (z7) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                E10 = G.i.A(x509Certificate);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                    }
                }
            });
        } else {
            eVar.h0(null);
        }
        E.e eVar2 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedTo", obj, null, 4);
        if (c0396w != null) {
            eVar2.h0(new L5.b() { // from class: X5.H
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    Long l8;
                    List E9;
                    Long l9;
                    List E10;
                    X509Certificate x509Certificate;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c0396w2.getClass();
                                E4 = G.i.A(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0396w3.getClass();
                                E7 = G.i.A(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c0396w4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                if (validNotAfterDate != null) {
                                    l8 = Long.valueOf(validNotAfterDate.getTime());
                                } else {
                                    l8 = null;
                                }
                                E8 = G.i.A(l8);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0396w c0396w5 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c0396w5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                if (validNotBeforeDate != null) {
                                    l9 = Long.valueOf(validNotBeforeDate.getTime());
                                } else {
                                    l9 = null;
                                }
                                E9 = G.i.A(l9);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        default:
                            C0396w c0396w6 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z7 = false;
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c0396w6.f6533a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    z7 = true;
                                }
                                if (z7) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                E10 = G.i.A(x509Certificate);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                    }
                }
            });
        } else {
            eVar2.h0(null);
        }
        E.e eVar3 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotAfterMsSinceEpoch", obj, null, 4);
        if (c0396w != null) {
            eVar3.h0(new L5.b() { // from class: X5.H
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    Long l8;
                    List E9;
                    Long l9;
                    List E10;
                    X509Certificate x509Certificate;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c0396w2.getClass();
                                E4 = G.i.A(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0396w3.getClass();
                                E7 = G.i.A(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c0396w4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                if (validNotAfterDate != null) {
                                    l8 = Long.valueOf(validNotAfterDate.getTime());
                                } else {
                                    l8 = null;
                                }
                                E8 = G.i.A(l8);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0396w c0396w5 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c0396w5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                if (validNotBeforeDate != null) {
                                    l9 = Long.valueOf(validNotBeforeDate.getTime());
                                } else {
                                    l9 = null;
                                }
                                E9 = G.i.A(l9);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        default:
                            C0396w c0396w6 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z7 = false;
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c0396w6.f6533a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    z7 = true;
                                }
                                if (z7) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                E10 = G.i.A(x509Certificate);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                    }
                }
            });
        } else {
            eVar3.h0(null);
        }
        E.e eVar4 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotBeforeMsSinceEpoch", obj, null, 4);
        if (c0396w != null) {
            eVar4.h0(new L5.b() { // from class: X5.H
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    Long l8;
                    List E9;
                    Long l9;
                    List E10;
                    X509Certificate x509Certificate;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c0396w2.getClass();
                                E4 = G.i.A(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0396w3.getClass();
                                E7 = G.i.A(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c0396w4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                if (validNotAfterDate != null) {
                                    l8 = Long.valueOf(validNotAfterDate.getTime());
                                } else {
                                    l8 = null;
                                }
                                E8 = G.i.A(l8);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0396w c0396w5 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c0396w5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                if (validNotBeforeDate != null) {
                                    l9 = Long.valueOf(validNotBeforeDate.getTime());
                                } else {
                                    l9 = null;
                                }
                                E9 = G.i.A(l9);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        default:
                            C0396w c0396w6 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z7 = false;
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c0396w6.f6533a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    z7 = true;
                                }
                                if (z7) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                E10 = G.i.A(x509Certificate);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                    }
                }
            });
        } else {
            eVar4.h0(null);
        }
        E.e eVar5 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getX509Certificate", obj, null, 4);
        if (c0396w != null) {
            eVar5.h0(new L5.b() { // from class: X5.H
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    Long l8;
                    List E9;
                    Long l9;
                    List E10;
                    X509Certificate x509Certificate;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c0396w2.getClass();
                                E4 = G.i.A(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0396w3.getClass();
                                E7 = G.i.A(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c0396w4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                if (validNotAfterDate != null) {
                                    l8 = Long.valueOf(validNotAfterDate.getTime());
                                } else {
                                    l8 = null;
                                }
                                E8 = G.i.A(l8);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0396w c0396w5 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c0396w5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                if (validNotBeforeDate != null) {
                                    l9 = Long.valueOf(validNotBeforeDate.getTime());
                                } else {
                                    l9 = null;
                                }
                                E9 = G.i.A(l9);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        default:
                            C0396w c0396w6 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z7 = false;
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c0396w6.f6533a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    z7 = true;
                                }
                                if (z7) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                E10 = G.i.A(x509Certificate);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                    }
                }
            });
        } else {
            eVar5.h0(null);
        }
    }

    public static int o(int i7, byte[] bArr, int i8, int i9, C c8, c cVar) {
        M m7 = (M) c8;
        m7.h(n(bArr, i8));
        int i10 = i8 + 8;
        while (i10 < i9) {
            int K7 = K(bArr, i10, cVar);
            if (i7 != cVar.f249a) {
                break;
            }
            m7.h(n(bArr, K7));
            i10 = K7 + 8;
        }
        return i10;
    }

    public static final Object o0(t tVar, t tVar2, p pVar) {
        Object c0108v;
        Object D4;
        try {
            u.b(2, pVar);
            c0108v = pVar.invoke(tVar2, tVar);
        } catch (Throwable th) {
            c0108v = new C0108v(false, th);
        }
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        if (c0108v != enumC1565a && (D4 = tVar.D(c0108v)) != H.f1224e) {
            if (!(D4 instanceof C0108v)) {
                return H.w(D4);
            }
            throw ((C0108v) D4).f1316a;
        }
        return enumC1565a;
    }

    public static float p(byte[] bArr, int i7) {
        return Float.intBitsToFloat(l(bArr, i7));
    }

    public static long p0(long j, long j8, long j9, int i7) {
        int i8 = x.f2529a;
        return j + x.U(j8 - j9, 1000000L, i7, RoundingMode.FLOOR);
    }

    public static int q(int i7, byte[] bArr, int i8, int i9, C c8, c cVar) {
        AbstractC0792t abstractC0792t = (AbstractC0792t) c8;
        abstractC0792t.h(p(bArr, i8));
        int i10 = i8 + 4;
        while (i10 < i9) {
            int K7 = K(bArr, i10, cVar);
            if (i7 != cVar.f249a) {
                break;
            }
            abstractC0792t.h(Float.intBitsToFloat(l(bArr, K7)));
            i10 = K7 + 4;
        }
        return i10;
    }

    public static int r(g0 g0Var, int i7, byte[] bArr, int i8, int i9, C c8, c cVar) {
        int i10 = (i7 & (-8)) | 4;
        Object newInstance = g0Var.newInstance();
        int b0 = b0(newInstance, g0Var, bArr, i8, i9, i10, cVar);
        g0Var.b(newInstance);
        cVar.f251c = newInstance;
        c8.add(newInstance);
        while (b0 < i9) {
            int K7 = K(bArr, b0, cVar);
            if (i7 != cVar.f249a) {
                break;
            }
            Object newInstance2 = g0Var.newInstance();
            int b02 = b0(newInstance2, g0Var, bArr, K7, i9, i10, cVar);
            g0Var.b(newInstance2);
            cVar.f251c = newInstance2;
            c8.add(newInstance2);
            b0 = b02;
        }
        return b0;
    }

    public static ArrayList r0(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof io.flutter.plugins.googlesignin.e) {
            io.flutter.plugins.googlesignin.e eVar = (io.flutter.plugins.googlesignin.e) th;
            arrayList.add(eVar.f12324a);
            arrayList.add(eVar.getMessage());
            arrayList.add(null);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }

    public static int s(g0 g0Var, int i7, byte[] bArr, int i8, int i9, C c8, c cVar) {
        Object newInstance = g0Var.newInstance();
        int c02 = c0(newInstance, g0Var, bArr, i8, i9, cVar);
        g0Var.b(newInstance);
        cVar.f251c = newInstance;
        c8.add(newInstance);
        while (c02 < i9) {
            int K7 = K(bArr, c02, cVar);
            if (i7 != cVar.f249a) {
                break;
            }
            Object newInstance2 = g0Var.newInstance();
            int c03 = c0(newInstance2, g0Var, bArr, K7, i9, cVar);
            g0Var.b(newInstance2);
            cVar.f251c = newInstance2;
            c8.add(newInstance2);
            c02 = c03;
        }
        return c02;
    }

    public static int s0(int i7) {
        switch (i7) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static int t(byte[] bArr, int i7, C c8, c cVar) {
        boolean z7;
        AbstractC0777d abstractC0777d = (AbstractC0777d) c8;
        int K7 = K(bArr, i7, cVar);
        int i8 = cVar.f249a + K7;
        while (K7 < i8) {
            K7 = M(bArr, K7, cVar);
            if (cVar.f250b != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            abstractC0777d.h(z7);
        }
        if (K7 == i8) {
            return K7;
        }
        throw F.g();
    }

    public static C1737a t0() {
        C1737a c1737a = f11074c;
        I.j(c1737a, "CameraUpdateFactory is not initialized");
        return c1737a;
    }

    public static int u(byte[] bArr, int i7, C c8, c cVar) {
        AbstractC0785l abstractC0785l = (AbstractC0785l) c8;
        int K7 = K(bArr, i7, cVar);
        int i8 = cVar.f249a + K7;
        while (K7 < i8) {
            abstractC0785l.h(Double.longBitsToDouble(n(bArr, K7)));
            K7 += 8;
        }
        if (K7 == i8) {
            return K7;
        }
        throw F.g();
    }

    public static int v(byte[] bArr, int i7, C c8, c cVar) {
        AbstractC0798z abstractC0798z = (AbstractC0798z) c8;
        int K7 = K(bArr, i7, cVar);
        int i8 = cVar.f249a + K7;
        while (K7 < i8) {
            abstractC0798z.h(l(bArr, K7));
            K7 += 4;
        }
        if (K7 == i8) {
            return K7;
        }
        throw F.g();
    }

    public static int w(byte[] bArr, int i7, C c8, c cVar) {
        M m7 = (M) c8;
        int K7 = K(bArr, i7, cVar);
        int i8 = cVar.f249a + K7;
        while (K7 < i8) {
            m7.h(n(bArr, K7));
            K7 += 8;
        }
        if (K7 == i8) {
            return K7;
        }
        throw F.g();
    }

    public static int x(byte[] bArr, int i7, C c8, c cVar) {
        AbstractC0792t abstractC0792t = (AbstractC0792t) c8;
        int K7 = K(bArr, i7, cVar);
        int i8 = cVar.f249a + K7;
        while (K7 < i8) {
            abstractC0792t.h(Float.intBitsToFloat(l(bArr, K7)));
            K7 += 4;
        }
        if (K7 == i8) {
            return K7;
        }
        throw F.g();
    }

    public static int y(byte[] bArr, int i7, C c8, c cVar) {
        AbstractC0798z abstractC0798z = (AbstractC0798z) c8;
        int K7 = K(bArr, i7, cVar);
        int i8 = cVar.f249a + K7;
        while (K7 < i8) {
            K7 = K(bArr, K7, cVar);
            abstractC0798z.h(d.d(cVar.f249a));
        }
        if (K7 == i8) {
            return K7;
        }
        throw F.g();
    }

    public static int z(byte[] bArr, int i7, C c8, c cVar) {
        M m7 = (M) c8;
        int K7 = K(bArr, i7, cVar);
        int i8 = cVar.f249a + K7;
        while (K7 < i8) {
            K7 = M(bArr, K7, cVar);
            m7.h(d.e(cVar.f250b));
        }
        if (K7 == i8) {
            return K7;
        }
        throw F.g();
    }

    public abstract j7.a Q();

    public abstract InterfaceC1959a T();

    public abstract l U();

    public abstract k7.o V();

    public void X(int i7) {
        if (i7 != -2) {
            if (i7 != -1) {
                if (i7 == 1) {
                    T().invoke();
                    return;
                }
                return;
            }
            U().invoke(Boolean.FALSE);
            return;
        }
        U().invoke(Boolean.TRUE);
    }

    public abstract void Y();

    public abstract boolean Z();

    public abstract void f0(Throwable th);

    public abstract void g0(E.e eVar);

    public abstract void k0();

    public abstract void m0(j7.a aVar);

    public abstract void q0();
}
