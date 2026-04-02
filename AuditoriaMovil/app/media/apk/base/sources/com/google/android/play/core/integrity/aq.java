package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
/* loaded from: classes.dex */
final class aq extends IntegrityTokenResponse {

    /* renamed from: a  reason: collision with root package name */
    private final String f9505a;

    /* renamed from: b  reason: collision with root package name */
    private final y f9506b;

    public aq(String str, y yVar) {
        this.f9505a = str;
        this.f9506b = yVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final Task<Integer> showDialog(Activity activity, int i7) {
        return this.f9506b.a(activity, i7);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f9505a;
    }
}
