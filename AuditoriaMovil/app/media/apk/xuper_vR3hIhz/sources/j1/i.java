package j1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    public final q0.e f14564a;

    /* renamed from: b  reason: collision with root package name */
    public final q0.b f14565b;

    /* renamed from: c  reason: collision with root package name */
    public final q0.k f14566c;

    /* loaded from: classes.dex */
    public class a extends q0.b {
        public a(q0.e eVar) {
            super(eVar);
        }

        @Override // q0.k
        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // q0.b
        /* renamed from: i */
        public void g(t0.f fVar, g gVar) {
            String str = gVar.f14562a;
            if (str == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, str);
            }
            fVar.bindLong(2, gVar.f14563b);
        }
    }

    /* loaded from: classes.dex */
    public class b extends q0.k {
        public b(q0.e eVar) {
            super(eVar);
        }

        @Override // q0.k
        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(q0.e eVar) {
        this.f14564a = eVar;
        this.f14565b = new a(eVar);
        this.f14566c = new b(eVar);
    }

    @Override // j1.h
    public void a(g gVar) {
        this.f14564a.b();
        this.f14564a.c();
        try {
            this.f14565b.h(gVar);
            this.f14564a.r();
        } finally {
            this.f14564a.g();
        }
    }

    @Override // j1.h
    public g b(String str) {
        q0.h c10 = q0.h.c("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            c10.bindNull(1);
        } else {
            c10.bindString(1, str);
        }
        this.f14564a.b();
        g gVar = null;
        Cursor b10 = s0.c.b(this.f14564a, c10, false, null);
        try {
            int b11 = s0.b.b(b10, "work_spec_id");
            int b12 = s0.b.b(b10, "system_id");
            if (b10.moveToFirst()) {
                gVar = new g(b10.getString(b11), b10.getInt(b12));
            }
            return gVar;
        } finally {
            b10.close();
            c10.release();
        }
    }

    @Override // j1.h
    public List c() {
        q0.h c10 = q0.h.c("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f14564a.b();
        Cursor b10 = s0.c.b(this.f14564a, c10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            c10.release();
        }
    }

    @Override // j1.h
    public void d(String str) {
        this.f14564a.b();
        t0.f a10 = this.f14566c.a();
        if (str == null) {
            a10.bindNull(1);
        } else {
            a10.bindString(1, str);
        }
        this.f14564a.c();
        try {
            a10.executeUpdateDelete();
            this.f14564a.r();
        } finally {
            this.f14564a.g();
            this.f14566c.f(a10);
        }
    }
}
