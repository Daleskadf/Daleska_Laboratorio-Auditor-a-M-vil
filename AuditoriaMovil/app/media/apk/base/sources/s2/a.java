package S2;

import O2.g;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.AbstractC0726a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
/* loaded from: classes.dex */
public abstract class a extends l {
    private static final h zza;
    private static final AbstractC0726a zzb;
    private static final i zzc;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ?? obj = new Object();
        zza = obj;
        g gVar = new g(4);
        zzb = gVar;
        zzc = new i("SmsRetriever.API", gVar, obj);
    }

    public a(Activity activity) {
        super(activity, activity, zzc, e.f9157U, k.f9283c);
    }

    public a(Context context) {
        super(context, null, zzc, e.f9157U, k.f9283c);
    }
}
