package su.ermine.orders;

import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;

public interface OrderRepository extends DatastoreRepository<Order, Long> {
}
