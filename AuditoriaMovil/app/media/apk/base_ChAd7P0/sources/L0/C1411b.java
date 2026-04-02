package l0;

import E6.l;
import K5.m;
import android.location.Location;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.tasks.OnSuccessListener;
import p3.q;
import t2.f;
import x5.C2008j;
/* renamed from: l0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1411b implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13801a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13802b;

    public /* synthetic */ C1411b(Object obj, int i7) {
        this.f13801a = i7;
        this.f13802b = obj;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        Object obj2 = this.f13802b;
        switch (this.f13801a) {
            case 0:
                int i7 = HiddenActivity.f7744c;
                ((C1413d) obj2).invoke(obj);
                return;
            case 1:
                int i8 = HiddenActivity.f7744c;
                ((C1413d) obj2).invoke(obj);
                return;
            case 2:
                int i9 = HiddenActivity.f7744c;
                ((C1413d) obj2).invoke(obj);
                return;
            case 3:
                int i10 = HiddenActivity.f7744c;
                ((C1413d) obj2).invoke(obj);
                return;
            case 4:
                q qVar = (q) obj;
                f fVar = (f) obj2;
                fVar.g(fVar.f);
                return;
            case 5:
                ((m) obj2).b((Location) obj);
                return;
            case 6:
                ((C2008j) obj2).invoke(obj);
                return;
            default:
                ((l) obj2).invoke(obj);
                return;
        }
    }
}
