package com.github.relucent.base.util.thread;

public class ThreadUtil {
    /**
     * 线程休眠
     * @param millis 毫秒数
     */
    public static void sleepUnchecked(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 线程休眠
     * @param millis 毫秒数
     */
    public static void sleepQuietly(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * 启动一组守护线程任务，并且等待执行结束
     * @param runnable 一组线程任务
     */
    public static void startAndJoinDaemon(Runnable... runnable) {
        Thread[] threads = new Thread[runnable.length];
        for (int i = 0; i < runnable.length; i++) {
            Thread thread = threads[i] = new Thread(runnable[i]);;
            thread.setDaemon(true);
            thread.start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /**
     * 如果异常是中断异常，那么恢复中断状态
     * @param throwable 异常
     */
    public static void keepIfInterrupted(Throwable throwable) {
        if (throwable instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
