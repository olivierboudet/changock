package io.changock.driver.mongo.springdata.v3.driver.decorator.operation.executable.remove.impl;

import io.changock.driver.mongo.springdata.v3.driver.decorator.operation.executable.remove.TerminatingRemoveDecorator;
import io.changock.driver.api.lock.guard.decorator.DecoratorBase;
import io.changock.driver.api.lock.guard.invoker.LockGuardInvoker;
import org.springframework.data.mongodb.core.ExecutableRemoveOperation;

public class TerminatingRemoveDecoratorImpl<T> extends DecoratorBase<ExecutableRemoveOperation.TerminatingRemove<T>> implements TerminatingRemoveDecorator<T> {

  public TerminatingRemoveDecoratorImpl(ExecutableRemoveOperation.TerminatingRemove<T> impl, LockGuardInvoker invoker) {
    super(impl, invoker);
  }

}