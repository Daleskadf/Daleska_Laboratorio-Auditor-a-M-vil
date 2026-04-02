package R1;
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final int f4665a;

    /* renamed from: b  reason: collision with root package name */
    public final b f4666b;

    public f(int i7, b bVar) {
        this.f4665a = i7;
        this.f4666b = bVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f4665a, ((f) obj).f4665a);
    }
}
