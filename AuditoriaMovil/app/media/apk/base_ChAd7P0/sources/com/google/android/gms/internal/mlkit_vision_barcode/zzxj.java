package com.google.android.gms.internal.mlkit_vision_barcode;

import android.util.Log;
import com.google.android.gms.common.internal.C0765n;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzxj implements zzeh {
    final /* synthetic */ zzrc zza;
    final /* synthetic */ float zzb;
    final /* synthetic */ zzxn zzc;
    final /* synthetic */ float zzd;
    final /* synthetic */ zzxk zze;

    public zzxj(zzxk zzxkVar, zzrc zzrcVar, float f, zzxn zzxnVar, float f4) {
        this.zza = zzrcVar;
        this.zzb = f;
        this.zzc = zzxnVar;
        this.zzd = f4;
        this.zze = zzxkVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeh
    public final void zza(Throwable th) {
        C0765n c0765n;
        AtomicBoolean atomicBoolean;
        c0765n = zzxk.zzf;
        String str = "Unable to set zoom to " + this.zzd;
        if (Log.isLoggable(c0765n.f9383a, 5)) {
            Log.w("AutoZoom", c0765n.c(str), th);
        }
        atomicBoolean = this.zze.zzg;
        atomicBoolean.set(false);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeh
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AtomicBoolean atomicBoolean;
        Float f = (Float) obj;
        if (f.floatValue() >= 1.0f) {
            zzxk.zzg(this.zze, f.floatValue());
            this.zze.zzq(this.zza, this.zzb, f.floatValue(), this.zzc);
        }
        atomicBoolean = this.zze.zzg;
        atomicBoolean.set(false);
    }
}
