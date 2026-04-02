package K6;

import j$.util.Objects;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2806a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2807b;

    public w(String str, int i7) {
        this.f2806a = i7;
        switch (i7) {
            case 1:
                str.getClass();
                this.f2807b = str;
                return;
            default:
                this.f2807b = str;
                return;
        }
    }

    public void a(StringBuilder sb, Iterator it) {
        CharSequence obj;
        CharSequence obj2;
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    obj = (CharSequence) next;
                } else {
                    obj = next.toString();
                }
                sb.append(obj);
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f2807b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        obj2 = (CharSequence) next2;
                    } else {
                        obj2 = next2.toString();
                    }
                    sb.append(obj2);
                }
            }
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    public String b(Collection collection) {
        Iterator it = collection.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }

    public String toString() {
        switch (this.f2806a) {
            case 0:
                return "<" + this.f2807b + '>';
            default:
                return super.toString();
        }
    }
}
