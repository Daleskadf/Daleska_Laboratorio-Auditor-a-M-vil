package F6;
/* loaded from: classes.dex */
public abstract class F0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f1218a = new ThreadLocal();

    public static AbstractC0077a0 a() {
        ThreadLocal threadLocal = f1218a;
        AbstractC0077a0 abstractC0077a0 = (AbstractC0077a0) threadLocal.get();
        if (abstractC0077a0 == null) {
            C0092i c0092i = new C0092i(Thread.currentThread());
            threadLocal.set(c0092i);
            return c0092i;
        }
        return abstractC0077a0;
    }
}
