package B5;

import android.view.textservice.SpellCheckerInfo;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
/* renamed from: B5.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0049w implements Predicate {
    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return ((SpellCheckerInfo) obj).getPackageName().equals("com.google.android.inputmethod.latin");
    }
}
