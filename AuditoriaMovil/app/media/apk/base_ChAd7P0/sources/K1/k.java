package k1;

import B5.Q;
import D.AbstractC0059i;
import H0.C0130j;
import H0.C0137q;
import H0.e0;
import K0.x;
import O0.C0244f;
import O0.C0245g;
import O0.E;
import O0.F;
import O0.I;
import O0.k0;
import Q0.A;
import Q0.C0276m;
import X0.w;
import X0.z;
import Y1.C0406g;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.firestore.S;
import e0.C0927b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
/* loaded from: classes.dex */
public final class k extends X0.t {

    /* renamed from: f2  reason: collision with root package name */
    public static final int[] f13606f2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: g2  reason: collision with root package name */
    public static boolean f13607g2;

    /* renamed from: h2  reason: collision with root package name */
    public static boolean f13608h2;

    /* renamed from: A1  reason: collision with root package name */
    public final boolean f13609A1;

    /* renamed from: B1  reason: collision with root package name */
    public final C0276m f13610B1;

    /* renamed from: C1  reason: collision with root package name */
    public final int f13611C1;

    /* renamed from: D1  reason: collision with root package name */
    public final boolean f13612D1;

    /* renamed from: E1  reason: collision with root package name */
    public final n f13613E1;

    /* renamed from: F1  reason: collision with root package name */
    public final Q f13614F1;

    /* renamed from: G1  reason: collision with root package name */
    public C0406g f13615G1;

    /* renamed from: H1  reason: collision with root package name */
    public boolean f13616H1;

    /* renamed from: I1  reason: collision with root package name */
    public boolean f13617I1;

    /* renamed from: J1  reason: collision with root package name */
    public C1387d f13618J1;

    /* renamed from: K1  reason: collision with root package name */
    public boolean f13619K1;

    /* renamed from: L1  reason: collision with root package name */
    public List f13620L1;

    /* renamed from: M1  reason: collision with root package name */
    public Surface f13621M1;

    /* renamed from: N1  reason: collision with root package name */
    public m f13622N1;

    /* renamed from: O1  reason: collision with root package name */
    public K0.r f13623O1;

    /* renamed from: P1  reason: collision with root package name */
    public boolean f13624P1;

    /* renamed from: Q1  reason: collision with root package name */
    public int f13625Q1;

    /* renamed from: R1  reason: collision with root package name */
    public long f13626R1;

    /* renamed from: S1  reason: collision with root package name */
    public int f13627S1;

    /* renamed from: T1  reason: collision with root package name */
    public int f13628T1;

    /* renamed from: U1  reason: collision with root package name */
    public int f13629U1;

    /* renamed from: V1  reason: collision with root package name */
    public long f13630V1;

    /* renamed from: W1  reason: collision with root package name */
    public int f13631W1;

    /* renamed from: X1  reason: collision with root package name */
    public long f13632X1;

    /* renamed from: Y1  reason: collision with root package name */
    public e0 f13633Y1;

    /* renamed from: Z1  reason: collision with root package name */
    public e0 f13634Z1;

    /* renamed from: a2  reason: collision with root package name */
    public int f13635a2;

    /* renamed from: b2  reason: collision with root package name */
    public boolean f13636b2;

    /* renamed from: c2  reason: collision with root package name */
    public int f13637c2;

    /* renamed from: d2  reason: collision with root package name */
    public j f13638d2;

    /* renamed from: e2  reason: collision with root package name */
    public F f13639e2;

    /* renamed from: z1  reason: collision with root package name */
    public final Context f13640z1;

