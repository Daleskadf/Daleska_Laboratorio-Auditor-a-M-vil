package A3;
/* loaded from: classes.dex */
public final class M {

    /* renamed from: a  reason: collision with root package name */
    public final Object f100a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f101b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f102c;

    public M(Object obj, Object obj2, Object obj3) {
        this.f100a = obj;
        this.f101b = obj2;
        this.f102c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f100a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f101b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f102c);
        return new IllegalArgumentException(sb.toString());
    }
}
