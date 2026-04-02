package D5;

import D.AbstractC0055e;
import Q0.A;
import a5.C0470a;
import a6.AbstractC0482k;
import a6.InterfaceC0484m;
import a6.e0;
import a6.f0;
import android.content.Context;
import android.content.res.AssetManager;
import android.media.Image;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import c1.RunnableC0626c;
import c6.AbstractC0655c;
import c6.InterfaceC0659d0;
import c6.o2;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzal;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.firebase.firestore.Z;
import d6.m;
import g1.C1006c;
import g6.C1012a;
import g6.C1013b;
import io.flutter.embedding.engine.FlutterJNI;
import j$.util.Objects;
import j3.C1364a;
import j3.C1367d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import k5.AbstractC1398a;
import k5.InterfaceC1406i;
import l5.C1423a;
import p4.C1688s;
import p4.P;
import p4.W;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class b implements L5.f, InterfaceC0659d0, InterfaceC1406i, W {

    /* renamed from: a  reason: collision with root package name */
    public boolean f867a;

    /* renamed from: b  reason: collision with root package name */
    public Object f868b;

    /* renamed from: c  reason: collision with root package name */
    public Object f869c;

    /* renamed from: d  reason: collision with root package name */
    public Object f870d;

    /* renamed from: e  reason: collision with root package name */
    public Object f871e;

    @Override // c6.InterfaceC0659d0
    public boolean b() {
        return this.f867a;
    }

    @Override // c6.InterfaceC0659d0
    public void close() {
        boolean z7 = true;
        this.f867a = true;
        if (((byte[]) this.f870d) == null) {
            z7 = false;
        }
        G.i.o("Lack of request message. GET request is only supported for unary requests", z7);
        ((m) ((AbstractC0655c) this.f871e)).f10430o.n0((e0) this.f868b, (byte[]) this.f870d);
        this.f870d = null;
        this.f868b = null;
    }

    @Override // c6.InterfaceC0659d0
    public void d(C1012a c1012a) {
        boolean z7;
        if (((byte[]) this.f870d) == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("writePayload should not be called multiple times", z7);
        try {
            this.f870d = B3.g.b(c1012a);
            o2 o2Var = (o2) this.f869c;
            for (AbstractC0482k abstractC0482k : o2Var.f8947a) {
                abstractC0482k.i(0);
            }
            byte[] bArr = (byte[]) this.f870d;
            long length = bArr.length;
            long length2 = bArr.length;
            for (AbstractC0482k abstractC0482k2 : o2Var.f8947a) {
                abstractC0482k2.j(0, length, length2);
            }
            long length3 = ((byte[]) this.f870d).length;
            AbstractC0482k[] abstractC0482kArr = o2Var.f8947a;
            for (AbstractC0482k abstractC0482k3 : abstractC0482kArr) {
                abstractC0482k3.k(length3);
            }
            long length4 = ((byte[]) this.f870d).length;
            for (AbstractC0482k abstractC0482k4 : abstractC0482kArr) {
                abstractC0482k4.l(length4);
            }
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // k5.InterfaceC1406i
    public ArrayList e(C1423a c1423a) {
        zzu[] zzf;
        if (((zzaj) this.f871e) == null) {
            zzc();
        }
        zzaj zzajVar = (zzaj) this.f871e;
        if (zzajVar != null) {
            zzan zzanVar = new zzan(c1423a.f13860c, c1423a.f13861d, 0, 0L, AbstractC1740d.j(c1423a.f13862e));
            try {
                int i7 = c1423a.f;
                if (i7 != -1) {
                    if (i7 != 17) {
                        if (i7 != 35) {
                            if (i7 == 842094169) {
                                zzf = zzajVar.zze(new i3.b(AbstractC0055e.f(c1423a)), zzanVar);
                            } else {
                                throw new C0470a("Unsupported image format: " + c1423a.f, 3);
                            }
                        } else {
                            Image.Plane[] b5 = c1423a.b();
                            I.i(b5);
                            zzanVar.zza = b5[0].getRowStride();
                            zzf = zzajVar.zze(new i3.b(b5[0].getBuffer()), zzanVar);
                        }
                    } else {
                        zzf = zzajVar.zze(new i3.b(null), zzanVar);
                    }
                } else {
                    zzf = zzajVar.zzf(new i3.b(c1423a.f13858a), zzanVar);
                }
                ArrayList arrayList = new ArrayList();
                for (zzu zzuVar : zzf) {
                    arrayList.add(new i5.f(new C1006c(zzuVar)));
                }
                return arrayList;
            } catch (RemoteException e7) {
                throw new C0470a("Failed to detect with legacy barcode detector", e7);
            }
        }
        throw new C0470a("Error initializing the legacy barcode scanner.", 14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, L5.m] */
    @Override // L5.f
    public Z f() {
        return ((i) ((A4.c) this.f871e).f218b).b(new Object());
    }

    public A g() {
        return new A((f0) this.f870d, (String) this.f871e, (C1013b) this.f868b, (C1013b) this.f869c, this.f867a);
    }

    @Override // L5.f
    public void h(String str, ByteBuffer byteBuffer, L5.e eVar) {
        ((A4.c) this.f871e).h(str, byteBuffer, eVar);
    }

    @Override // L5.f
    public void i(String str, L5.d dVar, Z z7) {
        ((A4.c) this.f871e).i(str, dVar, z7);
    }

    public void j(a aVar, List list) {
        if (this.f867a) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        Y5.a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(aVar);
            ((FlutterJNI) this.f868b).runBundleAndSnapshotFromLibrary(aVar.f864a, aVar.f866c, aVar.f865b, (AssetManager) this.f869c, list);
            this.f867a = true;
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // L5.f
    public void k(String str, ByteBuffer byteBuffer) {
        ((A4.c) this.f871e).k(str, byteBuffer);
    }

    @Override // L5.f
    public void n(String str, L5.d dVar) {
        ((A4.c) this.f871e).n(str, dVar);
    }

    @Override // p4.W
    public void start() {
        long j;
        if (((C1688s) this.f871e).f15290b.f1902a != -1) {
            if (this.f867a) {
                j = C1688s.f15288d;
            } else {
                j = C1688s.f15287c;
            }
            this.f870d = ((u4.e) this.f868b).b(u4.d.GARBAGE_COLLECTION, j, new RunnableC0626c(this, 13));
        }
    }

    @Override // p4.W
    public void stop() {
        P p7 = (P) this.f870d;
        if (p7 != null) {
            p7.b();
        }
    }

    @Override // k5.InterfaceC1406i
    public void zzb() {
        zzaj zzajVar = (zzaj) this.f871e;
        if (zzajVar != null) {
            try {
                zzajVar.zzd();
            } catch (RemoteException e7) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e7);
            }
            this.f871e = null;
        }
    }

    @Override // k5.InterfaceC1406i
    public boolean zzc() {
        Context context = (Context) this.f868b;
        if (((zzaj) this.f871e) == null) {
            try {
                zzaj zzd = zzal.zza(C1367d.c(context, C1367d.f13426b, "com.google.android.gms.vision.dynamite").b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).zzd(new i3.b(context), (zzah) this.f869c);
                this.f871e = zzd;
                zzwp zzwpVar = (zzwp) this.f870d;
                if (zzd == null && !this.f867a) {
                    Log.d("LegacyBarcodeScanner", "Request optional module download.");
                    W2.d[] dVarArr = e5.j.f10900a;
                    e5.j.a(context, zzaf.zzh("barcode"));
                    this.f867a = true;
                    AbstractC1398a.b(zzwpVar, zzrb.OPTIONAL_MODULE_NOT_AVAILABLE);
                    throw new C0470a("Waiting for the barcode module to be downloaded. Please wait.", 14);
                }
                AbstractC1398a.b(zzwpVar, zzrb.NO_ERROR);
                return false;
            } catch (RemoteException e7) {
                throw new C0470a("Failed to create legacy barcode detector.", e7);
            } catch (C1364a e8) {
                throw new C0470a("Failed to load deprecated vision dynamite module.", e8);
            }
        }
        return false;
    }

    @Override // c6.InterfaceC0659d0
    public void flush() {
    }

    @Override // c6.InterfaceC0659d0
    public InterfaceC0659d0 a(InterfaceC0484m interfaceC0484m) {
        return this;
    }

    @Override // c6.InterfaceC0659d0
    public void c(int i7) {
    }
}
