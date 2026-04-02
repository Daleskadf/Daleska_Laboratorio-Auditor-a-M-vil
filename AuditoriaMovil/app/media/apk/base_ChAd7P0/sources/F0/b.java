package F0;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.google.android.libraries.barhopper.RecognitionOptions;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final IntentFilter f1107a;

    /* renamed from: b  reason: collision with root package name */
    public final BroadcastReceiver f1108b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1109c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1110d;

    public b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.f1107a = intentFilter;
        this.f1108b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((int) RecognitionOptions.ITF);
        sb.append("Receiver{");
        sb.append(this.f1108b);
        sb.append(" filter=");
        sb.append(this.f1107a);
        if (this.f1110d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
