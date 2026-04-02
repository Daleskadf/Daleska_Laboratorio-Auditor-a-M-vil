package t9;
/* loaded from: classes3.dex */
public abstract class s extends c implements z9.g {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s(java.lang.Object r8, java.lang.Class r9, java.lang.String r10, java.lang.String r11, int r12) {
        /*
            r7 = this;
            r0 = 1
            r12 = r12 & r0
            if (r12 != r0) goto L6
            r6 = 1
            goto L8
        L6:
            r0 = 0
            r6 = 0
        L8:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.s.<init>(java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (e().equals(sVar.e()) && getName().equals(sVar.getName()) && g().equals(sVar.g()) && i.b(d(), sVar.d())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof z9.g)) {
            return false;
        } else {
            return obj.equals(b());
        }
    }

    public z9.g h() {
        return (z9.g) super.f();
    }

    public int hashCode() {
        return (((e().hashCode() * 31) + getName().hashCode()) * 31) + g().hashCode();
    }

    public String toString() {
        z9.a b10 = b();
        if (b10 != this) {
            return b10.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
