package j$.util;

import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class Optional<T> {

    /* renamed from: b  reason: collision with root package name */
    private static final Optional f12852b = new Optional();

    /* renamed from: a  reason: collision with root package name */
    private final Object f12853a;

    private Optional() {
        this.f12853a = null;
    }

    public static Optional a() {
        return f12852b;
    }

    private Optional(Object obj) {
        this.f12853a = Objects.requireNonNull(obj);
    }

    public static Optional b(Object obj) {
        return new Optional(obj);
    }

    public static <T> Optional<T> ofNullable(T t7) {
        if (t7 != null) {
            return new Optional<>(t7);
        }
        return f12852b;
    }

    public T get() {
        T t7 = (T) this.f12853a;
        if (t7 != null) {
            return t7;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean isPresent() {
        return this.f12853a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.f12853a, ((Optional) obj).f12853a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f12853a);
    }

    public final String toString() {
        Object obj = this.f12853a;
        if (obj != null) {
            return String.format("Optional[%s]", obj);
        }
        return "Optional.empty";
    }
}
