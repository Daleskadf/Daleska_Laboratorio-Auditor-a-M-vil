package X0;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6242a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k1.j f6243b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f6244c;

    public /* synthetic */ a(j jVar, k1.j jVar2, int i7) {
        this.f6242a = i7;
        this.f6244c = jVar;
        this.f6243b = jVar2;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j8) {
        switch (this.f6242a) {
            case 0:
                ((c) this.f6244c).getClass();
                k1.j jVar = this.f6243b;
                jVar.getClass();
                if (K0.x.f2529a < 30) {
                    Handler handler = jVar.f13604a;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    return;
                }
                jVar.a(j);
                return;
            default:
                ((R1.j) this.f6244c).getClass();
                k1.j jVar2 = this.f6243b;
                jVar2.getClass();
                if (K0.x.f2529a < 30) {
                    Handler handler2 = jVar2.f13604a;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    return;
                }
                jVar2.a(j);
                return;
        }
    }
}
