package l7;

import android.media.MediaPlayer;
import k7.l;
import kotlin.jvm.internal.j;
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f13879a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13880b;

    public d(String str, boolean z7) {
        this.f13879a = str;
        this.f13880b = z7;
    }

    @Override // l7.c
    public final void a(l soundPoolPlayer) {
        j.e(soundPoolPlayer, "soundPoolPlayer");
        soundPoolPlayer.release();
        soundPoolPlayer.m(this);
    }

    @Override // l7.c
    public final void b(MediaPlayer mediaPlayer) {
        j.e(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f13879a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (j.a(this.f13879a, dVar.f13879a) && this.f13880b == dVar.f13880b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f13879a.hashCode() * 31;
        boolean z7 = this.f13880b;
        int i7 = z7;
        if (z7 != 0) {
            i7 = 1;
        }
        return hashCode + i7;
    }

    public final String toString() {
        return "UrlSource(url=" + this.f13879a + ", isLocal=" + this.f13880b + ')';
    }
}
