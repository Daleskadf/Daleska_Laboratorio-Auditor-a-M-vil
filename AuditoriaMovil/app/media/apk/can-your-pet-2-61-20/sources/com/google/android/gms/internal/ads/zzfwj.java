package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfwj {
    private final String zza;
    private final zzfwh zzb;
    private zzfwh zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfwj(String str, zzfwi zzfwiVar) {
        zzfwh zzfwhVar = new zzfwh();
        this.zzb = zzfwhVar;
        this.zzc = zzfwhVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfwh zzfwhVar = this.zzb.zzb;
        String str = "";
        while (zzfwhVar != null) {
            Object obj = zzfwhVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            zzfwhVar = zzfwhVar.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfwj zza(@CheckForNull Object obj) {
        zzfwh zzfwhVar = new zzfwh();
        this.zzc.zzb = zzfwhVar;
        this.zzc = zzfwhVar;
        zzfwhVar.zza = obj;
        return this;
    }
}
