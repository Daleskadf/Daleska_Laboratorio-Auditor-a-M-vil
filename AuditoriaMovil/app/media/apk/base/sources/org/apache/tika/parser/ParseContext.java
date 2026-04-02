package org.apache.tika.parser;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class ParseContext implements Serializable {
    private static final long serialVersionUID = -5921436862145826534L;
    private final Map<String, Object> context = new HashMap();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.context.equals(((ParseContext) obj).context);
        }
        return false;
    }

    public <T> T get(Class<T> cls) {
        return (T) this.context.get(cls.getName());
    }

    public int hashCode() {
        return this.context.hashCode();
    }

    public boolean isEmpty() {
        if (this.context.size() == 0) {
            return true;
        }
        return false;
    }

    public Set<String> keySet() {
        return DesugarCollections.unmodifiableSet(this.context.keySet());
    }

    public <T> void set(Class<T> cls, T t7) {
        if (t7 != null) {
            this.context.put(cls.getName(), t7);
        } else {
            this.context.remove(cls.getName());
        }
    }

    public <T> T get(Class<T> cls, T t7) {
        T t8 = (T) get(cls);
        return t8 != null ? t8 : t7;
    }
}
