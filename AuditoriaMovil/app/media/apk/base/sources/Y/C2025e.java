package y;

import android.hardware.camera2.params.InputConfiguration;
import j$.util.Objects;
/* renamed from: y.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2025e {

    /* renamed from: a  reason: collision with root package name */
    public final InputConfiguration f16576a;

    public C2025e(Object obj) {
        this.f16576a = (InputConfiguration) obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2025e)) {
            return false;
        }
        return Objects.equals(this.f16576a, ((C2025e) obj).f16576a);
    }

    public final int hashCode() {
        return this.f16576a.hashCode();
    }

    public final String toString() {
        return this.f16576a.toString();
    }
}
