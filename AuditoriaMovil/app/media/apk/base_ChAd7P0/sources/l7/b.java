package l7;

import android.media.MediaPlayer;
import k7.l;
import kotlin.jvm.internal.j;
/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final a f13878a;

    public b(byte[] bArr) {
        this.f13878a = new a(bArr);
    }

    @Override // l7.c
    public final void a(l soundPoolPlayer) {
        j.e(soundPoolPlayer, "soundPoolPlayer");
        throw new IllegalStateException("Bytes sources are not supported on LOW_LATENCY mode yet.");
    }

    @Override // l7.c
    public final void b(MediaPlayer mediaPlayer) {
        j.e(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f13878a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && j.a(this.f13878a, ((b) obj).f13878a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13878a.hashCode();
    }

    public final String toString() {
        return "BytesSource(dataSource=" + this.f13878a + ')';
    }
}
