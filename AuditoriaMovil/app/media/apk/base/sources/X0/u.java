package X0;
/* loaded from: classes.dex */
public final /* synthetic */ class u implements y {

    /* renamed from: b  reason: collision with root package name */
    public static final u f6364b = new u(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6365a;

    public /* synthetic */ u(int i7) {
        this.f6365a = i7;
    }

    @Override // X0.y
    public int a(Object obj) {
        m mVar = (m) obj;
        switch (this.f6365a) {
            case 1:
                String str = mVar.f6286a;
                if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
                    if (K0.x.f2529a < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        return -1;
                    }
                    return 0;
                }
                return 1;
            default:
                return mVar.f6286a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
