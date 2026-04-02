package R6;

import Q6.o;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final o f4794a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4795b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4796c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f4797d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4798e;
    public final ArrayList f;

    public /* synthetic */ f(o oVar) {
        this(oVar, true, StringUtils.EMPTY, -1L, -1L, -1, null, -1L);
    }

    public f(o oVar, boolean z7, String comment, long j, long j8, int i7, Long l8, long j9) {
        j.e(comment, "comment");
        this.f4794a = oVar;
        this.f4795b = z7;
        this.f4796c = j8;
        this.f4797d = l8;
        this.f4798e = j9;
        this.f = new ArrayList();
    }
}
