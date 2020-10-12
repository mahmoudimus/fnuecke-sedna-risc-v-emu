package li.cil.sedna.instruction.decoder;

public interface DecoderTreeSwitchVisitor {
    void visit(final int[] patterns, final int mask);

    DecoderTreeVisitor visitSwitchCase(final int index, final int pattern);

    void visitEnd();
}