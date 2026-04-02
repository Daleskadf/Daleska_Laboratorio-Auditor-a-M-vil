package z3;
/* loaded from: classes.dex */
public final class g extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final int f16882b = Integer.numberOfLeadingZeros(31);

    /* renamed from: c  reason: collision with root package name */
    public static final g f16883c = new e("CharMatcher.whitespace()");

    @Override // z3.c
    public final boolean a(char c8) {
        if ("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c8) >>> f16882b) == c8) {
            return true;
        }
        return false;
    }
}
