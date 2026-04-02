package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaan implements zzcp {
    private final zzdm zza;

    public zzaan(zzdm zzdmVar) {
        this.zza = zzdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcq zza(Context context, zzt zztVar, zzw zzwVar, zzdn zzdnVar, Executor executor, List list, long j) throws zzdl {
        try {
            Constructor<?> constructor = Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(zzdm.class);
            Object[] objArr = new Object[1];
            try {
                objArr[0] = this.zza;
                return ((zzcp) constructor.newInstance(objArr)).zza(context, zztVar, zzwVar, zzdnVar, executor, list, 0L);
            } catch (Exception e) {
                e = e;
                if (e instanceof zzdl) {
                    throw ((zzdl) e);
                }
                throw new zzdl(e, -9223372036854775807L);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
