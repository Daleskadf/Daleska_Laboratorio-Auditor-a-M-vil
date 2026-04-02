package s3;

import android.os.RemoteException;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.maps.zzl;
/* renamed from: s3.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1777e {

    /* renamed from: a  reason: collision with root package name */
    public final zzl f15595a;

    public C1777e(zzl zzlVar) {
        I.i(zzlVar);
        this.f15595a = zzlVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1777e)) {
            return false;
        }
        try {
            return this.f15595a.zzy(((C1777e) obj).f15595a);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final int hashCode() {
        try {
            return this.f15595a.zzi();
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
