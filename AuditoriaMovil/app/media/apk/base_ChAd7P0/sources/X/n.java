package x;
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16406a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f16407b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f16408c;

    public /* synthetic */ n(o oVar, String str, int i7) {
        this.f16406a = i7;
        this.f16407b = oVar;
        this.f16408c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16406a) {
            case 0:
                this.f16407b.f16410b.onCameraAvailable(this.f16408c);
                return;
            default:
                this.f16407b.f16410b.onCameraUnavailable(this.f16408c);
                return;
        }
    }
}
