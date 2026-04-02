package E2;

import D.AbstractC0059i;
import android.content.Context;
/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1060a;

    /* renamed from: b  reason: collision with root package name */
    public final L2.a f1061b;

    /* renamed from: c  reason: collision with root package name */
    public final L2.a f1062c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1063d;

    public b(Context context, L2.a aVar, L2.a aVar2, String str) {
        if (context != null) {
            this.f1060a = context;
            if (aVar != null) {
                this.f1061b = aVar;
                if (aVar2 != null) {
                    this.f1062c = aVar2;
                    if (str != null) {
                        this.f1063d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f1060a.equals(((b) dVar).f1060a)) {
            b bVar = (b) dVar;
            if (this.f1061b.equals(bVar.f1061b) && this.f1062c.equals(bVar.f1062c) && this.f1063d.equals(bVar.f1063d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f1060a.hashCode() ^ 1000003) * 1000003) ^ this.f1061b.hashCode()) * 1000003) ^ this.f1062c.hashCode()) * 1000003) ^ this.f1063d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f1060a);
        sb.append(", wallClock=");
        sb.append(this.f1061b);
        sb.append(", monotonicClock=");
        sb.append(this.f1062c);
        sb.append(", backendName=");
        return AbstractC0059i.D(sb, this.f1063d, "}");
    }
}
