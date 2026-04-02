package s3;

import android.os.RemoteException;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.maps.zzag;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final zzag f15653a;

    public s(zzag zzagVar) {
        I.i(zzagVar);
        this.f15653a = zzagVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        try {
            return this.f15653a.zzB(((s) obj).f15653a);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final int hashCode() {
        try {
            return this.f15653a.zzi();
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
