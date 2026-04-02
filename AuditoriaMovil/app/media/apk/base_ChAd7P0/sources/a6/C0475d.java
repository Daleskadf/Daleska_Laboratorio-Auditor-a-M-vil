package a6;
/* renamed from: a6.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0475d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7129a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7130b;

    public /* synthetic */ C0475d(String str, int i7) {
        this.f7129a = i7;
        this.f7130b = str;
    }

    public static C0475d a(K0.q qVar) {
        String str;
        qVar.H(2);
        int u7 = qVar.u();
        int i7 = u7 >> 1;
        int u8 = ((qVar.u() >> 3) & 31) | ((u7 & 1) << 5);
        if (i7 != 4 && i7 != 5 && i7 != 7) {
            if (i7 == 8) {
                str = "hev1";
            } else if (i7 == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(".0");
        sb.append(i7);
        if (u8 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(u8);
        return new C0475d(sb.toString(), 2);
    }

    public String toString() {
        switch (this.f7129a) {
            case 0:
                return this.f7130b;
            default:
                return super.toString();
        }
    }
}
