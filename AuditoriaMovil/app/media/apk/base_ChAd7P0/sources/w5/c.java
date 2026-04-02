package w5;

import K5.r;
import L5.t;
import android.content.Intent;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a  reason: collision with root package name */
    public r f16372a;

    /* renamed from: b  reason: collision with root package name */
    public AtomicBoolean f16373b;

    @Override // L5.t
    public final boolean onActivityResult(int i7, int i8, Intent intent) {
        r rVar;
        if (i7 != 22643) {
            return false;
        }
        String str = SharePlusPendingIntent.f10503a;
        if (this.f16373b.compareAndSet(false, true) && (rVar = this.f16372a) != null) {
            rVar.a(str);
            this.f16372a = null;
        }
        return true;
    }
}
