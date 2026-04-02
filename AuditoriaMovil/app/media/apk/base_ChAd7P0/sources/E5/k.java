package e5;

import Y1.y;
import android.content.Context;
import c4.C0632a;
import j6.C1372c;
import java.util.UUID;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final C0632a f10904b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f10905a;

    static {
        y b5 = C0632a.b(k.class);
        b5.c(c4.j.b(g.class));
        b5.c(c4.j.b(Context.class));
        b5.f = new C1372c(17);
        f10904b = b5.d();
    }

    public k(Context context) {
        this.f10905a = context;
    }

    public final synchronized String a() {
        String string = this.f10905a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        this.f10905a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }
}
