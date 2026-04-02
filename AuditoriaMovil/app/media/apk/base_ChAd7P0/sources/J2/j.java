package J2;

import android.database.sqlite.SQLiteDatabase;
import java.util.List;
/* loaded from: classes.dex */
public final /* synthetic */ class j implements k {

    /* renamed from: b  reason: collision with root package name */
    public static final j f2414b = new j(0);

    /* renamed from: c  reason: collision with root package name */
    public static final j f2415c = new j(1);

    /* renamed from: d  reason: collision with root package name */
    public static final j f2416d = new j(2);

    /* renamed from: e  reason: collision with root package name */
    public static final j f2417e = new j(3);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2418a;

    public /* synthetic */ j(int i7) {
        this.f2418a = i7;
    }

    @Override // J2.k
    public final void a(SQLiteDatabase sQLiteDatabase) {
        switch (this.f2418a) {
            case 0:
                List list = l.f2419c;
                sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                return;
            case 1:
                List list2 = l.f2419c;
                sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
                return;
            case 2:
                List list3 = l.f2419c;
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                return;
            default:
                List list4 = l.f2419c;
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
                return;
        }
    }
}
