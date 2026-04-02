package t4;

import com.google.protobuf.AbstractC0852m;
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0852m f15849a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15850b;

    /* renamed from: c  reason: collision with root package name */
    public final e4.e f15851c;

    /* renamed from: d  reason: collision with root package name */
    public final e4.e f15852d;

    /* renamed from: e  reason: collision with root package name */
    public final e4.e f15853e;

    public w(AbstractC0852m abstractC0852m, boolean z7, e4.e eVar, e4.e eVar2, e4.e eVar3) {
        this.f15849a = abstractC0852m;
        this.f15850b = z7;
        this.f15851c = eVar;
        this.f15852d = eVar2;
        this.f15853e = eVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f15850b != wVar.f15850b || !this.f15849a.equals(wVar.f15849a) || !this.f15851c.equals(wVar.f15851c) || !this.f15852d.equals(wVar.f15852d)) {
            return false;
        }
        return this.f15853e.equals(wVar.f15853e);
    }

    public final int hashCode() {
        int hashCode = this.f15851c.f10876a.hashCode();
        int hashCode2 = this.f15852d.f10876a.hashCode();
        return this.f15853e.f10876a.hashCode() + ((hashCode2 + ((hashCode + (((this.f15849a.hashCode() * 31) + (this.f15850b ? 1 : 0)) * 31)) * 31)) * 31);
    }
}
