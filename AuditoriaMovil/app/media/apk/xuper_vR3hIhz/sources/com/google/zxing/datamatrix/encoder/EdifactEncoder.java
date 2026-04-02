package com.google.zxing.datamatrix.encoder;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class EdifactEncoder implements Encoder {
    private static void encodeChar(char c10, StringBuilder sb) {
        if (c10 >= ' ' && c10 <= '?') {
            sb.append(c10);
        } else if (c10 >= '@' && c10 <= '^') {
            sb.append((char) (c10 - '@'));
        } else {
            HighLevelEncoder.illegalCharacter(c10);
        }
    }

    private static String encodeToCodewords(CharSequence charSequence, int i10) {
        char c10;
        char c11;
        int length = charSequence.length() - i10;
        if (length != 0) {
            char charAt = charSequence.charAt(i10);
            char c12 = 0;
            if (length >= 2) {
                c10 = charSequence.charAt(i10 + 1);
            } else {
                c10 = 0;
            }
            if (length >= 3) {
                c11 = charSequence.charAt(i10 + 2);
            } else {
                c11 = 0;
            }
            if (length >= 4) {
                c12 = charSequence.charAt(i10 + 3);
            }
            int i11 = (charAt << 18) + (c10 << '\f') + (c11 << 6) + c12;
            char c13 = (char) ((i11 >> 8) & 255);
            char c14 = (char) (i11 & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append((char) ((i11 >> 16) & 255));
            if (length >= 2) {
                sb.append(c13);
            }
            if (length >= 3) {
                sb.append(c14);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    private static void handleEOD(EncoderContext encoderContext, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z10 = true;
            if (length == 1) {
                encoderContext.updateSymbolInfo();
                int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity() - encoderContext.getCodewordCount();
                if (encoderContext.getRemainingCharacters() == 0 && dataCapacity <= 2) {
                    return;
                }
            }
            if (length <= 4) {
                int i10 = length - 1;
                String encodeToCodewords = encodeToCodewords(charSequence, 0);
                if (!(!encoderContext.hasMoreCharacters()) || i10 > 2) {
                    z10 = false;
                }
                if (i10 <= 2) {
                    encoderContext.updateSymbolInfo(encoderContext.getCodewordCount() + i10);
                    if (encoderContext.getSymbolInfo().getDataCapacity() - encoderContext.getCodewordCount() >= 3) {
                        encoderContext.updateSymbolInfo(encoderContext.getCodewordCount() + encodeToCodewords.length());
                        z10 = false;
                    }
                }
                if (z10) {
                    encoderContext.resetSymbolInfo();
                    encoderContext.pos -= i10;
                } else {
                    encoderContext.writeCodewords(encodeToCodewords);
                }
                return;
            }
            throw new IllegalStateException("Count must not exceed 4");
        } finally {
            encoderContext.signalEncoderChange(0);
        }
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public void encode(EncoderContext encoderContext) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!encoderContext.hasMoreCharacters()) {
                break;
            }
            encodeChar(encoderContext.getCurrentChar(), sb);
            encoderContext.pos++;
            if (sb.length() >= 4) {
                encoderContext.writeCodewords(encodeToCodewords(sb, 0));
                sb.delete(0, 4);
                if (HighLevelEncoder.lookAheadTest(encoderContext.getMessage(), encoderContext.pos, getEncodingMode()) != getEncodingMode()) {
                    encoderContext.signalEncoderChange(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        handleEOD(encoderContext, sb);
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 4;
    }
}
