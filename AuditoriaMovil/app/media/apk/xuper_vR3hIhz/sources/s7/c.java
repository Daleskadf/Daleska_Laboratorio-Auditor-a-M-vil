package s7;

import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class c extends LinkedHashMap {

    /* renamed from: a  reason: collision with root package name */
    public int f18779a;

    public c() {
        this(256);
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry entry) {
        if (size() > this.f18779a) {
            return true;
        }
        return false;
    }

    public c(int i10) {
        super(i10, 1.0f, true);
        this.f18779a = i10;
    }
}
