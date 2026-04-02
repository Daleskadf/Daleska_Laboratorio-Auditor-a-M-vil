package j$.util.concurrent;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1209a extends p {

    /* renamed from: i  reason: collision with root package name */
    final ConcurrentHashMap f12898i;
    l j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1209a(l[] lVarArr, int i7, int i8, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i7, 0, i8);
        this.f12898i = concurrentHashMap;
        a();
    }

    public final boolean hasNext() {
        return this.f12924b != null;
    }

    public final boolean hasMoreElements() {
        return this.f12924b != null;
    }

    public final void remove() {
        l lVar = this.j;
        if (lVar == null) {
            throw new IllegalStateException();
        }
        this.j = null;
        this.f12898i.g(lVar.f12916b, null, null);
    }
}
