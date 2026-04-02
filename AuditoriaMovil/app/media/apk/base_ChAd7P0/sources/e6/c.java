package E6;

import java.util.Iterator;
import w6.p;
/* loaded from: classes.dex */
public final class c implements D6.d {

    /* renamed from: a  reason: collision with root package name */
    public final String f1080a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1081b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1082c;

    /* renamed from: d  reason: collision with root package name */
    public final kotlin.jvm.internal.k f1083d;

    public c(String input, int i7, int i8, p pVar) {
        kotlin.jvm.internal.j.e(input, "input");
        this.f1080a = input;
        this.f1081b = i7;
        this.f1082c = i8;
        this.f1083d = (kotlin.jvm.internal.k) pVar;
    }

    @Override // D6.d
    public final Iterator iterator() {
        return new b(this);
    }
}
