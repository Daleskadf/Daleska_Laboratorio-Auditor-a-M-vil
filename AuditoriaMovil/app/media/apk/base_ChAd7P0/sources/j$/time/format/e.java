package j$.time.format;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    private final f[] f12671a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12672b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(ArrayList arrayList, boolean z7) {
        this((f[]) arrayList.toArray(new f[arrayList.size()]), z7);
    }

    e(f[] fVarArr, boolean z7) {
        this.f12671a = fVarArr;
        this.f12672b = z7;
    }

    public final e a() {
        return !this.f12672b ? this : new e(this.f12671a, false);
    }

    @Override // j$.time.format.f
    public final boolean o(t tVar, StringBuilder sb) {
        int length = sb.length();
        boolean z7 = this.f12672b;
        if (z7) {
            tVar.g();
        }
        try {
            for (f fVar : this.f12671a) {
                if (!fVar.o(tVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            if (z7) {
                tVar.a();
            }
            return true;
        } finally {
            if (z7) {
                tVar.a();
            }
        }
    }

    @Override // j$.time.format.f
    public final int q(q qVar, CharSequence charSequence, int i7) {
        boolean z7 = this.f12672b;
        f[] fVarArr = this.f12671a;
        if (z7) {
            qVar.q();
            int i8 = i7;
            for (f fVar : fVarArr) {
                i8 = fVar.q(qVar, charSequence, i8);
                if (i8 < 0) {
                    qVar.e(false);
                    return i7;
                }
            }
            qVar.e(true);
            return i8;
        }
        for (f fVar2 : fVarArr) {
            i7 = fVar2.q(qVar, charSequence, i7);
            if (i7 < 0) {
                break;
            }
        }
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        f[] fVarArr = this.f12671a;
        if (fVarArr != null) {
            boolean z7 = this.f12672b;
            sb.append(z7 ? "[" : "(");
            for (f fVar : fVarArr) {
                sb.append(fVar);
            }
            sb.append(z7 ? "]" : ")");
        }
        return sb.toString();
    }
}
