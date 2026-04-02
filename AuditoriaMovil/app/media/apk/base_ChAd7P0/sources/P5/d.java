package P5;

import D.AbstractC0059i;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
/* loaded from: classes.dex */
public class d implements H5.b {

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap f4034c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public Context f4035a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4036b = false;

    /* JADX WARN: Type inference failed for: r4v0, types: [P5.j, java.lang.Object] */
    public static j a(U3.k kVar) {
        String str = kVar.f5757a;
        String str2 = kVar.f5761e;
        if (str2 == null) {
            str2 = null;
        }
        String str3 = kVar.f5762g;
        if (str3 == null) {
            str3 = null;
        }
        ?? obj = new Object();
        if (str != null) {
            obj.f4048a = str;
            String str4 = kVar.f5758b;
            if (str4 != null) {
                obj.f4049b = str4;
                if (str2 != null) {
                    obj.f4050c = str2;
                    if (str3 != null) {
                        obj.f4051d = str3;
                        obj.f4052e = null;
                        obj.f = kVar.f5759c;
                        obj.f4053g = kVar.f;
                        obj.f4054h = null;
                        obj.f4055i = kVar.f5760d;
                        obj.j = null;
                        obj.f4056k = null;
                        obj.f4057l = null;
                        obj.f4058m = null;
                        obj.f4059n = null;
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

    public static void b(TaskCompletionSource taskCompletionSource, h hVar) {
        taskCompletionSource.getTask().addOnCompleteListener(new c(hVar, 0));
    }

    @Override // H5.b
    public final void onAttachedToEngine(H5.a aVar) {
        AbstractC0059i.T(aVar.f2030b, this);
        AbstractC0059i.S(aVar.f2030b, this);
        this.f4035a = aVar.f2029a;
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a aVar) {
        this.f4035a = null;
        AbstractC0059i.T(aVar.f2030b, null);
        AbstractC0059i.S(aVar.f2030b, null);
    }
}
