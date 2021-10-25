package su.ermine.packages;

import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;

public interface PackagesRepository extends DatastoreRepository<Package, Long> {
}
