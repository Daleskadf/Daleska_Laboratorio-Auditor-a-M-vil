package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import D2.b;
import D2.i;
import H.h;
import I2.f;
import I2.g;
import M2.a;
import V2.k;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f9084a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i7 = jobParameters.getExtras().getInt(MimeTypesReaderMetKeys.MAGIC_PRIORITY_ATTR);
        int i8 = jobParameters.getExtras().getInt("attemptNumber");
        i.b(getApplicationContext());
        k a7 = b.a();
        if (string != null) {
            a7.f5965b = string;
            a7.f5967d = a.b(i7);
            if (string2 != null) {
                a7.f5966c = Base64.decode(string2, 0);
            }
            g gVar = i.a().f856d;
            b a8 = a7.a();
            h hVar = new h(5, this, jobParameters);
            gVar.getClass();
            gVar.f2191e.execute(new f(gVar, a8, i8, hVar));
            return true;
        }
        throw new NullPointerException("Null backendName");
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
