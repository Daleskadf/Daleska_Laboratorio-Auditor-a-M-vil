package Q0;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
public final class E {

    /* renamed from: a */
    public final AudioTrack f4155a;

    /* renamed from: b */
    public final C0272i f4156b;

    /* renamed from: c */
    public D f4157c = new AudioRouting.OnRoutingChangedListener() { // from class: Q0.D
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            E.a(E.this, audioRouting);
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [Q0.D] */
    public E(AudioTrack audioTrack, C0272i c0272i) {
        this.f4155a = audioTrack;
        this.f4156b = c0272i;
        audioTrack.addOnRoutingChangedListener(this.f4157c, new Handler(Looper.myLooper()));
    }

    public static /* synthetic */ void a(E e7, AudioRouting audioRouting) {
        e7.b(audioRouting);
    }

    public void b(AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        AudioDeviceInfo routedDevice2;
        if (this.f4157c != null) {
            routedDevice = audioRouting.getRoutedDevice();
            if (routedDevice != null) {
                C0272i c0272i = this.f4156b;
                routedDevice2 = audioRouting.getRoutedDevice();
                c0272i.b(routedDevice2);
            }
        }
    }

    public void c() {
        D d7 = this.f4157c;
        d7.getClass();
        this.f4155a.removeOnRoutingChangedListener(d7);
        this.f4157c = null;
    }
}
