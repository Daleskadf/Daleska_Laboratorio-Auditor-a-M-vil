package W;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import org.apache.tika.utils.StringUtils;
/* renamed from: W.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366i {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f6037a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f6038b;

    /* renamed from: c  reason: collision with root package name */
    public final Q[] f6039c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6040d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6041e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6042g;

    /* renamed from: h  reason: collision with root package name */
    public final CharSequence f6043h;

    /* renamed from: i  reason: collision with root package name */
    public final PendingIntent f6044i;

    public C0366i(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, Q[] qArr, Q[] qArr2, boolean z7, boolean z8, boolean z9) {
        this.f6041e = true;
        this.f6038b = iconCompat;
        if (iconCompat != null) {
            int i7 = iconCompat.f7706a;
            if ((i7 == -1 ? j3.f.w(iconCompat.f7707b) : i7) == 2) {
                this.f6042g = iconCompat.f();
            }
        }
        this.f6043h = C0372o.b(charSequence);
        this.f6044i = pendingIntent;
        this.f6037a = bundle == null ? new Bundle() : bundle;
        this.f6039c = qArr;
        this.f6040d = z7;
        this.f6041e = z8;
        this.f = z9;
    }

    public final IconCompat a() {
        int i7;
        if (this.f6038b == null && (i7 = this.f6042g) != 0) {
            this.f6038b = IconCompat.e(null, StringUtils.EMPTY, i7);
        }
        return this.f6038b;
    }
}
