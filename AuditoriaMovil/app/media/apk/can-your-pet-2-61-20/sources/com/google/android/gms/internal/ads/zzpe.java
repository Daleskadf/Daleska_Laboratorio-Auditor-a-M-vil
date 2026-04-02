package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.media.AudioProfile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzpe {
    public static zzph zza(AudioManager audioManager, zzk zzkVar) {
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(zzkVar.zza().zza);
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(zzgcl.zzf(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile m349m = zzox$$ExternalSyntheticApiModelOutline1.m349m(directProfilesForAttributes.get(i));
            encapsulationType = m349m.getEncapsulationType();
            if (encapsulationType != 1) {
                format = m349m.getFormat();
                if (zzfx.zzK(format) || zzph.zzb.containsKey(Integer.valueOf(format))) {
                    Integer valueOf = Integer.valueOf(format);
                    if (hashMap.containsKey(valueOf)) {
                        Set set = (Set) hashMap.get(valueOf);
                        set.getClass();
                        channelMasks2 = m349m.getChannelMasks();
                        set.addAll(zzgcl.zzf(channelMasks2));
                    } else {
                        channelMasks = m349m.getChannelMasks();
                        hashMap.put(valueOf, new HashSet(zzgcl.zzf(channelMasks)));
                    }
                }
            }
        }
        zzfzk zzfzkVar = new zzfzk();
        for (Map.Entry entry : hashMap.entrySet()) {
            zzfzkVar.zzf(new zzpf(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new zzph(zzfzkVar.zzi());
    }

    public static zzpp zzb(AudioManager audioManager, zzk zzkVar) {
        List audioDevicesForAttributes;
        audioManager.getClass();
        try {
            audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(zzkVar.zza().zza);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new zzpp(zzox$$ExternalSyntheticApiModelOutline1.m(audioDevicesForAttributes.get(0)));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
