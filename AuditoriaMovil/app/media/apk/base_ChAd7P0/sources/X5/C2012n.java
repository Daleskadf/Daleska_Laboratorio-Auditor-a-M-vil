package x5;

import java.util.ArrayList;
/* renamed from: x5.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2012n extends kotlin.jvm.internal.k implements l6.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C2014p f16552a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2012n(C2014p c2014p) {
        super(4);
        this.f16552a = c2014p;
    }

    public final void a(ArrayList arrayList, Object obj, Integer num, Integer num2) {
        this.f16552a.f16559b.c(m6.s.Q(new l6.d("name", "barcode"), new l6.d("data", arrayList), new l6.d("image", m6.s.Q(new l6.d("bytes", (byte[]) obj), new l6.d("width", Double.valueOf(num.intValue())), new l6.d("height", Double.valueOf(num2.intValue()))))));
    }
}
