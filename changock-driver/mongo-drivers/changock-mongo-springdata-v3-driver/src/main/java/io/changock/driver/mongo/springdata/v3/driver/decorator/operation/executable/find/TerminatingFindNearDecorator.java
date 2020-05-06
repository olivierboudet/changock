package io.changock.driver.mongo.springdata.v3.driver.decorator.operation.executable.find;

import io.changock.driver.api.lock.guard.decorator.Invokable;
import org.springframework.data.geo.GeoResults;
import org.springframework.data.mongodb.core.ExecutableFindOperation;

public interface TerminatingFindNearDecorator<T> extends Invokable, ExecutableFindOperation.TerminatingFindNear<T> {

  ExecutableFindOperation.TerminatingFindNear<T> getImpl();

  @Override
  default GeoResults<T> all() {
    return getInvoker().invoke(()-> getImpl().all());
  }
}