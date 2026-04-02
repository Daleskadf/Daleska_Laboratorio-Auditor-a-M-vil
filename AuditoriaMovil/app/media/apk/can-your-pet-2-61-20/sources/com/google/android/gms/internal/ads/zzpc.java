package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzpc {
    private static zzfzs<Integer> zzb() {
        zzfzr zzfzrVar = new zzfzr();
        zzfzrVar.zzg(8, 7);
        if (zzfx.zza >= 31) {
            zzfzrVar.zzg(26, 27);
        }
        if (zzfx.zza >= 33) {
            zzfzrVar.zzf((Object) 30);
        }
        return zzfzrVar.zzi();
    }

    public static boolean zza(AudioManager audioManager, zzpp zzppVar) {
        AudioDeviceInfo[] audioDeviceInfoArr;
        int type;
        if (zzppVar == null) {
            audioManager.getClass();
            audioDeviceInfoArr = audioManager.getDevices(2);
        } else {
            audioDeviceInfoArr = new AudioDeviceInfo[]{zzppVar.zza};
        }
        zzfzs<Integer> zzb = zzb();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            type = audioDeviceInfo.getType();
            if (zzb.contains(Integer.valueOf(type))) {
                return true;
            }
        }
        return false;
    }
}
