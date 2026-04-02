package j$.time.format;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final char f12670a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(char c8) {
        this.f12670a = c8;
    }

    @Override // j$.time.format.f
    public final boolean o(t tVar, StringBuilder sb) {
        sb.append(this.f12670a);
        return true;
    }

    @Override // j$.time.format.f
    public final int q(q qVar, CharSequence charSequence, int i7) {
        if (i7 == charSequence.length()) {
            return ~i7;
        }
        char charAt = charSequence.charAt(i7);
        char c8 = this.f12670a;
        return (charAt == c8 || (!qVar.j() && (Character.toUpperCase(charAt) == Character.toUpperCase(c8) || Character.toLowerCase(charAt) == Character.toLowerCase(c8)))) ? i7 + 1 : ~i7;
    }

    public final String toString() {
        char c8 = this.f12670a;
        if (c8 == '\'') {
            return "''";
        }
        return "'" + c8 + "'";
    }
}
