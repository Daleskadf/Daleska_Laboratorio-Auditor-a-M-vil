package s3;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzr;
/* renamed from: s3.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1782j {

    /* renamed from: a  reason: collision with root package name */
    public final zzr f15608a;

    public C1782j(zzr zzrVar) {
        this.f15608a = zzrVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1782j)) {
            return false;
        }
        try {
            return this.f15608a.zzz(((C1782j) obj).f15608a);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final int hashCode() {
        try {
            return this.f15608a.zzi();
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
