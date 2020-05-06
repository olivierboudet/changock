package io.changock.driver.mongo.springdata.v3.driver.decorator.operation.executable.insert.impl;

import io.changock.driver.mongo.springdata.v3.driver.decorator.operation.executable.insert.TerminatingBulkInsertDecorator;
import io.changock.driver.api.lock.guard.decorator.DecoratorBase;
import io.changock.driver.api.lock.guard.invoker.LockGuardInvoker;
import org.springframework.data.mongodb.core.ExecutableInsertOperation;

public class TerminatingBulkInsertDecoratorImpl<T>
    extends DecoratorBase<ExecutableInsertOperation.TerminatingBulkInsert<T>>
    implements TerminatingBulkInsertDecorator<T> {
  public TerminatingBulkInsertDecoratorImpl(ExecutableInsertOperation.TerminatingBulkInsert<T> impl, LockGuardInvoker invoker) {
    super(impl, invoker);
  }
}
