package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.play.core.splitcompat.SplitCompat;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes3.dex */
public final class zzak implements com.google.android.play.core.splitinstall.zzh {
    private final Context zza;
    private final com.google.android.play.core.splitcompat.zze zzb;
    private final zzam zzc;
    private final Executor zzd;
    private final com.google.android.play.core.splitcompat.zzs zze;

    public zzak(Context context, Executor executor, zzam zzamVar, com.google.android.play.core.splitcompat.zze zzeVar, com.google.android.play.core.splitcompat.zzs zzsVar) {
        this.zza = context;
        this.zzb = zzeVar;
        this.zzc = zzamVar;
        this.zzd = executor;
        this.zze = zzsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzb(zzak zzakVar, List list, com.google.android.play.core.splitinstall.zzf zzfVar) {
        Integer zze = zzakVar.zze(list);
        if (zze == null) {
            return;
        }
        if (zze.intValue() == 0) {
            zzfVar.zzc();
        } else {
            zzfVar.zzb(zze.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzc(zzak zzakVar, com.google.android.play.core.splitinstall.zzf zzfVar) {
        try {
            if (!SplitCompat.zzd(zzbr.zza(zzakVar.zza))) {
                Log.e("SplitCompat", "Emulating splits failed.");
                zzfVar.zzb(-12);
                return;
            }
            Log.i("SplitCompat", "Splits installed.");
            zzfVar.zza();
        } catch (Exception e) {
            Log.e("SplitCompat", "Error emulating splits.", e);
            zzfVar.zzb(-12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        if (r7.exists() == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0147 A[Catch: Exception -> 0x014b, TRY_LEAVE, TryCatch #13 {Exception -> 0x014b, blocks: (B:3:0x0004, B:90:0x0147, B:5:0x0016, B:11:0x0022, B:12:0x002b, B:14:0x0032, B:48:0x00b2, B:56:0x00c2, B:55:0x00bf, B:57:0x00c3, B:58:0x00c8, B:60:0x00d4, B:62:0x00dc, B:64:0x00e4, B:65:0x00f2, B:67:0x00f6, B:69:0x0107, B:81:0x0132, B:71:0x010e, B:72:0x0114, B:74:0x011b, B:77:0x0124, B:79:0x012b), top: B:101:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Integer zze(java.util.List r14) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.internal.zzak.zze(java.util.List):java.lang.Integer");
    }

    @Override // com.google.android.play.core.splitinstall.zzh
    public final void zzd(List list, com.google.android.play.core.splitinstall.zzf zzfVar) {
        if (!SplitCompat.zze()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.zzd.execute(new zzaj(this, list, zzfVar));
    }
}
