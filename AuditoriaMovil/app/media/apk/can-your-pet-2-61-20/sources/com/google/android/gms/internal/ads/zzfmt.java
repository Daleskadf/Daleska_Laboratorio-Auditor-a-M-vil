package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfmt {
    private final Context zza;
    private final Executor zzb;
    private final com.google.android.gms.ads.internal.util.client.zzr zzc;
    private final zzflk zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfmt(Context context, Executor executor, com.google.android.gms.ads.internal.util.client.zzr zzrVar, zzflk zzflkVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzrVar;
        this.zzd = zzflkVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(String str, zzflh zzflhVar) {
        zzfkw zza = zzfkv.zza(this.zza, zzflo.CUI_NAME_PING);
        zza.zzi();
        zza.zzg(this.zzc.zza(str));
        if (zzflhVar == null) {
            this.zzd.zzb(zza.zzm());
            return;
        }
        zzflhVar.zza(zza);
        zzflhVar.zzh();
    }

    public final void zzc(final String str, final zzflh zzflhVar) {
        if (!zzflk.zza() || !((Boolean) zzbfm.zzd.zze()).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfmr
                @Override // java.lang.Runnable
                public final void run() {
                    zzfmt.this.zza(str);
                }
            });
        } else {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfms
                @Override // java.lang.Runnable
                public final void run() {
                    zzfmt.this.zzb(str, zzflhVar);
                }
            });
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), null);
        }
    }
}
