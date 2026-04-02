package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzpk extends AudioDeviceCallback {
    final /* synthetic */ zzpo zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzpk(zzpo zzpoVar, zzpj zzpjVar) {
        this.zza = zzpoVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        Context context;
        zzk zzkVar;
        zzpp zzppVar;
        zzpo zzpoVar = this.zza;
        context = zzpoVar.zza;
        zzkVar = zzpoVar.zzh;
        zzppVar = zzpoVar.zzg;
        this.zza.zzj(zzph.zzc(context, zzkVar, zzppVar));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzpp zzppVar;
        Context context;
        zzk zzkVar;
        zzpp zzppVar2;
        zzppVar = this.zza.zzg;
        int i = zzfx.zza;
        int length = audioDeviceInfoArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (zzfx.zzG(audioDeviceInfoArr[i2], zzppVar)) {
                this.zza.zzg = null;
                break;
            } else {
                i2++;
            }
        }
        zzpo zzpoVar = this.zza;
        context = zzpoVar.zza;
        zzkVar = zzpoVar.zzh;
        zzppVar2 = zzpoVar.zzg;
        zzpoVar.zzj(zzph.zzc(context, zzkVar, zzppVar2));
    }
}
