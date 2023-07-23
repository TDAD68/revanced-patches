package app.revanced.patches.youtube.utils.fix.parameter.fingerprints

import app.revanced.patcher.fingerprint.method.impl.MethodFingerprint
import com.android.tools.smali.dexlib2.Opcode

object BadResponseFingerprint : MethodFingerprint(
    opcodes = listOf(Opcode.CONST_16),
    strings = listOf("Response code: ")
)