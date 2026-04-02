package com.google.android.gms.internal.location;

import X2.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.List;
import m5.d;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class zzem extends a {
    public static final Parcelable.Creator<zzem> CREATOR = new zzen();
    private final List zza;
    private final PendingIntent zzb;
    private final String zzc;

    public zzem(List list, PendingIntent pendingIntent, String str) {
        zzex zzj;
        if (list == null) {
            zzj = zzex.zzi();
        } else {
            zzj = zzex.zzj(list);
        }
        this.zza = zzj;
        this.zzb = pendingIntent;
        this.zzc = str;
    }

    public static zzem zza(List list) {
        I.j(list, "geofence can't be null.");
        I.a("Geofences must contains at least one id.", !list.isEmpty());
        return new zzem(list, null, StringUtils.EMPTY);
    }

    public static zzem zzb(PendingIntent pendingIntent) {
        I.j(pendingIntent, "PendingIntent can not be null.");
        return new zzem(null, pendingIntent, StringUtils.EMPTY);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        List list = this.zza;
        int G2 = d.G(20293, parcel);
        d.D(parcel, 1, list);
        d.A(parcel, 2, this.zzb, i7, false);
        d.B(parcel, 3, this.zzc, false);
        d.J(G2, parcel);
    }
}
