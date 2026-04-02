package Q0;

import A3.AbstractC0021t;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
/* renamed from: Q0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0264a {
    /* JADX WARN: Type inference failed for: r3v0, types: [A3.E, A3.O] */
    private static A3.P a() {
        ?? e7 = new A3.E(4);
        Integer[] numArr = {8, 7};
        AbstractC0021t.c(2, numArr);
        e7.f(e7.f87b + 2);
        System.arraycopy(numArr, 0, e7.f86a, e7.f87b, 2);
        e7.f87b += 2;
        int i7 = K0.x.f2529a;
        if (i7 >= 31) {
            Integer[] numArr2 = {26, 27};
            AbstractC0021t.c(2, numArr2);
            e7.f(e7.f87b + 2);
            System.arraycopy(numArr2, 0, e7.f86a, e7.f87b, 2);
            e7.f87b += 2;
        }
        if (i7 >= 33) {
            e7.a(30);
        }
        return e7.g();
    }

    public static boolean b(AudioManager audioManager, C0273j c0273j) {
        AudioDeviceInfo[] audioDeviceInfoArr;
        if (c0273j == null) {
            audioManager.getClass();
            audioDeviceInfoArr = audioManager.getDevices(2);
        } else {
            audioDeviceInfoArr = new AudioDeviceInfo[]{c0273j.f4288a};
        }
        A3.P a7 = a();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (a7.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
