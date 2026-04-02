package i6;

import a6.EnumC0486o;
import a6.O;
import c6.C1;
import c6.L0;
import org.apache.tika.utils.StringUtils;
/* renamed from: i6.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1122i {

    /* renamed from: a  reason: collision with root package name */
    public final C1123j f11522a;

    /* renamed from: b  reason: collision with root package name */
    public final C1118e f11523b;

    /* renamed from: c  reason: collision with root package name */
    public final C1 f11524c;

    /* renamed from: d  reason: collision with root package name */
    public EnumC0486o f11525d;

    /* renamed from: e  reason: collision with root package name */
    public O f11526e;
    public boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ w f11527g;

    public C1122i(w wVar, C1123j c1123j, C1 c12, L0 l02) {
        this.f11527g = wVar;
        this.f11522a = c1123j;
        this.f11524c = c12;
        this.f11526e = l02;
        C1118e c1118e = new C1118e(new C1121h(this, 1));
        this.f11523b = c1118e;
        this.f11525d = EnumC0486o.CONNECTING;
        c1118e.i(c12);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address = ");
        sb.append(this.f11522a);
        sb.append(", state = ");
        sb.append(this.f11525d);
        sb.append(", picker type: ");
        sb.append(this.f11526e.getClass());
        sb.append(", lb: ");
        sb.append(this.f11523b.g().getClass());
        if (this.f) {
            str = ", deactivated";
        } else {
            str = StringUtils.EMPTY;
        }
        sb.append(str);
        return sb.toString();
    }
}
