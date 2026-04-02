package S3;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
/* loaded from: classes.dex */
public final class n extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f5250a;

    public n(o oVar) {
        this.f5250a = oVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        o oVar = this.f5250a;
        try {
            j jVar = j.f5244c;
            Mac mac = (Mac) jVar.f5245a.B(oVar.f5253b);
            mac.init(oVar.f5254c);
            return mac;
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }
}
