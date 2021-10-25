package su.ermine.images;

import com.google.cloud.storage.Storage;
import com.google.cloud.storage.Bucket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class ImageRepository {
    private static final Logger LOGGER = LoggerFactory.getLogger(ImageRepository.class);

    private final Storage storage;
    private final Bucket bucket;

    public ImageRepository(Storage storage) {
        this.storage = storage;
        this.bucket = storage.get("mustelaerminea");
    }
}
