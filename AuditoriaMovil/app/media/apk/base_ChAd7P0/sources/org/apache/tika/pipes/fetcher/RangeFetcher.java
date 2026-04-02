package org.apache.tika.pipes.fetcher;

import java.io.InputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
/* loaded from: classes.dex */
public interface RangeFetcher extends Fetcher {
    InputStream fetch(String str, long j, long j8, Metadata metadata);

    InputStream fetch(String str, long j, long j8, Metadata metadata, ParseContext parseContext);
}
