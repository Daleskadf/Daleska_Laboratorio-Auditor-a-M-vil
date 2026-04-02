package Q0;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
/* renamed from: Q0.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270g extends AudioDeviceCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0272i f4276a;

    public C0270g(C0272i c0272i) {
        this.f4276a = c0272i;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C0272i c0272i = this.f4276a;
        c0272i.a(C0268e.b(c0272i.f4280a, c0272i.f4287i, c0272i.f4286h));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C0272i c0272i = this.f4276a;
        if (K0.x.l(audioDeviceInfoArr, c0272i.f4286h)) {
            c0272i.f4286h = null;
        }
        c0272i.a(C0268e.b(c0272i.f4280a, c0272i.f4287i, c0272i.f4286h));
    }
}
