package e1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public class f0 implements b1.e {

    /* renamed from: e  reason: collision with root package name */
    public static final String f12845e = a1.k.f("SystemJobScheduler");

    /* renamed from: a  reason: collision with root package name */
    public final Context f12846a;

    /* renamed from: b  reason: collision with root package name */
    public final JobScheduler f12847b;

    /* renamed from: c  reason: collision with root package name */
    public final b1.j f12848c;

    /* renamed from: d  reason: collision with root package name */
    public final u f12849d;

    public f0(Context context, b1.j jVar) {
        this(context, jVar, v.a(context.getSystemService("jobscheduler")), new u(context));
    }

    public static void b(Context context) {
        List<Object> f10;
        int id;
        JobScheduler a10 = v.a(context.getSystemService("jobscheduler"));
        if (a10 != null && (f10 = f(context, a10)) != null && !f10.isEmpty()) {
            for (Object obj : f10) {
                id = w.a(obj).getId();
                c(a10, id);
            }
        }
    }

    public static void c(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            a1.k.c().b(f12845e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th);
        }
    }

    public static List d(Context context, JobScheduler jobScheduler, String str) {
        int id;
        List<Object> f10 = f(context, jobScheduler);
        if (f10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (Object obj : f10) {
            JobInfo a10 = w.a(obj);
            if (str.equals(g(a10))) {
                id = a10.getId();
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public static List f(Context context, JobScheduler jobScheduler) {
        List<Object> list;
        ComponentName service;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            a1.k.c().b(f12845e, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (Object obj : list) {
            JobInfo a10 = w.a(obj);
            service = a10.getService();
            if (componentName.equals(service)) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    public static String g(JobInfo jobInfo) {
        PersistableBundle extras;
        boolean containsKey;
        String string;
        extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                containsKey = extras.containsKey("EXTRA_WORK_SPEC_ID");
                if (containsKey) {
                    string = extras.getString("EXTRA_WORK_SPEC_ID");
                    return string;
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean h(Context context, b1.j jVar) {
        int i10;
        int id;
        JobScheduler a10 = v.a(context.getSystemService("jobscheduler"));
        List<Object> f10 = f(context, a10);
        List<String> c10 = jVar.n().y().c();
        boolean z10 = false;
        if (f10 != null) {
            i10 = f10.size();
        } else {
            i10 = 0;
        }
        HashSet hashSet = new HashSet(i10);
        if (f10 != null && !f10.isEmpty()) {
            for (Object obj : f10) {
                JobInfo a11 = w.a(obj);
                String g10 = g(a11);
                if (TextUtils.isEmpty(g10)) {
                    id = a11.getId();
                    c(a10, id);
                } else {
                    hashSet.add(g10);
                }
            }
        }
        Iterator it = c10.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    a1.k.c().a(f12845e, "Reconciling jobs", new Throwable[0]);
                    z10 = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z10) {
            WorkDatabase n10 = jVar.n();
            n10.c();
            try {
                j1.q B = n10.B();
                for (String str : c10) {
                    B.l(str, -1L);
                }
                n10.r();
            } finally {
                n10.g();
            }
        }
        return z10;
    }

    @Override // b1.e
    public boolean a() {
        return true;
    }

    @Override // b1.e
    public void cancel(String str) {
        List<Integer> d10 = d(this.f12846a, this.f12847b, str);
        if (d10 != null && !d10.isEmpty()) {
            for (Integer num : d10) {
                c(this.f12847b, num.intValue());
            }
            this.f12848c.n().y().d(str);
        }
    }

    @Override // b1.e
    public void e(j1.p... pVarArr) {
        int d10;
        List d11;
        int d12;
        WorkDatabase n10 = this.f12848c.n();
        k1.f fVar = new k1.f(n10);
        for (j1.p pVar : pVarArr) {
            n10.c();
            try {
                j1.p h10 = n10.B().h(pVar.f14583a);
                if (h10 == null) {
                    a1.k.c().h(f12845e, "Skipping scheduling " + pVar.f14583a + " because it's no longer in the DB", new Throwable[0]);
                    n10.r();
                } else if (h10.f14584b != a1.s.ENQUEUED) {
                    a1.k.c().h(f12845e, "Skipping scheduling " + pVar.f14583a + " because it is no longer enqueued", new Throwable[0]);
                    n10.r();
                } else {
                    j1.g b10 = n10.y().b(pVar.f14583a);
                    if (b10 != null) {
                        d10 = b10.f14563b;
                    } else {
                        d10 = fVar.d(this.f12848c.h().i(), this.f12848c.h().g());
                    }
                    if (b10 == null) {
                        this.f12848c.n().y().a(new j1.g(pVar.f14583a, d10));
                    }
                    i(pVar, d10);
                    if (Build.VERSION.SDK_INT == 23 && (d11 = d(this.f12846a, this.f12847b, pVar.f14583a)) != null) {
                        int indexOf = d11.indexOf(Integer.valueOf(d10));
                        if (indexOf >= 0) {
                            d11.remove(indexOf);
                        }
                        if (!d11.isEmpty()) {
                            d12 = ((Integer) d11.get(0)).intValue();
                        } else {
                            d12 = fVar.d(this.f12848c.h().i(), this.f12848c.h().g());
                        }
                        i(pVar, d12);
                    }
                    n10.r();
                }
                n10.g();
            } catch (Throwable th) {
                n10.g();
                throw th;
            }
        }
    }

    public void i(j1.p pVar, int i10) {
        int i11;
        int schedule;
        JobInfo a10 = this.f12849d.a(pVar, i10);
        a1.k c10 = a1.k.c();
        String str = f12845e;
        c10.a(str, String.format("Scheduling work ID %s Job ID %s", pVar.f14583a, Integer.valueOf(i10)), new Throwable[0]);
        try {
            schedule = this.f12847b.schedule(a10);
            if (schedule == 0) {
                a1.k.c().h(str, String.format("Unable to schedule work ID %s", pVar.f14583a), new Throwable[0]);
                if (pVar.f14599q && pVar.f14600r == a1.o.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f14599q = false;
                    a1.k.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", pVar.f14583a), new Throwable[0]);
                    i(pVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            List f10 = f(this.f12846a, this.f12847b);
            if (f10 != null) {
                i11 = f10.size();
            } else {
                i11 = 0;
            }
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(i11), Integer.valueOf(this.f12848c.n().B().c().size()), Integer.valueOf(this.f12848c.h().h()));
            a1.k.c().b(f12845e, format, new Throwable[0]);
            throw new IllegalStateException(format, e10);
        } catch (Throwable th) {
            a1.k.c().b(f12845e, String.format("Unable to schedule %s", pVar), th);
        }
    }

    public f0(Context context, b1.j jVar, JobScheduler jobScheduler, u uVar) {
        this.f12846a = context;
        this.f12848c = jVar;
        this.f12847b = jobScheduler;
        this.f12849d = uVar;
    }
}
