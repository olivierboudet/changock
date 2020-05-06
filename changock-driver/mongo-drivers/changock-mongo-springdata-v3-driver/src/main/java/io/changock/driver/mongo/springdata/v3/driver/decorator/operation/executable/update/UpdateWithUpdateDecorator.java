package io.changock.driver.mongo.springdata.v3.driver.decorator.operation.executable.update;

import io.changock.driver.mongo.springdata.v3.driver.decorator.operation.executable.update.impl.FindAndReplaceWithProjectionDecoratorImpl;
import io.changock.driver.mongo.springdata.v3.driver.decorator.operation.executable.update.impl.TerminatingUpdateDecoratorImpl;
import io.changock.driver.api.lock.guard.decorator.Invokable;
import org.springframework.data.mongodb.core.ExecutableUpdateOperation;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.core.query.UpdateDefinition;

public interface UpdateWithUpdateDecorator<T> extends Invokable, ExecutableUpdateOperation.UpdateWithUpdate<T> {

  ExecutableUpdateOperation.UpdateWithUpdate<T> getImpl();


  @Override
  default ExecutableUpdateOperation.TerminatingUpdate<T> apply(UpdateDefinition update) {
    return new TerminatingUpdateDecoratorImpl<>(getInvoker().invoke(()-> getImpl().apply(update)), getInvoker());
  }

  @Override
  default ExecutableUpdateOperation.FindAndReplaceWithProjection<T> replaceWith(T replacement) {
    return new FindAndReplaceWithProjectionDecoratorImpl<>(getInvoker().invoke(() -> getImpl().replaceWith(replacement)), getInvoker());
  }

}
