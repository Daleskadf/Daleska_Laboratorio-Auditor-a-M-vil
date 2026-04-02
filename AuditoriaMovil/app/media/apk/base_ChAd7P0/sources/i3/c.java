package i3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.maps.zzc;
import p4.P;
import q3.k;
import r3.AbstractC1740d;
import r3.C1743g;
/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Bundle f11474a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f11475b;

    public c(k kVar, Bundle bundle) {
        this.f11475b = kVar;
        this.f11474a = bundle;
    }

    @Override // i3.f
    public final int a() {
        return 1;
    }

    @Override // i3.f
    public final void b() {
        P p7 = (P) this.f11475b.f15330b;
        Bundle bundle = this.f11474a;
        q3.f fVar = (q3.f) p7.f15210a;
        C1743g c1743g = (C1743g) p7.f15211b;
        try {
            Bundle bundle2 = new Bundle();
            AbstractC1740d.F(bundle, bundle2);
            Parcel zza = c1743g.zza();
            zzc.zzd(zza, bundle2);
            c1743g.zzc(2, zza);
            AbstractC1740d.F(bundle2, bundle);
            Parcel zzJ = c1743g.zzJ(8, c1743g.zza());
            InterfaceC1109a b5 = b.b(zzJ.readStrongBinder());
            zzJ.recycle();
            p7.f15212c = (View) b.c(b5);
            fVar.removeAllViews();
            fVar.addView((View) p7.f15212c);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
