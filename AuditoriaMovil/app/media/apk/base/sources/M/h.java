package M;
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3087a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f3088b;

    public /* synthetic */ h(m mVar, int i7) {
        this.f3087a = i7;
        this.f3088b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3087a) {
            case 0:
                m mVar = this.f3088b;
                mVar.getClass();
                j3.f.C().execute(new h(mVar, 1));
                return;
            default:
                m mVar2 = this.f3088b;
                if (!mVar2.f3114n) {
                    mVar2.d();
                    return;
                }
                return;
        }
    }
}
