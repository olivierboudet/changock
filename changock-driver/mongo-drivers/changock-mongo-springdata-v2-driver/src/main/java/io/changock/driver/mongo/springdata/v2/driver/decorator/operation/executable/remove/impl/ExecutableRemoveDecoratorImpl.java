package io.changock.driver.mongo.springdata.v2.driver.decorator.operation.executable.remove.impl;

import io.changock.driver.mongo.springdata.v2.driver.decorator.operation.executable.remove.ExecutableRemoveDecorator;
import io.changock.driver.mongo.springdata.v2.driver.decorator.util.DecoratorBase;
import io.changock.driver.core.lock.guard.invoker.LockGuardInvoker;
import org.springframework.data.mongodb.core.ExecutableRemoveOperation;

public class ExecutableRemoveDecoratorImpl<T> extends DecoratorBase<ExecutableRemoveOperation.ExecutableRemove<T>> implements ExecutableRemoveDecorator<T> {
  public ExecutableRemoveDecoratorImpl(ExecutableRemoveOperation.ExecutableRemove<T> impl, LockGuardInvoker invoker) {
    super(impl, invoker);
  }
}
