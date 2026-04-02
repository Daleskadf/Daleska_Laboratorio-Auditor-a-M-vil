package okio;
/* loaded from: classes3.dex */
final class PeekSource implements Source {
    private final Buffer buffer;
    private boolean closed;
    private int expectedPos;
    private Segment expectedSegment;
    private long pos;
    private final BufferedSource upstream;

    public PeekSource(BufferedSource bufferedSource) {
        int i10;
        this.upstream = bufferedSource;
        Buffer buffer = bufferedSource.buffer();
        this.buffer = buffer;
        Segment segment = buffer.head;
        this.expectedSegment = segment;
        if (segment != null) {
            i10 = segment.pos;
        } else {
            i10 = -1;
        }
        this.expectedPos = i10;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    @Override // okio.Source
    public long read(Buffer buffer, long j10) {
        Segment segment;
        Segment segment2;
        if (j10 >= 0) {
            if (!this.closed) {
                Segment segment3 = this.expectedSegment;
                if (segment3 != null && (segment3 != (segment2 = this.buffer.head) || this.expectedPos != segment2.pos)) {
                    throw new IllegalStateException("Peek source is invalid because upstream source was used");
                }
                if (j10 == 0) {
                    return 0L;
                }
                if (!this.upstream.request(this.pos + 1)) {
                    return -1L;
                }
                if (this.expectedSegment == null && (segment = this.buffer.head) != null) {
                    this.expectedSegment = segment;
                    this.expectedPos = segment.pos;
                }
                long min = Math.min(j10, this.buffer.size - this.pos);
                this.buffer.copyTo(buffer, this.pos, min);
                this.pos += min;
                return min;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException("byteCount < 0: " + j10);
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.upstream.timeout();
    }
}
