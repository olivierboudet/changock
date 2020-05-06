package io.changock.driver.mongo.springdata.v3.driver.decorator.operation.executable.aggregation.impl;

import io.changock.driver.mongo.springdata.v3.driver.decorator.operation.executable.aggregation.TerminatingAggregationDecorator;
import io.changock.driver.api.lock.guard.decorator.DecoratorBase;
import io.changock.driver.api.lock.guard.invoker.LockGuardInvoker;
import org.springframework.data.mongodb.core.ExecutableAggregationOperation;

public class TerminatingAggregationDecoratorImpl<T>
    extends DecoratorBase<ExecutableAggregationOperation.TerminatingAggregation<T>>
    implements TerminatingAggregationDecorator<T> {
  public TerminatingAggregationDecoratorImpl(ExecutableAggregationOperation.TerminatingAggregation<T> impl, LockGuardInvoker invoker) {
    super(impl, invoker);
  }
}
