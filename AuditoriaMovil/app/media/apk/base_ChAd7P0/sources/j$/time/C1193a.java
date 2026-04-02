package j$.time;

import java.io.ObjectInputStream;
import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1193a extends b implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    static final C1193a f12593b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* renamed from: a  reason: collision with root package name */
    private final ZoneId f12594a;

    static {
        System.currentTimeMillis();
        f12593b = new C1193a(ZoneOffset.UTC);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1193a(ZoneId zoneId) {
        this.f12594a = zoneId;
    }

    @Override // j$.time.b
    public final ZoneId a() {
        return this.f12594a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1193a) {
            return this.f12594a.equals(((C1193a) obj).f12594a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12594a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f12594a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }
}
