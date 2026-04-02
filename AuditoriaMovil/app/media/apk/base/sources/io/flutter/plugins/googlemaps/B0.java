package io.flutter.plugins.googlemaps;

import a.AbstractC0412a;
import android.content.res.AssetManager;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzai;
import com.google.android.gms.internal.maps.zzaj;
import com.google.android.gms.internal.maps.zzc;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p.C1608t;
import r3.C1742f;
/* loaded from: classes.dex */
public final class B0 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f12032a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f12033b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final a6.t0 f12034c;

    /* renamed from: d  reason: collision with root package name */
    public C1608t f12035d;

    /* renamed from: e  reason: collision with root package name */
    public final float f12036e;
    public final AssetManager f;

    public B0(a6.t0 t0Var, AssetManager assetManager, float f) {
        this.f = assetManager;
        this.f12034c = t0Var;
        this.f12036e = f;
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            float f = this.f12036e;
            C1163a c1163a = new C1163a(f, 2);
            String C7 = AbstractC0412a.C((q0) it.next(), c1163a, this.f, f);
            s3.v vVar = (s3.v) c1163a.f12100d;
            boolean z7 = c1163a.f12099c;
            C1608t c1608t = this.f12035d;
            c1608t.getClass();
            try {
                com.google.android.gms.common.internal.I.j(vVar, "PolylineOptions must not be null");
                C1742f c1742f = (C1742f) c1608t.f14880b;
                Parcel zza = c1742f.zza();
                zzc.zzd(zza, vVar);
                Parcel zzJ = c1742f.zzJ(9, zza);
                zzaj zzb = zzai.zzb(zzJ.readStrongBinder());
                zzJ.recycle();
                s3.u uVar = new s3.u(zzb);
                this.f12032a.put(C7, new z0(uVar, z7, f));
                try {
                    this.f12033b.put(uVar.f15664a.zzl(), C7);
                } catch (RemoteException e7) {
                    throw new RuntimeException(e7);
                }
            } catch (RemoteException e8) {
                throw new RuntimeException(e8);
            }
        }
    }
}
