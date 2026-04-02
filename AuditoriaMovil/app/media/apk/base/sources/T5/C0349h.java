package T5;
/* renamed from: T5.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0349h {

    /* renamed from: a  reason: collision with root package name */
    public final String f5436a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5437b;

    public C0349h(String str, boolean z7) {
        this.f5436a = str;
        this.f5437b = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0349h)) {
            return false;
        }
        C0349h c0349h = (C0349h) obj;
        if (kotlin.jvm.internal.j.a(this.f5436a, c0349h.f5436a) && this.f5437b == c0349h.f5437b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        String str = this.f5436a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i7 = hashCode * 31;
        boolean z7 = this.f5437b;
        int i8 = z7;
        if (z7 != 0) {
            i8 = 1;
        }
        return i7 + i8;
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f5436a + ", useDataStore=" + this.f5437b + ")";
    }
}
