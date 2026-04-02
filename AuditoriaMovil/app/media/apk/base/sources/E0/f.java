package e0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10598a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10599b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f10600c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f10601d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f10602e;

    public /* synthetic */ f(String str, Context context, Object obj, int i7, int i8) {
        this.f10598a = i8;
        this.f10599b = str;
        this.f10600c = context;
        this.f10602e = obj;
        this.f10601d = i7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i7 = this.f10601d;
        Object obj = this.f10602e;
        Context context = this.f10600c;
        String str = this.f10599b;
        switch (this.f10598a) {
            case 0:
                Object[] objArr = {(C0930e) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return h.b(str, context, DesugarCollections.unmodifiableList(arrayList), i7);
            default:
                try {
                    return h.b(str, context, (List) obj, i7);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
