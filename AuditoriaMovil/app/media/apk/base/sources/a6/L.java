package a6;

import D.AbstractC0055e;
import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class L {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7087a = 0;

    /* renamed from: b  reason: collision with root package name */
    public List f7088b;

    /* renamed from: c  reason: collision with root package name */
    public C0473b f7089c;

    /* renamed from: d  reason: collision with root package name */
    public Object[][] f7090d;

    public /* synthetic */ L() {
    }

    public static L d() {
        L l8 = new L();
        l8.f7089c = C0473b.f7115b;
        l8.f7090d = (Object[][]) Array.newInstance(Object.class, 0, 2);
        return l8;
    }

    public void a(P p7) {
        C0483l c0483l = Q.f7100c;
        int i7 = 0;
        while (true) {
            Object[][] objArr = this.f7090d;
            if (i7 < objArr.length) {
                if (c0483l.equals(objArr[i7][0])) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 == -1) {
            Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, this.f7090d.length + 1, 2);
            Object[][] objArr3 = this.f7090d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f7090d = objArr2;
            i7 = objArr2.length - 1;
        }
        Object[][] objArr4 = this.f7090d;
        Object[] objArr5 = new Object[2];
        objArr5[0] = c0483l;
        objArr5[1] = p7;
        objArr4[i7] = objArr5;
    }

    public L b() {
        return new L(this.f7088b, this.f7089c, this.f7090d);
    }

    public Object c() {
        C0483l c0483l = Q.f7100c;
        int i7 = 0;
        while (true) {
            Object[][] objArr = this.f7090d;
            if (i7 < objArr.length) {
                if (c0483l.equals(objArr[i7][0])) {
                    return objArr[i7][1];
                }
                i7++;
            } else {
                return null;
            }
        }
    }

    public void e(List list) {
        G.i.f("addrs is empty", !list.isEmpty());
        this.f7088b = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    public String toString() {
        switch (this.f7087a) {
            case 1:
                K5.d C7 = AbstractC0055e.C(this);
                C7.a(this.f7088b, "addrs");
                C7.a(this.f7089c, "attrs");
                C7.a(Arrays.deepToString(this.f7090d), "customOptions");
                return C7.toString();
            default:
                return super.toString();
        }
    }

    public L(List list, C0473b c0473b, Object[][] objArr) {
        G.i.j(list, "addresses are not set");
        this.f7088b = list;
        G.i.j(c0473b, "attrs");
        this.f7089c = c0473b;
        G.i.j(objArr, "customOptions");
        this.f7090d = objArr;
    }
}
