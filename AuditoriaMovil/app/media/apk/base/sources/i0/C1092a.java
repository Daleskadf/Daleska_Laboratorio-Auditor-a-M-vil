package i0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* renamed from: i0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1092a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f11371a;

    /* renamed from: b  reason: collision with root package name */
    public final C1095d f11372b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11373c;

    public C1092a(int i7, C1095d c1095d, int i8) {
        this.f11371a = i7;
        this.f11372b = c1095d;
        this.f11373c = i8;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f11371a);
        this.f11372b.f11380a.performAction(this.f11373c, bundle);
    }
}
