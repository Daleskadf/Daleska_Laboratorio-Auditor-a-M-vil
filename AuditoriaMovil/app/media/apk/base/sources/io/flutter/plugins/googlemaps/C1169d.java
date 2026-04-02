package io.flutter.plugins.googlemaps;

import a.AbstractC0412a;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzaf;
import com.google.android.gms.internal.maps.zzag;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzk;
import com.google.android.gms.internal.maps.zzl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p.C1608t;
import r3.C1742f;
import s3.C1777e;
import s3.C1778f;
/* renamed from: io.flutter.plugins.googlemaps.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1169d {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f12119a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f12120b;

    /* renamed from: c  reason: collision with root package name */
    public final a6.t0 f12121c;

    /* renamed from: d  reason: collision with root package name */
    public final float f12122d;

    /* renamed from: e  reason: collision with root package name */
    public C1608t f12123e;

    public C1169d(a6.t0 t0Var, float f, int i7) {
        switch (i7) {
            case 1:
                this.f12119a = new HashMap();
                this.f12120b = new HashMap();
                this.f12121c = t0Var;
                this.f12122d = f;
                return;
            default:
                this.f12119a = new HashMap();
                this.f12120b = new HashMap();
                this.f12121c = t0Var;
                this.f12122d = f;
                return;
        }
    }

    public void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            float f = this.f12122d;
            C1163a c1163a = new C1163a(f, 0);
            String w2 = AbstractC0412a.w((W) it.next(), c1163a);
            C1778f c1778f = (C1778f) c1163a.f12100d;
            boolean z7 = c1163a.f12099c;
            C1608t c1608t = this.f12123e;
            c1608t.getClass();
            try {
                C1742f c1742f = (C1742f) c1608t.f14880b;
                Parcel zza = c1742f.zza();
                zzc.zzd(zza, c1778f);
                Parcel zzJ = c1742f.zzJ(35, zza);
                zzl zzb = zzk.zzb(zzJ.readStrongBinder());
                zzJ.recycle();
                C1777e c1777e = new C1777e(zzb);
                this.f12119a.put(w2, new C1165b(c1777e, z7, f));
                try {
                    this.f12120b.put(c1777e.f15595a.zzl(), w2);
                } catch (RemoteException e7) {
                    throw new RuntimeException(e7);
                }
            } catch (RemoteException e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    public void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            float f = this.f12122d;
            C1163a c1163a = new C1163a(f, 1);
            String B7 = AbstractC0412a.B((p0) it.next(), c1163a);
            s3.t tVar = (s3.t) c1163a.f12100d;
            boolean z7 = c1163a.f12099c;
            C1608t c1608t = this.f12123e;
            c1608t.getClass();
            try {
                com.google.android.gms.common.internal.I.j(tVar, "PolygonOptions must not be null");
                C1742f c1742f = (C1742f) c1608t.f14880b;
                Parcel zza = c1742f.zza();
                zzc.zzd(zza, tVar);
                Parcel zzJ = c1742f.zzJ(10, zza);
                zzag zzb = zzaf.zzb(zzJ.readStrongBinder());
                zzJ.recycle();
                s3.s sVar = new s3.s(zzb);
                this.f12119a.put(B7, new x0(sVar, z7, f));
                try {
                    this.f12120b.put(sVar.f15653a.zzk(), B7);
                } catch (RemoteException e7) {
                    throw new RuntimeException(e7);
                }
            } catch (RemoteException e8) {
                throw new RuntimeException(e8);
            }
        }
    }
}
