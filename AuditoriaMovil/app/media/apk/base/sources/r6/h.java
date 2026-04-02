package R6;

import Q6.s;
import java.io.IOException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.r;
import l6.j;
import w6.p;
/* loaded from: classes.dex */
public final class h extends k implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f4804a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f4805b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r f4806c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ r f4807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(s sVar, r rVar, r rVar2, r rVar3) {
        super(2);
        this.f4804a = sVar;
        this.f4805b = rVar;
        this.f4806c = rVar2;
        this.f4807d = rVar3;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        s sVar;
        boolean z7;
        boolean z8;
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 21589) {
            long j = 1;
            if (longValue >= 1) {
                byte a7 = this.f4804a.a();
                boolean z9 = true;
                if ((a7 & 1) == 1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if ((a7 & 2) == 2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if ((a7 & 4) != 4) {
                    z9 = false;
                }
                if (z7) {
                    j = 5;
                }
                if (z8) {
                    j += 4;
                }
                if (z9) {
                    j += 4;
                }
                if (longValue >= j) {
                    if (z7) {
                        this.f4805b.f13796a = Long.valueOf(sVar.d() * 1000);
                    }
                    if (z8) {
                        this.f4806c.f13796a = Long.valueOf(sVar.d() * 1000);
                    }
                    if (z9) {
                        this.f4807d.f13796a = Long.valueOf(sVar.d() * 1000);
                    }
                } else {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
            } else {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
        }
        return j.f13876a;
    }
}
