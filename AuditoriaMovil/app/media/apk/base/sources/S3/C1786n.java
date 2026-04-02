package s3;

import android.os.RemoteException;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.maps.zzad;
import com.google.android.gms.maps.model.LatLng;
/* renamed from: s3.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1786n {

    /* renamed from: a  reason: collision with root package name */
    public final zzad f15625a;

    public C1786n(zzad zzadVar) {
        I.i(zzadVar);
        this.f15625a = zzadVar;
    }

    public final String a() {
        try {
            return this.f15625a.zzk();
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final LatLng b() {
        try {
            return this.f15625a.zzj();
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final void c(LatLng latLng) {
        if (latLng != null) {
            try {
                this.f15625a.zzw(latLng);
                return;
            } catch (RemoteException e7) {
                throw new RuntimeException(e7);
            }
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    public final void d(String str) {
        try {
            this.f15625a.zzA(str);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1786n)) {
            return false;
        }
        try {
            return this.f15625a.zzE(((C1786n) obj).f15625a);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final int hashCode() {
        try {
            return this.f15625a.zzg();
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
