package B4;

import android.app.Activity;
import com.google.firebase.firestore.S;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f269a;

    /* renamed from: b  reason: collision with root package name */
    public final S f270b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f271c;

    public a(Activity activity, S s7, Object obj) {
        this.f269a = activity;
        this.f270b = s7;
        this.f271c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!aVar.f271c.equals(this.f271c) || aVar.f270b != this.f270b || aVar.f269a != this.f269a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f271c.hashCode();
    }
}
