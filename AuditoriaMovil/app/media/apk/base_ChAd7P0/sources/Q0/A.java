package Q0;

import D.AbstractC0055e;
import O0.C0251m;
import a6.f0;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory;
import com.google.android.gms.common.api.internal.C0728b;
import com.google.android.gms.common.api.internal.C0735i;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.internal.InterfaceC0755d;
import e1.InterfaceC0959y;
import f5.C0993a;
import g6.C1012a;
import g6.C1013b;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import w.AbstractC1916a;
import w.C1917b;
import w.C1925j;
import w.g0;
import w.h0;
/* loaded from: classes.dex */
public final class A implements InterfaceC0755d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4135a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4136b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4137c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f4138d;

    /* renamed from: e  reason: collision with root package name */
    public Object f4139e;
    public Object f;

    /* renamed from: g  reason: collision with root package name */
    public Object f4140g;

    public A(C0735i c0735i, com.google.android.gms.common.api.g gVar, C0728b c0728b) {
        this.f4135a = 2;
        this.f4140g = c0735i;
        this.f4139e = null;
        this.f = null;
        this.f4136b = false;
        this.f4137c = gVar;
        this.f4138d = c0728b;
    }

    public static g0 b(x.j jVar) {
        Range range;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) jVar.a(AbstractC1916a.a());
            } catch (AssertionError e7) {
                org.slf4j.helpers.i.P("ZoomControl", "AssertionError, fail to get camera characteristic.", e7);
                range = null;
            }
            if (range != null) {
                return new C1917b(jVar);
            }
        }
        return new E.e(jVar);
    }

    public static String c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        G.i.j(str, "fullServiceName");
        sb.append(str);
        sb.append("/");
        G.i.j(str2, "methodName");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, D5.b] */
    public static D5.b e() {
        ?? obj = new Object();
        obj.f868b = null;
        obj.f869c = null;
        return obj;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0755d
    public void a(W2.b bVar) {
        ((C0735i) this.f4140g).f9264i0.post(new d0(1, this, bVar));
    }

    public z3.o d(int i7) {
        z3.o oVar;
        z3.o oVar2;
        HashMap hashMap = (HashMap) this.f4138d;
        z3.o oVar3 = (z3.o) hashMap.get(Integer.valueOf(i7));
        if (oVar3 != null) {
            return oVar3;
        }
        final A.f fVar = (A.f) this.f;
        fVar.getClass();
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 == 4) {
                            oVar2 = new z3.o() { // from class: e1.m
                                @Override // z3.o
                                public final Object get() {
                                    switch (r3) {
                                        case 0:
                                            return C0949n.d((Class) this, fVar);
                                        case 1:
                                            return C0949n.d((Class) this, fVar);
                                        case 2:
                                            return C0949n.d((Class) this, fVar);
                                        default:
                                            return new N(fVar, (m1.m) ((Q0.A) this).f4137c);
                                    }
                                }
                            };
                        } else {
                            throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i7, "Unrecognized contentType: "));
                        }
                    } else {
                        oVar2 = new C0251m(RtspMediaSource$Factory.class.asSubclass(InterfaceC0959y.class), 2);
                    }
                    hashMap.put(Integer.valueOf(i7), oVar2);
                    return oVar2;
                }
                final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(InterfaceC0959y.class);
                oVar = new z3.o() { // from class: e1.m
                    @Override // z3.o
                    public final Object get() {
                        switch (r3) {
                            case 0:
                                return C0949n.d((Class) asSubclass, fVar);
                            case 1:
                                return C0949n.d((Class) asSubclass, fVar);
                            case 2:
                                return C0949n.d((Class) asSubclass, fVar);
                            default:
                                return new N(fVar, (m1.m) ((Q0.A) asSubclass).f4137c);
                        }
                    }
                };
            } else {
                final Class asSubclass2 = SsMediaSource$Factory.class.asSubclass(InterfaceC0959y.class);
                oVar = new z3.o() { // from class: e1.m
                    @Override // z3.o
                    public final Object get() {
                        switch (r3) {
                            case 0:
                                return C0949n.d((Class) asSubclass2, fVar);
                            case 1:
                                return C0949n.d((Class) asSubclass2, fVar);
                            case 2:
                                return C0949n.d((Class) asSubclass2, fVar);
                            default:
                                return new N(fVar, (m1.m) ((Q0.A) asSubclass2).f4137c);
                        }
                    }
                };
            }
        } else {
            final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(InterfaceC0959y.class);
            oVar = new z3.o() { // from class: e1.m
                @Override // z3.o
                public final Object get() {
                    switch (r3) {
                        case 0:
                            return C0949n.d((Class) asSubclass3, fVar);
                        case 1:
                            return C0949n.d((Class) asSubclass3, fVar);
                        case 2:
                            return C0949n.d((Class) asSubclass3, fVar);
                        default:
                            return new N(fVar, (m1.m) ((Q0.A) asSubclass3).f4137c);
                    }
                }
            };
        }
        oVar2 = oVar;
        hashMap.put(Integer.valueOf(i7), oVar2);
        return oVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a A[Catch: IOException -> 0x004a, TryCatch #0 {IOException -> 0x004a, blocks: (B:11:0x0025, B:13:0x002a, B:17:0x0034, B:19:0x003e, B:21:0x0046, B:29:0x005a, B:32:0x0064, B:34:0x0068, B:35:0x006d, B:36:0x008d, B:26:0x004d, B:38:0x0090), top: B:61:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068 A[Catch: IOException -> 0x004a, TryCatch #0 {IOException -> 0x004a, blocks: (B:11:0x0025, B:13:0x002a, B:17:0x0034, B:19:0x003e, B:21:0x0046, B:29:0x005a, B:32:0x0064, B:34:0x0068, B:35:0x006d, B:36:0x008d, B:26:0x004d, B:38:0x0090), top: B:61:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d A[Catch: IOException -> 0x004a, TryCatch #0 {IOException -> 0x004a, blocks: (B:11:0x0025, B:13:0x002a, B:17:0x0034, B:19:0x003e, B:21:0x0046, B:29:0x005a, B:32:0x0064, B:34:0x0068, B:35:0x006d, B:36:0x008d, B:26:0x004d, B:38:0x0090), top: B:61:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3 A[Catch: X -> 0x00d7, TryCatch #2 {X -> 0x00d7, blocks: (B:49:0x00b0, B:51:0x00c3, B:53:0x00c8, B:54:0x00d6), top: B:64:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8 A[Catch: X -> 0x00d7, TryCatch #2 {X -> 0x00d7, blocks: (B:49:0x00b0, B:51:0x00c3, B:53:0x00c8, B:54:0x00d6), top: B:64:0x00b0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.protobuf.AbstractC0828a f(java.io.InputStream r8) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.A.f(java.io.InputStream):com.google.protobuf.a");
    }

    public C1012a g(com.google.protobuf.J j) {
        C1013b c1013b = (C1013b) this.f;
        c1013b.getClass();
        return new C1012a(j, c1013b.f11136a);
    }

    public void h(U.i iVar, I.b bVar) {
        I.b e7;
        if (!this.f4136b) {
            synchronized (((h0) this.f4139e)) {
                ((h0) this.f4139e).f(1.0f);
                e7 = I.b.e((h0) this.f4139e);
            }
            i(e7);
            iVar.b(new Exception("Camera is not active."));
            return;
        }
        ((g0) this.f4140g).c(bVar.f2079a, iVar);
        ((C1925j) this.f4137c).o();
    }

    public void i(I.b bVar) {
        Looper myLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        androidx.lifecycle.C c8 = (androidx.lifecycle.C) this.f;
        if (myLooper == mainLooper) {
            c8.l(bVar);
        } else {
            c8.i(bVar);
        }
    }

    public void j(W2.b bVar) {
        com.google.android.gms.common.api.internal.G g3 = (com.google.android.gms.common.api.internal.G) ((C0735i) this.f4140g).f9260e0.get((C0728b) this.f4138d);
        if (g3 != null) {
            g3.q(bVar);
        }
    }

    public String toString() {
        switch (this.f4135a) {
            case 1:
                K5.d C7 = AbstractC0055e.C(this);
                C7.a((String) this.f4138d, "fullMethodName");
                C7.a((f0) this.f4137c, "type");
                C7.c("idempotent", false);
                C7.c("safe", false);
                C7.c("sampledToLocalTracing", this.f4136b);
                C7.a((C1013b) this.f, "requestMarshaller");
                C7.a((C1013b) this.f4140g, "responseMarshaller");
                C7.a(null, "schemaDescriptor");
                C7.f2698b = true;
                return C7.toString();
            default:
                return super.toString();
        }
    }

    public A(C1925j c1925j, x.j jVar, G.k kVar) {
        this.f4135a = 5;
        this.f4136b = false;
        w.f0 f0Var = new w.f0(this);
        this.f4137c = c1925j;
        this.f4138d = kVar;
        g0 b5 = b(jVar);
        this.f4140g = b5;
        h0 h0Var = new h0(b5.h(), b5.n());
        this.f4139e = h0Var;
        h0Var.f(1.0f);
        this.f = new androidx.lifecycle.C(I.b.e(h0Var));
        c1925j.a(f0Var);
    }

    public A(Context context, k1.n nVar) {
        this.f4135a = 4;
        this.f4137c = context.getApplicationContext();
        this.f4138d = nVar;
        this.f4140g = K0.s.f2519a;
    }

    public A(f0 f0Var, String str, C1013b c1013b, C1013b c1013b2, boolean z7) {
        this.f4135a = 1;
        new AtomicReferenceArray(2);
        G.i.j(f0Var, "type");
        this.f4137c = f0Var;
        G.i.j(str, "fullMethodName");
        this.f4138d = str;
        int lastIndexOf = str.lastIndexOf(47);
        this.f4139e = lastIndexOf == -1 ? null : str.substring(0, lastIndexOf);
        G.i.j(c1013b, "requestMarshaller");
        this.f = c1013b;
        G.i.j(c1013b2, "responseMarshaller");
        this.f4140g = c1013b2;
        this.f4136b = z7;
    }

    public A(Context context) {
        this.f4135a = 0;
        this.f4137c = context;
        this.f4138d = C0268e.f4271c;
        this.f = J.f4228a;
    }

    public A(m1.m mVar, C0993a c0993a) {
        this.f4135a = 3;
        this.f4137c = mVar;
        this.f4140g = c0993a;
        this.f4138d = new HashMap();
        this.f4139e = new HashMap();
        this.f4136b = true;
    }
}
