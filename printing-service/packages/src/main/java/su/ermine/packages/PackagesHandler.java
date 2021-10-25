package su.ermine.packages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PackagesHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(PackagesHandler.class);

    private final PackagesRepository repository;

    public PackagesHandler(PackagesRepository repository) {
        this.repository = repository;

        var storedPackage = repository.save(new Package(1L, "Default street"));

        LOGGER.info("PackagesRepository initialized {}", repository);
    }
}
