package U4;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzac;
import com.google.android.gms.internal.maps.zzad;
import com.google.android.gms.internal.maps.zzc;
import io.flutter.plugins.googlemaps.C1177j;
import java.util.LinkedHashSet;
import p.C1608t;
import q3.c;
import q3.d;
import r3.C1742f;
import s3.C1786n;
import s3.C1787o;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f5767a = new LinkedHashSet();

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f5768b;

    /* renamed from: c  reason: collision with root package name */
    public q3.b f5769c;

    /* renamed from: d  reason: collision with root package name */
    public c f5770d;

    /* renamed from: e  reason: collision with root package name */
    public d f5771e;
    public C1177j f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ b f5772g;

    public a(b bVar) {
        this.f5772g = bVar;
        this.f5768b = bVar;
    }

    public final C1786n a(C1787o c1787o) {
        C1786n c1786n;
        C1608t c1608t = this.f5772g.f5774b;
        c1608t.getClass();
        try {
            C1742f c1742f = (C1742f) c1608t.f14880b;
            Parcel zza = c1742f.zza();
            zzc.zzd(zza, c1787o);
            Parcel zzJ = c1742f.zzJ(11, zza);
            zzad zzb = zzac.zzb(zzJ.readStrongBinder());
            zzJ.recycle();
            if (zzb != null) {
                if (c1787o.f15641l0 == 1) {
                    c1786n = new C1786n(zzb);
                } else {
                    c1786n = new C1786n(zzb);
                }
            } else {
                c1786n = null;
            }
            this.f5767a.add(c1786n);
            this.f5768b.f5773a.put(c1786n, this);
            return c1786n;
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final void b() {
        LinkedHashSet linkedHashSet = this.f5767a;
        for (Object obj : linkedHashSet) {
            b bVar = this.f5768b;
            bVar.getClass();
            C1786n c1786n = (C1786n) obj;
            c1786n.getClass();
            try {
                c1786n.f15625a.zzo();
                bVar.f5773a.remove(obj);
            } catch (RemoteException e7) {
                throw new RuntimeException(e7);
            }
        }
        linkedHashSet.clear();
    }
}
