package A;

import D.i0;
import D.v0;
import F3.t;
import G3.C;
import G3.E;
import G3.H;
import G3.s;
import G3.u;
import G3.w;
import G3.y;
import G3.z;
import H4.p1;
import K4.p;
import M3.q;
import R3.A;
import R3.C0286c;
import R3.C0287c0;
import R3.C0304l;
import R3.C0307m0;
import R3.J;
import R3.P;
import R3.W;
import R3.X0;
import R3.c1;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import c4.InterfaceC0635d;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import com.google.crypto.tink.shaded.protobuf.C0787n;
import com.google.crypto.tink.shaded.protobuf.F;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;
import org.apache.tika.utils.XMLReaderUtils;
import s.InterfaceC1749a;
/* loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC1749a, InterfaceC0635d, z3.i, i0, p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17a;

    public /* synthetic */ i(int i7) {
        this.f17a = i7;
    }

    private final F3.c e(q qVar) {
        t tVar = t.f1194a;
        if (((String) qVar.f3252a).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                C0286c F7 = C0286c.F((AbstractC0781h) qVar.f3255d, C0787n.a());
                if (F7.D() == 0) {
                    V2.k kVar = new V2.k(27);
                    kVar.f5965b = null;
                    kVar.f5966c = null;
                    kVar.f5967d = N3.d.f;
                    kVar.D(F7.B().size());
                    int A7 = F7.C().A();
                    if (A7 >= 10 && 16 >= A7) {
                        kVar.f5966c = Integer.valueOf(A7);
                        kVar.f5967d = N3.g.a((X0) qVar.f);
                        N3.e g3 = kVar.g();
                        V2.k kVar2 = new V2.k(26);
                        kVar2.f5966c = null;
                        kVar2.f5967d = null;
                        kVar2.f5965b = g3;
                        kVar2.f5966c = c.m(F7.B().k(), tVar);
                        kVar2.f5967d = (Integer) qVar.f3253b;
                        return kVar2.f();
                    }
                    throw new GeneralSecurityException(io.flutter.plugins.pathprovider.b.e(A7, "Invalid tag size for AesCmacParameters: "));
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (F | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
    }

    @Override // D.i0
    public void a(v0 v0Var) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(v0Var.f783b.getWidth(), v0Var.f783b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        v0Var.a(surface, j3.f.r(), new I.d(0, surface, surfaceTexture));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d9  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.text.SpannableString, android.text.Spannable] */
    @Override // s.InterfaceC1749a, z3.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.i.apply(java.lang.Object):java.lang.Object");
    }

    public F3.c b(q qVar) {
        t tVar = t.f1194a;
        switch (this.f17a) {
            case 5:
                if (((String) qVar.f3252a).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    try {
                        C0304l F7 = C0304l.F((AbstractC0781h) qVar.f3255d, C0787n.a());
                        if (F7.D() == 0) {
                            F3.o oVar = new F3.o(1);
                            oVar.f1178b = null;
                            oVar.f1179c = null;
                            oVar.f1180d = null;
                            oVar.f1181e = null;
                            oVar.f = G3.j.j;
                            int size = F7.B().C().size();
                            if (size != 16 && size != 24 && size != 32) {
                                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
                            }
                            oVar.f1178b = Integer.valueOf(size);
                            int size2 = F7.C().C().size();
                            if (size2 >= 16) {
                                oVar.f1179c = Integer.valueOf(size2);
                                int C7 = F7.C().D().C();
                                if (C7 >= 10) {
                                    oVar.f1180d = Integer.valueOf(C7);
                                    oVar.f1181e = G3.m.a(F7.C().D().B());
                                    oVar.f = G3.m.b((X0) qVar.f);
                                    G3.k c8 = oVar.c();
                                    E.e eVar = new E.e(1, false);
                                    eVar.f921c = null;
                                    eVar.f922d = null;
                                    eVar.f923e = null;
                                    eVar.f920b = c8;
                                    eVar.f921c = c.m(F7.B().C().k(), tVar);
                                    eVar.f922d = c.m(F7.C().C().k(), tVar);
                                    eVar.f923e = (Integer) qVar.f3253b;
                                    return eVar.s();
                                }
                                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(C7)));
                            }
                            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(size2)));
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (F unused) {
                        throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
            case 6:
                if (((String) qVar.f3252a).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    try {
                        A F8 = A.F((AbstractC0781h) qVar.f3255d, C0787n.a());
                        if (F8.D() == 0) {
                            int size3 = F8.B().size();
                            if (size3 != 16 && size3 != 24 && size3 != 32) {
                                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size3)));
                            }
                            int A7 = F8.C().A();
                            if (A7 != 12 && A7 != 16) {
                                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(A7)));
                            }
                            G3.o oVar2 = new G3.o(size3, A7, 16, G3.q.a((X0) qVar.f));
                            V2.k kVar = new V2.k(12);
                            kVar.f5966c = null;
                            kVar.f5967d = null;
                            kVar.f5965b = oVar2;
                            kVar.f5966c = c.m(F8.B().k(), tVar);
                            kVar.f5967d = (Integer) qVar.f3253b;
                            return kVar.b();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (F unused2) {
                        throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
            case 7:
                if (((String) qVar.f3252a).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    try {
                        J D4 = J.D((AbstractC0781h) qVar.f3255d, C0787n.a());
                        if (D4.B() == 0) {
                            int size4 = D4.A().size();
                            if (size4 != 16 && size4 != 24 && size4 != 32) {
                                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size4)));
                            }
                            s sVar = new s(size4, 12, 16, u.a((X0) qVar.f));
                            V2.k kVar2 = new V2.k(13);
                            kVar2.f5966c = null;
                            kVar2.f5967d = null;
                            kVar2.f5965b = sVar;
                            kVar2.f5966c = c.m(D4.A().k(), tVar);
                            kVar2.f5967d = (Integer) qVar.f3253b;
                            return kVar2.c();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (F unused3) {
                        throw new GeneralSecurityException("Parsing AesGcmKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
            case 8:
                if (((String) qVar.f3252a).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    try {
                        P D7 = P.D((AbstractC0781h) qVar.f3255d, C0787n.a());
                        if (D7.B() == 0) {
                            int size5 = D7.A().size();
                            if (size5 != 16 && size5 != 32) {
                                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(size5)));
                            }
                            w wVar = new w(size5, y.a((X0) qVar.f));
                            V2.k kVar3 = new V2.k(14);
                            kVar3.f5966c = null;
                            kVar3.f5967d = null;
                            kVar3.f5965b = wVar;
                            kVar3.f5966c = c.m(D7.A().k(), tVar);
                            kVar3.f5967d = (Integer) qVar.f3253b;
                            return kVar3.d();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (F unused4) {
                        throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
            case 9:
                if (((String) qVar.f3252a).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    try {
                        C0287c0 D8 = C0287c0.D((AbstractC0781h) qVar.f3255d, C0787n.a());
                        if (D8.B() == 0) {
                            return z.b(C.a((X0) qVar.f), c.m(D8.A().k(), tVar), (Integer) qVar.f3253b);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (F unused5) {
                        throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
            case 10:
                if (((String) qVar.f3252a).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    try {
                        c1 D9 = c1.D((AbstractC0781h) qVar.f3255d, C0787n.a());
                        if (D9.B() == 0) {
                            return E.b(H.a((X0) qVar.f), c.m(D9.A().k(), tVar), (Integer) qVar.f3253b);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (F unused6) {
                        throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
            case 15:
                if (((String) qVar.f3252a).equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    try {
                        W D10 = W.D((AbstractC0781h) qVar.f3255d, C0787n.a());
                        if (D10.B() == 0) {
                            int size6 = D10.A().size();
                            if (size6 != 32 && size6 != 48 && size6 != 64) {
                                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(size6)));
                            }
                            X0 x02 = (X0) qVar.f;
                            Map map = K3.d.f2637e;
                            if (map.containsKey(x02)) {
                                K3.b bVar = (K3.b) map.get(x02);
                                if (bVar != null) {
                                    K3.c cVar = new K3.c(size6, bVar);
                                    V2.k kVar4 = new V2.k(20);
                                    kVar4.f5966c = null;
                                    kVar4.f5967d = null;
                                    kVar4.f5965b = cVar;
                                    kVar4.f5966c = c.m(D10.A().k(), tVar);
                                    kVar4.f5967d = (Integer) qVar.f3253b;
                                    return kVar4.e();
                                }
                                throw new GeneralSecurityException("Variant is not set");
                            }
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + x02.b());
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (F unused7) {
                        throw new GeneralSecurityException("Parsing AesSivKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
            case 26:
                return e(qVar);
            default:
                if (((String) qVar.f3252a).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    try {
                        C0307m0 G2 = C0307m0.G((AbstractC0781h) qVar.f3255d, C0787n.a());
                        if (G2.E() == 0) {
                            E.e eVar2 = new E.e(8, false);
                            eVar2.f920b = null;
                            eVar2.f921c = null;
                            eVar2.f922d = null;
                            eVar2.f923e = N3.d.f3414o;
                            eVar2.f920b = Integer.valueOf(G2.C().size());
                            eVar2.f921c = Integer.valueOf(G2.D().C());
                            eVar2.f922d = N3.o.a(G2.D().B());
                            eVar2.f923e = N3.o.b((X0) qVar.f);
                            N3.m t7 = eVar2.t();
                            V2.k kVar5 = new V2.k(28);
                            kVar5.f5966c = null;
                            kVar5.f5967d = null;
                            kVar5.f5965b = t7;
                            kVar5.f5966c = c.m(G2.C().k(), tVar);
                            kVar5.f5967d = (Integer) qVar.f3253b;
                            return kVar5.j();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (F | IllegalArgumentException unused8) {
                        throw new GeneralSecurityException("Parsing HmacKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
    }

    @Override // K4.p
    public Object c() {
        switch (this.f17a) {
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                return new LinkedHashMap();
            case 17:
                return new K4.o(true);
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new TreeSet();
            case 19:
                return new LinkedHashSet();
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return new ArrayDeque();
            case 21:
                return new ArrayList();
            case 22:
                return new ConcurrentSkipListMap();
            case 23:
                return new ConcurrentHashMap();
            default:
                return new TreeMap();
        }
    }

    @Override // c4.InterfaceC0635d
    public Object d(q qVar) {
        Set x7 = qVar.x(A4.a.class);
        A4.c cVar = A4.c.f216c;
        if (cVar == null) {
            synchronized (A4.c.class) {
                try {
                    cVar = A4.c.f216c;
                    if (cVar == null) {
                        cVar = new A4.c(0);
                        A4.c.f216c = cVar;
                    }
                } finally {
                }
            }
        }
        return new A4.b(x7, cVar);
    }
}
