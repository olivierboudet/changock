package io.changock.driver.mongo.springdata.v3.driver.decorator.operation.executable.update.impl;

import io.changock.driver.mongo.springdata.v3.driver.decorator.operation.executable.update.UpdateWithCollectionDecorator;
import io.changock.driver.api.lock.guard.decorator.DecoratorBase;
import io.changock.driver.api.lock.guard.invoker.LockGuardInvoker;
import org.springframework.data.mongodb.core.ExecutableUpdateOperation;

public class UpdateWithCollectionDecoratorImpl<T> extends DecoratorBase<ExecutableUpdateOperation.UpdateWithCollection<T>> implements UpdateWithCollectionDecorator<T> {

  public UpdateWithCollectionDecoratorImpl(ExecutableUpdateOperation.UpdateWithCollection<T> impl, LockGuardInvoker invoker) {
    super(impl, invoker);
  }
}