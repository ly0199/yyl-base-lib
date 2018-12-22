package com.github.relucent.base.util.queue;

@FunctionalInterface
public interface QueueStoreBuilder<T> {
    QueueStore<T> build();
}
