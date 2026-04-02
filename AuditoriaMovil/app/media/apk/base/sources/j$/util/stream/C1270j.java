package j$.util.stream;

import java.util.stream.Collector;
/* renamed from: j$.util.stream.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1270j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Collector f13286a;

    private /* synthetic */ C1270j(Collector collector) {
        this.f13286a = collector;
    }

    public static /* synthetic */ C1270j a(Collector collector) {
        if (collector == null) {
            return null;
        }
        return new C1270j(collector);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.f13286a;
        if (obj instanceof C1270j) {
            obj = ((C1270j) obj).f13286a;
        }
        return collector.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f13286a.hashCode();
    }
}
