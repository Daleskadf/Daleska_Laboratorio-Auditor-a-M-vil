package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import javax.annotation.Nullable;
import kotlin.time.DurationKt;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzerb implements zzewq {
    @Nullable
    private final Integer zza;

    private zzerb(@Nullable Integer num) {
        this.zza = num;
    }

    public static /* bridge */ /* synthetic */ zzerb zzb() {
        int extensionVersion;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjR)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzp();
            int i = 0;
            if (Build.VERSION.SDK_INT >= 30) {
                extensionVersion = SdkExtensions.getExtensionVersion(30);
                if (extensionVersion > 3) {
                    i = SdkExtensions.getExtensionVersion(DurationKt.NANOS_IN_MILLIS);
                }
            }
            return new zzerb(Integer.valueOf(i));
        }
        return new zzerb(null);
    }

    @Override // com.google.android.gms.internal.ads.zzewq
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Integer num = this.zza;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
