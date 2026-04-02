package h0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;
/* renamed from: h0.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1050j implements InterfaceC1051k {

    /* renamed from: a  reason: collision with root package name */
    public final ScrollFeedbackProvider f11196a;

    public C1050j(NestedScrollView nestedScrollView) {
        this.f11196a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // h0.InterfaceC1051k
    public final void a(int i7, int i8, int i9, boolean z7) {
        this.f11196a.onScrollLimit(i7, i8, i9, z7);
    }

    @Override // h0.InterfaceC1051k
    public final void c(int i7, int i8, int i9, int i10) {
        this.f11196a.onScrollProgress(i7, i8, i9, i10);
    }
}
