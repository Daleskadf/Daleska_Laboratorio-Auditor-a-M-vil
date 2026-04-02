package W;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: W.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0365h {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6030a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6031b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6032c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f6033d;

    /* renamed from: e  reason: collision with root package name */
    public final CharSequence f6034e;
    public final Object f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f6035g;

    /* renamed from: h  reason: collision with root package name */
    public Serializable f6036h;

    public C0365h(String str, String str2, String str3, S0.t tVar, boolean z7, boolean z8, boolean z9, Integer num) {
        this.f6033d = str;
        this.f6034e = str2;
        this.f = str3;
        this.f6035g = tVar;
        this.f6030a = z7;
        this.f6031b = z8;
        this.f6032c = z9;
        this.f6036h = num;
    }

    public C0366i a() {
        Q[] qArr;
        CharSequence[] charSequenceArr;
        if (!this.f6032c || ((PendingIntent) this.f) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = (ArrayList) this.f6036h;
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    Q q2 = (Q) it.next();
                    if (!q2.f6024c && (((charSequenceArr = q2.f6023b) == null || charSequenceArr.length == 0) && !q2.f6026e.isEmpty())) {
                        arrayList.add(q2);
                    } else {
                        arrayList2.add(q2);
                    }
                }
            }
            Q[] qArr2 = null;
            if (arrayList.isEmpty()) {
                qArr = null;
            } else {
                qArr = (Q[]) arrayList.toArray(new Q[arrayList.size()]);
            }
            if (!arrayList2.isEmpty()) {
                qArr2 = (Q[]) arrayList2.toArray(new Q[arrayList2.size()]);
            }
            return new C0366i((IconCompat) this.f6033d, this.f6034e, (PendingIntent) this.f, (Bundle) this.f6035g, qArr2, qArr, this.f6030a, this.f6031b, this.f6032c);
        }
        throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
    }

    public C0365h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        this.f6030a = true;
        this.f6031b = true;
        this.f6033d = iconCompat;
        this.f6034e = C0372o.b(charSequence);
        this.f = pendingIntent;
        this.f6035g = bundle;
        this.f6036h = null;
        this.f6030a = true;
        this.f6031b = true;
        this.f6032c = false;
    }
}
