package A3;

import java.util.Map;
/* renamed from: A3.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0017o implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!F.f.l(getKey(), entry.getKey()) || !F.f.l(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Object key = getKey();
        Object value = getValue();
        int i7 = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            i7 = value.hashCode();
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
