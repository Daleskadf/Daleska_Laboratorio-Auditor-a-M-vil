package l4;

import a6.p0;
import a6.q0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.I;
import com.google.firebase.firestore.J;
import java.lang.reflect.Constructor;
import m1.o;
import u4.n;
import u4.u;
/* renamed from: l4.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1418b implements Continuation, n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13847a;

    public /* synthetic */ C1418b(int i7) {
        this.f13847a = i7;
    }

    @Override // u4.n
    public void a(Object obj) {
        String str = (String) obj;
    }

    public Constructor b() {
        switch (this.f13847a) {
            case 1:
                if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return null;
                }
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(o.class).getConstructor(Integer.TYPE);
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(o.class).getConstructor(null);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f13847a) {
            case 0:
                if (task.isSuccessful()) {
                    return Tasks.forResult(((X3.b) task.getResult()).f6376a);
                }
                return Tasks.forException(task.getException());
            case 3:
                q4.n nVar = (q4.n) task.getResult();
                if (!nVar.d()) {
                    if (nVar.e()) {
                        return null;
                    }
                    throw new J("Failed to get document from cache. (However, this document may exist on the server. Run again without setting source to CACHE to attempt to retrieve the document from the server.)", I.UNAVAILABLE);
                }
                return nVar;
            case 5:
                if (task.isSuccessful()) {
                    return Tasks.forResult(null);
                }
                return Tasks.forException(task.getException());
            default:
                if (task.isSuccessful()) {
                    return (Void) task.getResult();
                }
                Exception exception = task.getException();
                if (exception instanceof p0) {
                    exception = u.h(((p0) exception).f7188a);
                } else if (exception instanceof q0) {
                    exception = u.h(((q0) exception).f7191a);
                }
                if (exception instanceof J) {
                    throw exception;
                }
                throw new J(exception.getMessage(), I.UNKNOWN, exception);
        }
    }
}
