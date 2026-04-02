package R6;

import Q6.s;
import java.io.IOException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import l6.j;
import w6.p;
/* loaded from: classes.dex */
public final class g extends k implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f4799a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f4800b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f4801c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ s f4802d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ q f4803e;
    public final /* synthetic */ q f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, long j, q qVar, s sVar, q qVar2, q qVar3) {
        super(2);
        this.f4799a = oVar;
        this.f4800b = j;
        this.f4801c = qVar;
        this.f4802d = sVar;
        this.f4803e = qVar2;
        this.f = qVar3;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 1) {
            o oVar = this.f4799a;
            if (!oVar.f13793a) {
                oVar.f13793a = true;
                if (longValue >= this.f4800b) {
                    q qVar = this.f4801c;
                    long j8 = qVar.f13795a;
                    int i7 = (j8 > 4294967295L ? 1 : (j8 == 4294967295L ? 0 : -1));
                    s sVar = this.f4802d;
                    if (i7 == 0) {
                        j8 = sVar.g();
                    }
                    qVar.f13795a = j8;
                    q qVar2 = this.f4803e;
                    long j9 = 0;
                    if (qVar2.f13795a == 4294967295L) {
                        j = sVar.g();
                    } else {
                        j = 0;
                    }
                    qVar2.f13795a = j;
                    q qVar3 = this.f;
                    if (qVar3.f13795a == 4294967295L) {
                        j9 = sVar.g();
                    }
                    qVar3.f13795a = j9;
                } else {
                    throw new IOException("bad zip: zip64 extra too short");
                }
            } else {
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }
        return j.f13876a;
    }
}
