package p4;

import android.database.sqlite.SQLiteTransactionListener;
/* loaded from: classes.dex */
public final class M implements SQLiteTransactionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Q f15205a;

    public M(Q q2) {
        this.f15205a = q2;
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onBegin() {
        this.f15205a.f15217l.y();
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onCommit() {
        this.f15205a.f15217l.w();
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onRollback() {
    }
}
