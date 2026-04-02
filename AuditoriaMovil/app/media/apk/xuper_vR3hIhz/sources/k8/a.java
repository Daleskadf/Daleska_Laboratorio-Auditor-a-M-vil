package k8;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import java.util.List;
import l8.h;
import t9.i;
import x8.a;
/* loaded from: classes3.dex */
public final class a extends x8.a {

    /* renamed from: l  reason: collision with root package name */
    public final String f15693l;

    /* renamed from: m  reason: collision with root package name */
    public Gson f15694m;

    /* renamed from: n  reason: collision with root package name */
    public Gson f15695n;

    public a(int i10) {
        super(i10);
        String simpleName = a.class.getSimpleName();
        i.c(simpleName, "javaClass.simpleName");
        this.f15693l = simpleName;
        this.f15694m = new Gson();
        this.f15695n = new GsonBuilder().setPrettyPrinting().create();
    }

    @Override // x8.a
    public a.m p(a.k kVar) {
        return u(kVar);
    }

    public final a.m u(a.k kVar) {
        a.l lVar;
        a.l lVar2 = a.l.GET;
        String str = null;
        if (kVar != null) {
            lVar = kVar.getMethod();
        } else {
            lVar = null;
        }
        if (lVar2 == lVar && i.b("/playinfo", kVar.a())) {
            List list = (List) kVar.getParameters().get("instance");
            if (list != null) {
                str = (String) list.get(0);
            }
            int parseInt = Integer.parseInt(String.valueOf(str));
            return v(200, new JsonParser().parse(h.f16357m.a().n(parseInt)), "Request successfully:" + parseInt);
        }
        return v(404, "", "Request not support!");
    }

    public final a.m v(int i10, Object obj, String str) {
        a.m l10 = x8.a.l(this.f15695n.toJson(new b(i10, obj, str)));
        i.c(l10, "newFixedLengthResponse(m…ttyGson.toJson(response))");
        return l10;
    }
}
