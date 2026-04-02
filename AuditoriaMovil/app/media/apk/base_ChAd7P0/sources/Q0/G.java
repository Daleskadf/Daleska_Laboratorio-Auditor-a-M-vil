package Q0;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
/* loaded from: classes.dex */
public final class G extends AudioTrack$StreamEventCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ H f4160a;

    public G(H h8) {
        this.f4160a = h8;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i7) {
        I i8;
        A.m mVar;
        O0.I i9;
        if (audioTrack.equals(this.f4160a.f4163c.f4224w) && (mVar = (i8 = this.f4160a.f4163c).f4220s) != null && i8.f4191Y && (i9 = ((L) mVar.f28b).f6304A0) != null) {
            i9.a();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (!audioTrack.equals(this.f4160a.f4163c.f4224w)) {
            return;
        }
        this.f4160a.f4163c.f4190X = true;
    }

    public final void onTearDown(AudioTrack audioTrack) {
        I i7;
        A.m mVar;
        O0.I i8;
        if (audioTrack.equals(this.f4160a.f4163c.f4224w) && (mVar = (i7 = this.f4160a.f4163c).f4220s) != null && i7.f4191Y && (i8 = ((L) mVar.f28b).f6304A0) != null) {
            i8.a();
        }
    }
}
