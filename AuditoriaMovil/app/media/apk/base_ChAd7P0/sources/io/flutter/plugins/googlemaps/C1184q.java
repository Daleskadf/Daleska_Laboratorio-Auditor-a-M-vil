package io.flutter.plugins.googlemaps;

import a.AbstractC0412a;
import android.content.res.AssetManager;
import android.os.Parcel;
import android.os.RemoteException;
import b3.C0585f;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzq;
import com.google.android.gms.internal.maps.zzr;
import j6.C1372c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p.C1608t;
import r3.C1742f;
import s3.C1782j;
import s3.C1783k;
/* renamed from: io.flutter.plugins.googlemaps.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1184q {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f12254a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f12255b;

    /* renamed from: c  reason: collision with root package name */
    public final a6.t0 f12256c;

    /* renamed from: d  reason: collision with root package name */
    public C1608t f12257d;

    /* renamed from: e  reason: collision with root package name */
    public final AssetManager f12258e;
    public final float f;

    /* renamed from: g  reason: collision with root package name */
    public final C1372c f12259g;

    public C1184q(a6.t0 t0Var, AssetManager assetManager, float f) {
        C1372c c1372c = new C1372c(18);
        this.f12254a = new HashMap();
        this.f12255b = new HashMap();
        this.f12256c = t0Var;
        this.f12258e = assetManager;
        this.f = f;
        this.f12259g = c1372c;
    }

    public final void a(List list) {
        C1782j c1782j;
        boolean z7;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1166b0 c1166b0 = (C1166b0) it.next();
            C0585f c0585f = new C0585f(7);
            String x7 = AbstractC0412a.x(c1166b0, c0585f, this.f12258e, this.f, this.f12259g);
            C1783k c1783k = (C1783k) c0585f.f8171b;
            C1608t c1608t = this.f12257d;
            c1608t.getClass();
            try {
                C1742f c1742f = (C1742f) c1608t.f14880b;
                Parcel zza = c1742f.zza();
                zzc.zzd(zza, c1783k);
                Parcel zzJ = c1742f.zzJ(12, zza);
                zzr zzb = zzq.zzb(zzJ.readStrongBinder());
                zzJ.recycle();
                if (zzb != null) {
                    c1782j = new C1782j(zzb);
                } else {
                    c1782j = null;
                }
                if (c1782j != null) {
                    if (c1166b0.f12111d != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    this.f12254a.put(x7, new C1182o(c1782j, z7));
                    try {
                        this.f12255b.put(c1782j.f15608a.zzm(), x7);
                    } catch (RemoteException e7) {
                        throw new RuntimeException(e7);
                    }
                }
            } catch (RemoteException e8) {
                throw new RuntimeException(e8);
            }
        }
    }
}