    public k(Context context, X0.i iVar, Handler handler, E e7) {
        super(2, iVar, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f13640z1 = applicationContext;
        this.f13611C1 = 50;
        this.f13610B1 = new C0276m(handler, e7, 1);
        this.f13609A1 = true;
        this.f13613E1 = new n(applicationContext, this);
        this.f13614F1 = new Q();
        this.f13612D1 = "NVIDIA".equals(x.f2531c);
        this.f13623O1 = K0.r.f2516c;
        this.f13625Q1 = 1;
        this.f13633Y1 = e0.f1792e;
        this.f13637c2 = 0;
        this.f13634Z1 = null;
        this.f13635a2 = -1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x074f, code lost:
        if (r14.equals("A10-70L") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x08b7, code lost:
        if (r1.equals("JSN-L21") == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean u0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 3206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.k.u0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
        if (r9.equals("video/hevc") == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int v0(X0.m r11, H0.r r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.k.v0(X0.m, H0.r):int");
    }

    public static List w0(Context context, X0.u uVar, H0.r rVar, boolean z7, boolean z8) {
        List e7;
        String str = rVar.f1886m;
        if (str == null) {
            return A3.e0.f138e;
        }
        if (x.f2529a >= 26 && "video/dolby-vision".equals(str) && !AbstractC1392i.a(context)) {
            String b5 = z.b(rVar);
            if (b5 == null) {
                e7 = A3.e0.f138e;
            } else {
                uVar.getClass();
                e7 = z.e(b5, z7, z8);
            }
            if (!e7.isEmpty()) {
                return e7;
            }
        }
        return z.g(uVar, rVar, z7, z8);
    }

    public static int x0(X0.m mVar, H0.r rVar) {
        if (rVar.f1887n != -1) {
            List list = rVar.f1889p;
            int size = list.size();
            int i7 = 0;
            for (int i8 = 0; i8 < size; i8++) {
                i7 += ((byte[]) list.get(i8)).length;
            }
            return rVar.f1887n + i7;
        }
        return v0(mVar, rVar);
    }

    public final void A0() {
        int i7;
        X0.j jVar;
        if (!this.f13636b2 || (i7 = x.f2529a) < 23 || (jVar = this.f6309F0) == null) {
            return;
        }
        this.f13638d2 = new j(this, jVar);
        if (i7 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            jVar.a(bundle);
        }
    }

    public final void B0() {
        Surface surface = this.f13621M1;
        m mVar = this.f13622N1;
        if (surface == mVar) {
            this.f13621M1 = null;
        }
        if (mVar != null) {
            mVar.release();
            this.f13622N1 = null;
        }
    }

    @Override // X0.t
    public final C0245g C(X0.m mVar, H0.r rVar, H0.r rVar2) {
        int i7;
        C0245g b5 = mVar.b(rVar, rVar2);
        C0406g c0406g = this.f13615G1;
        c0406g.getClass();
        int i8 = rVar2.f1892s;
        int i9 = c0406g.f6659a;
        int i10 = b5.f3745e;
        if (i8 > i9 || rVar2.f1893t > c0406g.f6660b) {
            i10 |= RecognitionOptions.QR_CODE;
        }
        if (x0(mVar, rVar2) > c0406g.f6661c) {
            i10 |= 64;
        }
        int i11 = i10;
        if (i11 != 0) {
            i7 = 0;
        } else {
            i7 = b5.f3744d;
        }
        return new C0245g(mVar.f6286a, rVar, rVar2, i7, i11);
    }

    public final void C0(X0.j jVar, int i7) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        jVar.o(i7, true);
        Trace.endSection();
        this.f6355u1.f3735e++;
        boolean z7 = false;
        this.f13628T1 = 0;
        if (this.f13618J1 == null) {
            z0(this.f13633Y1);
            n nVar = this.f13613E1;
            if (nVar.f13654d != 3) {
                z7 = true;
            }
            nVar.f13654d = 3;
            nVar.f13659k.getClass();
            nVar.f = x.M(SystemClock.elapsedRealtime());
            if (z7 && (surface = this.f13621M1) != null) {
                C0276m c0276m = this.f13610B1;
                Handler handler = c0276m.f4296b;
                if (handler != null) {
                    handler.post(new t(c0276m, surface, SystemClock.elapsedRealtime()));
                }
                this.f13624P1 = true;
            }
        }
    }

    @Override // X0.t
    public final X0.l D(IllegalStateException illegalStateException, X0.m mVar) {
        Surface surface = this.f13621M1;
        X0.l lVar = new X0.l(illegalStateException, mVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return lVar;
    }

    public final void D0(X0.j jVar, int i7, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        jVar.T(i7, j);
        Trace.endSection();
        this.f6355u1.f3735e++;
        boolean z7 = false;
        this.f13628T1 = 0;
        if (this.f13618J1 == null) {
            z0(this.f13633Y1);
            n nVar = this.f13613E1;
            if (nVar.f13654d != 3) {
                z7 = true;
            }
            nVar.f13654d = 3;
            nVar.f13659k.getClass();
            nVar.f = x.M(SystemClock.elapsedRealtime());
            if (z7 && (surface = this.f13621M1) != null) {
                C0276m c0276m = this.f13610B1;
                Handler handler = c0276m.f4296b;
                if (handler != null) {
                    handler.post(new t(c0276m, surface, SystemClock.elapsedRealtime()));
                }
                this.f13624P1 = true;
            }
        }
    }

    public final boolean E0(X0.m mVar) {
        if (x.f2529a >= 23 && !this.f13636b2 && !u0(mVar.f6286a) && (!mVar.f || m.a(this.f13640z1))) {
            return true;
        }
        return false;
    }

    public final void F0(X0.j jVar, int i7) {
        Trace.beginSection("skipVideoBuffer");
        jVar.o(i7, false);
        Trace.endSection();
        this.f6355u1.f++;
    }

    public final void G0(int i7, int i8) {
        C0244f c0244f = this.f6355u1;
        c0244f.f3737h += i7;
        int i9 = i7 + i8;
        c0244f.f3736g += i9;
        this.f13627S1 += i9;
        int i10 = this.f13628T1 + i9;
        this.f13628T1 = i10;
        c0244f.f3738i = Math.max(i10, c0244f.f3738i);
        int i11 = this.f13611C1;
        if (i11 > 0 && this.f13627S1 >= i11) {
            y0();
        }
    }

    public final void H0(long j) {
        C0244f c0244f = this.f6355u1;
        c0244f.f3739k += j;
        c0244f.f3740l++;
        this.f13630V1 += j;
        this.f13631W1++;
    }

    @Override // X0.t
    public final int L(N0.f fVar) {
        if (x.f2529a >= 34 && this.f13636b2 && fVar.f3345X < this.f3706g0) {
            return 32;
        }
        return 0;
    }

    @Override // X0.t
    public final boolean M() {
        if (this.f13636b2 && x.f2529a < 23) {
            return true;
        }
        return false;
    }

    @Override // X0.t
    public final float N(float f, H0.r[] rVarArr) {
        float f4 = -1.0f;
        for (H0.r rVar : rVarArr) {
            float f8 = rVar.f1894u;
            if (f8 != -1.0f) {
                f4 = Math.max(f4, f8);
            }
        }
        if (f4 == -1.0f) {
            return -1.0f;
        }
        return f4 * f;
    }

    @Override // X0.t
    public final ArrayList O(X0.u uVar, H0.r rVar, boolean z7) {
        List w02 = w0(this.f13640z1, uVar, rVar, z7, this.f13636b2);
        Pattern pattern = z.f6369a;
        ArrayList arrayList = new ArrayList(w02);
        Collections.sort(arrayList, new K.a(new A.j(rVar, 28), 1));
        return arrayList;
    }

    @Override // X0.t
    public final X0.h P(X0.m mVar, H0.r rVar, MediaCrypto mediaCrypto, float f) {
        boolean z7;
        int i7;
        int i8;
        C0130j c0130j;
        int i9;
        C0406g c0406g;
        boolean z8;
        int i10;
        int i11;
        Point point;
        float f4;
        int i12;
        int i13;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Point point2;
        boolean z9;
        int i14;
        char c8;
        boolean z10;
        int i15;
        boolean z11;
        Pair d7;
        int v02;
        m mVar2 = this.f13622N1;
        boolean z12 = mVar.f;
        if (mVar2 != null && mVar2.f13648a != z12) {
            B0();
        }
        String str = mVar.f6288c;
        H0.r[] rVarArr = this.f3704e0;
        rVarArr.getClass();
        int i16 = rVar.f1892s;
        int x02 = x0(mVar, rVar);
        int length = rVarArr.length;
        float f8 = rVar.f1894u;
        int i17 = rVar.f1892s;
        C0130j c0130j2 = rVar.f1899z;
        int i18 = rVar.f1893t;
        if (length == 1) {
            if (x02 != -1 && (v02 = v0(mVar, rVar)) != -1) {
                x02 = Math.min((int) (x02 * 1.5f), v02);
            }
            c0406g = new C0406g(i16, i18, x02);
            z7 = z12;
            i7 = i18;
            i8 = i17;
            c0130j = c0130j2;
        } else {
            int length2 = rVarArr.length;
            int i19 = i18;
            int i20 = 0;
            boolean z13 = false;
            while (i20 < length2) {
                H0.r rVar2 = rVarArr[i20];
                H0.r[] rVarArr2 = rVarArr;
                if (c0130j2 != null && rVar2.f1899z == null) {
                    C0137q a7 = rVar2.a();
                    a7.f1863y = c0130j2;
                    rVar2 = new H0.r(a7);
                }
                if (mVar.b(rVar, rVar2).f3744d != 0) {
                    int i21 = rVar2.f1893t;
                    i14 = length2;
                    int i22 = rVar2.f1892s;
                    z9 = z12;
                    c8 = 65535;
                    if (i22 != -1 && i21 != -1) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    z13 |= z10;
                    i16 = Math.max(i16, i22);
                    i19 = Math.max(i19, i21);
                    x02 = Math.max(x02, x0(mVar, rVar2));
                } else {
                    z9 = z12;
                    i14 = length2;
                    c8 = 65535;
                }
                i20++;
                rVarArr = rVarArr2;
                length2 = i14;
                z12 = z9;
            }
            z7 = z12;
            int i23 = i19;
            if (z13) {
                K0.a.A("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i16 + "x" + i23);
                if (i18 > i17) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    i10 = i18;
                } else {
                    i10 = i17;
                }
                if (z8) {
                    i11 = i17;
                } else {
                    i11 = i18;
                }
                c0130j = c0130j2;
                float f9 = i11 / i10;
                int[] iArr = f13606f2;
                i7 = i18;
                i8 = i17;
                int i24 = 0;
                while (i24 < 9) {
                    int i25 = iArr[i24];
                    int[] iArr2 = iArr;
                    int i26 = (int) (i25 * f9);
                    if (i25 <= i10 || i26 <= i11) {
                        break;
                    }
                    int i27 = i11;
                    int i28 = i10;
                    if (x.f2529a >= 21) {
                        if (z8) {
                            i13 = i26;
                        } else {
                            i13 = i25;
                        }
                        if (!z8) {
                            i25 = i26;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f6289d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            f4 = f9;
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            f4 = f9;
                            point2 = new Point(x.g(i13, widthAlignment) * widthAlignment, x.g(i25, heightAlignment) * heightAlignment);
                        }
                        if (point2 != null) {
                            Point point3 = point2;
                            if (mVar.f(point2.x, point2.y, f8)) {
                                point = point3;
                                break;
                            }
                        } else {
                            continue;
                        }
                        i24++;
                        iArr = iArr2;
                        i11 = i27;
                        i10 = i28;
                        f9 = f4;
                    } else {
                        f4 = f9;
                        try {
                            int g3 = x.g(i25, 16) * 16;
                            int g4 = x.g(i26, 16) * 16;
                            if (g3 * g4 <= z.j()) {
                                if (z8) {
                                    i12 = g4;
                                } else {
                                    i12 = g3;
                                }
                                if (!z8) {
                                    g3 = g4;
                                }
                                point = new Point(i12, g3);
                            } else {
                                i24++;
                                iArr = iArr2;
                                i11 = i27;
                                i10 = i28;
                                f9 = f4;
                            }
                        } catch (w unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i16 = Math.max(i16, point.x);
                    i9 = Math.max(i23, point.y);
                    C0137q a8 = rVar.a();
                    a8.f1856r = i16;
                    a8.f1857s = i9;
                    x02 = Math.max(x02, v0(mVar, new H0.r(a8)));
                    K0.a.A("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i16 + "x" + i9);
                    c0406g = new C0406g(i16, i9, x02);
                }
            } else {
                i7 = i18;
                i8 = i17;
                c0130j = c0130j2;
            }
            i9 = i23;
            c0406g = new C0406g(i16, i9, x02);
        }
        this.f13615G1 = c0406g;
        if (this.f13636b2) {
            i15 = this.f13637c2;
        } else {
            i15 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i8);
        mediaFormat.setInteger("height", i7);
        K0.a.z(mediaFormat, rVar.f1889p);
        if (f8 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f8);
        }
        K0.a.v(mediaFormat, "rotation-degrees", rVar.f1895v);
        if (c0130j != null) {
            C0130j c0130j3 = c0130j;
            K0.a.v(mediaFormat, "color-transfer", c0130j3.f1813c);
            K0.a.v(mediaFormat, "color-standard", c0130j3.f1811a);
            K0.a.v(mediaFormat, "color-range", c0130j3.f1812b);
            byte[] bArr = c0130j3.f1814d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(rVar.f1886m) && (d7 = z.d(rVar)) != null) {
            K0.a.v(mediaFormat, "profile", ((Integer) d7.first).intValue());
        }
        mediaFormat.setInteger("max-width", c0406g.f6659a);
        mediaFormat.setInteger("max-height", c0406g.f6660b);
        K0.a.v(mediaFormat, "max-input-size", c0406g.f6661c);
        int i29 = x.f2529a;
        if (i29 >= 23) {
            mediaFormat.setInteger(MimeTypesReaderMetKeys.MAGIC_PRIORITY_ATTR, 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.f13612D1) {
            z11 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z11 = true;
        }
        if (i15 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z11);
            mediaFormat.setInteger("audio-session-id", i15);
        }
        if (i29 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f13635a2));
        }
        if (this.f13621M1 == null) {
            if (E0(mVar)) {
                if (this.f13622N1 == null) {
                    this.f13622N1 = m.d(this.f13640z1, z7);
                }
                this.f13621M1 = this.f13622N1;
            } else {
                throw new IllegalStateException();
            }
        }
        C1387d c1387d = this.f13618J1;
        if (c1387d != null && !x.J(c1387d.f13573a)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        if (this.f13618J1 == null) {
            return new X0.h(mVar, mediaFormat, rVar, this.f13621M1, mediaCrypto);
        }
        K0.a.j(false);
        K0.a.k(null);
        throw null;
    }

    @Override // X0.t
    public final void Q(N0.f fVar) {
        if (!this.f13617I1) {
            return;
        }
        ByteBuffer byteBuffer = fVar.f3346Y;
        byteBuffer.getClass();
        if (byteBuffer.remaining() >= 7) {
            byte b5 = byteBuffer.get();
            short s7 = byteBuffer.getShort();
            short s8 = byteBuffer.getShort();
            byte b7 = byteBuffer.get();
            byte b8 = byteBuffer.get();
            byteBuffer.position(0);
            if (b5 == -75 && s7 == 60 && s8 == 1 && b7 == 4) {
                if (b8 == 0 || b8 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    X0.j jVar = this.f6309F0;
                    jVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    jVar.a(bundle);
                }
            }
        }
    }

    @Override // X0.t
    public final void V(Exception exc) {
        K0.a.o("MediaCodecVideoRenderer", "Video codec error", exc);
        C0276m c0276m = this.f13610B1;
        Handler handler = c0276m.f4296b;
        if (handler != null) {
            handler.post(new s(c0276m, exc, 3));
        }
    }

    @Override // X0.t
    public final void W(long j, long j8, String str) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C0276m c0276m = this.f13610B1;
        Handler handler = c0276m.f4296b;
        if (handler != null) {
            handler.post(new s(c0276m, str, j, j8));
        }
        this.f13616H1 = u0(str);
        X0.m mVar = this.f6316M0;
        mVar.getClass();
        boolean z7 = false;
        if (x.f2529a >= 29 && "video/x-vnd.on2.vp9".equals(mVar.f6287b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f6289d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                } else if (codecProfileLevelArr[i7].profile == 16384) {
                    z7 = true;
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.f13617I1 = z7;
        A0();
    }

    @Override // X0.t
    public final void X(String str) {
        C0276m c0276m = this.f13610B1;
        Handler handler = c0276m.f4296b;
        if (handler != null) {
            handler.post(new s(c0276m, str, 5));
        }
    }

    @Override // X0.t
    public final C0245g Y(M0.x xVar) {
        C0245g Y3 = super.Y(xVar);
        H0.r rVar = (H0.r) xVar.f3211c;
        rVar.getClass();
        C0276m c0276m = this.f13610B1;
        Handler handler = c0276m.f4296b;
        if (handler != null) {
            handler.post(new S(c0276m, rVar, Y3));
        }
        return Y3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
        if (r9.f13618J1 == null) goto L14;
     */
    @Override // X0.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(H0.r r10, android.media.MediaFormat r11) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.k.Z(H0.r, android.media.MediaFormat):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v13, types: [android.view.Surface] */
    @Override // O0.AbstractC0243e, O0.g0
    public final void b(int i7, Object obj) {
        m mVar;
        Handler handler;
        m mVar2;
        n nVar = this.f13613E1;
        if (i7 != 1) {
            if (i7 != 7) {
                if (i7 != 10) {
                    if (i7 != 16) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                if (i7 != 13) {
                                    if (i7 != 14) {
                                        if (i7 == 11) {
                                            this.f6304A0 = (I) obj;
                                            return;
                                        }
                                        return;
                                    }
                                    obj.getClass();
                                    K0.r rVar = (K0.r) obj;
                                    if (rVar.f2517a != 0 && rVar.f2518b != 0) {
                                        this.f13623O1 = rVar;
                                        C1387d c1387d = this.f13618J1;
                                        if (c1387d != null) {
                                            Surface surface = this.f13621M1;
                                            K0.a.k(surface);
                                            c1387d.e(surface, rVar);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                obj.getClass();
                                List list = (List) obj;
                                this.f13620L1 = list;
                                C1387d c1387d2 = this.f13618J1;
                                if (c1387d2 != null) {
                                    ArrayList arrayList = c1387d2.f13575c;
                                    if (!arrayList.equals(list)) {
                                        arrayList.clear();
                                        arrayList.addAll(list);
                                        c1387d2.c();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            int intValue = ((Integer) obj).intValue();
                            q qVar = nVar.f13652b;
                            if (qVar.j != intValue) {
                                qVar.j = intValue;
                                qVar.d(true);
                                return;
                            }
                            return;
                        }
                        obj.getClass();
                        int intValue2 = ((Integer) obj).intValue();
                        this.f13625Q1 = intValue2;
                        X0.j jVar = this.f6309F0;
                        if (jVar != null) {
                            jVar.u(intValue2);
                            return;
                        }
                        return;
                    }
                    obj.getClass();
                    this.f13635a2 = ((Integer) obj).intValue();
                    X0.j jVar2 = this.f6309F0;
                    if (jVar2 != null && x.f2529a >= 35) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("importance", Math.max(0, -this.f13635a2));
                        jVar2.a(bundle);
                        return;
                    }
                    return;
                }
                obj.getClass();
                int intValue3 = ((Integer) obj).intValue();
                if (this.f13637c2 != intValue3) {
                    this.f13637c2 = intValue3;
                    if (this.f13636b2) {
                        i0();
                        return;
                    }
                    return;
                }
                return;
            }
            obj.getClass();
            F f = (F) obj;
            this.f13639e2 = f;
            C1387d c1387d3 = this.f13618J1;
            if (c1387d3 != null) {
                c1387d3.j.f13588h = f;
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            mVar = (Surface) obj;
        } else {
            mVar = null;
        }
        if (mVar == null) {
            m mVar3 = this.f13622N1;
            if (mVar3 != null) {
                mVar = mVar3;
            } else {
                X0.m mVar4 = this.f6316M0;
                if (mVar4 != null && E0(mVar4)) {
                    mVar = m.d(this.f13640z1, mVar4.f);
                    this.f13622N1 = mVar;
                }
            }
        }
        Surface surface2 = this.f13621M1;
        C0276m c0276m = this.f13610B1;
        if (surface2 != mVar) {
            this.f13621M1 = mVar;
            if (this.f13618J1 == null) {
                q qVar2 = nVar.f13652b;
                qVar2.getClass();
                if (mVar instanceof m) {
                    mVar2 = null;
                } else {
                    mVar2 = mVar;
                }
                if (qVar2.f13669e != mVar2) {
                    qVar2.b();
                    qVar2.f13669e = mVar2;
                    qVar2.d(true);
                }
                nVar.c(1);
            }
            this.f13624P1 = false;
            int i8 = this.f3697Y;
            X0.j jVar3 = this.f6309F0;
            if (jVar3 != null && this.f13618J1 == null) {
                if (x.f2529a >= 23 && mVar != null && !this.f13616H1) {
                    jVar3.F(mVar);
                } else {
                    i0();
                    T();
                }
            }
            if (mVar != null && mVar != this.f13622N1) {
                e0 e0Var = this.f13634Z1;
                if (e0Var != null) {
                    c0276m.c(e0Var);
                }
                if (i8 == 2) {
                    nVar.b(true);
                }
            } else {
                this.f13634Z1 = null;
                C1387d c1387d4 = this.f13618J1;
                if (c1387d4 != null) {
                    C1388e c1388e = c1387d4.j;
                    c1388e.getClass();
                    int i9 = K0.r.f2516c.f2517a;
                    c1388e.j = null;
                }
            }
            A0();
        } else if (mVar != null && mVar != this.f13622N1) {
            e0 e0Var2 = this.f13634Z1;
            if (e0Var2 != null) {
                c0276m.c(e0Var2);
            }
            Surface surface3 = this.f13621M1;
            if (surface3 != null && this.f13624P1 && (handler = c0276m.f4296b) != null) {
                handler.post(new t(c0276m, surface3, SystemClock.elapsedRealtime()));
            }
        }
    }

    @Override // X0.t
    public final void b0(long j) {
        super.b0(j);
        if (!this.f13636b2) {
            this.f13629U1--;
        }
    }

    @Override // X0.t
    public final void c0() {
        if (this.f13618J1 != null) {
            long j = this.f6357v1.f6301c;
        } else {
            this.f13613E1.c(2);
        }
        A0();
    }

    @Override // X0.t
    public final void d0(N0.f fVar) {
        boolean z7;
        Surface surface;
        boolean z8 = this.f13636b2;
        if (!z8) {
            this.f13629U1++;
        }
        if (x.f2529a < 23 && z8) {
            long j = fVar.f3345X;
            t0(j);
            z0(this.f13633Y1);
            this.f6355u1.f3735e++;
            n nVar = this.f13613E1;
            if (nVar.f13654d != 3) {
                z7 = true;
            } else {
                z7 = false;
            }
            nVar.f13654d = 3;
            nVar.f13659k.getClass();
            nVar.f = x.M(SystemClock.elapsedRealtime());
            if (z7 && (surface = this.f13621M1) != null) {
                C0276m c0276m = this.f13610B1;
                Handler handler = c0276m.f4296b;
                if (handler != null) {
                    handler.post(new t(c0276m, surface, SystemClock.elapsedRealtime()));
                }
                this.f13624P1 = true;
            }
            b0(j);
        }
    }

    @Override // X0.t
    public final void e0(H0.r rVar) {
        C1387d c1387d = this.f13618J1;
        if (c1387d == null) {
            return;
        }
        try {
            c1387d.b(rVar);
            throw null;
        } catch (v e7) {
            throw f(e7, rVar, false, 7000);
        }
    }

    @Override // O0.AbstractC0243e
    public final void g() {
        C1387d c1387d = this.f13618J1;
        if (c1387d != null) {
            n nVar = c1387d.j.f13583b;
            if (nVar.f13654d == 0) {
                nVar.f13654d = 1;
                return;
            }
            return;
        }
        n nVar2 = this.f13613E1;
        if (nVar2.f13654d == 0) {
            nVar2.f13654d = 1;
        }
    }

    @Override // X0.t
    public final boolean g0(long j, long j8, X0.j jVar, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z7, boolean z8, H0.r rVar) {
        jVar.getClass();
        X0.s sVar = this.f6357v1;
        long j10 = j9 - sVar.f6301c;
        int a7 = this.f13613E1.a(j9, j, j8, sVar.f6300b, z8, this.f13614F1);
        if (a7 == 4) {
            return false;
        }
        boolean z9 = true;
        if (z7 && !z8) {
            F0(jVar, i7);
            return true;
        }
        Surface surface = this.f13621M1;
        m mVar = this.f13622N1;
        Q q2 = this.f13614F1;
        if (surface == mVar && this.f13618J1 == null) {
            if (q2.f332a >= 30000) {
                return false;
            }
            F0(jVar, i7);
            H0(q2.f332a);
            return true;
        }
        C1387d c1387d = this.f13618J1;
        if (c1387d != null) {
            try {
                c1387d.d(j, j8);
                C1387d c1387d2 = this.f13618J1;
                c1387d2.getClass();
                K0.a.j(false);
                if (c1387d2.f13574b == -1) {
                    z9 = false;
                }
                K0.a.j(z9);
                long j11 = c1387d2.f13578g;
                if (j11 != -9223372036854775807L) {
                    C1388e c1388e = c1387d2.j;
                    if (c1388e.f13590k == 0) {
                        long j12 = c1388e.f13584c.j;
                        if (j12 != -9223372036854775807L && j12 >= j11) {
                            c1387d2.c();
                            c1387d2.f13578g = -9223372036854775807L;
                        }
                    }
                    return false;
                }
                K0.a.k(null);
                throw null;
            } catch (v e7) {
                throw f(e7, e7.f13694a, false, 7001);
            }
        } else if (a7 != 0) {
            if (a7 != 1) {
                if (a7 != 2) {
                    if (a7 != 3) {
                        if (a7 == 5) {
                            return false;
                        }
                        throw new IllegalStateException(String.valueOf(a7));
                    }
                    F0(jVar, i7);
                    H0(q2.f332a);
                    return true;
                }
                Trace.beginSection("dropVideoBuffer");
                jVar.o(i7, false);
                Trace.endSection();
                G0(0, 1);
                H0(q2.f332a);
                return true;
            }
            long j13 = q2.f333b;
            long j14 = q2.f332a;
            if (x.f2529a >= 21) {
                if (j13 == this.f13632X1) {
                    F0(jVar, i7);
                } else {
                    F f = this.f13639e2;
                    if (f != null) {
                        f.d(j10, j13);
                    }
                    D0(jVar, i7, j13);
                }
                H0(j14);
                this.f13632X1 = j13;
            } else if (j14 >= 30000) {
                return false;
            } else {
                if (j14 > 11000) {
                    try {
                        Thread.sleep((j14 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                F f4 = this.f13639e2;
                if (f4 != null) {
                    f4.d(j10, j13);
                }
                C0(jVar, i7);
                H0(j14);
            }
            return true;
        } else {
            this.f3696X.getClass();
            long nanoTime = System.nanoTime();
            F f8 = this.f13639e2;
            if (f8 != null) {
                f8.d(j10, nanoTime);
            }
            if (x.f2529a >= 21) {
                D0(jVar, i7, nanoTime);
            } else {
                C0(jVar, i7);
            }
            H0(q2.f332a);
            return true;
        }
    }

    @Override // O0.AbstractC0243e
    public final String i() {
        return "MediaCodecVideoRenderer";
    }

    @Override // O0.AbstractC0243e
    public final boolean k() {
        if (this.q1 && this.f13618J1 == null) {
            return true;
        }
        return false;
    }

    @Override // X0.t
    public final void k0() {
        super.k0();
        this.f13629U1 = 0;
    }

    @Override // X0.t, O0.AbstractC0243e
    public final boolean l() {
        boolean z7;
        m mVar;
        if (super.l() && this.f13618J1 == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7 && (((mVar = this.f13622N1) != null && this.f13621M1 == mVar) || this.f6309F0 == null || this.f13636b2)) {
            return true;
        }
        n nVar = this.f13613E1;
        if (z7 && nVar.f13654d == 3) {
            nVar.f13657h = -9223372036854775807L;
        } else if (nVar.f13657h == -9223372036854775807L) {
            return false;
        } else {
            nVar.f13659k.getClass();
            if (SystemClock.elapsedRealtime() >= nVar.f13657h) {
                nVar.f13657h = -9223372036854775807L;
                return false;
            }
        }
        return true;
    }

    @Override // X0.t, O0.AbstractC0243e
    public final void m() {
        C0276m c0276m = this.f13610B1;
        this.f13634Z1 = null;
        C1387d c1387d = this.f13618J1;
        if (c1387d != null) {
            c1387d.j.f13583b.c(0);
        } else {
            this.f13613E1.c(0);
        }
        A0();
        this.f13624P1 = false;
        this.f13638d2 = null;
        try {
            super.m();
            C0244f c0244f = this.f6355u1;
            c0276m.getClass();
            synchronized (c0244f) {
            }
            Handler handler = c0276m.f4296b;
            if (handler != null) {
                handler.post(new S(18, c0276m, c0244f));
            }
            c0276m.c(e0.f1792e);
        } catch (Throwable th) {
            c0276m.a(this.f6355u1);
            c0276m.c(e0.f1792e);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, O0.f] */
    @Override // O0.AbstractC0243e
    public final void n(boolean z7, boolean z8) {
        boolean z9;
        this.f6355u1 = new Object();
        k0 k0Var = this.f3702d;
        k0Var.getClass();
        boolean z10 = true;
        boolean z11 = k0Var.f3790b;
        if (z11 && this.f13637c2 == 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        K0.a.j(z9);
        if (this.f13636b2 != z11) {
            this.f13636b2 = z11;
            i0();
        }
        C0244f c0244f = this.f6355u1;
        C0276m c0276m = this.f13610B1;
        Handler handler = c0276m.f4296b;
        if (handler != null) {
            handler.post(new s(c0276m, c0244f, 4));
        }
        boolean z12 = this.f13619K1;
        n nVar = this.f13613E1;
        if (!z12) {
            if ((this.f13620L1 != null || !this.f13609A1) && this.f13618J1 == null) {
                A a7 = new A(this.f13640z1, nVar);
                K0.s sVar = this.f3696X;
                sVar.getClass();
                a7.f4140g = sVar;
                K0.a.j(!a7.f4136b);
                if (((C1385b) a7.f) == null) {
                    if (((C1384a) a7.f4139e) == null) {
                        a7.f4139e = new Object();
                    }
                    a7.f = new C1385b((C1384a) a7.f4139e);
                }
                C1388e c1388e = new C1388e(a7);
                a7.f4136b = true;
                this.f13618J1 = c1388e.f13582a;
            }
            this.f13619K1 = true;
        }
        C1387d c1387d = this.f13618J1;
        if (c1387d != null) {
            C0927b c0927b = new C0927b(this);
            E3.a aVar = E3.a.INSTANCE;
            c1387d.f13579h = c0927b;
            c1387d.f13580i = aVar;
            F f = this.f13639e2;
            if (f != null) {
                c1387d.j.f13588h = f;
            }
            if (this.f13621M1 != null && !this.f13623O1.equals(K0.r.f2516c)) {
                this.f13618J1.e(this.f13621M1, this.f13623O1);
            }
            C1387d c1387d2 = this.f13618J1;
            float f4 = this.f6307D0;
            r rVar = c1387d2.j.f13584c;
            rVar.getClass();
            if (f4 <= 0.0f) {
                z10 = false;
            }
            K0.a.e(z10);
            n nVar2 = rVar.f13681b;
            if (f4 != nVar2.j) {
                nVar2.j = f4;
                q qVar = nVar2.f13652b;
                qVar.f13672i = f4;
                qVar.f13675m = 0L;
                qVar.f13678p = -1L;
                qVar.f13676n = -1L;
                qVar.d(false);
            }
            List list = this.f13620L1;
            if (list != null) {
                C1387d c1387d3 = this.f13618J1;
                ArrayList arrayList = c1387d3.f13575c;
                if (!arrayList.equals(list)) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    c1387d3.c();
                }
            }
            this.f13618J1.j.f13583b.f13654d = z8 ? 1 : 0;
            return;
        }
        K0.s sVar2 = this.f3696X;
        sVar2.getClass();
        nVar.f13659k = sVar2;
        nVar.f13654d = z8 ? 1 : 0;
    }

    @Override // X0.t, O0.AbstractC0243e
    public final void o(long j, boolean z7) {
        C1387d c1387d = this.f13618J1;
        if (c1387d != null) {
            c1387d.a(true);
            C1387d c1387d2 = this.f13618J1;
            long j8 = this.f6357v1.f6301c;
            c1387d2.getClass();
        }
        super.o(j, z7);
        C1387d c1387d3 = this.f13618J1;
        n nVar = this.f13613E1;
        if (c1387d3 == null) {
            q qVar = nVar.f13652b;
            qVar.f13675m = 0L;
            qVar.f13678p = -1L;
            qVar.f13676n = -1L;
            nVar.f13656g = -9223372036854775807L;
            nVar.f13655e = -9223372036854775807L;
            nVar.c(1);
            nVar.f13657h = -9223372036854775807L;
        }
        if (z7) {
            nVar.b(false);
        }
        A0();
        this.f13628T1 = 0;
    }

    @Override // X0.t
    public final boolean o0(X0.m mVar) {
        if (this.f13621M1 == null && !E0(mVar)) {
            return false;
        }
        return true;
    }

    @Override // O0.AbstractC0243e
    public final void p() {
        C1387d c1387d = this.f13618J1;
        if (c1387d != null && this.f13609A1) {
            C1388e c1388e = c1387d.j;
            if (c1388e.f13591l != 2) {
                K0.u uVar = c1388e.f13589i;
                if (uVar != null) {
                    uVar.f2522a.removeCallbacksAndMessages(null);
                }
                c1388e.j = null;
                c1388e.f13591l = 2;
            }
        }
    }

    @Override // O0.AbstractC0243e
    public final void q() {
        try {
            E();
            i0();
            A.m mVar = this.f6363z0;
            if (mVar != null) {
                mVar.k0(null);
            }
            this.f6363z0 = null;
        } finally {
            this.f13619K1 = false;
            if (this.f13622N1 != null) {
                B0();
            }
        }
    }

    @Override // X0.t
    public final int q0(X0.u uVar, H0.r rVar) {
        boolean z7;
        boolean z8;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = 0;
        if (!H0.I.k(rVar.f1886m)) {
            return AbstractC0059i.s(0, 0, 0, 0);
        }
        if (rVar.f1890q != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        Context context = this.f13640z1;
        List w02 = w0(context, uVar, rVar, z7, false);
        if (z7 && w02.isEmpty()) {
            w02 = w0(context, uVar, rVar, false, false);
        }
        if (w02.isEmpty()) {
            return AbstractC0059i.s(1, 0, 0, 0);
        }
        int i12 = rVar.f1874J;
        if (i12 != 0 && i12 != 2) {
            return AbstractC0059i.s(2, 0, 0, 0);
        }
        X0.m mVar = (X0.m) w02.get(0);
        boolean d7 = mVar.d(rVar);
        if (!d7) {
            for (int i13 = 1; i13 < w02.size(); i13++) {
                X0.m mVar2 = (X0.m) w02.get(i13);
                if (mVar2.d(rVar)) {
                    d7 = true;
                    z8 = false;
                    mVar = mVar2;
                    break;
                }
            }
        }
        z8 = true;
        if (d7) {
            i7 = 4;
        } else {
            i7 = 3;
        }
        if (mVar.e(rVar)) {
            i8 = 16;
        } else {
            i8 = 8;
        }
        if (mVar.f6291g) {
            i9 = 64;
        } else {
            i9 = 0;
        }
        if (z8) {
            i10 = RecognitionOptions.ITF;
        } else {
            i10 = 0;
        }
        if (x.f2529a >= 26 && "video/dolby-vision".equals(rVar.f1886m) && !AbstractC1392i.a(context)) {
            i10 = RecognitionOptions.QR_CODE;
        }
        if (d7) {
            List w03 = w0(context, uVar, rVar, z7, true);
            if (!w03.isEmpty()) {
                Pattern pattern = z.f6369a;
                ArrayList arrayList = new ArrayList(w03);
                Collections.sort(arrayList, new K.a(new A.j(rVar, 28), 1));
                X0.m mVar3 = (X0.m) arrayList.get(0);
                if (mVar3.d(rVar) && mVar3.e(rVar)) {
                    i11 = 32;
                }
            }
        }
        return i7 | i8 | i11 | i9 | i10;
    }

    @Override // O0.AbstractC0243e
    public final void r() {
        this.f13627S1 = 0;
        this.f3696X.getClass();
        this.f13626R1 = SystemClock.elapsedRealtime();
        this.f13630V1 = 0L;
        this.f13631W1 = 0;
        C1387d c1387d = this.f13618J1;
        if (c1387d != null) {
            c1387d.j.f13583b.d();
        } else {
            this.f13613E1.d();
        }
    }

    @Override // O0.AbstractC0243e
    public final void s() {
        y0();
        int i7 = this.f13631W1;
        if (i7 != 0) {
            long j = this.f13630V1;
            C0276m c0276m = this.f13610B1;
            Handler handler = c0276m.f4296b;
            if (handler != null) {
                handler.post(new s(c0276m, j, i7));
            }
            this.f13630V1 = 0L;
            this.f13631W1 = 0;
        }
        C1387d c1387d = this.f13618J1;
        if (c1387d != null) {
            c1387d.j.f13583b.e();
        } else {
            this.f13613E1.e();
        }
    }

    @Override // X0.t, O0.AbstractC0243e
    public final void v(long j, long j8) {
        super.v(j, j8);
        C1387d c1387d = this.f13618J1;
        if (c1387d != null) {
            try {
                c1387d.d(j, j8);
            } catch (v e7) {
                throw f(e7, e7.f13694a, false, 7001);
            }
        }
    }

    @Override // X0.t, O0.AbstractC0243e
    public final void y(float f, float f4) {
        boolean z7;
        super.y(f, f4);
        C1387d c1387d = this.f13618J1;
        if (c1387d != null) {
            r rVar = c1387d.j.f13584c;
            rVar.getClass();
            if (f > 0.0f) {
                z7 = true;
            } else {
                z7 = false;
            }
            K0.a.e(z7);
            n nVar = rVar.f13681b;
            if (f != nVar.j) {
                nVar.j = f;
                q qVar = nVar.f13652b;
                qVar.f13672i = f;
                qVar.f13675m = 0L;
                qVar.f13678p = -1L;
                qVar.f13676n = -1L;
                qVar.d(false);
                return;
            }
            return;
        }
        n nVar2 = this.f13613E1;
        if (f != nVar2.j) {
            nVar2.j = f;
            q qVar2 = nVar2.f13652b;
            qVar2.f13672i = f;
            qVar2.f13675m = 0L;
            qVar2.f13678p = -1L;
            qVar2.f13676n = -1L;
            qVar2.d(false);
        }
    }

    public final void y0() {
        if (this.f13627S1 > 0) {
            this.f3696X.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.f13626R1;
            int i7 = this.f13627S1;
            C0276m c0276m = this.f13610B1;
            Handler handler = c0276m.f4296b;
            if (handler != null) {
                handler.post(new s(c0276m, i7, j));
            }
            this.f13627S1 = 0;
            this.f13626R1 = elapsedRealtime;
        }
    }

    public final void z0(e0 e0Var) {
        if (!e0Var.equals(e0.f1792e) && !e0Var.equals(this.f13634Z1)) {
            this.f13634Z1 = e0Var;
            this.f13610B1.c(e0Var);
        }
    }
}
