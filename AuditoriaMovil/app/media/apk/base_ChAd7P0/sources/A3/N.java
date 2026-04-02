package A3;

import H0.C0140u;
import a1.C0416B;
import a1.C0436m;
import a1.C0437n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import android.widget.ImageView;
import b4.C0597e;
import f1.C0982d;
import h0.AbstractC1066z;
import i.AbstractC1091a;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import m1.AbstractC1428b;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
import p.C1597n;
import r3.AbstractC1740d;
import t4.AbstractC1823c;
import t5.C1832d;
import t5.InterfaceC1835g;
/* loaded from: classes.dex */
public final class N implements K2.b, m1.i, InterfaceC1835g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f103a;

    /* renamed from: b  reason: collision with root package name */
    public int f104b;

    /* renamed from: c  reason: collision with root package name */
    public Object f105c;

    /* renamed from: d  reason: collision with root package name */
    public Object f106d;

    public /* synthetic */ N(Object obj, int i7, int i8, Object obj2) {
        this.f103a = i8;
        this.f105c = obj;
        this.f106d = obj2;
        this.f104b = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ca, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r4.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static A3.N e(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.N.e(android.content.res.Resources, int, android.content.res.Resources$Theme):A3.N");
    }

    private final /* synthetic */ void k() {
    }

    public static N l(String str) {
        io.grpc.okhttp.internal.m mVar;
        int i7;
        String str2;
        if (str.startsWith("HTTP/1.")) {
            i7 = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    mVar = io.grpc.okhttp.internal.m.HTTP_1_0;
                } else if (charAt == 1) {
                    mVar = io.grpc.okhttp.internal.m.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else if (str.startsWith("ICY ")) {
            mVar = io.grpc.okhttp.internal.m.HTTP_1_0;
            i7 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i8 = i7 + 3;
        if (str.length() >= i8) {
            try {
                int parseInt = Integer.parseInt(str.substring(i7, i8));
                if (str.length() > i8) {
                    if (str.charAt(i8) == ' ') {
                        str2 = str.substring(i7 + 4);
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                } else {
                    str2 = StringUtils.EMPTY;
                }
                return new N(mVar, parseInt, str2, 10);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        }
        throw new ProtocolException("Unexpected status line: ".concat(str));
    }

    @Override // t5.InterfaceC1835g
    public void a(C1832d c1832d, Runnable runnable) {
        ((Handler) this.f106d).post(runnable);
    }

    @Override // t5.InterfaceC1835g
    public void b() {
        HandlerThread handlerThread = (HandlerThread) this.f105c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f105c = null;
            this.f106d = null;
        }
    }

    public void c() {
        C0597e c0597e;
        ImageView imageView = (ImageView) this.f105c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            p.O.a(drawable);
        }
        if (drawable != null && (c0597e = (C0597e) this.f106d) != null) {
            C1597n.c(drawable, c0597e, imageView.getDrawableState());
        }
    }

    public j0 d() {
        M m7 = (M) this.f106d;
        if (m7 == null) {
            j0 b5 = j0.b(this.f104b, (Object[]) this.f105c, this);
            M m8 = (M) this.f106d;
            if (m8 == null) {
                return b5;
            }
            throw m8.a();
        }
        throw m7.a();
    }

    public long f(m1.l lVar) {
        long j;
        C0140u c0140u;
        m1.t tVar;
        boolean d7;
        int h8;
        while (true) {
            long t7 = lVar.t();
            j = lVar.f13973c;
            int i7 = (t7 > (j - 6) ? 1 : (t7 == (j - 6) ? 0 : -1));
            c0140u = (C0140u) this.f106d;
            tVar = (m1.t) this.f105c;
            if (i7 >= 0) {
                break;
            }
            long t8 = lVar.t();
            byte[] bArr = new byte[2];
            lVar.q(bArr, 0, 2, false);
            int i8 = ((bArr[0] & ForkServer.ERROR) << 8) | (bArr[1] & ForkServer.ERROR);
            int i9 = this.f104b;
            if (i8 != i9) {
                lVar.f = 0;
                lVar.b((int) (t8 - lVar.f13974d), false);
                d7 = false;
            } else {
                K0.q qVar = new K0.q(16);
                System.arraycopy(bArr, 0, qVar.f2513a, 0, 2);
                byte[] bArr2 = qVar.f2513a;
                int i10 = 0;
                for (int i11 = 2; i10 < 14 && (h8 = lVar.h(bArr2, i11 + i10, 14 - i10)) != -1; i11 = 2) {
                    i10 += h8;
                }
                qVar.F(i10);
                lVar.f = 0;
                lVar.b((int) (t8 - lVar.f13974d), false);
                d7 = AbstractC1428b.d(qVar, tVar, i9, c0140u);
            }
            if (d7) {
                break;
            }
            lVar.b(1, false);
        }
        if (lVar.t() >= j - 6) {
            lVar.b((int) (j - lVar.t()), false);
            return tVar.j;
        }
        return c0140u.f1902a;
    }

    public Object g(int i7) {
        SparseArray sparseArray;
        if (this.f104b == -1) {
            this.f104b = 0;
        }
        while (true) {
            int i8 = this.f104b;
            sparseArray = (SparseArray) this.f105c;
            if (i8 <= 0 || i7 >= sparseArray.keyAt(i8)) {
                break;
            }
            this.f104b--;
        }
        while (this.f104b < sparseArray.size() - 1 && i7 >= sparseArray.keyAt(this.f104b + 1)) {
            this.f104b++;
        }
        return sparseArray.valueAt(this.f104b);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [R0.a, java.io.IOException] */
    public C0416B h(int i7, String str, Map map, Uri uri) {
        C0436m c0436m = (C0436m) this.f106d;
        String str2 = c0436m.f6854c;
        int i8 = this.f104b;
        this.f104b = i8 + 1;
        A4.c cVar = new A4.c(str2, str, i8);
        if (c0436m.f6861i0 != null) {
            K0.a.k(c0436m.f6857e0);
            try {
                cVar.b("Authorization", c0436m.f6861i0.c(c0436m.f6857e0, uri, i7));
            } catch (H0.J e7) {
                C0436m.c(c0436m, new IOException(e7));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            cVar.b((String) entry.getKey(), (String) entry.getValue());
        }
        return new C0416B(uri, i7, new C0437n(cVar), StringUtils.EMPTY);
    }

    public boolean i() {
        ColorStateList colorStateList;
        if (((Shader) this.f105c) == null && (colorStateList = (ColorStateList) this.f106d) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public void j(int i7) {
        int resourceId;
        ImageView imageView = (ImageView) this.f105c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC1091a.f11355e;
        R1.j J02 = R1.j.J0(context, null, iArr, i7);
        AbstractC1066z.d(imageView, imageView.getContext(), iArr, null, (TypedArray) J02.f4683c, i7);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) J02.f4683c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC1740d.o(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                p.O.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(J02.s0(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(p.O.c(typedArray.getInt(3, -1), null));
            }
            J02.O0();
        } catch (Throwable th) {
            J02.O0();
            throw th;
        }
    }

    public void m(Object obj, Object obj2) {
        int i7 = (this.f104b + 1) * 2;
        Object[] objArr = (Object[]) this.f105c;
        if (i7 > objArr.length) {
            this.f105c = Arrays.copyOf(objArr, E.e(objArr.length, i7));
        }
        AbstractC0021t.d(obj, obj2);
        Object[] objArr2 = (Object[]) this.f105c;
        int i8 = this.f104b;
        int i9 = i8 * 2;
        objArr2[i9] = obj;
        objArr2[i9 + 1] = obj2;
        this.f104b = i8 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
    @Override // m1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m1.C1434h n(m1.l r22, long r23) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.N.n(m1.l, long):m1.h");
    }

    public void o() {
        K0.a.k((C0416B) this.f105c);
        C0437n c0437n = ((C0416B) this.f105c).f6747c;
        HashMap hashMap = new HashMap();
        L l8 = c0437n.f6867a;
        t0 m7 = ((h0) l8.f99d.keySet()).m();
        while (true) {
            I i7 = (I) m7;
            if (i7.hasNext()) {
                String str = (String) i7.next();
                if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                    hashMap.put(str, (String) AbstractC0021t.l(l8.d(str)));
                }
            } else {
                C0416B c0416b = (C0416B) this.f105c;
                r(h(c0416b.f6746b, ((C0436m) this.f106d).f6858f0, hashMap, c0416b.f6745a));
                return;
            }
        }
    }

    @Override // m1.i
    public void p() {
        switch (this.f103a) {
            case 4:
                byte[] bArr = K0.x.f;
                K0.q qVar = (K0.q) this.f106d;
                qVar.getClass();
                qVar.E(bArr, bArr.length);
                return;
            default:
                return;
        }
    }

    public void q(Uri uri, String str) {
        r(h(2, str, j0.f157X, uri));
    }

    public void r(C0416B c0416b) {
        boolean z7;
        String c8 = c0416b.f6747c.c("CSeq");
        c8.getClass();
        int parseInt = Integer.parseInt(c8);
        C0436m c0436m = (C0436m) this.f106d;
        if (c0436m.f.get(parseInt) == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        c0436m.f.append(parseInt, c0416b);
        c0436m.f6851Z.b(a1.z.g(c0416b));
        this.f105c = c0416b;
    }

    @Override // t5.InterfaceC1835g
    public void start() {
        HandlerThread handlerThread = new HandlerThread("Sqflite", this.f104b);
        this.f105c = handlerThread;
        handlerThread.start();
        this.f106d = new Handler(((HandlerThread) this.f105c).getLooper());
    }

    public String toString() {
        String str;
        switch (this.f103a) {
            case 10:
                StringBuilder sb = new StringBuilder();
                if (((io.grpc.okhttp.internal.m) this.f105c) == io.grpc.okhttp.internal.m.HTTP_1_0) {
                    str = "HTTP/1.0";
                } else {
                    str = "HTTP/1.1";
                }
                sb.append(str);
                sb.append(' ');
                sb.append(this.f104b);
                String str2 = (String) this.f106d;
                if (str2 != null) {
                    sb.append(' ');
                    sb.append(str2);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // K2.b
    public Object w() {
        ((I2.g) this.f105c).f2190d.a((D2.b) this.f106d, this.f104b + 1, false);
        return null;
    }

    public /* synthetic */ N(Object obj, int i7, String str, int i8) {
        this.f103a = i8;
        this.f105c = obj;
        this.f104b = i7;
        this.f106d = str;
    }

    public N(int i7, C0437n c0437n, String str) {
        this.f103a = 8;
        this.f104b = i7;
        this.f105c = c0437n;
        this.f106d = str;
    }

    public N(ImageView imageView) {
        this.f103a = 11;
        this.f104b = 0;
        this.f105c = imageView;
    }

    public N(com.it_nomads.fluttersecurestorage.ciphers.d dVar) {
        this.f103a = 9;
        this.f105c = new SparseArray();
        this.f106d = dVar;
        this.f104b = -1;
    }

    public N(m1.t tVar, int i7) {
        this.f103a = 12;
        this.f105c = tVar;
        this.f104b = i7;
        this.f106d = new Object();
    }

    public N(int i7, K0.v vVar) {
        this.f103a = 4;
        this.f104b = i7;
        this.f105c = vVar;
        this.f106d = new K0.q();
    }

    public N(AbstractC1823c abstractC1823c, J2.e eVar) {
        this.f103a = 13;
        this.f106d = abstractC1823c;
        this.f104b = 0;
        this.f105c = eVar;
    }

    public N(int[] iArr, float[] fArr, int i7) {
        this.f103a = 5;
        if (iArr.length == fArr.length) {
            if (iArr.length != 0) {
                for (int i8 = 1; i8 < fArr.length; i8++) {
                    if (fArr[i8] <= fArr[i8 - 1]) {
                        throw new IllegalArgumentException("startPoints should be in increasing order");
                    }
                }
                this.f104b = i7;
                int[] iArr2 = new int[iArr.length];
                this.f105c = iArr2;
                float[] fArr2 = new float[fArr.length];
                this.f106d = fArr2;
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                return;
            }
            throw new IllegalArgumentException("No colors have been defined");
        }
        throw new IllegalArgumentException("colors and startPoints should be same length");
    }

    public N(M0.g gVar) {
        this.f103a = 3;
        this.f106d = C0982d.f10990e0;
        this.f105c = gVar;
        this.f104b = 1;
    }

    public N(C0436m c0436m) {
        this.f103a = 7;
        this.f106d = c0436m;
    }

    public N(int i7, int i8) {
        this.f103a = i8;
        switch (i8) {
            case 14:
                this.f104b = i7;
                return;
            default:
                this.f105c = new Object[i7 * 2];
                this.f104b = 0;
                return;
        }
    }
}
