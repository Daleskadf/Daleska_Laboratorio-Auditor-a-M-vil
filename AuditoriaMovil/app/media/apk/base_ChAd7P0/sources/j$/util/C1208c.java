package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
/* renamed from: j$.util.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1208c implements Comparator, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12871a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Comparator f12872b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f12873c;

    public /* synthetic */ C1208c(Comparator comparator, Object obj, int i7) {
        this.f12871a = i7;
        this.f12872b = comparator;
        this.f12873c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f12871a) {
            case 0:
                int compare = this.f12872b.compare(obj, obj2);
                return compare != 0 ? compare : ((Comparator) this.f12873c).compare(obj, obj2);
            default:
                Function function = (Function) this.f12873c;
                return this.f12872b.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
