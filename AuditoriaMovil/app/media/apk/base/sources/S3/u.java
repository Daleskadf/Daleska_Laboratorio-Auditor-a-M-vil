package s3;

import android.os.RemoteException;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.maps.zzaj;
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final zzaj f15664a;

    public u(zzaj zzajVar) {
        I.i(zzajVar);
        this.f15664a = zzajVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        try {
            return this.f15664a.zzD(((u) obj).f15664a);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final int hashCode() {
        try {
            return this.f15664a.zzh();
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
