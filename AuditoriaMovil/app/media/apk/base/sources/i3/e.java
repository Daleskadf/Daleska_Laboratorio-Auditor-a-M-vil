package i3;

import android.os.RemoteException;
import p4.P;
import q3.k;
import r3.C1743g;
/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11478a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f11479b;

    public /* synthetic */ e(k kVar, int i7) {
        this.f11478a = i7;
        this.f11479b = kVar;
    }

    @Override // i3.f
    public final int a() {
        switch (this.f11478a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override // i3.f
    public final void b() {
        switch (this.f11478a) {
            case 0:
                P p7 = (P) this.f11479b.f15330b;
                p7.getClass();
                try {
                    C1743g c1743g = (C1743g) p7.f15211b;
                    c1743g.zzc(12, c1743g.zza());
                    return;
                } catch (RemoteException e7) {
                    throw new RuntimeException(e7);
                }
            default:
                P p8 = (P) this.f11479b.f15330b;
                p8.getClass();
                try {
                    C1743g c1743g2 = (C1743g) p8.f15211b;
                    c1743g2.zzc(3, c1743g2.zza());
                    return;
                } catch (RemoteException e8) {
                    throw new RuntimeException(e8);
                }
        }
    }
}
