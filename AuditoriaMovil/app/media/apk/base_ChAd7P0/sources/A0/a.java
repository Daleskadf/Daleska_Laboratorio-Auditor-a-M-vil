package A0;

import kotlin.jvm.internal.j;
import z0.AbstractComponentCallbacksC2061v;
/* loaded from: classes.dex */
public final class a extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractComponentCallbacksC2061v f33a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AbstractComponentCallbacksC2061v fragment, String str) {
        super(str);
        j.e(fragment, "fragment");
        this.f33a = fragment;
    }
}
