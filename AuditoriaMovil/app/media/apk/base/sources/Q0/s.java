package Q0;

import android.media.AudioTrack;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final r f4310a;

    /* renamed from: b  reason: collision with root package name */
    public int f4311b;

    /* renamed from: c  reason: collision with root package name */
    public long f4312c;

    /* renamed from: d  reason: collision with root package name */
    public long f4313d;

    /* renamed from: e  reason: collision with root package name */
    public long f4314e;
    public long f;

    public s(AudioTrack audioTrack) {
        this.f4310a = new r(audioTrack);
        a();
    }

    public final void a() {
        if (this.f4310a != null) {
            b(0);
        }
    }

    public final void b(int i7) {
        this.f4311b = i7;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2 && i7 != 3) {
                    if (i7 == 4) {
                        this.f4313d = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f4313d = 10000000L;
                return;
            }
            this.f4313d = 10000L;
            return;
        }
        this.f4314e = 0L;
        this.f = -1L;
        this.f4312c = System.nanoTime() / 1000;
        this.f4313d = 10000L;
    }
}
