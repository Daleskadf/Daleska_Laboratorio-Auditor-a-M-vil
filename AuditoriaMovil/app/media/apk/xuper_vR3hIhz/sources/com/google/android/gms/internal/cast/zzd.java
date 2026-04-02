package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transport;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.UUID;
@ShowFirstParty
/* loaded from: classes.dex */
public final class zzd {
    private final Transport<zzku> zza;
    private final String zzb;
    private final int zzc;

    private zzd(SharedPreferences sharedPreferences, Transport<zzku> transport, long j10) {
        int i10;
        this.zza = transport;
        String string = sharedPreferences.getString("client_sender_id", null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            sharedPreferences.edit().putString("client_sender_id", string).apply();
        }
        this.zzb = string;
        if (j10 == 0) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        this.zzc = i10;
    }

    public static zzd zza(SharedPreferences sharedPreferences, Transport<zzku> transport, long j10) {
        return new zzd(sharedPreferences, transport, j10);
    }

    public final void zzb(zzku zzkuVar, int i10) {
        Event<zzku> ofTelemetry;
        zzkt zzd = zzku.zzd(zzkuVar);
        zzd.zzi(this.zzb);
        zzku zzp = zzd.zzp();
        if (this.zzc - 1 != 0) {
            ofTelemetry = Event.ofData(i10 - 1, zzp);
        } else {
            ofTelemetry = Event.ofTelemetry(i10 - 1, zzp);
        }
        Preconditions.checkNotNull(ofTelemetry);
        this.zza.send(ofTelemetry);
    }
}
