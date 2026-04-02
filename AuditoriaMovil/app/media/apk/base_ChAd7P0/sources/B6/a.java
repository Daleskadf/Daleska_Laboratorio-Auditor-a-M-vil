package B6;

import D.AbstractC0055e;
import java.util.Iterator;
import x6.InterfaceC2020a;
/* loaded from: classes.dex */
public abstract class a implements Iterable, InterfaceC2020a {

    /* renamed from: a  reason: collision with root package name */
    public final char f394a;

    /* renamed from: b  reason: collision with root package name */
    public final char f395b;

    /* renamed from: c  reason: collision with root package name */
    public final int f396c = 1;

    public a(char c8, char c9) {
        this.f394a = c8;
        this.f395b = (char) AbstractC0055e.k(c8, c9, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f394a, this.f395b, this.f396c);
    }
}
