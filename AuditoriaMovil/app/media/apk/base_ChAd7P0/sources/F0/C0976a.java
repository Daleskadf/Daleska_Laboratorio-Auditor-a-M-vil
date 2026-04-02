package f0;
/* renamed from: f0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0976a {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f10960e = new byte[1792];

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f10961a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10962b;

    /* renamed from: c  reason: collision with root package name */
    public int f10963c;

    /* renamed from: d  reason: collision with root package name */
    public char f10964d;

    static {
        for (int i7 = 0; i7 < 1792; i7++) {
            f10960e[i7] = Character.getDirectionality(i7);
        }
    }

    public C0976a(CharSequence charSequence) {
        this.f10961a = charSequence;
        this.f10962b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f10961a;
        char charAt = charSequence.charAt(this.f10963c - 1);
        this.f10964d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f10963c);
            this.f10963c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f10963c--;
        char c8 = this.f10964d;
        if (c8 < 1792) {
            return f10960e[c8];
        }
        return Character.getDirectionality(c8);
    }
}
