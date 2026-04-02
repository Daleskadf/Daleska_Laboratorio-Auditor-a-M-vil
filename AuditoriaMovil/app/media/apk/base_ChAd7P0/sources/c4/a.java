package C4;

import U3.h;
import V2.k;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f533m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(k kVar, h hVar, int i7) {
        super(kVar, hVar);
        this.f533m = i7;
    }

    @Override // C4.c
    public final String d() {
        switch (this.f533m) {
            case 0:
                return "DELETE";
            case 1:
                return "GET";
            default:
                return "GET";
        }
    }

    @Override // C4.c
    public Map h() {
        switch (this.f533m) {
            case 2:
                return Collections.singletonMap("alt", "media");
            default:
                return super.h();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k kVar, h hVar, long j) {
        super(kVar, hVar);
        this.f533m = 2;
        if (j != 0) {
            q("Range", "bytes=" + j + "-");
        }
    }
}
