package m9;

import kotlin.coroutines.Continuation;
/* loaded from: classes3.dex */
public abstract class i extends a {
    public i(Continuation continuation) {
        super(continuation);
        boolean z10;
        if (continuation != null) {
            if (continuation.getContext() == k9.g.f15708a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public k9.f getContext() {
        return k9.g.f15708a;
    }
}
