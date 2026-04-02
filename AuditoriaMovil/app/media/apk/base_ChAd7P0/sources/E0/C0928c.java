package e0;

import j$.util.Objects;
import java.util.List;
/* renamed from: e0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0928c {

    /* renamed from: a  reason: collision with root package name */
    public String f10588a;

    /* renamed from: b  reason: collision with root package name */
    public String f10589b;

    /* renamed from: c  reason: collision with root package name */
    public List f10590c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0928c)) {
            return false;
        }
        C0928c c0928c = (C0928c) obj;
        if (Objects.equals(this.f10588a, c0928c.f10588a) && Objects.equals(this.f10589b, c0928c.f10589b) && Objects.equals(this.f10590c, c0928c.f10590c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10588a, this.f10589b, this.f10590c);
    }
}
