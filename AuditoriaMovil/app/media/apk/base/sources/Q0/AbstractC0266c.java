package Q0;

import H0.C0126f;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r3.AbstractC1740d;
/* renamed from: Q0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0266c {
    public static C0268e a(AudioManager audioManager, C0126f c0126f) {
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        directProfilesForAttributes = audioManager.getDirectProfilesForAttributes((AudioAttributes) c0126f.a().f4b);
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(AbstractC1740d.d(12)));
        for (int i7 = 0; i7 < directProfilesForAttributes.size(); i7++) {
            AudioProfile f = P0.h.f(directProfilesForAttributes.get(i7));
            encapsulationType = f.getEncapsulationType();
            if (encapsulationType != 1) {
                format = f.getFormat();
                if (K0.x.I(format) || C0268e.f4273e.containsKey(Integer.valueOf(format))) {
                    if (hashMap.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) hashMap.get(Integer.valueOf(format));
                        set.getClass();
                        channelMasks2 = f.getChannelMasks();
                        set.addAll(AbstractC1740d.d(channelMasks2));
                    } else {
                        Integer valueOf = Integer.valueOf(format);
                        channelMasks = f.getChannelMasks();
                        hashMap.put(valueOf, new HashSet(AbstractC1740d.d(channelMasks)));
                    }
                }
            }
        }
        A3.H o7 = A3.K.o();
        for (Map.Entry entry : hashMap.entrySet()) {
            o7.a(new C0267d(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new C0268e(o7.g());
    }

    public static C0273j b(AudioManager audioManager, C0126f c0126f) {
        List audioDevicesForAttributes;
        try {
            audioManager.getClass();
            audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes((AudioAttributes) c0126f.a().f4b);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new C0273j((AudioDeviceInfo) audioDevicesForAttributes.get(0));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
