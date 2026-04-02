package a1;
/* loaded from: classes.dex */
public abstract class i {

    /* loaded from: classes.dex */
    public class a extends i {
        @Override // a1.i
        public h a(String str) {
            return null;
        }
    }

    public static i c() {
        return new a();
    }

    public abstract h a(String str);

    public final h b(String str) {
        h a10 = a(str);
        if (a10 == null) {
            return h.a(str);
        }
        return a10;
    }
}
