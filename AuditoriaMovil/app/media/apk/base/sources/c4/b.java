package C4;

import U3.h;
import V2.k;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: m  reason: collision with root package name */
    public final Integer f534m;

    /* renamed from: n  reason: collision with root package name */
    public final String f535n;

    public b(k kVar, h hVar, Integer num, String str) {
        super(kVar, hVar);
        this.f534m = num;
        this.f535n = str;
    }

    @Override // C4.c
    public final String d() {
        return "GET";
    }

    @Override // C4.c
    public final Map h() {
        HashMap hashMap = new HashMap();
        String path = ((Uri) this.f539b.f5967d).getPath();
        if (path == null) {
            path = StringUtils.EMPTY;
        } else if (path.startsWith("/")) {
            path = path.substring(1);
        }
        if (!path.isEmpty()) {
            hashMap.put("prefix", path.concat("/"));
        }
        hashMap.put("delimiter", "/");
        Integer num = this.f534m;
        if (num != null) {
            hashMap.put("maxResults", Integer.toString(num.intValue()));
        }
        String str = this.f535n;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("pageToken", str);
        }
        return hashMap;
    }

    @Override // C4.c
    public final Uri k() {
        k kVar = this.f539b;
        String authority = ((Uri) kVar.f5967d).getAuthority();
        return Uri.parse(((Uri) kVar.f5965b) + "/b/" + authority + "/o");
    }
}
