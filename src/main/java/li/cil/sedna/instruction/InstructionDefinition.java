package li.cil.sedna.instruction;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public final class InstructionDefinition {
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.CLASS)
    public @interface Implementation {
        String value();
    }

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.CLASS)
    public @interface ContainsNonStaticMethodInvocations {
    }

    @Target(ElementType.PARAMETER)
    @Retention(RetentionPolicy.CLASS)
    public @interface Field {
        String value();
    }

    @Target(ElementType.PARAMETER)
    @Retention(RetentionPolicy.CLASS)
    public @interface InstructionSize {
    }

    public final String instructionName;
    public final String methodName;
    public final boolean readsPC;
    public final boolean writesPC;
    public final boolean returnsBoolean;
    public final InstructionArgument[] parameters;

    InstructionDefinition(final String instructionName,
                          final String methodName,
                          final boolean readsPC,
                          final boolean writesPC,
                          final boolean returnsBoolean,
                          final InstructionArgument[] parameters) {
        this.instructionName = instructionName;
        this.methodName = methodName;
        this.readsPC = readsPC;
        this.writesPC = writesPC;
        this.returnsBoolean = returnsBoolean;
        this.parameters = parameters;
    }
}