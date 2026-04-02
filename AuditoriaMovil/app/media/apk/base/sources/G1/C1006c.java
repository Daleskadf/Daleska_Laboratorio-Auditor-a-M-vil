package g1;

import A3.N;
import B5.S;
import K5.w;
import K5.z;
import S0.t;
import a6.C0475d;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.Log;
import android.view.View;
import c6.RunnableC0649a;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import e0.C0927b;
import f5.C0993a;
import f6.C0994a;
import g.C0996a;
import g.InterfaceC0997b;
import i5.C1112a;
import i5.C1113b;
import io.flutter.plugin.editing.f;
import io.flutter.plugin.editing.k;
import io.flutter.plugins.googlemaps.InterfaceC1185s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.C1541e;
import o.MenuC1545i;
import o.View$OnKeyListenerC1542f;
import p.AbstractC1595m;
import p.C1608t;
import p.InterfaceC1586h0;
import p.J0;
import p.Y0;
import p0.InterfaceC1640h;
import p6.i;
import r3.C1738b;
import s3.C1769D;
import t0.C1804c;
import u0.C1852h;
import v2.AbstractC1884c;
import w.C1903M;
import w0.C1946e;
import w0.h;
import w6.p;
import x.j;
import y.C2023c;
import y.C2024d;
import z0.AbstractComponentCallbacksC2061v;
import z0.H;
import z0.L;
/* renamed from: g1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1006c implements InterfaceC1007d, InterfaceC1185s, j5.a, InterfaceC1586h0, InterfaceC1640h, H.c, InterfaceC0997b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f11091a;

    public /* synthetic */ C1006c(Object obj) {
        this.f11091a = obj;
    }

    public static C1006c A(j jVar) {
        CameraCharacteristics.Key key;
        boolean z7;
        int i7 = Build.VERSION.SDK_INT;
        C1006c c1006c = null;
        if (i7 >= 33) {
            key = CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
            DynamicRangeProfiles b5 = AbstractC1884c.b(jVar.a(key));
            if (b5 != null) {
                if (i7 >= 33) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                g0.c.g("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", z7);
                c1006c = new C1006c(new C2023c(b5));
            }
        }
        if (c1006c == null) {
            return C2024d.f16574a;
        }
        return c1006c;
    }

    @Override // j5.a
    public Y0 B() {
        Object arrayList;
        zzl zzlVar = ((zzu) this.f11091a).zzm;
        Y0 y02 = null;
        if (zzlVar == null) {
            return null;
        }
        zzp zzpVar = zzlVar.zza;
        if (zzpVar != null) {
            y02 = new Y0(zzpVar.zza, zzpVar.zzb, zzpVar.zzc, zzpVar.zzd, zzpVar.zze, zzpVar.zzf, zzpVar.zzg);
        }
        Y0 y03 = y02;
        String str = zzlVar.zzb;
        String str2 = zzlVar.zzc;
        zzq[] zzqVarArr = zzlVar.zzd;
        ArrayList arrayList2 = new ArrayList();
        if (zzqVarArr != null) {
            for (zzq zzqVar : zzqVarArr) {
                if (zzqVar != null) {
                    arrayList2.add(new i5.e(zzqVar.zzb, zzqVar.zza));
                }
            }
        }
        zzn[] zznVarArr = zzlVar.zze;
        ArrayList arrayList3 = new ArrayList();
        if (zznVarArr != null) {
            for (zzn zznVar : zznVarArr) {
                if (zznVar != null) {
                    arrayList3.add(new i5.c(zznVar.zza, zznVar.zzb, zznVar.zzc, zznVar.zzd));
                }
            }
        }
        String[] strArr = zzlVar.zzf;
        if (strArr != null) {
            arrayList = Arrays.asList(strArr);
        } else {
            arrayList = new ArrayList();
        }
        Object obj = arrayList;
        zzi[] zziVarArr = zzlVar.zzg;
        ArrayList arrayList4 = new ArrayList();
        if (zziVarArr != null) {
            for (zzi zziVar : zziVarArr) {
                if (zziVar != null) {
                    arrayList4.add(new C1112a(zziVar.zza, zziVar.zzb));
                }
            }
        }
        return new Y0(y03, str, str2, arrayList2, arrayList3, obj, arrayList4);
    }

    public KeyListener C(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((C1608t) ((C1006c) this.f11091a).f11091a).getClass();
            if (!(keyListener instanceof C1946e)) {
                if (keyListener == null) {
                    return null;
                }
                if (!(keyListener instanceof NumberKeyListener)) {
                    return new C1946e(keyListener);
                }
                return keyListener;
            }
            return keyListener;
        }
        return keyListener;
    }

    public C1769D D() {
        try {
            C1738b c1738b = (C1738b) this.f11091a;
            Parcel zzJ = c1738b.zzJ(3, c1738b.zza());
            C1769D c1769d = (C1769D) zzc.zza(zzJ, C1769D.CREATOR);
            zzJ.recycle();
            return c1769d;
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public void E(int i7, w wVar) {
        z zVar;
        k kVar = (k) this.f11091a;
        kVar.d();
        kVar.f = wVar;
        kVar.f11666e = new S(io.flutter.plugin.editing.j.FRAMEWORK_CLIENT, i7, 10);
        kVar.f11668h.e(kVar);
        E.e eVar = wVar.j;
        if (eVar != null) {
            zVar = (z) eVar.f922d;
        } else {
            zVar = null;
        }
        kVar.f11668h = new f(zVar, kVar.f11662a);
        kVar.e(wVar);
        kVar.f11669i = true;
        if (((io.flutter.plugin.editing.j) kVar.f11666e.f336c) == io.flutter.plugin.editing.j.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            kVar.f11674o = false;
        }
        kVar.f11671l = null;
        kVar.f11668h.a(kVar);
    }

    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, D.d] */
    public void F(double d7, double d8, double[] dArr) {
        boolean z7;
        k kVar = (k) this.f11091a;
        kVar.getClass();
        double[] dArr2 = new double[4];
        if (dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d) {
            z7 = true;
        } else {
            z7 = false;
        }
        double d9 = dArr[12];
        double d10 = dArr[15];
        double d11 = d9 / d10;
        dArr2[1] = d11;
        dArr2[0] = d11;
        double d12 = dArr[13] / d10;
        dArr2[3] = d12;
        dArr2[2] = d12;
        ?? obj = new Object();
        obj.f688a = z7;
        obj.f689b = dArr;
        obj.f690c = dArr2;
        obj.j(d7, 0.0d);
        obj.j(d7, d8);
        obj.j(0.0d, d8);
        double d13 = kVar.f11662a.getContext().getResources().getDisplayMetrics().density;
        kVar.f11671l = new Rect((int) (dArr2[0] * d13), (int) (dArr2[2] * d13), (int) Math.ceil(dArr2[1] * d13), (int) Math.ceil(dArr2[3] * d13));
    }

    public void G(z zVar) {
        z zVar2;
        int i7;
        int i8;
        k kVar = (k) this.f11091a;
        View view = kVar.f11662a;
        if (!kVar.f11669i && (zVar2 = kVar.f11673n) != null && (i7 = zVar2.f2761d) >= 0 && (i8 = zVar2.f2762e) > i7) {
            int i9 = i8 - i7;
            int i10 = zVar.f2762e;
            int i11 = zVar.f2761d;
            boolean z7 = true;
            if (i9 == i10 - i11) {
                int i12 = 0;
                while (true) {
                    if (i12 < i9) {
                        if (zVar2.f2758a.charAt(i12 + i7) != zVar.f2758a.charAt(i12 + i11)) {
                            break;
                        }
                        i12++;
                    } else {
                        z7 = false;
                        break;
                    }
                }
            }
            kVar.f11669i = z7;
        }
        kVar.f11673n = zVar;
        kVar.f11668h.f(zVar);
        if (kVar.f11669i) {
            kVar.f11663b.restartInput(view);
            kVar.f11669i = false;
        }
    }

    public void H(boolean z7) {
        h hVar = (h) ((C1608t) ((C1006c) this.f11091a).f11091a).f14881c;
        if (hVar.f16329c != z7) {
            if (hVar.f16328b != null) {
                C1852h a7 = C1852h.a();
                J0 j02 = hVar.f16328b;
                a7.getClass();
                g0.c.f(j02, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a7.f15920a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a7.f15921b.remove(j02);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            hVar.f16329c = z7;
            if (z7) {
                h.a(hVar.f16327a, C1852h.a().b());
            }
        }
    }

    public void I(int i7, boolean z7) {
        k kVar = (k) this.f11091a;
        if (z7) {
            View view = kVar.f11662a;
            view.requestFocus();
            kVar.f11666e = new S(io.flutter.plugin.editing.j.VIRTUAL_DISPLAY_PLATFORM_VIEW, i7, 10);
            kVar.f11663b.restartInput(view);
            kVar.f11669i = false;
            return;
        }
        kVar.getClass();
        kVar.f11666e = new S(io.flutter.plugin.editing.j.PHYSICAL_DISPLAY_PLATFORM_VIEW, i7, 10);
        kVar.j = null;
    }

    @Override // p.InterfaceC1586h0
    public void a(MenuC1545i menuC1545i, o.j jVar) {
        View$OnKeyListenerC1542f view$OnKeyListenerC1542f = (View$OnKeyListenerC1542f) this.f11091a;
        C1541e c1541e = null;
        view$OnKeyListenerC1542f.f.removeCallbacksAndMessages(null);
        ArrayList arrayList = view$OnKeyListenerC1542f.f14413Y;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                if (menuC1545i == ((C1541e) arrayList.get(i7)).f14410b) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 == -1) {
            return;
        }
        int i8 = i7 + 1;
        if (i8 < arrayList.size()) {
            c1541e = (C1541e) arrayList.get(i8);
        }
        view$OnKeyListenerC1542f.f.postAtTime(new RunnableC0649a(this, c1541e, jVar, menuC1545i, 5), menuC1545i, SystemClock.uptimeMillis() + 200);
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1185s
    public void b(int i7) {
        ((W4.b) this.f11091a).f6205b = i7;
        if (i7 >= 10 && i7 <= 50) {
            return;
        }
        throw new IllegalArgumentException("Radius not within bounds.");
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1185s
    public void c(ArrayList arrayList) {
        ((W4.b) this.f11091a).f6204a = arrayList;
        if (!arrayList.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException("No input points.");
    }

    @Override // j5.a
    public i5.c d() {
        zzn zznVar = ((zzu) this.f11091a).zzf;
        if (zznVar != null) {
            return new i5.c(zznVar.zza, zznVar.zzb, zznVar.zzc, zznVar.zzd);
        }
        return null;
    }

    @Override // j5.a
    public int e() {
        return ((zzu) this.f11091a).zza;
    }

    @Override // j5.a
    public i5.e f() {
        zzq zzqVar = ((zzu) this.f11091a).zzg;
        if (zzqVar != null) {
            return new i5.e(zzqVar.zzb, zzqVar.zza);
        }
        return null;
    }

    @Override // p0.InterfaceC1640h
    public Object g(p pVar, i iVar) {
        return ((InterfaceC1640h) this.f11091a).g(new C1804c(pVar, null), iVar);
    }

    @Override // p0.InterfaceC1640h
    public I6.d getData() {
        return ((InterfaceC1640h) this.f11091a).getData();
    }

    @Override // p.InterfaceC1586h0
    public void h(MenuC1545i menuC1545i, o.j jVar) {
        ((View$OnKeyListenerC1542f) this.f11091a).f.removeCallbacksAndMessages(menuC1545i);
    }

    @Override // g.InterfaceC0997b
    public void i(Object obj) {
        C0996a c0996a = (C0996a) obj;
        L l8 = (L) this.f11091a;
        H h8 = (H) l8.f16647E.pollFirst();
        if (h8 == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = h8.f16638a;
        AbstractComponentCallbacksC2061v E4 = l8.f16660c.E(str);
        if (E4 == null) {
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
            return;
        }
        E4.u(h8.f16639b, c0996a.f11075a, c0996a.f11076b);
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1185s
    public void j(double d7) {
        ((W4.b) this.f11091a).f6208e = d7;
    }

    @Override // j5.a
    public C1113b k() {
        zzm zzmVar = ((zzu) this.f11091a).zzn;
        if (zzmVar == null) {
            return null;
        }
        return new C1113b(zzmVar.zza, zzmVar.zzb, zzmVar.zzc, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, zzmVar.zzm, zzmVar.zzn);
    }

    @Override // j5.a
    public String l() {
        return ((zzu) this.f11091a).zzc;
    }

    @Override // j5.a
    public Rect m() {
        zzu zzuVar = (zzu) this.f11091a;
        if (zzuVar.zze != null) {
            int i7 = 0;
            int i8 = Integer.MIN_VALUE;
            int i9 = Integer.MAX_VALUE;
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            while (true) {
                Point[] pointArr = zzuVar.zze;
                if (i7 < pointArr.length) {
                    Point point = pointArr[i7];
                    i9 = Math.min(i9, point.x);
                    i8 = Math.max(i8, point.x);
                    i10 = Math.min(i10, point.y);
                    i11 = Math.max(i11, point.y);
                    i7++;
                } else {
                    return new Rect(i9, i10, i8, i11);
                }
            }
        } else {
            return null;
        }
    }

    @Override // j5.a
    public byte[] n() {
        return ((zzu) this.f11091a).zzo;
    }

    @Override // j5.a
    public String o() {
        return ((zzu) this.f11091a).zzb;
    }

    @Override // H.c
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Void r12 = (Void) obj;
    }

    @Override // j5.a
    public Y0 p() {
        C0475d c0475d;
        zzk zzkVar = ((zzu) this.f11091a).zzl;
        C0475d c0475d2 = null;
        if (zzkVar == null) {
            return null;
        }
        String str = zzkVar.zza;
        String str2 = zzkVar.zzb;
        String str3 = zzkVar.zzc;
        String str4 = zzkVar.zzd;
        String str5 = zzkVar.zze;
        zzj zzjVar = zzkVar.zzf;
        if (zzjVar == null) {
            c0475d = null;
        } else {
            c0475d = new C0475d(zzjVar.zzh, 1);
        }
        zzj zzjVar2 = zzkVar.zzg;
        if (zzjVar2 != null) {
            c0475d2 = new C0475d(zzjVar2.zzh, 1);
        }
        return new Y0(str, str2, str3, str4, str5, c0475d, c0475d2);
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1185s
    public void q(double d7) {
        ((W4.b) this.f11091a).f6207d = d7;
        if (d7 >= 0.0d && d7 <= 1.0d) {
            return;
        }
        throw new IllegalArgumentException("Opacity must be in range [0, 1]");
    }

    @Override // j5.a
    public int r() {
        return ((zzu) this.f11091a).zzd;
    }

    @Override // j5.a
    public Point[] s() {
        return ((zzu) this.f11091a).zze;
    }

    @Override // j5.a
    public i5.d t() {
        zzo zzoVar = ((zzu) this.f11091a).zzk;
        if (zzoVar != null) {
            return new i5.d(zzoVar.zza, zzoVar.zzb);
        }
        return null;
    }

    @Override // j5.a
    public t u() {
        zzs zzsVar = ((zzu) this.f11091a).zzj;
        if (zzsVar != null) {
            return new t(zzsVar.zza, zzsVar.zzb, 3);
        }
        return null;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1185s
    public void v(N n7) {
        ((W4.b) this.f11091a).f6206c = n7;
    }

    @Override // j5.a
    public t w() {
        zzr zzrVar = ((zzu) this.f11091a).zzh;
        if (zzrVar != null) {
            return new t(zzrVar.zza, zzrVar.zzb, 2);
        }
        return null;
    }

    public boolean x(q4.p pVar) {
        boolean z7 = true;
        if (pVar.f15351a.size() % 2 != 1) {
            z7 = false;
        }
        m5.d.i("Expected a collection path.", z7, new Object[0]);
        String f = pVar.f();
        q4.p pVar2 = (q4.p) pVar.k();
        HashMap hashMap = (HashMap) this.f11091a;
        HashSet hashSet = (HashSet) hashMap.get(f);
        if (hashSet == null) {
            hashSet = new HashSet();
            hashMap.put(f, hashSet);
        }
        return hashSet.add(pVar2);
    }

    @Override // j5.a
    public C0994a y() {
        zzt zztVar = ((zzu) this.f11091a).zzi;
        if (zztVar != null) {
            return new C0994a(zztVar.zza, zztVar.zzb, zztVar.zzc);
        }
        return null;
    }

    @Override // H.c
    public void z(Throwable th) {
        synchronized (((C1903M) this.f11091a).f16079a) {
            try {
                ((C1903M) this.f11091a).f16082d.u();
                int ordinal = ((C1903M) this.f11091a).f16086i.ordinal();
                if ((ordinal == 3 || ordinal == 5 || ordinal == 6) && !(th instanceof CancellationException)) {
                    org.slf4j.helpers.i.P("CaptureSession", "Opening session with fail " + ((C1903M) this.f11091a).f16086i, th);
                    ((C1903M) this.f11091a).d();
                }
            } finally {
            }
        }
    }

    public C1006c(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f11091a = new C1608t(cameraCaptureSession, (C0927b) null);
        } else {
            this.f11091a = new C1608t(cameraCaptureSession, new C0927b(handler));
        }
    }

    public C1006c(AbstractC1595m abstractC1595m, int i7) {
        switch (i7) {
            case 13:
                this.f11091a = new C1608t(abstractC1595m);
                return;
            default:
                this.f11091a = new C1006c(abstractC1595m, 13);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [W4.b, java.lang.Object] */
    public C1006c(int i7) {
        switch (i7) {
            case 2:
                ?? obj = new Object();
                obj.f6205b = 20;
                obj.f6206c = W4.c.f6209f0;
                obj.f6207d = 0.7d;
                obj.f6208e = 0.0d;
                this.f11091a = obj;
                return;
            case 8:
                this.f11091a = new AtomicInteger(0);
                return;
            case 9:
                this.f11091a = new HashMap();
                return;
            default:
                this.f11091a = new C0993a(6);
                return;
        }
    }
}
