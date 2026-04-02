package s3;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzam;
/* renamed from: s3.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1766A {

    /* renamed from: a  reason: collision with root package name */
    public final zzam f15575a;

    public C1766A(zzam zzamVar) {
        this.f15575a = zzamVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1766A)) {
            return false;
        }
        try {
            return this.f15575a.zzn(((C1766A) obj).f15575a);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final int hashCode() {
        try {
            return this.f15575a.zzf();
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
