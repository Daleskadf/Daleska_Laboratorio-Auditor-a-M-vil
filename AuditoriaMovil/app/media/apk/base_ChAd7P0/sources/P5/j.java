package P5;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public String f4048a;

    /* renamed from: b  reason: collision with root package name */
    public String f4049b;

    /* renamed from: c  reason: collision with root package name */
    public String f4050c;

    /* renamed from: d  reason: collision with root package name */
    public String f4051d;

    /* renamed from: e  reason: collision with root package name */
    public String f4052e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public String f4053g;

    /* renamed from: h  reason: collision with root package name */
    public String f4054h;

    /* renamed from: i  reason: collision with root package name */
    public String f4055i;
    public String j;

    /* renamed from: k  reason: collision with root package name */
    public String f4056k;

    /* renamed from: l  reason: collision with root package name */
    public String f4057l;

    /* renamed from: m  reason: collision with root package name */
    public String f4058m;

    /* renamed from: n  reason: collision with root package name */
    public String f4059n;

    /* JADX WARN: Type inference failed for: r0v0, types: [P5.j, java.lang.Object] */
    public static j a(ArrayList arrayList) {
        ?? obj = new Object();
        String str = (String) arrayList.get(0);
        if (str != null) {
            obj.f4048a = str;
            String str2 = (String) arrayList.get(1);
            if (str2 != null) {
                obj.f4049b = str2;
                String str3 = (String) arrayList.get(2);
                if (str3 != null) {
                    obj.f4050c = str3;
                    String str4 = (String) arrayList.get(3);
                    if (str4 != null) {
                        obj.f4051d = str4;
                        obj.f4052e = (String) arrayList.get(4);
                        obj.f = (String) arrayList.get(5);
                        obj.f4053g = (String) arrayList.get(6);
                        obj.f4054h = (String) arrayList.get(7);
                        obj.f4055i = (String) arrayList.get(8);
                        obj.j = (String) arrayList.get(9);
                        obj.f4056k = (String) arrayList.get(10);
                        obj.f4057l = (String) arrayList.get(11);
                        obj.f4058m = (String) arrayList.get(12);
                        obj.f4059n = (String) arrayList.get(13);
                        return obj;
                    }
                    throw new IllegalStateException("Nonnull field \"projectId\" is null.");
                }
                throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
            }
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }
        throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(14);
        arrayList.add(this.f4048a);
        arrayList.add(this.f4049b);
        arrayList.add(this.f4050c);
        arrayList.add(this.f4051d);
        arrayList.add(this.f4052e);
        arrayList.add(this.f);
        arrayList.add(this.f4053g);
        arrayList.add(this.f4054h);
        arrayList.add(this.f4055i);
        arrayList.add(this.j);
        arrayList.add(this.f4056k);
        arrayList.add(this.f4057l);
        arrayList.add(this.f4058m);
        arrayList.add(this.f4059n);
        return arrayList;
    }
}
