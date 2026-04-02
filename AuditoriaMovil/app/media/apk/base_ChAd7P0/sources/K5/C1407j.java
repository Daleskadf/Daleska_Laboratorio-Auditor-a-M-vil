package k5;

import a3.C0445a;
import a5.C0470a;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import b3.C0585f;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyu;
import com.google.android.gms.tasks.Tasks;
import e5.r;
import e5.s;
import g5.C1010b;
import j3.C1364a;
import j3.C1367d;
import j3.InterfaceC1366c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import l5.C1423a;
import r3.AbstractC1740d;
/* renamed from: k5.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1407j implements InterfaceC1406i {

    /* renamed from: Y  reason: collision with root package name */
    public static final zzcs f13727Y = zzcs.zzh("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* renamed from: X  reason: collision with root package name */
    public zzyl f13728X;

    /* renamed from: a  reason: collision with root package name */
    public boolean f13729a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13730b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13731c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f13732d;

    /* renamed from: e  reason: collision with root package name */
    public final C1010b f13733e;
    public final zzwp f;

    public C1407j(Context context, C1010b c1010b, zzwp zzwpVar) {
        this.f13732d = context;
        this.f13733e = c1010b;
        this.f = zzwpVar;
    }

    public final zzyl a(InterfaceC1366c interfaceC1366c, String str, String str2) {
        boolean z7;
        Context context = this.f13732d;
        zzyo zza = zzyn.zza(C1367d.c(context, interfaceC1366c, str).b(str2));
        i3.b bVar = new i3.b(context);
        C1010b c1010b = this.f13733e;
        int i7 = c1010b.f11128a;
        if (c1010b.f11129b != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        return zza.zzd(bVar, new zzyd(i7, z7));
    }

    @Override // k5.InterfaceC1406i
    public final ArrayList e(C1423a c1423a) {
        i3.b bVar;
        if (this.f13728X == null) {
            zzc();
        }
        zzyl zzylVar = this.f13728X;
        I.i(zzylVar);
        if (!this.f13729a) {
            try {
                zzylVar.zze();
                this.f13729a = true;
            } catch (RemoteException e7) {
                throw new C0470a("Failed to init barcode scanner.", e7);
            }
        }
        int i7 = c1423a.f13860c;
        if (c1423a.f == 35) {
            Image.Plane[] b5 = c1423a.b();
            I.i(b5);
            i7 = b5[0].getRowStride();
        }
        zzyu zzyuVar = new zzyu(c1423a.f, i7, c1423a.f13861d, AbstractC1740d.j(c1423a.f13862e), SystemClock.elapsedRealtime());
        m5.b.f14053b.getClass();
        int i8 = c1423a.f;
        if (i8 != -1) {
            Image image = null;
            if (i8 != 17) {
                if (i8 != 35) {
                    if (i8 != 842094169) {
                        throw new C0470a(io.flutter.plugins.pathprovider.b.e(c1423a.f, "Unsupported image format: "), 3);
                    }
                } else {
                    if (c1423a.f13859b != null) {
                        image = (Image) c1423a.f13859b.f10587a;
                    }
                    bVar = new i3.b(image);
                }
            }
            I.i(null);
            throw null;
        }
        Bitmap bitmap = c1423a.f13858a;
        I.i(bitmap);
        bVar = new i3.b(bitmap);
        try {
            List<zzyb> zzd = zzylVar.zzd(bVar, zzyuVar);
            ArrayList arrayList = new ArrayList();
            for (zzyb zzybVar : zzd) {
                arrayList.add(new i5.f(new C0585f(zzybVar, 10)));
            }
            return arrayList;
        } catch (RemoteException e8) {
            throw new C0470a("Failed to run barcode scanner.", e8);
        }
    }

    @Override // k5.InterfaceC1406i
    public final void zzb() {
        zzyl zzylVar = this.f13728X;
        if (zzylVar != null) {
            try {
                zzylVar.zzf();
            } catch (RemoteException e7) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e7);
            }
            this.f13728X = null;
            this.f13729a = false;
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.common.api.l, b3.h] */
    @Override // k5.InterfaceC1406i
    public final boolean zzc() {
        boolean z7;
        boolean z8 = false;
        if (this.f13728X != null) {
            return this.f13730b;
        }
        Context context = this.f13732d;
        if (C1367d.a(context, ModuleDescriptor.MODULE_ID) > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        zzwp zzwpVar = this.f;
        if (z7) {
            this.f13730b = true;
            try {
                this.f13728X = a(C1367d.f13427c, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e7) {
                throw new C0470a("Failed to create thick barcode scanner.", e7);
            } catch (C1364a e8) {
                throw new C0470a("Failed to load the bundled barcode module.", e8);
            }
        } else {
            this.f13730b = false;
            W2.d[] dVarArr = e5.j.f10900a;
            W2.f.f6172b.getClass();
            int a7 = W2.f.a(context);
            zzcs<String> zzcsVar = f13727Y;
            if (a7 >= 221500000) {
                try {
                    z8 = ((C0445a) Tasks.await(new l(context, null, b3.h.f8174a, com.google.android.gms.common.api.e.f9157U, k.f9283c).c(new r(e5.j.b(e5.j.f10903d, zzcsVar), 1)).addOnFailureListener(new s(1)))).f6943a;
                } catch (InterruptedException | ExecutionException e9) {
                    Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e9);
                }
            } else {
                try {
                    for (String str : zzcsVar) {
                        C1367d.c(context, C1367d.f13426b, str);
                    }
                    z8 = true;
                } catch (C1364a unused) {
                }
            }
            if (!z8) {
                if (!this.f13731c) {
                    e5.j.a(context, zzcs.zzh("barcode", "tflite_dynamite"));
                    this.f13731c = true;
                }
                AbstractC1398a.b(zzwpVar, zzrb.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new C0470a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f13728X = a(C1367d.f13426b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | C1364a e10) {
                AbstractC1398a.b(zzwpVar, zzrb.OPTIONAL_MODULE_INIT_ERROR);
                throw new C0470a("Failed to create thin barcode scanner.", e10);
            }
        }
        AbstractC1398a.b(zzwpVar, zzrb.NO_ERROR);
        return this.f13730b;
    }
}
