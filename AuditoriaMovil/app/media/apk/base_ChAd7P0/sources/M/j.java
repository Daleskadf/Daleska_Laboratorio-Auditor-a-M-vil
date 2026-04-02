package M;
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f3091a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3092b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3093c;

    public /* synthetic */ j(m mVar, int i7, int i8) {
        this.f3091a = mVar;
        this.f3092b = i7;
        this.f3093c = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        m mVar = this.f3091a;
        int i7 = mVar.f3110i;
        int i8 = this.f3092b;
        boolean z8 = true;
        if (i7 != i8) {
            mVar.f3110i = i8;
            z7 = true;
        } else {
            z7 = false;
        }
        int i9 = mVar.f3109h;
        int i10 = this.f3093c;
        if (i9 != i10) {
            mVar.f3109h = i10;
        } else {
            z8 = z7;
        }
        if (z8) {
            mVar.e();
        }
    }
}
