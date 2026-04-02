package N0;
/* loaded from: classes.dex */
public final class h extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ W0.b f3353a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(W0.b bVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f3353a = bVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e7) {
                throw new IllegalStateException(e7);
            }
        } while (this.f3353a.h());
    }
}
