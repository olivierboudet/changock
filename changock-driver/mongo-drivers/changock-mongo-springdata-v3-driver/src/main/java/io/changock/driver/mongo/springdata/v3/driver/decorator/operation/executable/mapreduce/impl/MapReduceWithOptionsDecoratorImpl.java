package io.changock.driver.mongo.springdata.v3.driver.decorator.operation.executable.mapreduce.impl;

import io.changock.driver.mongo.springdata.v3.driver.decorator.operation.executable.mapreduce.MapReduceWithOptionsDecorator;
import io.changock.driver.api.lock.guard.invoker.LockGuardInvoker;
import org.springframework.data.mongodb.core.ExecutableMapReduceOperation;

public class MapReduceWithOptionsDecoratorImpl<T> implements MapReduceWithOptionsDecorator<T> {

    private final ExecutableMapReduceOperation.MapReduceWithOptions<T> impl;
    private final LockGuardInvoker invoker;

    public MapReduceWithOptionsDecoratorImpl(ExecutableMapReduceOperation.MapReduceWithOptions<T> impl, LockGuardInvoker invoker) {
        this.impl = impl;
        this.invoker = invoker;
    }

    @Override
    public ExecutableMapReduceOperation.MapReduceWithOptions<T> getImpl() {
        return impl;
    }

    @Override
    public LockGuardInvoker getInvoker() {
        return invoker;
    }
}