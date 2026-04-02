package I2;

import J2.i;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2180a;

    /* renamed from: b  reason: collision with root package name */
    public final J2.c f2181b;

    /* renamed from: c  reason: collision with root package name */
    public final b f2182c;

    public d(Context context, J2.c cVar, b bVar) {
        this.f2180a = context;
        this.f2181b = cVar;
        this.f2182c = bVar;
    }

    public final void a(D2.b bVar, int i7, boolean z7) {
        Long l8;
        Context context = this.f2180a;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(bVar.f835a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        A2.d dVar = bVar.f837c;
        adler32.update(allocate.putInt(M2.a.a(dVar)).array());
        byte[] bArr = bVar.f836b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z7) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i8 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i8 >= i7) {
                        m5.d.c(bVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        SQLiteDatabase a7 = ((i) this.f2181b).a();
        String valueOf = String.valueOf(M2.a.a(dVar));
        String str = bVar.f835a;
        Cursor rawQuery = a7.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf});
        try {
            if (rawQuery.moveToNext()) {
                l8 = Long.valueOf(rawQuery.getLong(0));
            } else {
                l8 = 0L;
            }
            rawQuery.close();
            long longValue = l8.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            b bVar2 = this.f2182c;
            Long l9 = l8;
            builder.setMinimumLatency(bVar2.a(dVar, longValue, i7));
            Set set = ((c) bVar2.f2176b.get(dVar)).f2179c;
            if (set.contains(e.NETWORK_UNMETERED)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(e.DEVICE_CHARGING)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(e.DEVICE_IDLE)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i7);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt(MimeTypesReaderMetKeys.MAGIC_PRIORITY_ATTR, M2.a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Log.d("TransportRuntime.".concat("JobInfoScheduler"), String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", bVar, Integer.valueOf(value), Long.valueOf(bVar2.a(dVar, longValue, i7)), l9, Integer.valueOf(i7)));
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
