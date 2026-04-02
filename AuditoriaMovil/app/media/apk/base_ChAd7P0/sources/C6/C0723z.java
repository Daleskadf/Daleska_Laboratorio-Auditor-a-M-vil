package c6;

import a6.C0473b;
import java.util.Arrays;
/* renamed from: c6.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0723z {

    /* renamed from: a  reason: collision with root package name */
    public String f9058a;

    /* renamed from: b  reason: collision with root package name */
    public C0473b f9059b;

    /* renamed from: c  reason: collision with root package name */
    public a6.B f9060c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0723z)) {
            return false;
        }
        C0723z c0723z = (C0723z) obj;
        if (!this.f9058a.equals(c0723z.f9058a) || !this.f9059b.equals(c0723z.f9059b) || !F.f.l(null, null) || !F.f.l(this.f9060c, c0723z.f9060c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9058a, this.f9059b, null, this.f9060c});
    }
}
