package z3;
/* loaded from: classes.dex */
public abstract class c implements k {
    public abstract boolean a(char c8);

    @Override // z3.k
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
