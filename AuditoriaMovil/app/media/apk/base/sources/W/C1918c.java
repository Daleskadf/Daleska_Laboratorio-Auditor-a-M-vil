package w;

import android.util.Size;
import androidx.camera.core.impl.C0505g;
import androidx.camera.core.impl.o0;
import androidx.camera.core.impl.y0;
import java.util.ArrayList;
/* renamed from: w.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1918c {

    /* renamed from: a  reason: collision with root package name */
    public final String f16178a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f16179b;

    /* renamed from: c  reason: collision with root package name */
    public final o0 f16180c;

    /* renamed from: d  reason: collision with root package name */
    public final y0 f16181d;

    /* renamed from: e  reason: collision with root package name */
    public final Size f16182e;
    public final C0505g f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f16183g;

    public C1918c(String str, Class cls, o0 o0Var, y0 y0Var, Size size, C0505g c0505g, ArrayList arrayList) {
        if (str != null) {
            this.f16178a = str;
            this.f16179b = cls;
            if (o0Var != null) {
                this.f16180c = o0Var;
                if (y0Var != null) {
                    this.f16181d = y0Var;
                    this.f16182e = size;
                    this.f = c0505g;
                    this.f16183g = arrayList;
                    return;
                }
                throw new NullPointerException("Null useCaseConfig");
            }
            throw new NullPointerException("Null sessionConfig");
        }
        throw new NullPointerException("Null useCaseId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1918c)) {
            return false;
        }
        C1918c c1918c = (C1918c) obj;
        if (this.f16178a.equals(c1918c.f16178a) && this.f16179b.equals(c1918c.f16179b) && this.f16180c.equals(c1918c.f16180c) && this.f16181d.equals(c1918c.f16181d)) {
            Size size = c1918c.f16182e;
            Size size2 = this.f16182e;
            if (size2 != null ? size2.equals(size) : size == null) {
                C0505g c0505g = c1918c.f;
                C0505g c0505g2 = this.f;
                if (c0505g2 != null ? c0505g2.equals(c0505g) : c0505g == null) {
                    ArrayList arrayList = c1918c.f16183g;
                    ArrayList arrayList2 = this.f16183g;
                    if (arrayList2 == null) {
                        if (arrayList == null) {
                            return true;
                        }
                    } else if (arrayList2.equals(arrayList)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (((((((this.f16178a.hashCode() ^ 1000003) * 1000003) ^ this.f16179b.hashCode()) * 1000003) ^ this.f16180c.hashCode()) * 1000003) ^ this.f16181d.hashCode()) * 1000003;
        int i7 = 0;
        Size size = this.f16182e;
        if (size == null) {
            hashCode = 0;
        } else {
            hashCode = size.hashCode();
        }
        int i8 = (hashCode3 ^ hashCode) * 1000003;
        C0505g c0505g = this.f;
        if (c0505g == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c0505g.hashCode();
        }
        int i9 = (i8 ^ hashCode2) * 1000003;
        ArrayList arrayList = this.f16183g;
        if (arrayList != null) {
            i7 = arrayList.hashCode();
        }
        return i9 ^ i7;
    }

    public final String toString() {
        return "UseCaseInfo{useCaseId=" + this.f16178a + ", useCaseType=" + this.f16179b + ", sessionConfig=" + this.f16180c + ", useCaseConfig=" + this.f16181d + ", surfaceResolution=" + this.f16182e + ", streamSpec=" + this.f + ", captureTypes=" + this.f16183g + "}";
    }
}
