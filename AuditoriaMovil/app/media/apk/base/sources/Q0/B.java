package Q0;

import H0.C0126f;
import android.media.AudioAttributes;
import android.media.AudioTrack;
/* loaded from: classes.dex */
public final class B {

    /* renamed from: a  reason: collision with root package name */
    public final H0.r f4141a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4142b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4143c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4144d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4145e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4146g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4147h;

    /* renamed from: i  reason: collision with root package name */
    public final I0.a f4148i;
    public final boolean j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f4149k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f4150l;

    public B(H0.r rVar, int i7, int i8, int i9, int i10, int i11, int i12, int i13, I0.a aVar, boolean z7, boolean z8, boolean z9) {
        this.f4141a = rVar;
        this.f4142b = i7;
        this.f4143c = i8;
        this.f4144d = i9;
        this.f4145e = i10;
        this.f = i11;
        this.f4146g = i12;
        this.f4147h = i13;
        this.f4148i = aVar;
        this.j = z7;
        this.f4149k = z8;
        this.f4150l = z9;
    }

    public static AudioAttributes c(C0126f c0126f, boolean z7) {
        if (z7) {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        return (AudioAttributes) c0126f.a().f4b;
    }

    public final AudioTrack a(C0126f c0126f, int i7) {
        boolean z7;
        boolean z8;
        int i8 = this.f4143c;
        try {
            AudioTrack b5 = b(c0126f, i7);
            int state = b5.getState();
            if (state == 1) {
                return b5;
            }
            try {
                b5.release();
            } catch (Exception unused) {
            }
            if (i8 == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            throw new C0278o(state, this.f4145e, this.f, this.f4147h, this.f4141a, z8, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e7) {
            if (i8 == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            throw new C0278o(0, this.f4145e, this.f, this.f4147h, this.f4141a, z7, e7);
        }
    }

    public final AudioTrack b(C0126f c0126f, int i7) {
        AudioTrack.Builder offloadedPlayback;
        int i8 = K0.x.f2529a;
        boolean z7 = this.f4150l;
        int i9 = this.f4145e;
        int i10 = this.f4146g;
        int i11 = this.f;
        if (i8 >= 29) {
            AudioTrack.Builder audioFormat = new AudioTrack.Builder().setAudioAttributes(c(c0126f, z7)).setAudioFormat(K0.x.r(i9, i11, i10));
            boolean z8 = true;
            AudioTrack.Builder sessionId = audioFormat.setTransferMode(1).setBufferSizeInBytes(this.f4147h).setSessionId(i7);
            if (this.f4143c != 1) {
                z8 = false;
            }
            offloadedPlayback = sessionId.setOffloadedPlayback(z8);
            return offloadedPlayback.build();
        } else if (i8 >= 21) {
            return new AudioTrack(c(c0126f, z7), K0.x.r(i9, i11, i10), this.f4147h, 1, i7);
        } else {
            c0126f.getClass();
            if (i7 == 0) {
                return new AudioTrack(3, this.f4145e, this.f, this.f4146g, this.f4147h, 1);
            }
            return new AudioTrack(3, this.f4145e, this.f, this.f4146g, this.f4147h, 1, i7);
        }
    }
}
