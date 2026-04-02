package z3;
/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: a  reason: collision with root package name */
    public final char f16879a;

    public d(char c8) {
        this.f16879a = c8;
    }

    @Override // z3.c
    public final boolean a(char c8) {
        if (c8 == this.f16879a) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c8 = this.f16879a;
        for (int i7 = 0; i7 < 4; i7++) {
            cArr[5 - i7] = "0123456789ABCDEF".charAt(c8 & 15);
            c8 = (char) (c8 >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
