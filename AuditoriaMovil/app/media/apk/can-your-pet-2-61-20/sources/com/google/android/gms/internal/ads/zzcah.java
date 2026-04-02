package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcah implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcai zza;
    private final String zzb;

    public zzcah(zzcai zzcaiVar, String str) {
        this.zza = zzcaiVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzcag> list;
        synchronized (this.zza) {
            list = this.zza.zzb;
            for (zzcag zzcagVar : list) {
                zzcagVar.zza.zzb(zzcagVar.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
