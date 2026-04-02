package c7;

import java.io.InputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.pipes.fetcher.RangeFetcher;
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static InputStream a(RangeFetcher rangeFetcher, String str, long j, long j8, Metadata metadata) {
        return rangeFetcher.fetch(str, j, j8, metadata, new ParseContext());
    }
}
