package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.StandardIntegrityManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class az implements StandardIntegrityManager {

    /* renamed from: a  reason: collision with root package name */
    private final bn f9520a;

    /* renamed from: b  reason: collision with root package name */
    private final bt f9521b;

    public az(bn bnVar, bt btVar) {
        this.f9520a = bnVar;
        this.f9521b = btVar;
    }

    public final /* synthetic */ Task a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l8) {
        final long b5 = prepareIntegrityTokenRequest.b();
        final long longValue = l8.longValue();
        prepareIntegrityTokenRequest.a();
        final bt btVar = this.f9521b;
        return Tasks.forResult(new StandardIntegrityManager.StandardIntegrityTokenProvider(b5, longValue, 0) { // from class: com.google.android.play.core.integrity.bs

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ long f9564b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ long f9565c;

            @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
            public final Task request(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
                return bt.this.a(this.f9564b, this.f9565c, 0, standardIntegrityTokenRequest);
            }
        });
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(final StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        long b5 = prepareIntegrityTokenRequest.b();
        prepareIntegrityTokenRequest.a();
        return this.f9520a.e(b5, 0).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.play.core.integrity.ay
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return az.this.a(prepareIntegrityTokenRequest, (Long) obj);
            }
        });
    }
}
