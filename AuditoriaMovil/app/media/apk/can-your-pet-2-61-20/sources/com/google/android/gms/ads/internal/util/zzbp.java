package com.google.android.gms.ads.internal.util;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.internal.ads.zzaqm;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzarn;
import com.google.android.gms.internal.ads.zzcbw;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes.dex */
public final class zzbp extends zzaqq {
    private final zzcbw zza;
    private final com.google.android.gms.ads.internal.util.client.zzl zzb;

    public zzbp(String str, Map map, zzcbw zzcbwVar) {
        super(0, str, new zzbo(zzcbwVar));
        this.zza = zzcbwVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.zzb = zzlVar;
        zzlVar.zzd(str, ShareTarget.METHOD_GET, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaqq
    public final zzaqw zzh(zzaqm zzaqmVar) {
        return zzaqw.zzb(zzaqmVar, zzarn.zzb(zzaqmVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaqq
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzaqm zzaqmVar = (zzaqm) obj;
        this.zzb.zzf(zzaqmVar.zzc, zzaqmVar.zza);
        byte[] bArr = zzaqmVar.zzb;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk() && bArr != null) {
            this.zzb.zzh(bArr);
        }
        this.zza.zzc(zzaqmVar);
    }
}
