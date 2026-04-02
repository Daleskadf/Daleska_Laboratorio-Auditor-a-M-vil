package j3;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public int f14660a;

    public i(int i10) {
        this.f14660a = i10;
    }

    public static i a(h[] hVarArr) {
        if (hVarArr.length <= 31) {
            int i10 = 0;
            for (h hVar : hVarArr) {
                if (hVar.a()) {
                    i10 |= hVar.b();
                }
            }
            return new i(i10);
        }
        throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", hVarArr[0].getClass().getName(), Integer.valueOf(hVarArr.length)));
    }

    public boolean b(h hVar) {
        if ((hVar.b() & this.f14660a) != 0) {
            return true;
        }
        return false;
    }

    public i c(h hVar) {
        int b10 = hVar.b() | this.f14660a;
        if (b10 == this.f14660a) {
            return this;
        }
        return new i(b10);
    }
}
