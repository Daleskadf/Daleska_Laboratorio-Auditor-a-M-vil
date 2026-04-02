package C5;

import B5.AbstractActivityC0032e;
import L5.t;
import L5.v;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.lifecycle.C0570w;
import com.google.android.gms.internal.maps.zzc;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import io.flutter.plugins.googlemaps.C1177j;
import java.util.HashSet;
import java.util.Iterator;
import p4.P;
import r3.AbstractC1740d;
import r3.C1743g;
/* loaded from: classes.dex */
public final class d implements I5.b {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractActivityC0032e f571a;

    /* renamed from: b  reason: collision with root package name */
    public final HiddenLifecycleReference f572b;

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f573c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f574d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f575e = new HashSet();
    public final HashSet f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    public final HashSet f576g;

    public d(AbstractActivityC0032e abstractActivityC0032e, C0570w c0570w) {
        new HashSet();
        this.f576g = new HashSet();
        this.f571a = abstractActivityC0032e;
        this.f572b = new HiddenLifecycleReference(c0570w);
    }

    public final void a(t tVar) {
        this.f574d.add(tVar);
    }

    public final void b(v vVar) {
        this.f573c.add(vVar);
    }

    public final void c(Bundle bundle) {
        Iterator it = this.f576g.iterator();
        while (it.hasNext()) {
            C1177j c1177j = (C1177j) it.next();
            if (!c1177j.f12199i0) {
                q3.k kVar = c1177j.f12194e.f15322a;
                P p7 = (P) kVar.f15330b;
                if (p7 != null) {
                    try {
                        Bundle bundle2 = new Bundle();
                        AbstractC1740d.F(bundle, bundle2);
                        C1743g c1743g = (C1743g) p7.f15211b;
                        Parcel zza = c1743g.zza();
                        zzc.zzd(zza, bundle2);
                        Parcel zzJ = c1743g.zzJ(7, zza);
                        if (zzJ.readInt() != 0) {
                            bundle2.readFromParcel(zzJ);
                        }
                        zzJ.recycle();
                        AbstractC1740d.F(bundle2, bundle);
                    } catch (RemoteException e7) {
                        throw new RuntimeException(e7);
                    }
                } else {
                    Bundle bundle3 = (Bundle) kVar.f15331c;
                    if (bundle3 != null) {
                        bundle.putAll(bundle3);
                    }
                }
            }
        }
    }

    public final void d(t tVar) {
        this.f574d.remove(tVar);
    }
}
