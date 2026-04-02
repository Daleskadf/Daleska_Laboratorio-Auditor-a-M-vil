package X5;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import j$.util.Objects;
/* loaded from: classes.dex */
public final /* synthetic */ class Z implements w6.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6442a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b0 f6443b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ JsResult f6444c;

    public /* synthetic */ Z(b0 b0Var, JsResult jsResult, int i7) {
        this.f6442a = i7;
        this.f6443b = b0Var;
        this.f6444c = jsResult;
    }

    @Override // w6.l
    public final Object invoke(Object obj) {
        S s7 = (S) obj;
        switch (this.f6442a) {
            case 0:
                b0 b0Var = this.f6443b;
                b0Var.getClass();
                if (s7.f6436d) {
                    F3.o oVar = b0Var.f6452b.f6530a;
                    Throwable th = s7.f6435c;
                    Objects.requireNonNull(th);
                    oVar.getClass();
                    F3.o.q(th);
                    return null;
                }
                boolean equals = Boolean.TRUE.equals(s7.f6434b);
                JsResult jsResult = this.f6444c;
                if (equals) {
                    jsResult.confirm();
                    return null;
                }
                jsResult.cancel();
                return null;
            case 1:
                b0 b0Var2 = this.f6443b;
                b0Var2.getClass();
                if (s7.f6436d) {
                    F3.o oVar2 = b0Var2.f6452b.f6530a;
                    Throwable th2 = s7.f6435c;
                    Objects.requireNonNull(th2);
                    oVar2.getClass();
                    F3.o.q(th2);
                    return null;
                }
                this.f6444c.confirm();
                return null;
            default:
                b0 b0Var3 = this.f6443b;
                b0Var3.getClass();
                if (s7.f6436d) {
                    F3.o oVar3 = b0Var3.f6452b.f6530a;
                    Throwable th3 = s7.f6435c;
                    Objects.requireNonNull(th3);
                    oVar3.getClass();
                    F3.o.q(th3);
                    return null;
                }
                String str = (String) s7.f6434b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f6444c;
                if (str != null) {
                    jsPromptResult.confirm(str);
                    return null;
                }
                jsPromptResult.cancel();
                return null;
        }
    }
}
