package V0;

import j$.util.DesugarCollections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class m implements Z0.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f5874a;

    /* renamed from: b  reason: collision with root package name */
    public final List f5875b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5876c;

    public m(String str, List list, boolean z7) {
        this.f5874a = str;
        this.f5875b = DesugarCollections.unmodifiableList(list);
        this.f5876c = z7;
    }
}
