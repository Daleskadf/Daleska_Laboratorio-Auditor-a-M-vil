package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzpl extends ContentObserver {
    final /* synthetic */ zzpo zza;
    private final ContentResolver zzb;
    private final Uri zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzpl(zzpo zzpoVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.zza = zzpoVar;
        this.zzb = contentResolver;
        this.zzc = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Context context;
        zzk zzkVar;
        zzpp zzppVar;
        zzpo zzpoVar = this.zza;
        context = zzpoVar.zza;
        zzkVar = zzpoVar.zzh;
        zzppVar = zzpoVar.zzg;
        this.zza.zzj(zzph.zzc(context, zzkVar, zzppVar));
    }

    public final void zza() {
        this.zzb.registerContentObserver(this.zzc, false, this);
    }

    public final void zzb() {
        this.zzb.unregisterContentObserver(this);
    }
}
