package q6;

import D.AbstractC0059i;
import java.io.Serializable;
import kotlin.jvm.internal.j;
import m6.AbstractC1443d;
/* renamed from: q6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1715b extends AbstractC1443d implements InterfaceC1714a, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Enum[] f15394a;

    public C1715b(Enum[] entries) {
        j.e(entries, "entries");
        this.f15394a = entries;
    }

    @Override // m6.AbstractC1443d, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        Enum r02;
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        j.e(element, "element");
        int ordinal = element.ordinal();
        Enum[] enumArr = this.f15394a;
        j.e(enumArr, "<this>");
        if (ordinal >= 0 && ordinal <= enumArr.length - 1) {
            r02 = enumArr[ordinal];
        } else {
            r02 = null;
        }
        if (r02 != element) {
            return false;
        }
        return true;
    }

    @Override // m6.AbstractC1443d
    public final int e() {
        return this.f15394a.length;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Enum[] enumArr = this.f15394a;
        int length = enumArr.length;
        if (i7 >= 0 && i7 < length) {
            return enumArr[i7];
        }
        throw new IndexOutOfBoundsException(AbstractC0059i.x("index: ", i7, length, ", size: "));
    }

    @Override // m6.AbstractC1443d, java.util.List
    public final int indexOf(Object obj) {
        Enum r22;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        j.e(element, "element");
        int ordinal = element.ordinal();
        Enum[] enumArr = this.f15394a;
        j.e(enumArr, "<this>");
        if (ordinal >= 0 && ordinal <= enumArr.length - 1) {
            r22 = enumArr[ordinal];
        } else {
            r22 = null;
        }
        if (r22 != element) {
            return -1;
        }
        return ordinal;
    }

    @Override // m6.AbstractC1443d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        j.e(element, "element");
        return indexOf(element);
    }
}
