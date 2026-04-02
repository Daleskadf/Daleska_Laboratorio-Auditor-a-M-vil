package P6;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4071a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f4072b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f4073c;

    public /* synthetic */ d(f fVar, String str, int i7) {
        this.f4071a = i7;
        this.f4072b = fVar;
        this.f4073c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4071a) {
            case 0:
                f fVar = this.f4072b;
                fVar.f4080b.H(fVar, this.f4073c);
                return;
            default:
                f fVar2 = this.f4072b;
                fVar2.f4080b.H(fVar2, this.f4073c);
                return;
        }
    }
}
