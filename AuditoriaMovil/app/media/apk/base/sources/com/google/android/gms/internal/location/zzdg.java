package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.support.v4.media.session.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
final class zzdg extends zzs {
    final /* synthetic */ TaskCompletionSource zza;

    public zzdg(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzt
    public final void zzb(int i7, String[] strArr) {
        if (i7 != 0 && (i7 < 1000 || i7 >= 1006)) {
            i7 = 13;
        }
        a.w(new Status(i7, null, null, null), null, this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzt
    public final void zzc(int i7, String[] strArr) {
        if (i7 != 0 && (i7 < 1000 || i7 >= 1006)) {
            i7 = 13;
        }
        a.w(new Status(i7, null, null, null), null, this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzt
    public final void zzd(int i7, PendingIntent pendingIntent) {
        if (i7 != 0 && (i7 < 1000 || i7 >= 1006)) {
            i7 = 13;
        }
        a.w(new Status(i7, null, null, null), null, this.zza);
    }
}
