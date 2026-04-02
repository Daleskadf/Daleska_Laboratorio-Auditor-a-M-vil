package d0;

import B5.AbstractC0046t;
import android.os.LocaleList;
import java.util.Locale;
/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public final LocaleList f10169a;

    public h(Object obj) {
        this.f10169a = AbstractC0046t.i(obj);
    }

    @Override // d0.g
    public final Object a() {
        return this.f10169a;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        equals = this.f10169a.equals(((g) obj).a());
        return equals;
    }

    @Override // d0.g
    public final Locale get(int i7) {
        Locale locale;
        locale = this.f10169a.get(i7);
        return locale;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f10169a.hashCode();
        return hashCode;
    }

    @Override // d0.g
    public final boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.f10169a.isEmpty();
        return isEmpty;
    }

    @Override // d0.g
    public final int size() {
        int size;
        size = this.f10169a.size();
        return size;
    }

    public final String toString() {
        String localeList;
        localeList = this.f10169a.toString();
        return localeList;
    }
}
