package C4;

import U3.h;
import V2.k;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f549m;

    /* renamed from: n  reason: collision with root package name */
    public final Object f550n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, h hVar, Uri uri, int i7) {
        super(kVar, hVar);
        this.f549m = i7;
        switch (i7) {
            case 1:
                super(kVar, hVar);
                this.f550n = uri;
                q("X-Goog-Upload-Protocol", "resumable");
                q("X-Goog-Upload-Command", "query");
                return;
            default:
                this.f550n = uri;
                q("X-Goog-Upload-Protocol", "resumable");
                q("X-Goog-Upload-Command", "cancel");
                return;
        }
    }

    @Override // C4.c
    public final String d() {
        switch (this.f549m) {
            case 0:
                return "POST";
            case 1:
                return "POST";
            default:
                return "POST";
        }
    }

    @Override // C4.c
    public JSONObject e() {
        switch (this.f549m) {
            case 2:
                return (JSONObject) this.f550n;
            default:
                return super.e();
        }
    }

    @Override // C4.c
    public Map h() {
        switch (this.f549m) {
            case 2:
                HashMap hashMap = new HashMap();
                String path = ((Uri) this.f539b.f5967d).getPath();
                if (path == null) {
                    path = StringUtils.EMPTY;
                } else if (path.startsWith("/")) {
                    path = path.substring(1);
                }
                hashMap.put("name", path);
                hashMap.put("uploadType", "resumable");
                return hashMap;
            default:
                return super.h();
        }
    }

    @Override // C4.c
    public final Uri k() {
        switch (this.f549m) {
            case 0:
                return (Uri) this.f550n;
            case 1:
                return (Uri) this.f550n;
            default:
                k kVar = this.f539b;
                String authority = ((Uri) kVar.f5967d).getAuthority();
                Uri.Builder buildUpon = ((Uri) kVar.f5965b).buildUpon();
                buildUpon.appendPath("b");
                buildUpon.appendPath(authority);
                buildUpon.appendPath("o");
                return buildUpon.build();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, h hVar, JSONObject jSONObject, String str) {
        super(kVar, hVar);
        this.f549m = 2;
        this.f550n = jSONObject;
        if (TextUtils.isEmpty(str)) {
            this.f538a = new IllegalArgumentException("mContentType is null or empty");
        }
        q("X-Goog-Upload-Protocol", "resumable");
        q("X-Goog-Upload-Command", "start");
        q("X-Goog-Upload-Header-Content-Type", str);
    }
}
