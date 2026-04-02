package F6;
/* loaded from: classes.dex */
public final class U implements InterfaceC0085e0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1241a;

    public U(boolean z7) {
        this.f1241a = z7;
    }

    @Override // F6.InterfaceC0085e0
    public final y0 c() {
        return null;
    }

    @Override // F6.InterfaceC0085e0
    public final boolean isActive() {
        return this.f1241a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.f1241a) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
