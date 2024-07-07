package ted.jvm.core;

import ted.jvm.runtime.JVMThread;

public abstract class JVMThreadHolder {

    private static final ThreadLocal<JVMThread> holder = new ThreadLocal<>();

    public static void set(JVMThread thread) {
        holder.set(thread);
    }

    public static JVMThread get() {
        return holder.get();
    }

}
