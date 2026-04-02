package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzpd {
    public static int zza(int i, int i2, zzk zzkVar) {
        boolean isDirectPlaybackSupported;
        for (int i3 = 10; i3 > 0; i3--) {
            int zzh = zzfx.zzh(i3);
            if (zzh != 0) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(zzh).build(), zzkVar.zza().zza);
                if (isDirectPlaybackSupported) {
                    return i3;
                }
            }
        }
        return 0;
    }

    public static zzfzn<Integer> zzb(zzk zzkVar) {
        boolean isDirectPlaybackSupported;
        zzfzk zzfzkVar = new zzfzk();
        zzgbt it = zzph.zzb.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (zzfx.zza >= zzfx.zzg(intValue)) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zzkVar.zza().zza);
                if (isDirectPlaybackSupported) {
                    zzfzkVar.zzf(Integer.valueOf(intValue));
                }
            }
        }
        zzfzkVar.zzf((Object) 2);
        return zzfzkVar.zzi();
    }
}
