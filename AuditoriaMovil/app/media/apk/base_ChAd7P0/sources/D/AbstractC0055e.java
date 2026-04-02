package D;

import X5.C0375a;
import a.AbstractC0412a;
import a4.AbstractC0456e;
import a4.C0448A;
import a4.C0449B;
import a4.C0453b;
import a4.C0454c;
import a4.C0457f;
import a4.C0458g;
import a4.C0468q;
import a4.C0469s;
import a5.C0470a;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugins.firebase.auth.C1140c;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l5.C1423a;
import m6.AbstractC1448i;
import org.apache.tika.fork.ForkServer;
import p.V0;
import p.X0;
import z.AbstractC2038a;
/* renamed from: D.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0055e {

    /* renamed from: a  reason: collision with root package name */
    public static Class f691a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f692b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f693c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f694d;

    public static U.l A(List list, G.k kVar, G.e eVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(H.i.d(((androidx.camera.core.impl.J) it.next()).c()));
        }
        return AbstractC0412a.s(new M.b(AbstractC0412a.s(new H.e(new H.m(new ArrayList(arrayList), false, j3.f.r()), eVar, 5000L)), kVar, list, 2));
    }

    public static void B(byte[] bArr, long j, int i7) {
        int i8 = 0;
        while (i8 < 4) {
            bArr[i7 + i8] = (byte) (255 & j);
            i8++;
            j >>= 8;
        }
    }

    public static K5.d C(Object obj) {
        return new K5.d(obj.getClass().getSimpleName());
    }

    public static ArrayList D(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static List E(Throwable th) {
        if (th instanceof C0375a) {
            C0375a c0375a = (C0375a) th;
            return AbstractC1448i.L(c0375a.f6445a, ((C0375a) th).f6446b, c0375a.f6447c);
        }
        String simpleName = th.getClass().getSimpleName();
        String th2 = th.toString();
        Throwable cause = th.getCause();
        String stackTraceString = Log.getStackTraceString(th);
        return AbstractC1448i.L(simpleName, th2, "Cause: " + cause + ", Stacktrace: " + stackTraceString);
    }

    public static final void G(Image.Plane plane, int i7, int i8, byte[] bArr, int i9, int i10) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i11 = i7 / (i8 / rowStride);
        int i12 = 0;
        for (int i13 = 0; i13 < rowStride; i13++) {
            int i14 = i12;
            for (int i15 = 0; i15 < i11; i15++) {
                bArr[i9] = buffer.get(i14);
                i9 += i10;
                i14 += plane.getPixelStride();
            }
            i12 += plane.getRowStride();
        }
    }

    public static void a(String str, boolean z7, Object... objArr) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            byte b5 = 0;
            long o7 = o(bArr, 0) & 67108863;
            long o8 = (o(bArr, 3) >> 2) & 67108611;
            long o9 = (o(bArr, 6) >> 4) & 67092735;
            long o10 = (o(bArr, 9) >> 6) & 66076671;
            long o11 = (o(bArr, 12) >> 8) & 1048575;
            long j = o8 * 5;
            long j8 = o9 * 5;
            long j9 = o10 * 5;
            long j10 = o11 * 5;
            int i7 = 17;
            byte[] bArr3 = new byte[17];
            long j11 = 0;
            int i8 = 0;
            long j12 = 0;
            long j13 = 0;
            long j14 = 0;
            long j15 = 0;
            while (i8 < bArr2.length) {
                int min = Math.min(16, bArr2.length - i8);
                System.arraycopy(bArr2, i8, bArr3, b5, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, i7, b5);
                }
                long o12 = j15 + (o(bArr3, b5) & 67108863);
                long o13 = j11 + ((o(bArr3, 3) >> 2) & 67108863);
                long o14 = j12 + ((o(bArr3, 6) >> 4) & 67108863);
                long o15 = j13 + ((o(bArr3, 9) >> 6) & 67108863);
                long o16 = j14 + (((o(bArr3, 12) >> 8) & 67108863) | (bArr3[16] << 24));
                long j16 = (o16 * j) + (o15 * j8) + (o14 * j9) + (o13 * j10) + (o12 * o7);
                long j17 = (o16 * j8) + (o15 * j9) + (o14 * j10) + (o13 * o7) + (o12 * o8);
                long j18 = (o16 * j9) + (o15 * j10) + (o14 * o7) + (o13 * o8) + (o12 * o9);
                long j19 = (o15 * o7) + (o14 * o8) + (o13 * o9) + (o12 * o10);
                long j20 = o15 * o8;
                long j21 = o16 * o7;
                long j22 = j17 + (j16 >> 26);
                long j23 = j18 + (j22 >> 26);
                long j24 = (o16 * j10) + j19 + (j23 >> 26);
                long j25 = j21 + j20 + (o14 * o9) + (o13 * o10) + (o12 * o11) + (j24 >> 26);
                long j26 = j25 >> 26;
                j14 = j25 & 67108863;
                long j27 = (j26 * 5) + (j16 & 67108863);
                long j28 = j27 & 67108863;
                j11 = (j22 & 67108863) + (j27 >> 26);
                i8 += 16;
                j12 = j23 & 67108863;
                j13 = j24 & 67108863;
                b5 = 0;
                i7 = 17;
                j15 = j28;
            }
            long j29 = j12 + (j11 >> 26);
            long j30 = j29 & 67108863;
            long j31 = j13 + (j29 >> 26);
            long j32 = j31 & 67108863;
            long j33 = j14 + (j31 >> 26);
            long j34 = j33 & 67108863;
            long j35 = ((j33 >> 26) * 5) + j15;
            long j36 = j35 >> 26;
            long j37 = j35 & 67108863;
            long j38 = (j11 & 67108863) + j36;
            long j39 = j37 + 5;
            long j40 = j39 & 67108863;
            long j41 = j38 + (j39 >> 26);
            long j42 = j30 + (j41 >> 26);
            long j43 = j32 + (j42 >> 26);
            long j44 = (j34 + (j43 >> 26)) - 67108864;
            long j45 = j44 >> 63;
            long j46 = ~j45;
            long j47 = (j38 & j45) | (j41 & 67108863 & j46);
            long j48 = (j30 & j45) | (j42 & 67108863 & j46);
            long j49 = (j32 & j45) | (j43 & 67108863 & j46);
            long o17 = o(bArr, 16) + (((j37 & j45) | (j40 & j46) | (j47 << 26)) & 4294967295L);
            long j50 = o17 & 4294967295L;
            long o18 = o(bArr, 20) + (((j47 >> 6) | (j48 << 20)) & 4294967295L) + (o17 >> 32);
            long j51 = o18 & 4294967295L;
            long o19 = o(bArr, 24) + (((j48 >> 12) | (j49 << 14)) & 4294967295L) + (o18 >> 32);
            long o20 = o(bArr, 28);
            byte[] bArr4 = new byte[16];
            B(bArr4, j50, 0);
            B(bArr4, j51, 4);
            B(bArr4, o19 & 4294967295L, 8);
            B(bArr4, (o20 + (((((j44 & j46) | (j34 & j45)) << 8) | (j49 >> 18)) & 4294967295L) + (o19 >> 32)) & 4294967295L, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }

    public static int d(Y1.C c8, B0.b bVar, View view, View view2, Y1.s sVar, boolean z7) {
        if (sVar.p() != 0 && c8.a() != 0 && view != null && view2 != null) {
            if (z7) {
                return Math.min(bVar.h(), bVar.d(view2) - bVar.e(view));
            }
            ((Y1.t) view.getLayoutParams()).getClass();
            throw null;
        }
        return 0;
    }

    public static int e(Y1.C c8, B0.b bVar, View view, View view2, Y1.s sVar, boolean z7) {
        if (sVar.p() != 0 && c8.a() != 0 && view != null && view2 != null) {
            if (!z7) {
                return c8.a();
            }
            bVar.d(view2);
            bVar.e(view);
            ((Y1.t) view.getLayoutParams()).getClass();
            throw null;
        }
        return 0;
    }

    public static ByteBuffer f(C1423a c1423a) {
        boolean z7;
        int i7 = c1423a.f;
        int i8 = 0;
        if (i7 != -1) {
            if (i7 != 17) {
                if (i7 != 35) {
                    if (i7 != 842094169) {
                        throw new C0470a("Unsupported image format", 13);
                    }
                    com.google.android.gms.common.internal.I.i(null);
                    throw null;
                }
                Image.Plane[] b5 = c1423a.b();
                com.google.android.gms.common.internal.I.i(b5);
                int i9 = c1423a.f13860c;
                int i10 = c1423a.f13861d;
                int i11 = i9 * i10;
                int i12 = i11 / 4;
                byte[] bArr = new byte[i12 + i12 + i11];
                ByteBuffer buffer = b5[1].getBuffer();
                ByteBuffer buffer2 = b5[2].getBuffer();
                int position = buffer2.position();
                int limit = buffer.limit();
                buffer2.position(position + 1);
                buffer.limit(limit - 1);
                int i13 = (i11 + i11) / 4;
                if (buffer2.remaining() == i13 - 2 && buffer2.compareTo(buffer) == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                buffer2.position(position);
                buffer.limit(limit);
                if (z7) {
                    b5[0].getBuffer().get(bArr, 0, i11);
                    ByteBuffer buffer3 = b5[1].getBuffer();
                    b5[2].getBuffer().get(bArr, i11, 1);
                    buffer3.get(bArr, i11 + 1, i13 - 1);
                } else {
                    G(b5[0], i9, i10, bArr, 0, 1);
                    G(b5[1], i9, i10, bArr, i11 + 1, 2);
                    G(b5[2], i9, i10, bArr, i11, 2);
                }
                return ByteBuffer.wrap(bArr);
            }
            com.google.android.gms.common.internal.I.i(null);
            throw null;
        }
        Bitmap bitmap = c1423a.f13858a;
        com.google.android.gms.common.internal.I.i(bitmap);
        if (Build.VERSION.SDK_INT >= 26 && bitmap.getConfig() == io.flutter.plugin.editing.i.b()) {
            bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
        }
        Bitmap bitmap2 = bitmap;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i14 = width * height;
        int[] iArr = new int[i14];
        bitmap2.getPixels(iArr, 0, width, 0, 0, width, height);
        int ceil = (int) Math.ceil(height / 2.0d);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((ceil + ceil) * ((int) Math.ceil(width / 2.0d))) + i14);
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < height) {
            int i18 = i8;
            while (i18 < width) {
                int i19 = iArr[i17];
                int i20 = i19 >> 16;
                int i21 = i19 >> 8;
                int i22 = i19 & 255;
                int i23 = i16 + 1;
                int i24 = i20 & 255;
                int i25 = i21 & 255;
                allocateDirect.put(i16, (byte) Math.min(255, ((((i22 * 25) + ((i25 * 129) + (i24 * 66))) + RecognitionOptions.ITF) >> 8) + 16));
                if (i15 % 2 == 0 && i17 % 2 == 0) {
                    int i26 = (((((i24 * 112) - (i25 * 94)) - (i22 * 18)) + RecognitionOptions.ITF) >> 8) + RecognitionOptions.ITF;
                    int i27 = (((((i24 * (-38)) - (i25 * 74)) + (i22 * 112)) + RecognitionOptions.ITF) >> 8) + RecognitionOptions.ITF;
                    int i28 = i14 + 1;
                    allocateDirect.put(i14, (byte) Math.min(255, i26));
                    i14 += 2;
                    allocateDirect.put(i28, (byte) Math.min(255, i27));
                }
                i17++;
                i18++;
                i16 = i23;
            }
            i15++;
            i8 = 0;
        }
        return allocateDirect;
    }

    public static C0454c g(io.flutter.plugins.firebase.auth.A a7) {
        C0453b c0453b = new C0453b();
        c0453b.f7008a = a7.f11760a;
        String str = a7.f11761b;
        if (str != null) {
            c0453b.f7013g = str;
        }
        String str2 = a7.f11766h;
        if (str2 != null) {
            c0453b.f7014h = str2;
        }
        c0453b.f = a7.f11762c.booleanValue();
        String str3 = a7.f11764e;
        if (str3 != null) {
            boolean booleanValue = a7.f.booleanValue();
            String str4 = a7.f11765g;
            c0453b.f7010c = str3;
            c0453b.f7011d = booleanValue;
            c0453b.f7012e = str4;
        }
        String str5 = a7.f11763d;
        if (str5 != null) {
            c0453b.f7009b = str5;
        }
        if (c0453b.f7008a != null) {
            return new C0454c(c0453b);
        }
        throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
    }

    public static AbstractC0456e h(Map map) {
        String str;
        String str2;
        if (map.get("token") != null) {
            Integer num = (Integer) map.get("token");
            num.getClass();
            AbstractC0456e abstractC0456e = (AbstractC0456e) C1140c.f11846Z.get(num);
            if (abstractC0456e != null) {
                return abstractC0456e;
            }
            throw org.slf4j.helpers.i.C();
        }
        Object obj = map.get("signInMethod");
        Objects.requireNonNull(obj);
        String str3 = (String) obj;
        String str4 = (String) map.get("secret");
        String str5 = (String) map.get("idToken");
        String str6 = (String) map.get("accessToken");
        String str7 = (String) map.get("rawNonce");
        char c8 = 65535;
        switch (str3.hashCode()) {
            case -1830313082:
                if (str3.equals("twitter.com")) {
                    c8 = 0;
                    break;
                }
                break;
            case -1551433523:
                if (str3.equals("playgames.google.com")) {
                    c8 = 1;
                    break;
                }
                break;
            case -1536293812:
                if (str3.equals("google.com")) {
                    c8 = 2;
                    break;
                }
                break;
            case -364826023:
                if (str3.equals("facebook.com")) {
                    c8 = 3;
                    break;
                }
                break;
            case 105516695:
                if (str3.equals("oauth")) {
                    c8 = 4;
                    break;
                }
                break;
            case 106642798:
                if (str3.equals("phone")) {
                    c8 = 5;
                    break;
                }
                break;
            case 1216985755:
                if (str3.equals("password")) {
                    c8 = 6;
                    break;
                }
                break;
            case 1985010934:
                if (str3.equals("github.com")) {
                    c8 = 7;
                    break;
                }
                break;
            case 2120171958:
                if (str3.equals("emailLink")) {
                    c8 = '\b';
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                Objects.requireNonNull(str6);
                Objects.requireNonNull(str4);
                return new a4.E(str6, str4);
            case 1:
                Object obj2 = map.get("serverAuthCode");
                Objects.requireNonNull(obj2);
                return new C0449B((String) obj2);
            case 2:
                return new C0469s(str5, str6);
            case 3:
                Objects.requireNonNull(str6);
                return new C0458g(str6);
            case 4:
                Object obj3 = map.get("providerId");
                Objects.requireNonNull(obj3);
                String str8 = (String) obj3;
                com.google.android.gms.common.internal.I.e(str8);
                if (str6 != null) {
                    str = str6;
                } else {
                    str = null;
                }
                if (str7 == null) {
                    Objects.requireNonNull(str5);
                    str2 = null;
                } else {
                    Objects.requireNonNull(str5);
                    str2 = str7;
                }
                com.google.android.gms.common.internal.I.f(str8, "Must specify a non-empty providerId");
                if (TextUtils.isEmpty(str5) && TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
                }
                return new a4.K(str8, str5, str, null, null, null, str2);
            case 5:
                Object obj4 = map.get("verificationId");
                Objects.requireNonNull(obj4);
                Object obj5 = map.get("smsCode");
                Objects.requireNonNull(obj5);
                return a4.v.n((String) obj4, (String) obj5);
            case 6:
                Object obj6 = map.get("email");
                Objects.requireNonNull(obj6);
                String str9 = (String) obj6;
                Objects.requireNonNull(str4);
                com.google.android.gms.common.internal.I.e(str9);
                com.google.android.gms.common.internal.I.e(str4);
                return new C0457f(str9, str4, null, null, false);
            case 7:
                Objects.requireNonNull(str6);
                return new a4.r(str6);
            case '\b':
                Object obj7 = map.get("email");
                Objects.requireNonNull(obj7);
                Object obj8 = map.get("emailLink");
                Objects.requireNonNull(obj8);
                return org.slf4j.helpers.i.y((String) obj7, (String) obj8);
            default:
                return null;
        }
    }

    public static d0.e j(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new d0.e(new d0.h(X.a.e(configuration)));
        }
        return d0.e.a(configuration.locale);
    }

    public static final int k(int i7, int i8, int i9) {
        if (i9 > 0) {
            if (i7 < i8) {
                int i10 = i8 % i9;
                if (i10 < 0) {
                    i10 += i9;
                }
                int i11 = i7 % i9;
                if (i11 < 0) {
                    i11 += i9;
                }
                int i12 = (i10 - i11) % i9;
                if (i12 < 0) {
                    i12 += i9;
                }
                return i8 - i12;
            }
            return i8;
        } else if (i9 < 0) {
            if (i7 > i8) {
                int i13 = -i9;
                int i14 = i7 % i13;
                if (i14 < 0) {
                    i14 += i13;
                }
                int i15 = i8 % i13;
                if (i15 < 0) {
                    i15 += i13;
                }
                int i16 = (i14 - i15) % i13;
                if (i16 < 0) {
                    i16 += i13;
                }
                return i8 + i16;
            }
            return i8;
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    public static int l(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean n(X5.E e7) {
        Boolean bool;
        try {
            bool = (Boolean) ((x.j) e7.f6409b).a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e8) {
            if (AbstractC2038a.f16621a.a0(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                org.slf4j.helpers.i.l("FlashAvailability", String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                org.slf4j.helpers.i.u("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e8);
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            org.slf4j.helpers.i.O("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static long o(byte[] bArr, int i7) {
        return (((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (bArr[i7] & ForkServer.ERROR) | ((bArr[i7 + 1] & ForkServer.ERROR) << 8) | ((bArr[i7 + 2] & ForkServer.ERROR) << 16)) & 4294967295L;
    }

    public static ArrayList p(io.flutter.plugins.firebase.auth.L l8) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(l8.f11806a.b());
        arrayList.add(l8.f11807b);
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, io.flutter.plugins.firebase.auth.F] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, io.flutter.plugins.firebase.auth.F] */
    public static ArrayList q(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a4.u uVar = (a4.u) it.next();
            if (uVar instanceof C0448A) {
                String str = ((C0448A) uVar).f6951d;
                C0448A c0448a = (C0448A) uVar;
                String str2 = c0448a.f6949b;
                Double valueOf = Double.valueOf(c0448a.f6950c);
                ?? obj = new Object();
                obj.f11787a = str2;
                obj.f11788b = valueOf;
                obj.f11789c = "phone";
                String str3 = c0448a.f6948a;
                if (str3 != null) {
                    obj.f11790d = str3;
                    obj.f11791e = str;
                    arrayList2.add(obj);
                } else {
                    throw new IllegalStateException("Nonnull field \"uid\" is null.");
                }
            } else {
                String i7 = uVar.i();
                Double valueOf2 = Double.valueOf(uVar.k());
                String a7 = uVar.a();
                String l8 = uVar.l();
                ?? obj2 = new Object();
                obj2.f11787a = i7;
                obj2.f11788b = valueOf2;
                obj2.f11789c = l8;
                if (a7 != null) {
                    obj2.f11790d = a7;
                    obj2.f11791e = null;
                    arrayList2.add(obj2);
                } else {
                    throw new IllegalStateException("Nonnull field \"uid\" is null.");
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, io.flutter.plugins.firebase.auth.C] */
    public static io.flutter.plugins.firebase.auth.C r(AbstractC0456e abstractC0456e) {
        String str = null;
        if (abstractC0456e == null) {
            return null;
        }
        int hashCode = abstractC0456e.hashCode();
        C1140c.f11846Z.put(Integer.valueOf(hashCode), abstractC0456e);
        String k2 = abstractC0456e.k();
        String l8 = abstractC0456e.l();
        Long valueOf = Long.valueOf(hashCode);
        if (abstractC0456e instanceof a4.K) {
            str = ((a4.K) abstractC0456e).f6982c;
        }
        ?? obj = new Object();
        if (k2 != null) {
            obj.f11772a = k2;
            if (l8 != null) {
                obj.f11773b = l8;
                obj.f11774c = valueOf;
                obj.f11775d = str;
                return obj;
            }
            throw new IllegalStateException("Nonnull field \"signInMethod\" is null.");
        }
        throw new IllegalStateException("Nonnull field \"providerId\" is null.");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [io.flutter.plugins.firebase.auth.K, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, io.flutter.plugins.firebase.auth.B] */
    public static io.flutter.plugins.firebase.auth.K s(b4.W w2) {
        String str;
        b4.V v6 = w2.f8228b;
        io.flutter.plugins.firebase.auth.B b5 = null;
        if (v6 != null) {
            Boolean valueOf = Boolean.valueOf(v6.f8226d);
            String str2 = v6.f8223a;
            boolean equals = "github.com".equals(str2);
            S.f fVar = v6.f8225c;
            if (equals) {
                str = (String) fVar.get("login");
            } else if ("twitter.com".equals(str2)) {
                str = (String) fVar.get("screen_name");
            } else {
                str = null;
            }
            ?? obj = new Object();
            obj.f11767a = valueOf;
            obj.f11768b = str2;
            obj.f11769c = str;
            obj.f11770d = null;
            obj.f11771e = fVar;
            b5 = obj;
        }
        io.flutter.plugins.firebase.auth.C r7 = r(w2.f8229c);
        io.flutter.plugins.firebase.auth.L t7 = t(w2.f8227a);
        ?? obj2 = new Object();
        obj2.f11803a = t7;
        obj2.f11804b = b5;
        obj2.f11805c = r7;
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (org.apache.tika.utils.StringUtils.EMPTY.equals(r8) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dc, code lost:
        if (org.apache.tika.utils.StringUtils.EMPTY.equals(r4) != false) goto L26;
     */
    /* JADX WARN: Type inference failed for: r12v0, types: [io.flutter.plugins.firebase.auth.M, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [io.flutter.plugins.firebase.auth.L, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.flutter.plugins.firebase.auth.L t(a4.AbstractC0467p r13) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.AbstractC0055e.t(a4.p):io.flutter.plugins.firebase.auth.L");
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, io.flutter.plugins.firebase.auth.E] */
    public static io.flutter.plugins.firebase.auth.E u(C0468q c0468q) {
        String str;
        long longValue;
        long longValue2;
        String str2 = c0468q.f7043a;
        Map map = (Map) c0468q.f7044b.get("firebase");
        String str3 = null;
        if (map != null) {
            str = (String) map.get("sign_in_provider");
        } else {
            str = null;
        }
        Integer num = (Integer) c0468q.f7044b.get("auth_time");
        long j = 0;
        if (num == null) {
            longValue = 0;
        } else {
            longValue = num.longValue();
        }
        Long valueOf = Long.valueOf(longValue * 1000);
        Integer num2 = (Integer) c0468q.f7044b.get("exp");
        if (num2 == null) {
            longValue2 = 0;
        } else {
            longValue2 = num2.longValue();
        }
        Long valueOf2 = Long.valueOf(longValue2 * 1000);
        Integer num3 = (Integer) c0468q.f7044b.get("iat");
        if (num3 != null) {
            j = num3.longValue();
        }
        Long valueOf3 = Long.valueOf(j * 1000);
        Map map2 = c0468q.f7044b;
        Map map3 = (Map) map2.get("firebase");
        if (map3 != null) {
            str3 = (String) map3.get("sign_in_second_factor");
        }
        ?? obj = new Object();
        obj.f11781a = str2;
        obj.f11782b = valueOf2;
        obj.f11783c = valueOf;
        obj.f11784d = valueOf3;
        obj.f11785e = str;
        obj.f = map2;
        obj.f11786g = str3;
        return obj;
    }

    public static P1.g v(P1.g gVar, String[] strArr, Map map) {
        int i7 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (P1.g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                P1.g gVar2 = new P1.g();
                int length = strArr.length;
                while (i7 < length) {
                    gVar2.a((P1.g) map.get(strArr[i7]));
                    i7++;
                }
                return gVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            gVar.a((P1.g) map.get(strArr[0]));
            return gVar;
        } else if (strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i7 < length2) {
                gVar.a((P1.g) map.get(strArr[i7]));
                i7++;
            }
        }
        return gVar;
    }

    public static void y(EditorInfo editorInfo, CharSequence charSequence, int i7, int i8) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i7);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i8);
    }

    public static void z(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            V0.a(view, charSequence);
            return;
        }
        X0 x02 = X0.f14747f0;
        if (x02 != null && x02.f14752a == view) {
            X0.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            X0 x03 = X0.f14748g0;
            if (x03 != null && x03.f14752a == view) {
                x03.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new X0(view, charSequence);
    }

    public abstract TransformationMethod F(TransformationMethod transformationMethod);

    public abstract InputFilter[] i(InputFilter[] inputFilterArr);

    public abstract boolean m();

    public abstract void w(boolean z7);

    public abstract void x(boolean z7);
}
